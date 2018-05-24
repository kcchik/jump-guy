package me.kevinchik.www.jumpguy;

import android.graphics.Bitmap;

public class Animation {

    private Bitmap[] frames;
    private long startTime;
    private long delay;
    private int currentFrame;

    void update() {
        long elapsed = (System.nanoTime() - startTime) / 1000000;

        //next frame
        if (elapsed > delay) {
            currentFrame++;
            startTime = System.nanoTime();
        }

        //loop through frames
        if (currentFrame == frames.length)
            currentFrame = 0;
    }

    Bitmap getImage() {
        return frames[currentFrame];
    }

    void setFrames(Bitmap[] frames) {
        this.frames = frames;
        currentFrame = 0;
        startTime = System.nanoTime();
    }

    void setDelay(long delay) {
        this.delay = delay;
    }

}
