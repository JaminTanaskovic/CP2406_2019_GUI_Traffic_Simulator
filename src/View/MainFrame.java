package View;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JPanel implements ActionListener {

    private final GamePane gamePane;

    // creating the frame and panel
    private JFrame frame = new JFrame("GUI Traffic Simulator");

    // Creating the MenuBar and adding components
    private JMenuBar menuBar = new JMenuBar();


    // Creating Menu Headers
    private JMenu m1 = new JMenu("City Editing");
    private JMenu m2 = new JMenu("Simulation");

    //creating sub menu choices
    private JMenuItem newCity = new JMenuItem("New City");
    private JMenuItem editCity = new JMenuItem("Edit a City");
    private JMenuItem openCity = new JMenuItem("Open a City");
    private JMenuItem saveCity = new JMenuItem("Save a City");

    private JMenuItem updateRate = new JMenuItem("Set Update Rate");
    private JMenuItem vehicleRate = new JMenuItem("Set Vehicle Spawn Rate");
    private JMenuItem runSim = new JMenuItem("Run The Simulator");
    private JMenuItem stopSim = new JMenuItem("Stop The Simulator");

    //Creating the panel at bottom and adding components
    private JPanel bottomPanel = new JPanel();

    private JLabel modeLabel = new JLabel("Mode", SwingConstants.RIGHT);
    private JTextField modeLabelStats = new JTextField("Mode stats");
    private JLabel statusLabel = new JLabel("Status", SwingConstants.RIGHT);
    private JTextField statusLabelStats = new JTextField("Status stats");

    //Creating the panel at top and adding components
    private JPanel editPanel = new JPanel();

    private JButton straightRoadButton = new JButton("Straight Road");
    private JButton tJunctionButton = new JButton("TJunction Road");
    private JButton fourWayButton = new JButton("Four Way Road");
    private JButton cancelEditButton = new JButton("Close Edit Selections");


    public MainFrame(GamePane gamePane) {

        // Accessing GamePane
        this.gamePane = gamePane;

        // Add menu headers to main menu bar
        menuBar.add(m1);
        menuBar.add(m2);

        // Add items for menu 1
        m1.add(newCity);
        m1.add(editCity);
        m1.add(openCity);
        m1.add(saveCity);

        // Add items for menu 2
        m2.add(updateRate);
        m2.add(vehicleRate);
        m2.add(runSim);
        m2.add(stopSim);

        // Add bottom panel
        bottomPanel.setLayout(new GridLayout(1, 4));
        editPanel.setLayout(new GridLayout(4, 1));

        // Add labels to bottomPanel
        bottomPanel.add(modeLabel);
        bottomPanel.add(modeLabelStats);
        bottomPanel.add(statusLabel);
        bottomPanel.add(statusLabelStats);

        // set editPanel to be invisible and un focusable
        editPanel.setVisible(false);
        editPanel.setFocusable(false);

        // Add labels editPanel
        editPanel.add(straightRoadButton);
        editPanel.add(tJunctionButton);
        editPanel.add(fourWayButton);
        editPanel.add(cancelEditButton);

        // Set text fields as non focusable so they can be used as display only
        modeLabelStats.setFocusable(false);
        statusLabelStats.setFocusable(false);

        // Set default background colors for menu's and bottompane
        bottomPanel.setBackground(Color.cyan);
        menuBar.setBackground(Color.cyan);
        editPanel.setBackground(Color.cyan);

        // Adding Components to the frame.
        frame.add(editPanel, BorderLayout.WEST);
        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(gamePane, BorderLayout.CENTER);
        frame.add(menuBar, BorderLayout.NORTH);


        // Adding action listeners to be handled in controller
        stopSim.addActionListener(this);
        runSim.addActionListener(this);
        vehicleRate.addActionListener(this);
        updateRate.addActionListener(this);
        newCity.addActionListener(this);
        openCity.addActionListener(this);
        editCity.addActionListener(this);
        saveCity.addActionListener(this);
        straightRoadButton.addActionListener(this);
        tJunctionButton.addActionListener(this);
        fourWayButton.addActionListener(this);
        cancelEditButton.addActionListener(this);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void turnOnEditPanel() {

        editPanel.setVisible(true);
        editPanel.setFocusable(true);
        menuBar.setVisible(false);
        menuBar.setFocusable(false);
    }

    public void turnOffEditPanel() {

        editPanel.setVisible(false);
        editPanel.setFocusable(false);
        menuBar.setVisible(true);
        menuBar.setFocusable(true);
    }

    public void setNewCityMenuListener(ActionListener listener) {
        newCity.addActionListener(listener);
    }

    public void setEditCityMenuListener(ActionListener listener) {
        editCity.addActionListener(listener);
    }

    public void setOpenCityMenuListener(ActionListener listener) {
        openCity.addActionListener(listener);
    }

    public void setSaveCityMenuListener(ActionListener listener) {
        saveCity.addActionListener(listener);
    }

    public void setUpdateRateMenuListener(ActionListener listener) {
        updateRate.addActionListener(listener);
    }

    public void setVehicleRateMenuListener(ActionListener listener) {
        vehicleRate.addActionListener(listener);
    }

    public void setRunSimMenuListener(ActionListener listener) {
        runSim.addActionListener(listener);
    }

    public void setStopSimMenuListener(ActionListener listener) {
        stopSim.addActionListener(listener);
    }

    public void straightRoadListener(ActionListener listener) {
        straightRoadButton.addActionListener(listener);
    }

    public void tJunctionListener(ActionListener listener) {
        tJunctionButton.addActionListener(listener);
    }

    public void fourWayListener(ActionListener listener) {
        fourWayButton.addActionListener(listener);
    }

    public void cancelListener(ActionListener listener) {
        cancelEditButton.addActionListener(listener);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

