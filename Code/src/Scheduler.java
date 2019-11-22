import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class Scheduler extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void sch() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Scheduler frame = new Scheduler();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Scheduler() {
		setSize(833,655);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnViewTheOrders = new JButton("View the orders of patient");
		btnViewTheOrders.setBounds(113, 44, 188, 23);
		contentPane.add(btnViewTheOrders);
		btnViewTheOrders.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Order_Detail od = new  Order_Detail();
			  od.O_D();
		  }
		});
		
		
		
		JButton btnViewBillsOf = new JButton("View bills of patient");
		btnViewBillsOf.setBounds(113, 108, 188, 23);
		contentPane.add(btnViewBillsOf);
		btnViewBillsOf.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Bills bp = new  Bills();
			  bp.bill_pay();
		  }
		});
		
		JButton btnScheduleAppointment = new JButton("Schedule Appointment");
		btnScheduleAppointment.setBounds(146, 181, 143, 23);
		contentPane.add(btnScheduleAppointment);
		
		btnScheduleAppointment.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  ScheduleAppointments sa4 = new ScheduleAppointments();
			  sa4.s_app();
		  }
		});
		
		JLabel lblScheduler = new JLabel("Scheduler");
		lblScheduler.setBounds(181, 19, 107, 14);
		contentPane.add(lblScheduler);
	}
}
