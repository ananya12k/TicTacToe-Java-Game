import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {
    CardLayout cardLayout = new CardLayout(20, 20);
    Font f = new Font("Comic Sans MS", Font.BOLD, 20);
    // Welcome screen
    Panel welcomPanel = new Panel();
    Label wel = new Label(" Welcome to Tic Tac Toe!! ");
    Button play = new Button("Play");
    Button exit = new Button("Exit");
    Panel pic=new Panel();
    JLabel imagelabel=new JLabel();
    // Selection screen which contains Grid Layout
    Panel home = new Panel();
    Label Name = new Label("Tic Tac Toe");
    Button onePlay = new Button("One Player");
    Button back2 = new Button("Back");

    // Message Panel
    JPanel Mess = new JPanel();
    Label messLabel = new Label();
    Button confirm = new Button("Confirm");
    Button back1 = new Button("Back");

    // Game Panel
    Label X = new Label("X:");
    Label D = new Label("D:");
    Label O = new Label("O:");

    // Card Layout panel
    JPanel card = new JPanel();

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == play) {
            cardLayout.show(card, "Players Screen");
        } else if (a.getSource() == exit) {
            cardLayout.show(card, "Message Screen");
        } else if (a.getSource() == back1) {
            cardLayout.show(card, "Welcome Screen");
        } else if (a.getSource() == back2) {
            cardLayout.show(card, "Welcome Screen");
        } else if (a.getSource() == confirm) {
            System.exit(1);
        }

    }

    TicTacToe() {
        setVisible(true);
        setSize(800, 800);
        add(welcomPanel);
        welcomPanel.setBackground(Color.ORANGE);
        welcomPanel.setLayout(null);
        wel.setBounds(250, 10, 250, 50);
        wel.setFont(f);
        setForeground(Color.BLUE);
        welcomPanel.add(wel);
        imagelabel.setBounds(80, 90, 628, 611);
        imagelabel.setIcon(new ImageIcon("D:\\Documents\\DDU\\DDU Sem 3\\JAVA\\TicTacToe\\tictactoe.jpg"));
        // pic.add(imagelabel);
        welcomPanel.add(imagelabel);
        // setting card layout
        card.setLayout(cardLayout);

        // players screen
        home.setLayout(new FlowLayout());
        home.setBackground(Color.CYAN);
        home.add(Name);
        home.add(onePlay);
        home.add(back2);

        // Message screen
        Mess.setLayout(new FlowLayout(FlowLayout.CENTER));
        Mess.setBackground(Color.RED);
        Mess.add(back1);
        Mess.add(confirm);

        // Adding Cards to the deck
        card.add("Welcome Screen", welcomPanel);
        card.add("Players Screen", home);
        card.add("Message Screen", Mess);

        // Adding Card to Frame
        add(card);
        card.setBackground(Color.lightGray);

        // Adding listeners to the buttons
        play.addActionListener(this);
        exit.addActionListener(this);
        onePlay.addActionListener(this);
        confirm.addActionListener(this);
        back1.addActionListener(this);
        back2.addActionListener(this);

    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

    }
}