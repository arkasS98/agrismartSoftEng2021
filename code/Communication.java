import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.time.*;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JTextField;

	
		
		//attributes
		protected Farmer farmer;
		protected LocalDate date;
		protected LocalTime time;
		protected String topic = "no value";
		private JButton btnCommunicate;
		private JTextField textField;
		private JTextField textField_1;
		
		//Constructor
		public Communication(Farmer farmer, String topic) 
		{
			this.farmer = farmer;
			this.topic = topic;
			LocalDate dObj = LocalDate.now();
			LocalTime tObj = LocalTime.now();
			this.date = dObj;
			this.time = tObj;
		}
		
		
		
		//Methods
		
		//    *****Sets&Gets*****    
		public LocalDate getDate() {
			return this.date;
		}
		
		public LocalTime getTime() {
			return this.time;
		}
		
		public Farmer getFarmer() {
			return this.farmer;
		}
		
		public String getTopic() {
			return topic;
		}
		
		public void setTopic(String topic) {
			this.topic = topic;
		}
		//    *****Sets&Gets*****    
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					COMMUNICATION window = new COMMUNICATION();
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
	public COMMUNICATION() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(Color.GRAY);
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setBackground(Color.BLUE);
		frame.getContentPane().setForeground(Color.BLUE);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnCommunicate = new JButton("Communicate");
		
		btnCommunicate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
				
		});
		
		btnCommunicate.setBounds(27, 11, 123, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton = new JButton("CallAgriculturist");
		btnNewButton.setBounds(27, 84, 109, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CallTrader");
		btnNewButton_1.setBounds(27, 155, 109, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setText("\u0391\u03BD \u03C5\u03C0\u03B1\u03C1\u03C7\u03B5\u03B9 \u03C0\u03C1\u03BF\u03B2\u03BB\u03B7\u03BC\u03B1 \u03BC\u03B5 \u03C4\u03B9\u03C2 \u03BA\u03B1\u03BB\u03BB\u03B9\u03B5\u03C1\u03B3\u03B5\u03B9\u03B5\u03C2 \u03B5\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03B7\u03C3\u03C4\u03B5 \u03BC\u03B5 \u03B3\u03B5\u03C9\u03C0\u03BF\u03BD\u03BF");
		textField.setBounds(27, 53, 340, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("\u0391\u03BD \u03B5\u03BD\u03B4\u03B9\u03B1\u03C6\u03B5\u03C1\u03B5\u03C3\u03C4\u03B5 \u03B3\u03B9\u03B1 \u03B1\u03B3\u03C9\u03C1\u03B1\u03C0\u03C9\u03BB\u03B7\u03C3\u03B9\u03B5\u03C2 \u03B5\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03B7\u03C3\u03C4\u03B5 \u03BC\u03B5 \u03B5\u03BC\u03C0\u03BF\u03C1\u03BF");
		textField_1.setBounds(27, 124, 314, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
	}
}
