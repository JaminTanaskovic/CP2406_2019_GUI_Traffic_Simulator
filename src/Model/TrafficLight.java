package Model;

import java.awt.*;

public class TrafficLight extends Shape {

    private boolean lightColor;

    public TrafficLight(int x, int y) {
        super(x, y);
        setWidth(1);
        setHeight(1);
        setColor(Color.black);
    }

    // change color of lights after predetermined time
    public boolean changeColor() {

        if (lightColor == true) { // if light is green
            setColor(Color.green);
            //wait 8
            lightColor = false;
            return false;
        } else { // turn light red
            setColor(Color.red);
            //wait 3
            lightColor = true;
            return true;
        }
    }

    @Override
    public void draw(Graphics g) {

        g.setColor(this.getColor());
        g.fillRect(x, y, this.getWidth(), this.getHeight());
    }
}