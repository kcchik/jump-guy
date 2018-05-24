package me.kevinchik.www.jumpguy;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

public class Score extends Entity{

    private final String PATH = "fonts/ARCADECLASSIC.TTF";
    private Paint paint;
    private int size;
    private int a, r, g, b;

    protected Score(Context context) {
        super(0, 0, 0, 0, 0, 1);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), PATH);
        paint = new Paint();
        paint.setTypeface(typeface);
    }

    protected void draw(Canvas canvas, int score) {
        paint.setTextSize(size);
        paint.setARGB(a, r, g, b);
        canvas.drawText(String.valueOf(score), getX(), getY(), paint);
    }

    protected void setSize(int size) {
        this.size = size;
    }

    public void setARGB(int a, int r, int g, int b) {
        this.a = a;
        this.r = r;
        this.g = g;
        this.b = b;
    }
}
