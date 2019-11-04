package Model;

import java.awt.*;

public class Bike extends Vehicle {

    public Bike(int x, int y, int xDir, int yDir) {
        super(x, y, xDir, yDir);
        setColor(Color.white);
        setWidth(1);
        setHeight(1);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(this.getColor());
        g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }
}
