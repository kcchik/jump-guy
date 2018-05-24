package me.kevinchik.www.jumpguy;

import android.graphics.Bitmap;

public class Animation {

    private Bitmap[] frames;
    private long startTime;
    private long delay;
    private int currentFrame;
    private boolean playedOnce;

    protected void update() {
        long elapsed = (System.nanoTime() - startTime) / 1000000;

        //next frame
        if (elapsed > delay) {
            currentFrame++;
            startTime = System.nanoTime();
        }

        //loop through frames
        if (currentFrame == frames.length) {
            currentFrame = 0;
            playedOnce = true;
        }
    }

    protected Bitmap getImage() {
        return frames[currentFrame];
    }

    protected void setFrames(Bitmap[] frames) {
        this.frames = frames;
        currentFrame = 0;
        startTime = System.nanoTime();
    }

    protected void setDelay(long delay) {
        this.delay = delay;
    }

    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    public int getCurrentFrame() {
        return currentFrame;
    }

    public boolean isPlayedOnce() {
        return playedOnce;
    }

}
