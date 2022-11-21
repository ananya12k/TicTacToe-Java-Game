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

    // One Player Panel
    Panel oneplay = new Panel();
    Label title = new Label("Tic Tac Toe");
    Button back3 = new Button("Back");
    Label X = new Label("X:");
    Label D = new Label("D:");
    Label O = new Label("O:");
    Label Score = new Label("Scores");
    Button nextRound = new Button("Next Round");
    Button Exit = new Button("Exit");

    // Two Player Panel
    Panel twoplay = new Panel();
    Label nam = new Label("Tic Tac Toe");
    Button back4 = new Button("Back");
    Label x = new Label("X:");
    Label dd = new Label("D:");
    Label o = new Label("O:");
    Label score = new Label("Scores");
    Button nextround = new Button("Next Round");
    Button exitbutton = new Button("Exit");

    // Exiting Dialog
    Dialog exitdDialog = new Dialog(this, "Leave Game", true);
    Panel nePanel = new Panel();
    Label leave = new Label("Leave Game ??");
    Button yes = new Button("Yes");
    Button no = new Button("No");

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
        } else if (a.getSource() == onePlay) {
            cardLayout.show(card, "One Player Screen");
        } else if (a.getSource() == twoPlay) {
            cardLayout.show(card, "Two Players Screen");
        } else if (a.getSource() == nextRound) {
        } else if (a.getSource() == nextround) {
        } else if (a.getSource() == exitbutton) {
            exitdDialog.setVisible(true);
        } else if (a.getSource() == Exit) {
            exitdDialog.setVisible(true);
        } else if (a.getSource() == yes) {
            exitdDialog.dispose();
            System.exit(1);
        } else if (a.getSource() == no) {
            exitdDialog.dispose();
        }
    }

    public void mouseReleased(MouseEvent m) {
    }

    public void mouseClicked(MouseEvent m) {
    }

    public void mouseEntered(MouseEvent m) {
    }

    public void mouseExited(MouseEvent m) {
    }

    public void mousePressed(MouseEvent m) {
    }

    TicTacToe() {
        setVisible(true);
        setSize(600, 650);
        add(welcomPanel);// adding home panel

        // Canvas Class for the tic tac toe square
        class MyCanvas extends Canvas {
            MyCanvas() {
                setBackground(Color.decode("#E9FFDB"));
                repaint();
            }

            public void paint(Graphics g) {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setStroke(new BasicStroke(4.0F));
                g2d.setColor(Color.DARK_GRAY);
                g.drawLine(115, 10, 115, 340);
                g.drawLine(240, 10, 240, 340);
                g.drawLine(10, 115, 340, 115);
                g.drawLine(10, 235, 340, 235);
            }
        }

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
        Font k = new Font("Comic Sans MS", Font.BOLD, 30);
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

        // Exiting Dialog
        exitdDialog.setSize(300, 200);
        exitdDialog.setVisible(false);
        exitdDialog.add(nePanel);
        nePanel.setBackground(Color.ORANGE);
        nePanel.setLayout(null);
        leave.setBounds(45, 30, 190, 40);
        yes.setBounds(40, 110, 80, 40);
        no.setBounds(160, 110, 80, 40);
        leave.setFont(newf);
        leave.setForeground(Color.BLUE);
        yes.setFont(l);
        no.setFont(l);
        no.setBackground(Color.MAGENTA);
        yes.setBackground(Color.MAGENTA);
        nePanel.add(leave);
        nePanel.add(yes);
        nePanel.add(no);

        // One Player Screen
        oneplay.setLayout(null);
        // back button
        back3.setBounds(20, 20, 50, 30);
        back3.setFont(l);
        oneplay.add(back3);
        // title
        title.setBounds(180, 20, 250, 30);
        title.setFont(k);
        title.setForeground(Color.BLUE);
        oneplay.add(title);
        // panel background
        oneplay.setBackground(Color.ORANGE);
        // Canvas
        MyCanvas c1 = new MyCanvas();
        c1.setBounds(100, 150, 350, 350);
        oneplay.add(c1);
        // X,O,D,Scores Labels
        Score.setBounds(220, 70, 70, 40);
        X.setBounds(150, 100, 50, 50);
        O.setBounds(250, 100, 50, 50);
        D.setBounds(350, 100, 50, 50);
        Font labFont = new Font("Comic Sans MS", Font.BOLD, 20);
        Score.setFont(labFont);
        X.setFont(labFont);
        D.setFont(labFont);
        O.setFont(labFont);
        oneplay.add(X);
        oneplay.add(D);
        oneplay.add(O);
        oneplay.add(Score);
        // next round and exit button
        nextRound.setBounds(110, 510, 140, 50);
        Exit.setBounds(340, 510, 100, 50);
        nextRound.setFont(f);
        Exit.setFont(f);
        nextRound.setBackground(Color.MAGENTA);
        Exit.setBackground(Color.MAGENTA);
        oneplay.add(nextRound);
        oneplay.add(Exit);

        // Two Player Screen
        twoplay.setLayout(null);
        // back button
        back4.setBounds(20, 20, 50, 30);
        back4.setFont(l);
        twoplay.add(back4);
        // title
        nam.setBounds(180, 20, 250, 30);
        nam.setFont(k);
        nam.setForeground(Color.BLUE);
        twoplay.add(nam);
        // panel background
        twoplay.setBackground(Color.ORANGE);
        // Canvas
        MyCanvas c2 = new MyCanvas();
        c2.setBounds(100, 150, 350, 350);
        twoplay.add(c2);
        // X,O,D,Scores Labels
        score.setBounds(220, 70, 70, 40);
        x.setBounds(150, 100, 50, 50);
        o.setBounds(250, 100, 50, 50);
        dd.setBounds(350, 100, 50, 50);
        score.setFont(labFont);
        x.setFont(labFont);
        dd.setFont(labFont);
        o.setFont(labFont);
        twoplay.add(x);
        twoplay.add(dd);
        twoplay.add(o);
        twoplay.add(score);
        // next round and exit button
        nextround.setBounds(110, 510, 140, 50);
        exitbutton.setBounds(340, 510, 100, 50);
        nextround.setFont(f);
        exitbutton.setFont(f);
        nextround.setBackground(Color.MAGENTA);
        exitbutton.setBackground(Color.MAGENTA);
        twoplay.add(nextround);
        twoplay.add(exitbutton);

        // Adding Cards to the deck
        card.add("Welcome Screen", welcomPanel);
        card.add("Players Screen", home);
        card.add("One Player Screen", oneplay);
        card.add("Two Players Screen", twoplay);

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
        yes.addActionListener(this);
        no.addActionListener(this);
        nextRound.addActionListener(this);
        nextround.addActionListener(this);
        exitbutton.addActionListener(this);
        Exit.addActionListener(this);

    }

    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

    }
}