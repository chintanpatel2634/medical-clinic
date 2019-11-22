import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.*;

public class NewPatient extends JFrame {

	private JPanel contentPane;
	private final JLabel labellname = new JLabel("Last Name");
	private final JLabel labelst = new JLabel("Street");
	private final JLabel labelcity = new JLabel("City");
	private final JLabel labelstate = new JLabel("State");
	private final JLabel labelzip = new JLabel("Zipcode");
	private final JLabel labelid = new JLabel("PatientID");
	private final JTextField fname = new JTextField();
	private final JTextField lname = new JTextField();
	private final JTextField st = new JTextField();
	private final JTextField city = new JTextField();
	private final JTextField patientid = new JTextField();
	private final JTextField zip = new JTextField();
	private final JTextField state = new JTextField();
	private final JLabel lblCreateNewPatient = new JLabel("Create New Patient");
	private final JButton create = new JButton("Create");
	public static NewPatient frame;
	
	/**
	 * @wbp.nonvisual location=51,14
	 */
	private final JTextField Admin = new JTextField();
	private JTextField pt_pass;

	/**
	 * Launch the application.
	 */
	public static void New_P() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new NewPatient();
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
	public NewPatient() {
		Admin.setText("Privilege");
		Admin.setColumns(10);
		fname.setBounds(0, 111, 242, 29);
		fname.setColumns(10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 479);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		

		
		JLabel labelfname = new JLabel("First Name");
		labelfname.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labelfname.setBounds(0, 90, 108, 29);
		contentPane.add(labelfname);
		labellname.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labellname.setBounds(0, 153, 91, 24);
		
		contentPane.add(labellname);
		labelst.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labelst.setBounds(0, 215, 91, 23);
		
		contentPane.add(labelst);
		labelcity.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labelcity.setBounds(0, 276, 91, 23);
		
		contentPane.add(labelcity);
		labelstate.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labelstate.setBounds(0, 339, 91, 23);
		
		contentPane.add(labelstate);
		labelzip.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labelzip.setBounds(160, 339, 91, 23);
		
		contentPane.add(labelzip);
		labelid.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		labelid.setBounds(0, 30, 91, 24);
		
		contentPane.add(labelid);
		
		contentPane.add(fname);
		lname.setColumns(10);
		lname.setBounds(0, 173, 242, 29);
		
		contentPane.add(lname);
		st.setColumns(10);
		st.setBounds(0, 234, 242, 29);
		
		contentPane.add(st);
		city.setColumns(10);
		city.setBounds(0, 297, 242, 29);
		
		contentPane.add(city);
		patientid.setColumns(10);
		patientid.setBounds(0, 48, 122, 29);
		
		contentPane.add(patientid);
		zip.setColumns(10);
		zip.setBounds(160, 357, 122, 29);
		
		contentPane.add(zip);
		state.setColumns(10);
		state.setBounds(0, 357, 122, 29);
		
		contentPane.add(state);
		lblCreateNewPatient.setForeground(new Color(0, 153, 255));
		lblCreateNewPatient.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 26));
		lblCreateNewPatient.setBounds(27, 0, 255, 29);
		
		
		
		contentPane.add(lblCreateNewPatient);
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
			     try {
			    	 
			    	 String first_name = fname.getText().toString();
			 		String last_name = lname.getText().toString();
			 		String street_name = st.getText().toString();
			 		String cityy= city.getText().toString();
			 		int p_id = Integer.parseInt(patientid.getText());
			 		int zip_code = Integer.parseInt(zip.getText());
			 		
			 		
			 		String stte = state.getText().toString();
			 		String passw = pt_pass.getText();
			    	 
			    	 	
			    	   Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "3mr3sIeLy");
			    	 
			  
						Statement statement = c.createStatement();
						
									
					
						String sql1 = "INSERT INTO users (user_id, privilege, user_pass) "
					            + "VALUES (" + p_id + ", '" + "patient" + "' , '" + passw + "' );";
						
						
						
						statement.executeUpdate(sql1);
						
				         String sql2 = "INSERT INTO patients (patient_id, firstName, lastName, stName, city, state, zipCode) "
				            + "VALUES (" + p_id + ", '" + first_name + "' , '" + last_name + "' , '" +street_name + "' , '" + cityy + "' , '" + stte + "' , " + zip_code + " );";
				        
				         statement.executeUpdate(sql2);
				        
				         c.close();
				         
				         JOptionPane.showMessageDialog(null, "New Patient Account Created");
				         
				         frame.setVisible(false);
				        
				         
				         
				      } catch (Exception ee) {
				         System.err.println( ee.getClass().getName()+": "+ ee.getMessage() );
				         System.exit(0);
				      }
			}
		});
		create.setForeground(Color.RED);
		create.setFont(new Font("Tahoma", Font.PLAIN, 18));
		create.setBounds(84, 395, 108, 29);
		
		contentPane.add(create);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Traditional Arabic", Font.PLAIN, 20));
		lblPassword.setBounds(160, 30, 91, 24);
		contentPane.add(lblPassword);
		
		pt_pass = new JTextField();
		pt_pass.setColumns(10);
		pt_pass.setBounds(160, 51, 122, 26);
		contentPane.add(pt_pass);
		

	}
}
