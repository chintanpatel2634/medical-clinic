import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JTextField;

public class ScheduleAppointments extends JFrame {

	private JPanel contentPane;
	private JTextField apt;
	private JTextField patient_i;
	private JTextField staff_id;
	private JTextField date;
	private JTextField time;
	public static ScheduleAppointments frame;

	/**
	 * Launch the application.
	 */
	public static void s_app() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new ScheduleAppointments();
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
	public ScheduleAppointments() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblScheduleAppointments = new JLabel("Schedule Appointments");
		lblScheduleAppointments.setFont(new Font("Arabic Typesetting", Font.BOLD | Font.ITALIC, 26));
		lblScheduleAppointments.setBackground(new Color(0, 153, 255));
		lblScheduleAppointments.setBounds(137, 0, 221, 29);
		contentPane.add(lblScheduleAppointments);
		
		JLabel lblAppintmentNo = new JLabel("Appintment No.");
		lblAppintmentNo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAppintmentNo.setBounds(6, 34, 132, 29);
		contentPane.add(lblAppintmentNo);
		
		JLabel lblScheduleWith = new JLabel("Date");
		lblScheduleWith.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblScheduleWith.setBounds(6, 163, 112, 27);
		contentPane.add(lblScheduleWith);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(161, 271, 117, 40);
		contentPane.add(btnSubmit);
		
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
			     try {
			    	 
			    	String appointment = apt.getText().toString();
			 		String patient_id = patient_i.getText().toString();
			 		String staff_i = staff_id.getText().toString();
			 		String date1= date.getText().toString();
			 		String time1 = time.getText().toString();
			 		
			 		
			    	   Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "3mr3sIeLy");
			    	 
			  
						Statement statement = c.createStatement();
						
									
					
						
			
				         String sql2 = "INSERT INTO public.appointments (appointment_id, date, time, patient_id, schedule_with_id) "
				            + "VALUES (" + appointment + ", '" + date1 + "' , '" + time1 + "' , " +patient_id + " , " + staff_i + " );";
				        
				         statement.executeUpdate(sql2);
				        
				         c.close();
				         
				         JOptionPane.showMessageDialog(null, "New Appointment Created");
				         
				         frame.setVisible(false);
				        
				         
				         
				      } catch (Exception ee) {
				         System.err.println( ee.getClass().getName()+": "+ ee.getMessage() );
				         System.exit(0);
				      }
			}
		});
		
		
		
		
		
		
		
		JLabel lblStaffId = new JLabel("Staff ID");
		lblStaffId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStaffId.setBounds(6, 121, 132, 29);
		contentPane.add(lblStaffId);
		
		JLabel pid = new JLabel("Patient ID");
		pid.setFont(new Font("Tahoma", Font.PLAIN, 18));
		pid.setBounds(6, 79, 132, 29);
		contentPane.add(pid);
		
		apt = new JTextField();
		apt.setBounds(135, 39, 223, 22);
		contentPane.add(apt);
		apt.setColumns(10);
		
		patient_i = new JTextField();
		patient_i.setColumns(10);
		patient_i.setBounds(90, 84, 223, 22);
		contentPane.add(patient_i);
		
		staff_id = new JTextField();
		staff_id.setColumns(10);
		staff_id.setBounds(100, 128, 223, 22);
		contentPane.add(staff_id);
		
		date = new JTextField();
		date.setColumns(10);
		date.setBounds(90, 167, 223, 22);
		contentPane.add(date);
		
		JLabel lblTime = new JLabel("Time");
		lblTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTime.setBounds(6, 203, 112, 27);
		contentPane.add(lblTime);
		
		time = new JTextField();
		time.setColumns(10);
		time.setBounds(100, 207, 223, 22);
		contentPane.add(time);
	}
}