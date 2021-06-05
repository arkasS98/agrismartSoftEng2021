import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.SwingUtilities;
public class GUI extends JPanel {
    public GUI() {
        String[] btnTexts = {"One", "Two", "Three", "Four", "Five", "Exit"};

        JToolBar toolBar = new JToolBar();
        for (int i = 0; i < btnTexts.length; i++) {
            JButton button = new JButton(btnTexts[i]);
            if (i != btnTexts.length - 1) {
                toolBar.add(button);
                toolBar.addSeparator();
            } else {
                toolBar.add(Box.createHorizontalGlue());
                toolBar.add(button);
            }
        }

        setLayout(new BorderLayout());
        add(toolBar, BorderLayout.PAGE_START);

        setPreferredSize(new Dimension(400, 300));

    }

    private static void createAndShowGui() {
        GUI mainPanel = new GUI();

        JFrame frame = new JFrame("BoxLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(mainPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> createAndShowGui());
    }
}