package Model;

import javax.swing.*;

public class NumberedButton extends JButton {
    private int number;

    public NumberedButton() {
        super();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
