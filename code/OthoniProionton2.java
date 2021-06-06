package agrismart;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import java.awt.Color;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OthoniProionton2 {

	JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JButton btnNewButton_1_1_2;
	private Component verticalStrut_4;
	private Component verticalStrut_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OthoniProionton2 window = new OthoniProionton2();
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
	public OthoniProionton2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLUE);
		frame.setBackground(Color.WHITE);
		frame.setTitle("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03B1");
		frame.setBounds(100, 100, 672, 566);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, Double.MIN_VALUE, 0.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_1 = new GridBagConstraints();
		gbc_verticalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_1.gridx = 5;
		gbc_verticalStrut_1.gridy = 1;
		frame.getContentPane().add(verticalStrut_1, gbc_verticalStrut_1);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut = new GridBagConstraints();
		gbc_verticalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut.gridx = 5;
		gbc_verticalStrut.gridy = 2;
		frame.getContentPane().add(verticalStrut, gbc_verticalStrut);
		
		Box verticalBox = Box.createVerticalBox();
		GridBagConstraints gbc_verticalBox = new GridBagConstraints();
		gbc_verticalBox.insets = new Insets(0, 0, 5, 5);
		gbc_verticalBox.gridx = 5;
		gbc_verticalBox.gridy = 3;
		frame.getContentPane().add(verticalBox, gbc_verticalBox);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setText("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD 1");
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 0;
		gbc_textField.gridy = 4;
		frame.getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		Component horizontalStrut = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut = new GridBagConstraints();
		gbc_horizontalStrut.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut.gridx = 1;
		gbc_horizontalStrut.gridy = 4;
		frame.getContentPane().add(horizontalStrut, gbc_horizontalStrut);
		
		Component horizontalStrut_1 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_1 = new GridBagConstraints();
		gbc_horizontalStrut_1.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_1.gridx = 2;
		gbc_horizontalStrut_1.gridy = 4;
		frame.getContentPane().add(horizontalStrut_1, gbc_horizontalStrut_1);
		
		Component horizontalStrut_2 = Box.createHorizontalStrut(20);
		GridBagConstraints gbc_horizontalStrut_2 = new GridBagConstraints();
		gbc_horizontalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_horizontalStrut_2.gridx = 3;
		gbc_horizontalStrut_2.gridy = 4;
		frame.getContentPane().add(horizontalStrut_2, gbc_horizontalStrut_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setText("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1: \u0395\u03C1\u03B3\u03B1\u03BB\u03B5\u03AF\u03B1");
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 4;
		gbc_textField_3.gridy = 4;
		frame.getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1: 30");
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.gridx = 5;
		gbc_textField_1.gridy = 4;
		frame.getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setText("\u03A4\u03B9\u03BC\u03AE: 13.99\u20AC");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 6;
		gbc_textField_2.gridy = 4;
		frame.getContentPane().add(textField_2, gbc_textField_2);
		
		JButton btnNewButton = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton.gridwidth = 2;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 6;
		gbc_btnNewButton.gridy = 5;
		frame.getContentPane().add(btnNewButton, gbc_btnNewButton);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_2 = new GridBagConstraints();
		gbc_verticalStrut_2.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_2.gridx = 6;
		gbc_verticalStrut_2.gridy = 6;
		frame.getContentPane().add(verticalStrut_2, gbc_verticalStrut_2);
		
		textField_4 = new JTextField();
		textField_4.setText("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD 2");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_4.gridx = 0;
		gbc_textField_4.gridy = 7;
		frame.getContentPane().add(textField_4, gbc_textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1: \u03A1\u03BF\u03CD\u03C7\u03B1");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_5.setColumns(10);
		GridBagConstraints gbc_textField_5 = new GridBagConstraints();
		gbc_textField_5.insets = new Insets(0, 0, 5, 5);
		gbc_textField_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_5.gridx = 4;
		gbc_textField_5.gridy = 7;
		frame.getContentPane().add(textField_5, gbc_textField_5);
		
		textField_6 = new JTextField();
		textField_6.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1: 7");
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_6.setColumns(10);
		GridBagConstraints gbc_textField_6 = new GridBagConstraints();
		gbc_textField_6.insets = new Insets(0, 0, 5, 5);
		gbc_textField_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_6.gridx = 5;
		gbc_textField_6.gridy = 7;
		frame.getContentPane().add(textField_6, gbc_textField_6);
		
		textField_7 = new JTextField();
		textField_7.setText("\u03A4\u03B9\u03BC\u03AE: 70.99\u20AC");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_7.setColumns(10);
		GridBagConstraints gbc_textField_7 = new GridBagConstraints();
		gbc_textField_7.insets = new Insets(0, 0, 5, 5);
		gbc_textField_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_7.gridx = 6;
		gbc_textField_7.gridy = 7;
		frame.getContentPane().add(textField_7, gbc_textField_7);
		
		JButton btnNewButton_1 = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridwidth = 2;
		gbc_btnNewButton_1.gridx = 6;
		gbc_btnNewButton_1.gridy = 8;
		frame.getContentPane().add(btnNewButton_1, gbc_btnNewButton_1);
		
		Component verticalStrut_3 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_3 = new GridBagConstraints();
		gbc_verticalStrut_3.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_3.gridx = 6;
		gbc_verticalStrut_3.gridy = 9;
		frame.getContentPane().add(verticalStrut_3, gbc_verticalStrut_3);
		
		textField_8 = new JTextField();
		textField_8.setText("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD 3");
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_8.setColumns(10);
		GridBagConstraints gbc_textField_8 = new GridBagConstraints();
		gbc_textField_8.insets = new Insets(0, 0, 5, 5);
		gbc_textField_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_8.gridx = 0;
		gbc_textField_8.gridy = 10;
		frame.getContentPane().add(textField_8, gbc_textField_8);
		
		textField_9 = new JTextField();
		textField_9.setText("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1: \u0395\u03C1\u03B3\u03B1\u03BB\u03B5\u03AF\u03B1");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_9.setColumns(10);
		GridBagConstraints gbc_textField_9 = new GridBagConstraints();
		gbc_textField_9.insets = new Insets(0, 0, 5, 5);
		gbc_textField_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_9.gridx = 4;
		gbc_textField_9.gridy = 10;
		frame.getContentPane().add(textField_9, gbc_textField_9);
		
		textField_10 = new JTextField();
		textField_10.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1: 150");
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_10.setColumns(10);
		GridBagConstraints gbc_textField_10 = new GridBagConstraints();
		gbc_textField_10.insets = new Insets(0, 0, 5, 5);
		gbc_textField_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_10.gridx = 5;
		gbc_textField_10.gridy = 10;
		frame.getContentPane().add(textField_10, gbc_textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("\u03A4\u03B9\u03BC\u03AE: 4.35\u20AC");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_11.setColumns(10);
		GridBagConstraints gbc_textField_11 = new GridBagConstraints();
		gbc_textField_11.insets = new Insets(0, 0, 5, 5);
		gbc_textField_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_11.gridx = 6;
		gbc_textField_11.gridy = 10;
		frame.getContentPane().add(textField_11, gbc_textField_11);
		
		JButton btnNewButton_1_1 = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1_1.gridwidth = 2;
		gbc_btnNewButton_1_1.gridx = 6;
		gbc_btnNewButton_1_1.gridy = 11;
		frame.getContentPane().add(btnNewButton_1_1, gbc_btnNewButton_1_1);
		
		verticalStrut_4 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_4 = new GridBagConstraints();
		gbc_verticalStrut_4.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_4.gridx = 6;
		gbc_verticalStrut_4.gridy = 12;
		frame.getContentPane().add(verticalStrut_4, gbc_verticalStrut_4);
		
		textField_12 = new JTextField();
		textField_12.setText("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD 4");
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_12.setColumns(10);
		GridBagConstraints gbc_textField_12 = new GridBagConstraints();
		gbc_textField_12.insets = new Insets(0, 0, 5, 5);
		gbc_textField_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_12.gridx = 0;
		gbc_textField_12.gridy = 13;
		frame.getContentPane().add(textField_12, gbc_textField_12);
		
		textField_13 = new JTextField();
		textField_13.setText("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1: \u0392\u03AC\u03BD");
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_13.setColumns(10);
		GridBagConstraints gbc_textField_13 = new GridBagConstraints();
		gbc_textField_13.insets = new Insets(0, 0, 5, 5);
		gbc_textField_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_13.gridx = 4;
		gbc_textField_13.gridy = 13;
		frame.getContentPane().add(textField_13, gbc_textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1: 3");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_14.setColumns(10);
		GridBagConstraints gbc_textField_14 = new GridBagConstraints();
		gbc_textField_14.insets = new Insets(0, 0, 5, 5);
		gbc_textField_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_14.gridx = 5;
		gbc_textField_14.gridy = 13;
		frame.getContentPane().add(textField_14, gbc_textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("\u03A4\u03B9\u03BC\u03AE: 57450\u20AC");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_15.setColumns(10);
		GridBagConstraints gbc_textField_15 = new GridBagConstraints();
		gbc_textField_15.insets = new Insets(0, 0, 5, 5);
		gbc_textField_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_15.gridx = 6;
		gbc_textField_15.gridy = 13;
		frame.getContentPane().add(textField_15, gbc_textField_15);
		
		JButton btnNewButton_1_1_1 = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1_1_1 = new GridBagConstraints();
		gbc_btnNewButton_1_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1_1_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1_1_1.gridwidth = 2;
		gbc_btnNewButton_1_1_1.gridx = 6;
		gbc_btnNewButton_1_1_1.gridy = 14;
		frame.getContentPane().add(btnNewButton_1_1_1, gbc_btnNewButton_1_1_1);
		
		verticalStrut_5 = Box.createVerticalStrut(20);
		GridBagConstraints gbc_verticalStrut_5 = new GridBagConstraints();
		gbc_verticalStrut_5.insets = new Insets(0, 0, 5, 5);
		gbc_verticalStrut_5.gridx = 6;
		gbc_verticalStrut_5.gridy = 15;
		frame.getContentPane().add(verticalStrut_5, gbc_verticalStrut_5);
		
		textField_16 = new JTextField();
		textField_16.setText("\u03A0\u03C1\u03BF\u03CA\u03CC\u03BD 4");
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_16.setColumns(10);
		GridBagConstraints gbc_textField_16 = new GridBagConstraints();
		gbc_textField_16.insets = new Insets(0, 0, 5, 5);
		gbc_textField_16.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_16.gridx = 0;
		gbc_textField_16.gridy = 16;
		frame.getContentPane().add(textField_16, gbc_textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("\u039A\u03B1\u03C4\u03B7\u03B3\u03BF\u03C1\u03AF\u03B1: \u03A1\u03BF\u03CD\u03C7\u03B1");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_17.setColumns(10);
		GridBagConstraints gbc_textField_17 = new GridBagConstraints();
		gbc_textField_17.insets = new Insets(0, 0, 5, 5);
		gbc_textField_17.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_17.gridx = 4;
		gbc_textField_17.gridy = 16;
		frame.getContentPane().add(textField_17, gbc_textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("\u03A0\u03BF\u03C3\u03CC\u03C4\u03B7\u03C4\u03B1: 12");
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_18.setColumns(10);
		GridBagConstraints gbc_textField_18 = new GridBagConstraints();
		gbc_textField_18.insets = new Insets(0, 0, 5, 5);
		gbc_textField_18.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_18.gridx = 5;
		gbc_textField_18.gridy = 16;
		frame.getContentPane().add(textField_18, gbc_textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("\u03A4\u03B9\u03BC\u03AE: 33.99\u20AC");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_19.setColumns(10);
		GridBagConstraints gbc_textField_19 = new GridBagConstraints();
		gbc_textField_19.insets = new Insets(0, 0, 5, 5);
		gbc_textField_19.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_19.gridx = 6;
		gbc_textField_19.gridy = 16;
		frame.getContentPane().add(textField_19, gbc_textField_19);
		
		btnNewButton_1_1_2 = new JButton("\u0395\u03C0\u03B5\u03BE\u03B5\u03C1\u03B3\u03B1\u03C3\u03AF\u03B1 \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD\u03C4\u03BF\u03C2");
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnNewButton_1_1_2 = new GridBagConstraints();
		gbc_btnNewButton_1_1_2.insets = new Insets(0, 0, 0, 5);
		gbc_btnNewButton_1_1_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNewButton_1_1_2.gridwidth = 2;
		gbc_btnNewButton_1_1_2.gridx = 6;
		gbc_btnNewButton_1_1_2.gridy = 17;
		frame.getContentPane().add(btnNewButton_1_1_2, gbc_btnNewButton_1_1_2);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		Button button = new Button("\u039D\u03AD\u03BF \u03A0\u03C1\u03BF\u03CA\u03CC\u03BD");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				OthoniNeouProiontos window = new OthoniNeouProiontos();
				window.frame.setVisible(true);
				frame.dispose();
			}
		});
		menuBar.add(button);
		
		Button button_2 = new Button("\u03A0\u03C1\u03BF\u03C6\u03AF\u03BB \u03A7\u03C1\u03AE\u03C3\u03C4\u03B7");
		menuBar.add(button_2);
		
		Button button_1 = new Button("\u0395\u03C0\u03B9\u03C3\u03C4\u03C1\u03BF\u03C6\u03AE \u03C3\u03C4\u03B7\u03BD \u0391\u03C1\u03C7\u03B9\u03BA\u03AE \u039F\u03B8\u03CC\u03BD\u03B7");
		menuBar.add(button_1);
	}

}
