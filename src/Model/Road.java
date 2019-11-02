package Model;

import java.awt.*;

public class Road extends Shape {

    private int segments = getWidth();

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

    @Override
    public void draw(Graphics g) {

    }
}
