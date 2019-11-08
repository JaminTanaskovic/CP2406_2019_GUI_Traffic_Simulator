package Model;

import java.awt.*;

public class Road extends Shape {

    private int segments;
    private boolean laneA, laneB, isRoad;

    public Road(int x, int y) {
        super(x, y);
        isRoad = true;
        setColor(Color.blue);
        setWidth(12);
        setHeight(2);
    }

    public boolean isRoad() {
        return isRoad;
    }

    public boolean isLaneA() {
        return laneA;
    }

    public boolean isLaneB() {
        return laneB;
    }

    public void laneA() {

    }

    private void laneB() {

    }

    public int getSegments() {
        return segments;
    }

    public void setSegments(int segments) {
        this.segments = segments;
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(this.getColor());
        g.fillRect(x, y, this.getWidth(), this.getHeight());
    }
}
