import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener, MouseListener {
    // CardLayout instance
    CardLayout cardLayout = new CardLayout(20, 20);

    // Setting font
    Font f = new Font("Comic Sans MS", Font.BOLD, 20);

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

    // Message Dialog
    Dialog d = new Dialog(this, "Exit Dialog Box", true);
    JPanel Mess = new JPanel();
    Button confirm = new Button("Confirm");
    Button back1 = new Button("Back");

    // Common Label for the game
    Label X = new Label("X:");
    Label D = new Label("D:");
    Label O = new Label("O:");

    // One Player Panel
    Panel oneplay = new Panel();
    Button back3 = new Button("Back");

    // Two Player Panel
    Panel twoplay = new Panel();
    Button back4 = new Button("Back");

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
        } else if (a.getSource() == back3) {
            cardLayout.show(card, "Players Screen");
        } else if (a.getSource() == back4) {
            cardLayout.show(card, "Players Screen");
        }else if (a.getSource() == onePlay) {
            cardLayout.show(card, "One Player Screen");
        }else if (a.getSource() == twoPlay) {
            cardLayout.show(card, "Two Players Screen");
        }

    }

    public void mouseReleased(MouseEvent m) {}
    public void mouseClicked(MouseEvent m) {}
    public void mouseEntered(MouseEvent m) {}
    public void mouseExited(MouseEvent m) {}
    public void mousePressed(MouseEvent m) {}
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
        home.setLayout(null);
        home.setBackground(Color.ORANGE);
        Name.setBounds(180, 20, 250, 50);
        Font k = new Font("Comic Sans MS", Font.BOLD, 35);
        Name.setFont(k);
        Name.setForeground(Color.BLUE);
        onePlay.setBounds(180, 150, 200, 60);
        twoPlay.setBounds(180, 250, 200, 60);
        back2.setBounds(180, 350, 200, 60);
        Font newf = new Font("Comic Sans MS", Font.BOLD, 25);
        onePlay.setFont(newf);
        twoPlay.setFont(newf);
        back2.setFont(newf);
        onePlay.setBackground(Color.MAGENTA);
        twoPlay.setBackground(Color.MAGENTA);
        back2.setBackground(Color.MAGENTA);
        home.add(Name);
        home.add(onePlay);
        home.add(twoPlay);
        home.add(back2);

        // Message dialog
        d.setSize(200, 200);
        d.setVisible(false);
        d.add(Mess);
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

        // One Player Screen
        oneplay.setLayout(new FlowLayout());
        oneplay.add(back3);
        oneplay.setBackground(Color.ORANGE);

        // Two Player Screen
        twoplay.setLayout(new FlowLayout());
        twoplay.add(back4);
        twoplay.setBackground(Color.ORANGE);

        // Adding Cards to the deck
        card.add("Welcome Screen", welcomPanel);
        card.add("Players Screen", home);
        card.add("One Player Screen",oneplay);
        card.add("Two Players Screen",twoplay);

        // Adding listeners to the buttons
        play.addActionListener(this);
        exit.addActionListener(this);
        onePlay.addActionListener(this);
        twoPlay.addActionListener(this);
        confirm.addActionListener(this);
        back1.addActionListener(this);
        back2.addActionListener(this);
        back3.addActionListener(this);
        back4.addActionListener(this);

    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

    }
}