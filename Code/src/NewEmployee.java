import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NewEmployee extends JFrame {

	private JPanel contentPane;
	private JTextField fname;
	private JTextField lname;
	private JTextField jtype;
	private JTextField employee;
	private JTextField user_pass;
	public static NewEmployee frame;

	/**
	 * Launch the application.
	 */
	public static void new_emp() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new NewEmployee();
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
	public NewEmployee() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreateNewEmployee = new JLabel("Create New Employee");
		lblCreateNewEmployee.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 26));
		lblCreateNewEmployee.setForeground(new Color(0, 153, 255));
		lblCreateNewEmployee.setBounds(61, 0, 299, 45);
		contentPane.add(lblCreateNewEmployee);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		lblFirstName.setBounds(137, 52, 115, 30);
		contentPane.add(lblFirstName);
		
		fname = new JTextField();
		fname.setBounds(105, 73, 147, 30);
		contentPane.add(fname);
		fname.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		lblLastName.setBounds(137, 116, 115, 30);
		contentPane.add(lblLastName);
		
		lname = new JTextField();
		lname.setColumns(10);
		lname.setBounds(105, 141, 147, 30);
		contentPane.add(lname);
		
		JLabel lblJobType = new JLabel("Job Type");
		lblJobType.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		lblJobType.setBounds(137, 196, 115, 30);
		contentPane.add(lblJobType);
		
		jtype = new JTextField();
		jtype.setColumns(10);
		jtype.setBounds(105, 222, 147, 30);
		contentPane.add(jtype);
		
		JLabel lblEmployeeid = new JLabel("EmployeeID");
		lblEmployeeid.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		lblEmployeeid.setBounds(137, 265, 115, 30);
		contentPane.add(lblEmployeeid);
		
		employee = new JTextField();
		employee.setColumns(10);
		employee.setBounds(105, 293, 147, 30);
		contentPane.add(employee);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		lblPassword.setBounds(137, 336, 115, 30);
		contentPane.add(lblPassword);
		
		user_pass = new JTextField();
		user_pass.setColumns(10);
		user_pass.setBounds(105, 359, 147, 30);
		contentPane.add(user_pass);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try { 
					 String first_name = fname.getText().toString();
				 		String last_name = lname.getText().toString();
				 		String job_type = jtype.getText().toString();
		
				 		int e_id = Integer.parseInt(employee.getText());
				 		
				 		String passw = user_pass.getText();
				    	 
				    	 	
				    	   Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "3mr3sIeLy");
				    	 
				  
							Statement statement = c.createStatement();
							
										
						
						
							String sql1 = "INSERT INTO users (user_id, privilege, user_pass) "
						            + "VALUES (" + e_id + ", '" + "employee" + "' , '" + passw + "' );";
							
						
							
							statement.executeUpdate(sql1);
							
					         String sql2 = "INSERT INTO employee (employee_id, firstName, lastName, jobType) "
					            + "VALUES (" + e_id + ", '" + first_name + "' , '" + last_name + "' , '" +job_type + "' );";
					        
					         statement.executeUpdate(sql2);
					        
					         c.close();
					         
					         JOptionPane.showMessageDialog(null, "New Employee Account Created");
					         
					         frame.setVisible(false);
					        
				
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				}
			
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(130, 410, 97, 30);
		contentPane.add(btnNewButton);
	}
}
