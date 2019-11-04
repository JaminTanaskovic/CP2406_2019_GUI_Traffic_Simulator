package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JPanel implements ActionListener {

    private JPanel setupSimPanel = new JPanel();

    private JMenuItem newCity = new JMenuItem("New City");
    public JTextField modeLabelStats = new JTextField("Sim State");
    private JMenuItem openCity = new JMenuItem("Open a City");
    private JMenuItem saveCity = new JMenuItem("Save a City");

    private JMenuItem updateRate = new JMenuItem("Set Update Rate");
    private JMenuItem vehicleRate = new JMenuItem("Set Vehicle Spawn Rate");
    private JMenuItem runSim = new JMenuItem("Run The Simulator");
    private JMenuItem stopSim = new JMenuItem("Stop The Simulator");
    public JTextField statusLabelStats = new JTextField("Status stats");
    private JMenuItem editCity = new JMenuItem("Edit a City");


    public MainFrame() {

        // Creating menu lists
        JMenuBar menuBar = new JMenuBar();

        JMenu m1 = new JMenu("City Editing");
        JMenu m2 = new JMenu("Simulation");
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

        // Grid layouts for bottom and sim panel
        JPanel bottomPanel = new JPanel();

        bottomPanel.setLayout(new GridLayout(1, 4));
        setupSimPanel.setLayout(new GridLayout(30, 30));

        // Basics setup for blankPanel
        JPanel blankPanel = new JPanel();
        JButton blankButton = new JButton("Traffic sim");

        blankButton.setBackground(Color.black);
        blankButton.setPreferredSize(new Dimension(500, 500));
        blankPanel.add(blankButton);

        // adding elements to bottomPanel
        JLabel modeLabel = new JLabel("Mode", SwingConstants.RIGHT);
        JLabel statusLabel = new JLabel("Status", SwingConstants.RIGHT);

        bottomPanel.add(statusLabel);
        bottomPanel.add(modeLabel);

        bottomPanel.add(modeLabelStats);
        bottomPanel.add(statusLabelStats);

        // Set text fields as non focusable so they can be used as display only
        modeLabelStats.setFocusable(false);
        statusLabelStats.setFocusable(false);

        // Set default background colors for menu's and bottomPanel and blankPanel
        bottomPanel.setBackground(Color.cyan);
        menuBar.setBackground(Color.cyan);
        blankPanel.setBackground(Color.black);

        // Adding Components to the frame.
        // creating the frame and panel
        JFrame frame = new JFrame("GUI Traffic Simulator");
        JPanel gamePane = new JPanel();

        frame.add(gamePane, BorderLayout.CENTER);
        frame.add(setupSimPanel, BorderLayout.CENTER);
        //       frame.add(blankPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);
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

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public JPanel getPanel() {
        return this.setupSimPanel;
    }

    public void clickEditButton() {
        editCity.doClick();
    }

    public void clickNewButton() {
        newCity.doClick();
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

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}

