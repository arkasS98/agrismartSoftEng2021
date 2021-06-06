import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.Arrays;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import org.knowm.xchart.XYChart;
import org.knowm.xchart.XYChartBuilder;
import javax.swing.JScrollBar;


public class AgriculturalMinistry {

	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		String text = null;
		Danger danger = null;
		String topic = null;
		Announcement object = new Announcement(text,danger,topic);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AgriculturalMinistry window = new AgriculturalMinistry();
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
	
	public AgriculturalMinistry() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainFrame = new JFrame("Υπηρεσία Πολιτικής Προστασίας");
		mainFrame.setTitle("AgriSmart_AgriculturalMinistry");
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
		desktopPane.setBackground(new Color(51, 255, 102));
		desktopPane.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		panel.add(desktopPane);
		
	
         
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
         scrollPanel.setLocation(10, 57);
        
         scrollPanel.setSize(207,534);  
         
        // scrollPanel.setViewportView(list);
         
         
         
        
         
	         desktopPane.add(scrollPanel); 
	         
	         
	         
	         
	         
	         DefaultListModel<String> l2 = new DefaultListModel<>();  
			 List<String> namesList2 = Arrays.asList( " Πατρέων    " , "   Ερυμάνθου   " , "  Δυτικής Αχαίας   " , "   Καλαβρύτων   " ,"   Αιγιαλείας  "  );
	           
	         l2.addAll(namesList2);
	         
	         
	         JList<String> jlistDhmwn = new JList<>(l2); 
	         jlistDhmwn.setMaximumSize(new Dimension(22222, 2147483647));
	         jlistDhmwn.setBounds(234, 57, 164, 233);
	         desktopPane.add(jlistDhmwn);
	         
		
	         
	         DefaultListModel<String> l3 = new DefaultListModel<>();  
			 List<String> namesList3 = Arrays.asList( "  Green    " , "  Red   " , "  Yellow  "  );
	           
	         l3.addAll(namesList3);
	         
	         JButton btnNewButton_1 = new JButton("Ενημέρωση Στατιστικών");
	         btnNewButton_1.setForeground(Color.RED);
	         btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 14));
	         btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
	         btnNewButton_1.setBackground(new Color(0, 0, 0));
	         btnNewButton_1.setAutoscrolls(true);
	         btnNewButton_1.setBounds(555, 423, 162, 37);
	         desktopPane.add(btnNewButton_1);
	         
	         
	         
	         JLabel lblNewLabel_1_1_2 = new JLabel("Επιλέξτε τις περιοχές για τις οποίες θέλετε να δείτε στατιστικά  στοιχεία των καλλιεργειών");
	         lblNewLabel_1_1_2.setBounds(19, 11, 716, 37);
	         desktopPane.add(lblNewLabel_1_1_2);
	         
	         //JLabel lblNewLabel_1_1_2 = new JLabel("Επιλέξτε βαθμό επικινδυνότητας ( Green,Red,Yellow) για την επιλεγμένη περιοχή ");
	         lblNewLabel_1_1_2.setVerticalTextPosition(SwingConstants.TOP);
	         lblNewLabel_1_1_2.setVerticalAlignment(SwingConstants.TOP);
	         lblNewLabel_1_1_2.setAutoscrolls(true);
	         lblNewLabel_1_1_2.setHorizontalTextPosition(SwingConstants.LEFT);
	         lblNewLabel_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
	         lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 19));
	         //desktopPane.add(lblNewLabel_1_1_2);
	         desktopPane.setVisible(true);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.PINK);
		mainFrame.getContentPane().add(panel_1, "name_20193622917300");
		
		JPanel panel_2 = new JPanel();
		panel_2.setVisible(false);
		mainFrame.getContentPane().add(panel_2, "name_20197066504300");
		mainFrame.setForeground(Color.BLACK);
		mainFrame.setBackground(new Color(0, 0, 0));
		mainFrame.setBounds(100, 100, 761, 691);
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
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Στατιστικά Στοιχεία Καλλιεργειών");
		mntmNewMenuItem.setMargin(new Insets(0, 0, 0, 0));
		mntmNewMenuItem.setBackground(new Color(153, 204, 255));
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
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Λίστα Ανακοινώσεων");
		mntmNewMenuItem_1.setBackground(new Color(153, 204, 255));
		mntmNewMenuItem_1.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_1.setActionCommand("Πολυμέσα διαχερησης έκακτων καταστάσεων ");
		mntmNewMenuItem_1.setHorizontalTextPosition(SwingConstants.LEFT);
		mntmNewMenuItem_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Νέες Νομοθεσίες & Επιδοτήσεις");
		mntmNewMenuItem_2.setBackground(new Color(153, 204, 255));
		mntmNewMenuItem_2.setPreferredSize(new Dimension(230, 26));
		mntmNewMenuItem_2.setHorizontalAlignment(SwingConstants.LEFT);
		mntmNewMenuItem_2.setHorizontalTextPosition(SwingConstants.LEFT);
		mntmNewMenuItem_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		menuBar.add(mntmNewMenuItem_2);
		
		
	
	}
}
