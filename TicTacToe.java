import java.awt.*;
import java.awt.event.*;

public class TicTacToe extends Frame {
    Label L1 = new Label("Player 1");
    Label L2 = new Label("Player 2");



    
    TicTacToe() {
        setVisible(true);
        setSize(600, 600);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

    }
}