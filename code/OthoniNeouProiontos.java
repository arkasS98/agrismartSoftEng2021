package agrismart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import java.awt.Insets;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SpinnerNumberModel;

public class OthoniNeouProiontos {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OthoniNeouProiontos window = new OthoniNeouProiontos();
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
	public OthoniNeouProiontos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setTitle("\u03A6\u03CC\u03C1\u03BC\u03B1 \u0394\u03B7\u03BC\u03B9\u03BF\u03C5\u03C1\u03B3\u03AF\u03B1\u03C2 \u039D\u03AD\u03BF\u03C5 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		frame.setBounds(100, 100, 672, 744);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		Button button = new Button("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03B1");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OthoniProionton2 window = new OthoniProionton2();
				window.frame.setVisible(true);
				frame.dispose();
				
			}
		});
		button.setActionCommand("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03B1");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		menuBar.add(button);
		
		Button button_2 = new Button("\u03A0\u03C1\u03BF\u03C6\u03AF\u03BB \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		menuBar.add(button_2);
		
		Button button_1 = new Button("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03B7\u03BD \u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u039F\u03B8\u03CC\u03BD\u03B7");
		menuBar.add(button_1);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{30, 146, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{30, 26, 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea = new GridBagConstraints();
		gbc_rigidArea.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea.gridx = 1;
		gbc_rigidArea.gridy = 0;
		frame.getContentPane().add(rigidArea, gbc_rigidArea);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setText("\u038C\u03BD\u03BF\u03BC\u03B1 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 1;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		GridBagConstraints gbc_formattedTextField = new GridBagConstraints();
		gbc_formattedTextField.insets = new Insets(0, 0, 5, 5);
		gbc_formattedTextField.gridwidth = 6;
		gbc_formattedTextField.fill = GridBagConstraints.HORIZONTAL;
		gbc_formattedTextField.gridx = 1;
		gbc_formattedTextField.gridy = 2;
		frame.getContentPane().add(formattedTextField, gbc_formattedTextField);
		
		Component rigidArea_1 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_1 = new GridBagConstraints();
		gbc_rigidArea_1.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_1.gridx = 1;
		gbc_rigidArea_1.gridy = 3;
		frame.getContentPane().add(rigidArea_1, gbc_rigidArea_1);
		
		textField_1 = new JTextField();
		textField_1.setText("\u03A0\u03B5\u03C1\u03B9\u03B3\u03C1\u03B1\u03C6\u03AE & \u03A4\u03B5\u03C7\u03BD\u03B9\u03BA\u03AD\u03C2 \u03A0\u03C1\u03BF\u03B4\u03B9\u03B1\u03B3\u03C1\u03B1\u03C6\u03AD\u03C2");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_1.setColumns(10);
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 4;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		
		JEditorPane editorPane = new JEditorPane();
		GridBagConstraints gbc_editorPane = new GridBagConstraints();
		gbc_editorPane.gridwidth = 6;
		gbc_editorPane.gridheight = 6;
		gbc_editorPane.insets = new Insets(0, 0, 5, 5);
		gbc_editorPane.fill = GridBagConstraints.BOTH;
		gbc_editorPane.gridx = 1;
		gbc_editorPane.gridy = 5;
		frame.getContentPane().add(editorPane, gbc_editorPane);
		
		Component rigidArea_11 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_11 = new GridBagConstraints();
		gbc_rigidArea_11.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_11.gridx = 7;
		gbc_rigidArea_11.gridy = 5;
		frame.getContentPane().add(rigidArea_11, gbc_rigidArea_11);
		
		Component rigidArea_4 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_4 = new GridBagConstraints();
		gbc_rigidArea_4.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_4.gridx = 0;
		gbc_rigidArea_4.gridy = 6;
		frame.getContentPane().add(rigidArea_4, gbc_rigidArea_4);
		
		Component rigidArea_10 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_10 = new GridBagConstraints();
		gbc_rigidArea_10.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_10.gridx = 7;
		gbc_rigidArea_10.gridy = 6;
		frame.getContentPane().add(rigidArea_10, gbc_rigidArea_10);
		
		Component rigidArea_5 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_5 = new GridBagConstraints();
		gbc_rigidArea_5.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_5.gridx = 0;
		gbc_rigidArea_5.gridy = 7;
		frame.getContentPane().add(rigidArea_5, gbc_rigidArea_5);
		
		Component rigidArea_3 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_3 = new GridBagConstraints();
		gbc_rigidArea_3.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_3.gridx = 7;
		gbc_rigidArea_3.gridy = 7;
		frame.getContentPane().add(rigidArea_3, gbc_rigidArea_3);
		
		Component rigidArea_7 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_7 = new GridBagConstraints();
		gbc_rigidArea_7.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_7.gridx = 0;
		gbc_rigidArea_7.gridy = 8;
		frame.getContentPane().add(rigidArea_7, gbc_rigidArea_7);
		
		Component rigidArea_6 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_6 = new GridBagConstraints();
		gbc_rigidArea_6.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_6.gridx = 7;
		gbc_rigidArea_6.gridy = 8;
		frame.getContentPane().add(rigidArea_6, gbc_rigidArea_6);
		
		Component rigidArea_9 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_9 = new GridBagConstraints();
		gbc_rigidArea_9.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_9.gridx = 7;
		gbc_rigidArea_9.gridy = 9;
		frame.getContentPane().add(rigidArea_9, gbc_rigidArea_9);
		
		Component rigidArea_8 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_8 = new GridBagConstraints();
		gbc_rigidArea_8.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_8.gridx = 0;
		gbc_rigidArea_8.gridy = 10;
		frame.getContentPane().add(rigidArea_8, gbc_rigidArea_8);
		
		Component rigidArea_2 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_2 = new GridBagConstraints();
		gbc_rigidArea_2.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_2.gridx = 1;
		gbc_rigidArea_2.gridy = 11;
		frame.getContentPane().add(rigidArea_2, gbc_rigidArea_2);
		
		textField_2 = new JTextField();
		textField_2.setText("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 12;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"\u0395\u03C1\u03B3\u03B1\u03BB\u03B5\u03AF\u03B1", "\u0388\u03BD\u03B4\u03C5\u03C3\u03B7", "\u03A7\u03B7\u03BC\u03B9\u03BA\u03AC & \u0395\u03BD\u03C4\u03BF\u03BC\u03BF\u03BA\u03C4\u03CC\u03BD\u03B1", "\u03A4\u03C1\u03B1\u03BA\u03C4\u03AD\u03C1", "\u03A6\u03BF\u03C1\u03C4\u03B7\u03B3\u03AC", "\u0392\u03AC\u03BD", "\u03A0\u03BF\u03C4\u03B9\u03C3\u03C4\u03B9\u03BA\u03AC & \u039B\u03BF\u03B9\u03C0\u03AC \u039C\u03B7\u03C7\u03B1\u03BD\u03AE\u03BC\u03B1\u03C4\u03B1 \u0386\u03B4\u03C1\u03B5\u03C5\u03C3\u03B7\u03C2"}));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 13;
		frame.getContentPane().add(comboBox, gbc_comboBox);
		
		Component rigidArea_12 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_12 = new GridBagConstraints();
		gbc_rigidArea_12.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_12.gridx = 1;
		gbc_rigidArea_12.gridy = 14;
		frame.getContentPane().add(rigidArea_12, gbc_rigidArea_12);
		
		textField_3 = new JTextField();
		textField_3.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1");
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_3.setColumns(10);
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 15;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		GridBagConstraints gbc_spinner = new GridBagConstraints();
		gbc_spinner.fill = GridBagConstraints.HORIZONTAL;
		gbc_spinner.insets = new Insets(0, 0, 5, 5);
		gbc_spinner.gridx = 1;
		gbc_spinner.gridy = 16;
		frame.getContentPane().add(spinner, gbc_spinner);
		
		Component rigidArea_13 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_13 = new GridBagConstraints();
		gbc_rigidArea_13.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_13.gridx = 1;
		gbc_rigidArea_13.gridy = 17;
		frame.getContentPane().add(rigidArea_13, gbc_rigidArea_13);
		
		textField_4 = new JTextField();
		textField_4.setText("\u0395\u03B9\u03BA\u03CC\u03BD\u03B5\u03C2 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 18;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		
		JButton btnNewButton = new JButton("\u039C\u03B5\u03C4\u03B1\u03C6\u03CC\u03C1\u03C4\u03C9\u03C3\u03B7 \u0395\u03B9\u03BA\u03CC\u03BD\u03C9\u03BD");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Images_Uploading_Screen window = new Images_Uploading_Screen();
				window.frame.setVisible(true);
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 19;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		Button button_3 = new Button("\u0391\u03C0\u03BF\u03B8\u03AE\u03BA\u03B5\u03C5\u03C3\u03B7 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (Images_Uploading_Screen.image_uploaded == true) {
					Success_Message_Trader window = new Success_Message_Trader();
					window.frame.setVisible(true);}
				else {
					Failed_Message_Trader window = new Failed_Message_Trader();
					window.frame.setVisible(true);}
				}
		});
		
		Component rigidArea_14 = Box.createRigidArea(new Dimension(20, 20));
		GridBagConstraints gbc_rigidArea_14 = new GridBagConstraints();
		gbc_rigidArea_14.insets = new Insets(0, 0, 5, 5);
		gbc_rigidArea_14.gridx = 1;
		gbc_rigidArea_14.gridy = 20;
		frame.getContentPane().add(rigidArea_14, gbc_rigidArea_14);
		GridBagConstraints gbc_button_3 = new GridBagConstraints();
		gbc_button_3.insets = new Insets(0, 0, 5, 5);
		gbc_button_3.gridx = 1;
		gbc_button_3.gridy = 22;
		frame.getContentPane().add(button_3, gbc_button_3);
	}

}
