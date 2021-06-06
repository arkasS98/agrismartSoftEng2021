import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;

public class Communication_Farmer_Agri extends COMMUNICATION{
	
	//attributes
		protected Agriculturist agriculturist;
		
		//Constructor
		public Communication_Farmer_Agri(Farmer farmer, Agriculturist agriculturist, String topic) {
			super(farmer, topic);
			this.agriculturist = agriculturist;
		}
		
		//Methods
		public Agriculturist getAgriculturist() {
			return this.agriculturist;
		}

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Communication_Farmer_Agri window = new Communication_Farmer_Agri();
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
	public Communication_Farmer_Agri() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setForeground(Color.BLACK);
		frame.setBounds(100, 100, 450, 348);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("\u0391\u03BD\u03B1\u03B6\u03B7\u03C4\u03B7\u03C3\u03B7 \u03BA\u03BF\u03BD\u03C4\u03B9\u03BD\u03C9\u03BD \u03B3\u03B5\u03C9\u03C0\u03BF\u03BD\u03C9\u03BD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 32, 187, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u03B5\u03C1\u03B3\u03B1\u03BB\u03B5\u03B9\u03C9\u03BD");
		btnNewButton_1.setBounds(10, 92, 187, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Forum \u03B1\u03BD\u03B1\u03C1\u03C4\u03B7\u03C3\u03B7\u03C2 \u03C3\u03C7\u03BF\u03BB\u03B9\u03C9\u03BD");
		btnNewButton_2.setBounds(10, 187, 187, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u03C0\u03C1\u03BF\u03B9\u03BF\u03BD\u03C4\u03C9\u03BD");
		btnNewButton_3.setBounds(10, 140, 187, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u03C1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03C5");
		btnNewButton_4.setBounds(10, 275, 187, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		textField = new JTextField();
		textField.setText("\u0391\u03BD \u03C4\u03BF \u03C0\u03C1\u03BF\u03B2\u03BB\u03B7\u03BC\u03B1 \u03B5\u03B9\u03BD\u03B1\u03B9 \u03C3\u03BF\u03B2\u03B1\u03C1\u03BF \u03BA\u03BB\u03B5\u03B9\u03C3\u03C4\u03B5 \u03C1\u03B1\u03BD\u03C4\u03B5\u03B2\u03BF\u03C5:");
		textField.setBounds(10, 233, 257, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}

}

 
