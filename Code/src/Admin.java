import java.awt.*;
import java.awt.event.*;
import java.sql.DriverManager;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


public class Admin extends JFrame{

	private JPanel contentPane;
	public static Admin frame;

	/**
	 * Launch the application.
	 */
	public static void a_run() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Admin();
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
	public Admin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 394);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAdmin = new JLabel("Admin");
		lblAdmin.setForeground(new Color(0, 153, 255));
		lblAdmin.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 30));
		lblAdmin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdmin.setBounds(167, 0, 100, 42);
		contentPane.add(lblAdmin);
		
		JButton btnNewButton = new JButton("Create a new patient");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setBounds(81, 81, 291, 25);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  NewPatient np = new NewPatient();
			  np.New_P();
			  frame.setVisible(false);
		  }
		});
		
		
		
		JButton btnCreateNewEmployee = new JButton("Create new employee account");
		btnCreateNewEmployee.setForeground(Color.RED);
		btnCreateNewEmployee.setBounds(81, 146, 291, 25);
		contentPane.add(btnCreateNewEmployee);
		btnCreateNewEmployee.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  NewEmployee ne = new NewEmployee();
			  ne.new_emp();
			  frame.setVisible(false);
		  }
		});
		
		
		
		JButton btnScheduleAnAppointment = new JButton("Schedule an appointment");
		btnScheduleAnAppointment.setForeground(Color.RED);
		btnScheduleAnAppointment.setBounds(81, 215, 291, 25);
		contentPane.add(btnScheduleAnAppointment);
		btnScheduleAnAppointment.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  ScheduleAppointments sa = new ScheduleAppointments();
			  sa.s_app();
			  frame.setVisible(false);
		  }
		});
		
		
		JButton btnAccessTheBusiness = new JButton("Access the business report");
		btnAccessTheBusiness.setForeground(Color.RED);
		btnAccessTheBusiness.setBounds(81, 280, 291, 25);
		contentPane.add(btnAccessTheBusiness);
		btnAccessTheBusiness.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  BusinessReport sa2 = new BusinessReport();
			  sa2.B_report();
			  frame.setVisible(false);
		  }
		});
		
	
	
	
	}
}
