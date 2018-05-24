package me.kevinchik.www.jumpguy;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Banner extends Entity{

    private Animation animation = new Animation();
    private Bitmap[] image;

    Banner(Bitmap res) {
        super(0, 0, 0, 270, 480, 1);
        image = new Bitmap[2];
        for (int i = 0; i < image.length; i++) {
            image[i] = Bitmap.createBitmap(res, i * getW(), 0, getW(), getH());
        }
        animation.setFrames(image);
        animation.setDelay(512);
    }

    protected void update() {
        animation.update();
        setY(getY() + getVy());
        setVy(getVy() + getAy());
    }

    protected void draw(Canvas canvas) {
        canvas.drawBitmap(animation.getImage(), getX(), getY(), null);
    }

    public void setImage(Bitmap res) {
        for (int i = 0; i < image.length; i++)
            image[i] = Bitmap.createBitmap(res, i * getW(), 0, getW(), getH());
    }
}
