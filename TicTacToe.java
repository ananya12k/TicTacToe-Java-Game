import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends Frame implements ActionListener {

    CardLayout cardLayout = new CardLayout(10, 10);
    // Welcome screen
    Panel welcomPanel=new Panel();
    Label wel = new Label(" Welcome to Tic Tac Toe!! ");
    Button play = new Button("Play");
    Button exit = new Button("Exit");
    Panel labPanel = new Panel();
    Panel butPanel = new Panel();
    
    // Selection screen which contains Grid Layout
    Panel home = new Panel();
    Label Name = new Label("Tic Tac Toe");
    Button onePlay = new Button("One Player");
    Button twoPlay = new Button("Two Players");

    // Message Panel
    Panel Mess = new Panel();
    Label messLabel = new Label();
    Button confirm = new Button("Confirm");

    // Card Layout panel
    Panel card = new Panel();

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == play) {
            cardLayout.show(card, "Players Screen");
        } else if (a.getSource() == exit) {
            cardLayout.show(card, "Message Screen");
        }

    }

    TicTacToe() {
        setVisible(true);
        setSize(500, 500);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
        add(welcomPanel);
        welcomPanel.setLayout(new BorderLayout());
        labPanel.add(wel);
        welcomPanel.add(labPanel, BorderLayout.CENTER);
        butPanel.setLayout(new FlowLayout());
        butPanel.add(play);
        butPanel.add(exit);
        welcomPanel.add(butPanel, BorderLayout.SOUTH);

        //setting card layout
        card.setLayout(cardLayout);

        // players screen
        home.setLayout(new GridLayout(3, 1));
        home.add(Name, BorderLayout.CENTER);
        home.add(onePlay);
        home.add(twoPlay);

        // Message screen
        Mess.add(messLabel, BorderLayout.CENTER);
        Mess.add(confirm, BorderLayout.SOUTH);

        // Adding Cards to the deck
        card.add("Welcome Screen",welcomPanel);
        card.add("Players Screen", home);
        card.add("Message Screen", Mess);

        add(card);

        play.addActionListener(this);
        exit.addActionListener(this);
        onePlay.addActionListener(this);
        twoPlay.addActionListener(this);
        confirm.addActionListener(this);

    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

    }
}