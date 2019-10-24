package View;

import Model.NumberedButton;

import javax.swing.*;
import java.awt.*;

public class GamePane2 extends JPanel {

    private int columnLength = 30;
    private int rowLength = 30;
    private int buttonTotal = columnLength + rowLength;
    private NumberedButton[] buttons;

    public GamePane2() {
        setPreferredSize(new Dimension(600, 600));
        setLayout(new GridLayout(30, 30));
        buttons = new NumberedButton[buttonTotal];
        for (int i = 0; i < buttons.length; ++i) {
            buttons[i] = new NumberedButton();
            buttons[i].setNumber(i);
            add(buttons[i]);
        }
    }
}
