package Model;

import java.awt.*;

public class Road extends Shape {

    public Road(int x, int y) {
        super(x, y);
        setColor(Color.blue);
        setWidth(12);
        setHeight(2);
    }

    @Override
    public void draw(Graphics g) {

    }
}
