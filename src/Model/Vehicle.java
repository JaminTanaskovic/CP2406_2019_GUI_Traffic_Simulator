package Model;

import java.awt.*;
import java.util.Random;

public abstract class Vehicle extends Shape {
    private int xDir, yDir, speed, segments, frontLgth, backLgth;

    Vehicle(int x, int y, int xDir, int yDir) {
        super(x, y);
        this.xDir = xDir;
        this.yDir = yDir;
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

    public int getSegments() {
        return segments;
    }

    public void setSegments(int segments) {
        this.segments = segments;
    }

    public int getFrontLgth() {
        return frontLgth;
    }

    public void setFrontLgth(int frontLgth) {
        this.frontLgth = frontLgth;
    }

    public int getBackLgth() {
        return backLgth;
    }

    public void setBackLgth(int backLgth) {
        this.backLgth = backLgth;
    }

    public boolean checkLight(TrafficLight trafficLight) {
        if (trafficLight.changeColor() == true) {
            move();
            return true;
        } else {
            // move to end of road segment if no vehicles in the way
            return false;
        }
    }

    private void checkTurn(Road road, TrafficLight trafficLight) {
        Random random = new Random();
        int answer = random.nextInt(3) + 1;
        if (getFrontLgth() == road.getWidth() && checkLight(trafficLight)) {
            if (answer == 1) {
                // turn left
            } else if (answer == 2) {
                // go straight
            } else {
                // turn right
            }
        }
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

