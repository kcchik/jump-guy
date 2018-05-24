package me.kevinchik.www.jumpguy;

public abstract class Entity {

    private int x;
    private int y;
    private int vx;
    private int vy;
    private int ay;
    private int w;
    private int h;
    private int scale;

    Entity(int x, int y, int ay, int w, int h, int scale) {
        this.x = x;
        this.y = y;
        this.ay = ay;
        this.w = w;
        this.h = h;
        this.scale = scale;
    }

    int getX() {
        return x;
    }

    void setX(int x) {
        this.x = x;
    }

    int getY() {
        return y;
    }

    void setY(int y) {
        this.y = y;
    }

    int getVx() {
        return vx;
    }

    void setVx(int vx) {
        this.vx = vx;
    }

    int getVy() {
        return vy;
    }

    void setVy(int vy) {
        this.vy = vy;
    }

    int getAy() {
        return ay;
    }

    void setAy(int ay) {
        this.ay = ay;
    }

    int getW() {
        return w;
    }

    int getH() {
        return h;
    }

    int getScaledW() {
        return w / scale;
    }

    int getScaledH() {
        return h / scale;
    }

}
