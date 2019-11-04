package Model;

import java.awt.*;

public class Road extends Shape {

    private int segments;

    public Road(int x, int y) {
        super(x, y);
        setColor(Color.blue);
        setWidth(12);
        setHeight(2);
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

    public void hasConnectingRoad() {

    }

    @Override
    public void draw(Graphics g) {

        g.setColor(this.getColor());
        g.fillRect(x, y, this.getWidth(), this.getHeight());
    }
}
