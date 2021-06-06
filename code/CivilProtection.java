import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JToolBar;
import java.awt.BorderLayout;
import java.awt.CardLayout;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Font;
import java.awt.ComponentOrientation;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.metal.MetalToggleButtonUI;
import java.awt.Insets;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.GridLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.GridBagLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JDesktopPane;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JEditorPane;
import javax.swing.Box;
import javax.swing.JSeparator;
import javax.swing.ListModel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextField;
import java.awt.Point;

public class CivilProtectionGUI_methods  {

	
	
	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		String text = null;
		Danger danger = null;
		String topic = null;
		//Announcement object = new Announcement(text,danger,topic);
		
		
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CivilProtectionGUI_methods window = new CivilProtectionGUI_methods();
					window.mainFrame.setVisible(true);
					
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
		
		
		
		
		
		
		
		
	}

	/**
	 * Create the application.
	 * @return 
	 */
	
	public  void createAnnouncement(String AnnText, Danger danger , String topic) {
		
		
	}
	
	
	
	
	
	
	
	
	public CivilProtectionGUI_methods() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Υπηρεσία Πολιτικής Προστασίας");
		mainFrame.setVisible(true);
		mainFrame.setIgnoreRepaint(true);
		mainFrame.getContentPane().setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
		mainFrame.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel.setBackground(new Color(102, 102, 102));
		mainFrame.getContentPane().add(panel, "name_20185794204700");
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBackground(SystemColor.textHighlight);
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(desktopPane);
		
		
		
		
		
		
		
		JLabel lblNewLabel = new JLabel("Ενημερωσή Χαρτών επικινδυνότητας");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel.setBounds(77, 1, 398, 50);
		desktopPane.add(lblNewLabel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(Color.BLACK);
		separator_1.setBounds(10, 53, 540, 10);
		desktopPane.add(separator_1);
		
	
         
		 DefaultListModel<String> l1 = new DefaultListModel<>();  
		 List<String> namesList = Arrays.asList( " ΑΙΤΩΛΟΑΚΑΡΝΑΝΙΑΣ    " , "   ΑΡΓΟΛΙΔΑΣ   " , "  ΑΡΚΑΔΙΑΣ   " , "   ΑΡΤΑΣ   " ,"   ΑΤΤΙΚΗ  " ,
				 "   ΑΧΑΐΑΣ   " ,"  ΒΟΙΩΤΙΑΣ   " , "  ΓΡΕΒΕΝΩΝ    " ,"  ΕΒΡΟΥ   "
				 , "   ΚΕΡΚΥΡΑΣ   " ,"  ΗΛΕΙΑΣ   " , "  ΚΕΦΑΛΛΗΝΙΑΣ    " ,"ΙΩΑΝΝΙΝΩΝ ", 
				 "  ΑΡΚΑΔΙΑΣ   " , "   ΛΑΣΙΘΙΟΥ   " ,"   ΑΤΤΙΚΗ  " , "   ΑΧΑΐΑΣ   " ,"  ΒΟΙΩΤΙΑΣ   " , "  ΓΡΕΒΕΝΩΝ    " ,"  ΚΕΦΑΛΛΗΝΙΑΣ   " , "   ΖΑΚΥΝΘΟΥ   " ,"  ΗΛΕΙΑΣ   " , "  ΘΕΣΣΑΛΟΝΙΚΗΣ    " ,"ΙΩΑΝΝΙΝΩΝ ",
				 "  ΧΑΝΙΩΝ   " , "   ΧΑΝΙΩΝ   " ,"   ΚΕΦΑΛΛΗΝΙΑΣ  " , "   ΜΕΣΣΗΝΙΑΣ   " ,"  ΛΑΣΙΘΙΟΥ   " , "  ΓΡΕΒΕΝΩΝ    " ,"  ΜΕΣΣΗΝΙΑΣ   " , "   ΖΑΚΥΝΘΟΥ   "  );
           
         l1.addAll(namesList);
         JList<String> list = new JList<>(l1);
         list.setMaximumSize(new Dimension(222222, 22222220));
         list.setLocation(new Point(111, 110));
         list.setBounds(10,91, 209,500);  
         
         JScrollPane scrollPanel = new JScrollPane(list);
         scrollPanel.setLocation(10, 91);
        
         scrollPanel.setSize(209,500);  
         
        // scrollPanel.setViewportView(list);
         
         
         
        
         
	         desktopPane.add(scrollPanel);  
	         desktopPane.setSize(400,400);  
	         desktopPane.setLayout(null);
	         
	         JEditorPane editorPane_12 = new JEditorPane();
	         editorPane_12.setBackground(new Color(245, 245, 245));
	         editorPane_12.setBounds(229, 390, 301, 172);
	         desktopPane.add(editorPane_12);
	         
	         JLabel lblNewLabel_1_1_1_5_1 = new JLabel("Συγγραφή Ανακοίνωσης");
	         lblNewLabel_1_1_1_5_1.setHorizontalTextPosition(SwingConstants.CENTER);
	         lblNewLabel_1_1_1_5_1.setHorizontalAlignment(SwingConstants.CENTER);
	         lblNewLabel_1_1_1_5_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
	         lblNewLabel_1_1_1_5_1.setBounds(229, 358, 301, 29);
	         desktopPane.add(lblNewLabel_1_1_1_5_1);
	         
	         
	         
	         
	         
	         
	         
	         
	         DefaultListModel<String> l2 = new DefaultListModel<>();  
			 List<String> namesList2 = Arrays.asList( " Πατρέων    " , "   Ερυμάνθου   " , "  Δυτικής Αχαίας   " , "   Καλαβρύτων   " ,"   Αιγιαλείας  "  );
	           
	         l2.addAll(namesList2);
	         
		
	         
	         
	         
	         DefaultListModel<String> l3 = new DefaultListModel<>();  
			 List<String> namesList3 = Arrays.asList( "  Green    " , "  Red   " , "  Yellow  "  );
	           
	         l3.addAll(namesList3);
	         
	         
	         JList<String> DangerCodes = new JList<>(l3); 
	         DangerCodes.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
	         DangerCodes.setLocation(429, 91);
	         DangerCodes.setSize(new Dimension(101, 84));
	         DangerCodes.setMinimumSize(new Dimension(11, 10));
	         DangerCodes.setMaximumSize(new Dimension(11111, 111110));
	         DangerCodes.setPreferredSize(new Dimension(10, 10));
	         desktopPane.add(DangerCodes);
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         
	         JScrollPane scrollPane = new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
	         scrollPane.setPreferredSize(new Dimension(50, 100));
	         scrollPane.setBounds(10, 62, 510, 23);
	         desktopPane.add(scrollPane);
	         
	         
	         
	         
	         
	         JLabel lblNewLabel_1_1_2 = new JLabel("Επιλέξτε βαθμό επικινδυνότητας ( Green,Red,Yellow) για την επιλεγμένη περιοχή");
	         scrollPane.setViewportView(lblNewLabel_1_1_2);
	         
	         //JLabel lblNewLabel_1_1_2 = new JLabel("Επιλέξτε βαθμό επικινδυνότητας ( Green,Red,Yellow) για την επιλεγμένη περιοχή ");
	         lblNewLabel_1_1_2.setVerticalTextPosition(SwingConstants.TOP);
	         lblNewLabel_1_1_2.setVerticalAlignment(SwingConstants.TOP);
	         lblNewLabel_1_1_2.setAutoscrolls(true);
	         lblNewLabel_1_1_2.setHorizontalTextPosition(SwingConstants.LEFT);
	         lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
	         lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
	         
	         JButton btnNewButton = new JButton("Αποστολή Ανακοίνωσής ");
	         btnNewButton.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 16));
	         btnNewButton.setAutoscrolls(true);
	         btnNewButton.setForeground(new Color(255, 0, 0));
	         btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
	         btnNewButton.setBackground(new Color(0, 0, 0));
	         btnNewButton.setBounds(229, 562, 301, 29);
	         desktopPane.add(btnNewButton);
	         
	         JButton btnNewButton_1 = new JButton("Ενημέρωση Χάρτη");
	         btnNewButton_1.setForeground(Color.RED);
	         btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	         btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
	         btnNewButton_1.setBackground(Color.BLACK);
	         btnNewButton_1.setAutoscrolls(true);
	         btnNewButton_1.setBounds(404, 186, 146, 37);
	         desktopPane.add(btnNewButton_1);
	         
	         JScrollPane scrollPane_1 = new JScrollPane();
	         scrollPane_1.setBounds(229, 93, 163, 259);
	         desktopPane.add(scrollPane_1);
	         
	         
	         JList<String> jlistDhmwn = new JList<>(l2);
	         scrollPane_1.setViewportView(jlistDhmwn);
	         //desktopPane.add(lblNewLabel_1_1_2);
	         desktopPane.setVisible(true);  
		
		
         
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBackground(SystemColor.textHighlight);
		desktopPane_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(desktopPane_1);
		
		
		
		 
		
		JLabel lblNewLabel_1 = new JLabel("Ενημερωσή Πολυμέσων");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1.setBounds(134, 5, 212, 46);
		desktopPane_1.add(lblNewLabel_1);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBackground(new Color(245, 245, 245));
		editorPane.setBounds(196, 72, 334, 29);
		desktopPane_1.add(editorPane);
		
		JLabel lblNewLabel_1_1 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1.setBounds(10, 72, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		
		JSeparator separator = new JSeparator();
		separator.setBackground(SystemColor.textText);
		separator.setBounds(0, 53, 540, 10);
		desktopPane_1.add(separator);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1.setBounds(10, 117, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_1.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_1.setBounds(10, 157, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_2.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_2.setBounds(10, 199, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_2);
		
		JLabel lblNewLabel_1_1_1_3 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_3.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_3.setBounds(10, 239, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_3);
		
		JLabel lblNewLabel_1_1_1_4 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_4.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_4.setBounds(10, 279, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_4);
		
		JLabel lblNewLabel_1_1_1_5 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_5.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_5.setBounds(10, 319, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_5);
		
		JLabel lblNewLabel_1_1_1_6 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_6.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_6.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_6.setBounds(10, 360, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_6);
		
		JLabel lblNewLabel_1_1_1_7 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_7.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_7.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_7.setBounds(10, 405, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_7);
		
		JLabel lblNewLabel_1_1_1_8 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_8.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_8.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_8.setBounds(10, 450, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_8);
		
		JLabel lblNewLabel_1_1_1_9 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_9.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_9.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_9.setBounds(10, 493, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_9);
		
		JLabel lblNewLabel_1_1_1_10 = new JLabel("Σύνδεσμος :");
		lblNewLabel_1_1_1_10.setHorizontalTextPosition(SwingConstants.CENTER);
		lblNewLabel_1_1_1_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1_10.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_1_1_1_10.setBounds(10, 535, 215, 29);
		desktopPane_1.add(lblNewLabel_1_1_1_10);
		
		JEditorPane editorPane_1 = new JEditorPane();
		editorPane_1.setBackground(new Color(245, 245, 245));
		editorPane_1.setBounds(196, 117, 334, 29);
		desktopPane_1.add(editorPane_1);
		
		JEditorPane editorPane_2 = new JEditorPane();
		editorPane_2.setBackground(new Color(245, 245, 245));
		editorPane_2.setBounds(196, 157, 334, 29);
		desktopPane_1.add(editorPane_2);
		
		JEditorPane editorPane_3 = new JEditorPane();
		editorPane_3.setBackground(new Color(245, 245, 245));
		editorPane_3.setBounds(196, 199, 334, 29);
		desktopPane_1.add(editorPane_3);
		
		JEditorPane editorPane_4 = new JEditorPane();
		editorPane_4.setBackground(new Color(245, 245, 245));
		editorPane_4.setBounds(196, 239, 334, 29);
		desktopPane_1.add(editorPane_4);
		
		JEditorPane editorPane_5 = new JEditorPane();
		editorPane_5.setBackground(new Color(245, 245, 245));
		editorPane_5.setBounds(196, 279, 334, 29);
		desktopPane_1.add(editorPane_5);
		
		JEditorPane editorPane_6 = new JEditorPane();
		editorPane_6.setBackground(new Color(245, 245, 245));
		editorPane_6.setBounds(196, 319, 334, 29);
		desktopPane_1.add(editorPane_6);
		
		JEditorPane editorPane_7 = new JEditorPane();
		editorPane_7.setBackground(new Color(245, 245, 245));
		editorPane_7.setBounds(196, 365, 334, 29);
		desktopPane_1.add(editorPane_7);
		
		JEditorPane editorPane_8 = new JEditorPane();
		editorPane_8.setBackground(new Color(245, 245, 245));
		editorPane_8.setBounds(196, 405, 334, 29);
		desktopPane_1.add(editorPane_8);
		
		JEditorPane editorPane_9 = new JEditorPane();
		editorPane_9.setBackground(new Color(245, 245, 245));
		editorPane_9.setBounds(196, 450, 334, 29);
		desktopPane_1.add(editorPane_9);
		
		JEditorPane editorPane_10 = new JEditorPane();
		editorPane_10.setBackground(new Color(245, 245, 245));
		editorPane_10.setBounds(196, 495, 334, 29);
		desktopPane_1.add(editorPane_10);
		
		JEditorPane editorPane_11 = new JEditorPane();
		editorPane_11.setBackground(new Color(245, 245, 245));
		editorPane_11.setBounds(196, 533, 334, 29);
		desktopPane_1.add(editorPane_11);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		mainFrame.getContentPane().add(panel_1, "name_20193622917300");
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		mainFrame.getContentPane().add(panel_2, "name_20197066504300");
		mainFrame.setForeground(Color.BLACK);
		mainFrame.setBackground(new Color(0, 0, 0));
		mainFrame.setBounds(100, 100, 1096, 691);
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		menuBar.setIgnoreRepaint(true);
		menuBar.setForeground(Color.DARK_GRAY);
		menuBar.setBackground(Color.BLACK);
		menuBar.setPreferredSize(new Dimension(1000, 50));
		menuBar.setSize(new Dimension(1000, 200));
		menuBar.setMinimumSize(new Dimension(0, 20));
		menuBar.setMaximumSize(new Dimension(100, 50));
		menuBar.setFont(new Font("Times New Roman", Font.BOLD, 16));
		mainFrame.setJMenuBar(menuBar);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Χάρτες Επικινδυνότητας ");
		mntmNewMenuItem.setMargin(new Insets(0, 0, 0, 0));
		mntmNewMenuItem.setBackground(SystemColor.menu);
		mntmNewMenuItem.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				mntmNewMenuItem.setBackground(new Color(255, 255, 255));
			}
		});
		mntmNewMenuItem.setRolloverEnabled(true);
		mntmNewMenuItem.setPreferredSize(new Dimension(260, 26));
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.setHorizontalTextPosition(SwingConstants.RIGHT);
		mntmNewMenuItem.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Πολυμέσα διαχείρησης έκακτων καταστάσεων");
		mntmNewMenuItem_1.setBackground(SystemColor.menu);
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.RIGHT);
		mntmNewMenuItem_1.setActionCommand("Πολυμέσα διαχερησης έκακτων καταστάσεων ");
		mntmNewMenuItem_1.setHorizontalTextPosition(SwingConstants.RIGHT);
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Διαχειρησή ενημέρωσης πολιτών");
		mntmNewMenuItem_2.setBackground(SystemColor.menu);
		mntmNewMenuItem_2.setPreferredSize(new Dimension(230, 26));
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_2.setHorizontalTextPosition(SwingConstants.LEFT);
		mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_2);
		
		
		
		    
	
	}
}
