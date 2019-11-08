package Model;

import java.awt.*;
import java.util.Random;

public abstract class Vehicle extends Shape {
    private int speed, frontLgth, backLgth;
    private boolean yDir, xDir;

    Vehicle(int x, int y, boolean xDir, boolean yDir) {
        super(x, y);
        this.xDir = xDir;
        this.yDir = yDir;
    }

    private boolean getxDir() {
        return xDir;
    }

    private void setxDir(boolean xDir) {
        this.xDir = xDir;
    }

    private boolean getyDir() {
        return yDir;
    }

    private void setyDir(boolean yDir) {
        this.yDir = yDir;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int getFrontLgth() {
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

    private void move(Road road, TrafficLight trafficLight) {
        checkTurn(road, trafficLight);
        if (getxDir()) { // if vehicle is moving forward on x direction
            if (road.isRoad()) {
                setX(getX() + speed);
                road.setSegments(road.getSegments() + speed);
            }
        } else { // if vehicle is moving backwards on x direction
            if (road.isRoad()) {
                setX(getX() - speed);
                road.setSegments(road.getSegments() + speed);
            }
        }
        if (getyDir()) { // if vehicle is moving forward on y direction
            if (road.isRoad()) {
                setY(getY() + speed);
                road.setSegments(road.getSegments() + speed);
            }
        } else { // if vehicle is moving backwards on y direction
            if (road.isRoad()) {
                setY(getY() - speed);
                road.setSegments(road.getSegments() + speed);
            }
        }
    }

    private boolean checkLight(Road road, TrafficLight trafficLight) {
        if (trafficLight.changeColor()) {
            move(road, trafficLight);
            return true;
        } else {
            move(road, trafficLight);
            // move to end of road segment if no vehicles in the way
            return false;
        }
    }

    private void checkTurn(Road road, TrafficLight trafficLight) {
        Random random = new Random();
        int answer = random.nextInt(3) + 1;
        if (getFrontLgth() == road.getWidth() && checkLight(road, trafficLight)) {
            if (answer == 1) { // turn left
                if (getxDir()) {
                    setyDir(true);
                } else if (getyDir()) {
                    setxDir(false);
                }
            } else if (answer == 2) { // go straight
            } else { // turn right
                if (getxDir()) {
                    setyDir(false);
                } else if (getyDir()) {
                    setxDir(true);
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%d %d", x, y);
    }

    @Override
    public abstract void draw(Graphics g);
}

