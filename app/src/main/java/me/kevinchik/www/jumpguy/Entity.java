package me.kevinchik.www.jumpguy;

public abstract class Entity {

    private int x;
    private int y;
    private int vx;
    private int vy;
    private int ay;
    private int w;
    private int h;

    protected Entity(int x, int y, int vx, int vy, int ay, int w, int h) {
        this.x = x;
        this.y = y;
        this.vx = vx;
        this.vy = vy;
        this.ay = ay;
        this.w = w;
        this.h = h;
    }

    protected int getX() {
        return x;
    }

    protected void setX(int x) {
        this.x = x;
    }

    protected int getY() {
        return y;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected int getVx() {
        return vx;
    }

    protected void setVx(int vx) {
        this.vx = vx;
    }

    protected int getVy() {
        return vy;
    }

    protected void setVy(int vy) {
        this.vy = vy;
    }

    protected int getAy() {
        return ay;
    }

    protected void setAy(int ay) {
        this.ay = ay;
    }

    protected int getW() {
        return w;
    }

    protected void setW(int w) {
        this.w = w;
    }

    protected int getH() {
        return h;
    }

    protected void setH(int h) {
        this.h = h;
    }

}
