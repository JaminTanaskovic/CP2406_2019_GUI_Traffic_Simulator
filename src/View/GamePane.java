package View;

import Model.Vehicle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GamePane extends JPanel implements ActionListener {

    private final static Random random = new Random();
    private Vehicle[] vehicles;
    private int timerDelay = 30;
    private Timer timer = new Timer(timerDelay, this);

    public GamePane(int width, int height, Vehicle[] vehicles) {

        setBackground(Color.BLACK);
        this.vehicles = vehicles;
        setPreferredSize(new Dimension(width, height));
    }

    public int getTimerDelay() {

        return timerDelay;
    }

    public void setTimerDelay(int timerDelay) {

        this.timerDelay = timerDelay;
    }

    public void timerStart() {

        timer.start();
        if (timer.isRunning()) {
            System.out.println("Timer is running");
        } else System.out.println("Error timer not running");
    }

    public void timerStop() {

        timer.stop();
        if (!timer.isRunning()) {
            System.out.println("Timer is off");
        } else System.out.println("Error timer not stopped");

    }

    public void setupNewGame() {

        removeAll();
        revalidate();
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);
        for (Vehicle vehicle : vehicles) {
            vehicle.draw(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

