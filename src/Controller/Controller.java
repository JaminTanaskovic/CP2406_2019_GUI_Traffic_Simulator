package Controller;

import Model.*;
import View.GamePane;
import View.MainFrame;

import javax.swing.*;
import java.util.Random;

public class Controller {

    private final static Random random = new Random();
    private int vehicleSpawn = 10;

    Controller() {

        final int WIDTH = 500;
        final int HEIGHT = 500;
        int speed = 2;

        Vehicle[] vehicles = new Vehicle[vehicleSpawn];
        for (int i = 0; i < vehicles.length; ++i) {
            int x = random.nextInt();
            int y = random.nextInt();
            int xDir = random.nextBoolean() ? -1 : 1;
            int yDir = random.nextBoolean() ? -1 : 1;

            switch (VehicleType.random()) {
                case CAR:
                    vehicles[i] = new Car(x, y, xDir, yDir, 2);
                    break;
                case BIKE:
                    vehicles[i] = new Bike(x, y, xDir, yDir, 2);
                    break;
                case BUS:
                    vehicles[i] = new Bus(x, y, xDir, yDir, 2);
                    break;
            }

            vehicles[i].setSpeed(speed);
            System.out.println(vehicles[i]);
        }

        GamePane gamePane = new GamePane(WIDTH, HEIGHT, vehicles);
        MainFrame mainFrame = new MainFrame(gamePane);

        // Create a new game panel
        mainFrame.setNewCityMenuListener(e -> {

            gamePane.setupNewGame();
            System.out.println(e.getActionCommand());
        });

        // Add to new game panel ( setup city )
        mainFrame.setEditCityMenuListener(e -> {

            mainFrame.turnOnEditPanel();
            System.out.println(e.getActionCommand());
        });

        // Open saved city
        mainFrame.setOpenCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //open saved map
        });

        // Saves the created city
        mainFrame.setSaveCityMenuListener(e -> {
            System.out.println(e.getActionCommand());
            //save map
        });

        // Set the rate changes are made on the screen
        mainFrame.setUpdateRateMenuListener(e -> {

            String input = JOptionPane.showInputDialog("Enter The Time to Update Movement:");
            int updateInput = Integer.parseInt(input);
            gamePane.setTimerDelay(updateInput);  // set updateInput to change the timer delay value
            System.out.println(gamePane.getTimerDelay());
        });
        // Set how many vehicles will spawn
        mainFrame.setVehicleRateMenuListener(e -> {

            String input = JOptionPane.showInputDialog("Enter Amount of Vehicles to Spawn:");
            int vehicleInput = Integer.parseInt(input);
            setVehicleSpawn(vehicleInput);
            System.out.println(getVehicleSpawn());
        });

        // Start the Simulation
        mainFrame.setRunSimMenuListener(e -> {

            gamePane.timerStart();
            System.out.println(e.getActionCommand());
        });

        // Stop the Simulation
        mainFrame.setStopSimMenuListener(e -> {

            gamePane.timerStop();
            System.out.println(e.getActionCommand());
        });

        // Add straight road to game panel
        mainFrame.straightRoadListener(e -> System.out.println(e.getActionCommand()));

        // Add TJunction road to game panel
        mainFrame.tJunctionListener(e -> System.out.println(e.getActionCommand()));

        // Add Four Way road to game panel
        mainFrame.fourWayListener(e -> System.out.println(e.getActionCommand()));

        // Close the edit panel
        mainFrame.cancelListener(e -> {

            mainFrame.turnOffEditPanel();
            System.out.println(e.getActionCommand());
        });
    }

    private int getVehicleSpawn() {

        return vehicleSpawn;
    }

    private void setVehicleSpawn(int vehicleSpawn) {

        this.vehicleSpawn = vehicleSpawn;
    }
}
