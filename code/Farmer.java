import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Farmer extends User{
	
	public Farmer(String mail, String pass, String usname, String fname, String lname, String addr, int num) {
		super(mail, pass, usname, fname, lname, addr, num);
		
		// TODO Auto-generated constructor stub
	}
	
	ArrayList <Product> ListOfProducts;
    ArrayList <Cultivation> ListOfCultivations;

    
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Farmer window = new Farmer();
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
	public Farmer() {
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
		
		
		
		JButton btnNewButton = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u03A0\u03C1\u03BF\u03C6\u03B9\u03BB");
		btnNewButton.setBounds(22, 72, 171, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\u0391\u03A1\u03A7\u0399\u039A\u0397 \u039F\u0398\u039F\u039D\u0397 \u03A7\u03A1\u0397\u03A3\u03A4\u0397");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 11, 183, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u0395\u03C0\u03B9\u03BA\u03BF\u03B9\u03BD\u03C9\u03BD\u03B9\u03B1\u03C2");
		btnNewButton_1.setBounds(239, 72, 153, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u039A\u03BF\u03BD\u03C4\u03B9\u03BD\u03C9\u03BD \u0393\u03B5\u03C9\u03C0\u03BF\u03BD\u03C9\u03BD");
		btnNewButton_2.setBounds(22, 125, 171, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("\u039F\u03B8\u03BF\u03BD\u03B7 \u0395\u03C1\u03B3\u03B1\u03BB\u03B5\u03B9\u03C9\u03BD");
		btnNewButton_3.setBounds(239, 125, 153, 23);
		frame.getContentPane().add(btnNewButton_3);
	}
}
