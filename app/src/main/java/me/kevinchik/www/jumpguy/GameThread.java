package me.kevinchik.www.jumpguy;

import android.graphics.Canvas;
import android.view.SurfaceHolder;

public class GameThread extends Thread {

    private int FPS = 30;
    private double averageFPS;
    private SurfaceHolder holder;
    private Game gamePanel;
    private boolean running;
    public static Canvas canvas;

    protected GameThread(SurfaceHolder holder, Game gamePanel) {
        super();
        this.holder = holder;
        this.gamePanel = gamePanel;
    }

    @Override
    public void run() {
        long startTime;
        long timeMillis;
        long waitTime;
        long totalTime = 0;
        int frameCount = 0;
        long targetTime = 1000 / FPS;

        //main loop
        while(running) {
            startTime = System.nanoTime();
            canvas = null;

            //???
            try {
                canvas = this.holder.lockCanvas();
                synchronized (holder) {
                    this.gamePanel.update();
                    this.gamePanel.draw(canvas);
                }
            } catch(Exception e) {
                e.printStackTrace();
            } finally {
                if (canvas != null) {
                    try {
                        holder.unlockCanvasAndPost(canvas);
                    } catch(Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            //time elapsed
            timeMillis = (System.nanoTime() - startTime) / 1000000;

            //cap FPS
            waitTime = targetTime - timeMillis;
            try {
                sleep(waitTime);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void setRunning(boolean running) {
        this.running = running;
    }

}