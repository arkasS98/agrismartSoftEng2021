package agrismart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Failed_Message_Trader {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Failed_Message_Trader window = new Failed_Message_Trader();
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
	public Failed_Message_Trader() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u03A3\u03C6\u03AC\u03BB\u03BC\u03B1");
		frame.getContentPane().setBackground(Color.BLUE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 4;
		gbc_rigidArea_3.gridy = 0;
		frame.getContentPane().add(rigidArea_3, gbc_rigidArea_3);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 4;
		gbc_rigidArea_2.gridy = 1;
		frame.getContentPane().add(rigidArea_2, gbc_rigidArea_2);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 4;
		gbc_rigidArea_1.gridy = 2;
		frame.getContentPane().add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 4;
		gbc_rigidArea.gridy = 3;
		frame.getContentPane().add(rigidArea, gbc_rigidArea);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setText("\u03A3\u03C6\u03AC\u03BB\u03BC\u03B1! \u0391\u03C0\u03B1\u03B9\u03C4\u03B5\u03AF\u03C4\u03B1\u03B9 \u03C4\u03BF\u03C5\u03BB\u03AC\u03C7\u03B9\u03C3\u03C4\u03BF\u03BD \u03BC\u03AF\u03B1 \u03C0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03B9\u03BA\u03AE \u03B5\u03B9\u03BA\u03CC\u03BD\u03B1 \u03C4\u03BF\u03C5 \u03C0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2.");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 12;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 4;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 4;
		gbc_rigidArea_4.gridy = 5;
		frame.getContentPane().add(rigidArea_4, gbc_rigidArea_4);
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 12;
		gbc_btnNewButton.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 6;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
