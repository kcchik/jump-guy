package me.kevinchik.www.jumpguy;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Background extends Entity{

    private Bitmap image;

    Background(Bitmap res) {
        super(0, 0, 0, 0, 0, 54, 96);
        image = Bitmap.createBitmap(res, 0, 0, getW(), getH());
        image = Bitmap.createScaledBitmap(image, Game.WIDTH, Game.HEIGHT, false);
    }

    void draw(Canvas canvas) {
        canvas.drawBitmap(image, getX(), getY(), null);
    }

}
