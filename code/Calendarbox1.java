package demopanels;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JButton;

public class Calendarbox1 extends JFrame {

	private JPanel contentPane;
	private static Date dateapo=null;
	private static Date datemexri=null;

	public Calendarbox1() {
	
		setBounds(100, 100, 581, 396);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
	    Date ydate = yesterday() ;  
	    ydate.setHours(0);
	    ydate.setMinutes(0);
	    ydate.setSeconds(0);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setDate(ydate);
		dateapo=ydate;
	
		dateChooser.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
				if(evt.getPropertyName().contentEquals("date"))
					dateapo = dateChooser.getDate();	
			}
		});
		dateChooser.setBounds(39, 123, 142, 45);
		contentPane.add(dateChooser);
		
		Date tdate = new Date();
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setDate(tdate);
		datemexri=tdate;
		dateChooser_1.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt1) {

				if(evt1.getPropertyName().equals("date") )
					datemexri = dateChooser_1.getDate();	
								
			}
		});
		dateChooser_1.setBounds(327, 123, 142, 45);
		contentPane.add(dateChooser_1);
		
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03B7\u03BC/\u03BD\u03B9\u03B1 \u03AD\u03C9\u03C2:");
		tglbtnNewToggleButton.setSelected(true);
		tglbtnNewToggleButton.setBackground(Color.CYAN);
		tglbtnNewToggleButton.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (tglbtnNewToggleButton.isSelected())
				{
					tglbtnNewToggleButton.setBackground(Color.CYAN);
					dateChooser_1.setVisible(true);
				}
				else
				{
					datemexri=null;
					tglbtnNewToggleButton.setBackground(Color.GRAY);				
					dateChooser_1.setVisible(false);
				}
			}
		});
		tglbtnNewToggleButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton.setFocusPainted(false);
		//tglbtnNewToggleButton.setBackground(Color.GRAY);
		tglbtnNewToggleButton.setBounds(310, 36, 194, 40);
		contentPane.add(tglbtnNewToggleButton);
		
		
		JToggleButton tglbtnNewToggleButton_1 = new JToggleButton("\u0395\u03C0\u03B9\u03BB\u03AD\u03BE\u03C4\u03B5 \u03B7\u03BC/\u03BD\u03B9\u03B1 \u03B1\u03C0\u03CC:");
		tglbtnNewToggleButton_1.setSelected(true);
		tglbtnNewToggleButton_1.setBackground(Color.CYAN);
		tglbtnNewToggleButton_1.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (tglbtnNewToggleButton_1.isSelected())
				{
					tglbtnNewToggleButton_1.setBackground(Color.CYAN);
					dateChooser.setVisible(true);
				}
				else
				{
					dateapo=null;
					tglbtnNewToggleButton_1.setBackground(Color.GRAY);
					dateChooser.setVisible(false);
				}
			}
		});
		tglbtnNewToggleButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		tglbtnNewToggleButton_1.setFocusPainted(false);
		tglbtnNewToggleButton_1.setBounds(22, 36, 194, 40);
		contentPane.add(tglbtnNewToggleButton_1);
		
		JButton button = new JButton("\u039F\u03BB\u03BF\u03BA\u03BB\u03AE\u03C1\u03C9\u03C3\u03B7");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainscreen.calendardates1(dateapo,datemexri);
				dispose();
			}
		});
		button.setBounds(120, 287, 200, 45);
		contentPane.add(button);
		
		
		
	}
	
	public Date yesterday() {
	    final Calendar cal = Calendar.getInstance();
	    cal.add(Calendar.DATE, -1);
	    return cal.getTime();
	}
}
