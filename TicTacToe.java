import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener {
    CardLayout cardLayout = new CardLayout(20, 20);
    Font f = new Font("Comic Sans MS", Font.BOLD, 18);

    // Welcome screen
    Panel welcomPanel = new Panel();
    Label wel = new Label(" Welcome to Tic Tac Toe!! ");
    Button play = new Button("Play");
    Button exit = new Button("Exit");
    JLabel imagelabel = new JLabel();

    // Selection screen
    Panel home = new Panel();
    Label Name = new Label("Tic Tac Toe");
    Button onePlay = new Button("One Player");
    Button twoPlay = new Button("Two Players");
    Button back2 = new Button("Back");

    // Message Panel
    Dialog d=new Dialog(this,"Exit Dialog Box",true);
    JPanel Mess = new JPanel();
    Label messLabel = new Label();
    Button confirm = new Button("Confirm");
    Button back1 = new Button("Back");

    // Game Panel
    Label X = new Label("X:");
    Label D = new Label("D:");
    Label O = new Label("O:");

    // Card Layout Container
    Container card = getContentPane();

    public void actionPerformed(ActionEvent a) {
        if (a.getSource() == play) {
            cardLayout.show(card, "Players Screen");
        } else if (a.getSource() == exit) {
            d.setVisible(true);
        } else if (a.getSource() == back1) {
            cardLayout.show(card, "Welcome Screen");
            d.dispose();
        } else if (a.getSource() == back2) {
            cardLayout.show(card, "Welcome Screen");
        } else if (a.getSource() == confirm) {
            System.exit(1);
        }

    }

    TicTacToe() {
        setVisible(true);
        setSize(600, 600);
        add(welcomPanel);// adding home panel

        // Home Screen
        welcomPanel.setBackground(Color.ORANGE);
        welcomPanel.setLayout(null);
        wel.setBounds(150, 10, 250, 50);
        wel.setFont(f);
        wel.setForeground(Color.BLUE);
        welcomPanel.add(wel);
        imagelabel.setBounds(110, 90, 320, 320);
        imagelabel.setIcon(new ImageIcon("D:\\Documents\\DDU\\DDU Sem 3\\JAVA\\TicTacToe\\tictactoe.jpg"));
        welcomPanel.add(imagelabel);
        play.setBounds(120, 450, 100, 50);
        exit.setBounds(320, 450, 100, 50);
        play.setBackground(Color.MAGENTA);
        exit.setBackground(Color.MAGENTA);
        play.setFont(f);
        exit.setFont(f);
        welcomPanel.add(play);
        welcomPanel.add(exit);

        // setting card layout in Container
        card.setLayout(cardLayout);
        card.setBackground(Color.BLACK);

        // Players screen
        home.setLayout(new FlowLayout());
        home.setBackground(Color.ORANGE);
        home.add(Name);
        home.add(onePlay);
        home.add(back2);

        // Message screen
        d.setSize(200,150);
        // d.setLayout(new FlowLayout());
        d.setVisible(false);
        d.add(Mess);
        Mess.setLayout(new FlowLayout(FlowLayout.CENTER));
        Mess.setBackground(Color.ORANGE);
        back1.setBounds(80, 90, 90, 50);
        confirm.setBounds(130, 90, 90, 50);
        back1.setBackground(Color.MAGENTA);
        confirm.setBackground(Color.MAGENTA);
        Font l = new Font("Comic Sans MS", Font.BOLD, 15);
        back1.setFont(l);
        confirm.setFont(l);
        Mess.add(back1);
        Mess.add(confirm);

        // Adding Cards to the deck
        card.add("Welcome Screen", welcomPanel);
        card.add("Players Screen", home);
        // card.add("Message Screen", d);

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