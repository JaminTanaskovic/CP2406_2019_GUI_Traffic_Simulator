package Model;

import java.awt.*;

public class Bus extends Vehicle {

    public Bus(int x, int y, int xDir, int yDir) {
        super(x, y, xDir, yDir);
        setColor(Color.yellow);
        setWidth(6);
        setHeight(1);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(this.getColor());
        g.fillRect(x, y, this.getWidth(), this.getHeight());
    }
}
