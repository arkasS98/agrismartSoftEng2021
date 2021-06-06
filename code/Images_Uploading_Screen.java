package agrismart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Images_Uploading_Screen {

	JFrame frame;
	private JTextField textField;
	public static boolean image_uploaded;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Images_Uploading_Screen window = new Images_Uploading_Screen();
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
	public Images_Uploading_Screen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("\u039C\u03B5\u03C4\u03B1\u03C6\u03CC\u03C1\u03C4\u03C9\u03C3\u03B7 \u0395\u03B9\u03BA\u03CC\u03BD\u03C9\u03BD");
		frame.getContentPane().setBackground(Color.BLUE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("\u0391\u03BD\u03B5\u03B2\u03AC\u03C3\u03C4\u03B5 \u03A4\u03BF\u03C5\u03BB\u03AC\u03C7\u03B9\u03C3\u03C4\u03BF\u03BD 1 \u0395\u03B9\u03BA\u03CC\u03BD\u03B1");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 0);
		gbc_textField.gridwidth = 10;
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 0;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 8;
		gbc_rigidArea_1.gridy = 1;
		frame.getContentPane().add(rigidArea_1, gbc_rigidArea_1);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 8;
		gbc_rigidArea.gridy = 2;
		frame.getContentPane().add(rigidArea, gbc_rigidArea);
		
		JButton btnNewButton = new JButton("\u039C\u03B5\u03C4\u03B1\u03C6\u03CC\u03C1\u03C4\u03C9\u03C3\u03B7 \u0395\u03B9\u03BA\u03CC\u03BD\u03C9\u03BD");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.gridwidth = 10;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 3;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 8;
		gbc_rigidArea_2.gridy = 4;
		frame.getContentPane().add(rigidArea_2, gbc_rigidArea_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Check If At Least 1 Image Uploaded");
		if(chckbxNewCheckBox.isSelected())
		{
		    image_uploaded = true;
		}
		else
		{
			image_uploaded = false;
		}
		GridBagConstraints gbc_chckbxNewCheckBox = new GridBagConstraints();
		gbc_chckbxNewCheckBox.insets = new Insets(0, 0, 5, 0);
		gbc_chckbxNewCheckBox.gridwidth = 10;
		gbc_chckbxNewCheckBox.fill = GridBagConstraints.VERTICAL;
		gbc_chckbxNewCheckBox.gridx = 0;
		gbc_chckbxNewCheckBox.gridy = 5;
		frame.getContentPane().add(chckbxNewCheckBox, gbc_chckbxNewCheckBox);
		
		JButton btnNewButton_1 = new JButton("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
			
		});
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 6;
		gbc_rigidArea_3.gridy = 6;
		frame.getContentPane().add(rigidArea_3, gbc_rigidArea_3);
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridwidth = 10;
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 7;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
