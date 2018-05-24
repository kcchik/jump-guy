package me.kevinchik.www.jumpguy;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Platform extends Entity {

    Bitmap image;

    Platform(Bitmap res, int x, int y) {
        super(x, y, 0, 0, 0, 40, 15);
        image = Bitmap.createBitmap(res, 0, 0, 8, 3);
        image = Bitmap.createScaledBitmap(image, getW(), getH(), false);
    }

    void update() {
        setY(getY() + getVy());
    }

    void draw(Canvas canvas) {
        canvas.drawBitmap(image, getX(), getY(), null);
    }

    Rect body() {
        return new Rect(getX(), getY(), getX() + getW(), getY() + 20);
    }

}
