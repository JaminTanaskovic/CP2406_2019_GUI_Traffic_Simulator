package Model;

import java.awt.*;

public class Car extends Vehicle {

    public Car(int x, int y, int xDir, int yDir, int speed) {
        super(x, y, xDir, yDir, speed);
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
