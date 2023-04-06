import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MemoryGame extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JButton[] buttons;
    private ImageIcon[] images;
    private int[] buttonIndex;
    private int numClicks;
    private int numMatches;
    private int firstIndex;
    private int secondIndex;

    public MemoryGame() {
        super("Memory Game");

        numClicks = 0;
        numMatches = 0;
        firstIndex = -1;
        secondIndex = -1;

        images = new ImageIcon[6];
        images[0] = new ImageIcon("C:\\Users\\04shakar2\\eclipse-workspace\\MemoryGame\\momory_pics\\image_bitcoin.jpg");
        images[1] = new ImageIcon("C:\\Users\\04shakar2\\eclipse-workspace\\MemoryGame\\momory_pics\\image_luna.jpg");
        images[2] = new ImageIcon("C:\\Users\\04shakar2\\eclipse-workspace\\MemoryGame\\momory_pics\\image_avalanch.jpg");
        images[3] = new ImageIcon("C:\\Users\\04shakar2\\eclipse-workspace\\MemoryGame\\momory_pics\\image_bitcoin.jpg");
        images[4] = new ImageIcon("C:\\Users\\04shakar2\\eclipse-workspace\\MemoryGame\\momory_pics\\image_luna.jpg");
        images[5] = new ImageIcon("C:\\Users\\04shakar2\\eclipse-workspace\\MemoryGame\\momory_pics\\image_avalanch.jpg");

        buttonIndex = new int[2];
        for (int i = 0; i < buttonIndex.length; i++) {
            buttonIndex[i] = -1;
        }

        buttons = new JButton[6];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton(" ");
            buttons[i].addActionListener(this);
        }

        JPanel panel = new JPanel(new GridLayout(3, 3));
        for (int i = 0; i < buttons.length; i++) {
            panel.add(buttons[i]);
        }

        add(panel);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new MemoryGame();
    }
}

