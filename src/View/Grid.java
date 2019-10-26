package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grid extends JPanel {

    //may need stuff from main

    public Grid(int rows, int cols) {

        int tot = rows * cols;
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(rows, cols));

        for (int i = 0; i < tot; i++) {

            final int[] flag = {1}; //  the variable denotes if something has been clicked
            int buttonIdentifier = (i + 1); // gives each button a number identifier

            JButton button = new JButton();
            button.setPreferredSize(new Dimension(20, 20));
            button.setBackground(Color.white);
            panel.add(button);

            button.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {

                    if (flag[0] == 1) { // when button is pressed the button color goes grey
                        button.setBackground(Color.gray);
                        flag[0] = 0;
                        System.out.println(buttonIdentifier);
                    } else if (flag[0] == 0) { // when button is pressed the button color goes white again
                        button.setBackground(Color.white);
                        System.out.println(buttonIdentifier);
                        flag[0] = 1;
                    }
                }
            });
        }
    }
}