import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.*;

public class Staff extends JFrame implements ActionListener {	

	String[] messageStrings = {"Message 1", "Message 2", "Message 3"};
	JLabel lblText = new JLabel();
	
	
	String[] messageStrings2 = {"Message 11", "Message 22", "Message 33"};
	JLabel lblText2 = new JLabel();
	
	private final JLabel lblNewLabel_2 = new JLabel("DocterStaff");
	private final JButton btnOrder = new JButton("Create an Order");
	private final JButton btnScheduleAppointment = new JButton("Schedule Appointment");
	public static Staff frame;


	/**
	 * Launch the application.
	 */
	
	public static void stf() {
		
		frame = new Staff();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Staff() {
		setSize(400,300);
		setTitle("Docter/Staff example");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		lblText.setBounds(277, 15, 0, 0);
		getContentPane().add(lblText);
		lblText2.setBounds(282, 15, 0, 0);
		getContentPane().add(lblText2);
		lblNewLabel_2.setBounds(174, 1, 121, 14);
		
		getContentPane().add(lblNewLabel_2);
		btnOrder.setBounds(12, 95, 146, 23);
		
		btnOrder.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
					
							CreateOrder am1 = new CreateOrder();
							am1.C_Order();
					
					frame.setVisible(false);
				}catch(Exception e1) {System.out.print(e1);}
				}
			});
		
		getContentPane().add(btnOrder);
		btnScheduleAppointment.setBounds(12, 152, 181, 23);
		 
		getContentPane().add(btnScheduleAppointment);
		
		btnScheduleAppointment.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  try {
					
				  			ScheduleAppointments am2 = new ScheduleAppointments();
							am2.s_app();
					
					frame.setVisible(false);
				}catch(Exception e1) {System.out.print(e1);}
				}
			});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
	}
}