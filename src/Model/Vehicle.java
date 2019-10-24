package Model;

import java.awt.*;

public abstract class Vehicle extends Shape {
    private int xDir, yDir, speed;

    Vehicle(int x, int y, int xDir, int yDir, int speed) {
        super(x, y);
        this.xDir = xDir;
        this.yDir = yDir;
        this.speed = speed;
    }

    public int getxDir() {
        return xDir;
    }

    public void setxDir(int xDir) {
        this.xDir = xDir;
    }

    public int getyDir() {
        return yDir;
    }

    public void setyDir(int yDir) {
        this.yDir = yDir;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    void move() {
        x += speed * xDir;
        y += speed * yDir;
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }

    @Override
    public abstract void draw(Graphics g);
}

