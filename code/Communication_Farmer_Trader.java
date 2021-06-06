import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import java.awt.Color;

public class Communication_Farmer_Trader extends Communication{
	
	Trader trader;
	
	
	 public Communication_Farmer_Trader(Farmer farmer, String topic) {
	        super(farmer, topic);
	    }

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Communication_Farmer_Trader window = new Communication_Farmer_Trader();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Communication_Farmer_Trader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("\u03A0\u03C9\u03BB\u03B7\u03C3\u03B7 \u03C3\u03BF\u03B4\u03B5\u03B9\u03B1\u03C2");
		btnNewButton_1.setBounds(27, 35, 173, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("\u03B5\u03B9\u03B4\u03BF\u03C2 \u03C3\u03BF\u03B4\u03B5\u03B9\u03B1\u03C2_1");
		chckbxNewCheckBox.setBounds(6, 76, 128, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("\u03B5\u03B9\u03B4\u03BF\u03C2 \u03C3\u03BF\u03B4\u03B5\u03B9\u03B1\u03C2_2");
		chckbxNewCheckBox_1.setBounds(6, 102, 128, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("\u03B5\u03B9\u03B4\u03BF\u03C2 \u03C3\u03BF\u03B4\u03B5\u03B9\u03B1\u03C2_3");
		chckbxNewCheckBox_2.setBounds(6, 128, 128, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JButton btnNewButton = new JButton("\u03BF\u03B8\u03BF\u03BD\u03B7 \u03B5\u03C1\u03B3\u03B1\u03BB\u03B5\u03B9\u03C9\u03BD-\u03C0\u03C1\u03BF\u03B9\u03BF\u03BD\u03C4\u03C9\u03BD");
		btnNewButton.setBounds(242, 35, 182, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("\u03BF\u03B8\u03BF\u03BD\u03B7 \u03B4\u03B9\u03B1\u03B8\u03B5\u03C3\u03B9\u03BC\u03C9\u03BD \u03B5\u03BC\u03C0\u03BF\u03C1\u03C9\u03BD");
		btnNewButton_2.setBounds(98, 0, 213, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u03BF\u03B8\u03BF\u03BD\u03B7 \u03C1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03C5");
		btnNewButton_3.setBounds(242, 102, 182, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}


