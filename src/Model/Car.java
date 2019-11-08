package Model;

import java.awt.*;

public class Car extends Vehicle {

    public Car(int x, int y, boolean xDir, boolean yDir) {
        super(x, y, xDir, yDir);
        setColor(Color.magenta);
        setWidth(2);
        setHeight(1);
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(this.getColor());
        g.fillRect(x, y, this.getWidth(), this.getHeight());
    }
}
