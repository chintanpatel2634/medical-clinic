import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class Login extends JFrame {
	
	private JPanel contentPane;
	private JTextField user;
	private JPasswordField pass;
	private JTextField prvlg;
	public Connection con;
	public Statement stmt;
	public static Login frame;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 331);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblClinicApp = new JLabel("Clinic App");
		lblClinicApp.setForeground(new Color(0, 153, 255));
		lblClinicApp.setBackground(Color.GRAY);
		lblClinicApp.setHorizontalAlignment(SwingConstants.CENTER);
		lblClinicApp.setFont(new Font("Californian FB", Font.BOLD | Font.ITALIC, 26));
		lblClinicApp.setBounds(0, 0, 280, 46);
		contentPane.add(lblClinicApp);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblUsername.setBounds(10, 37, 103, 22);
		contentPane.add(lblUsername);
		
		user = new JTextField();
		user.setBounds(10, 59, 196, 22);
		contentPane.add(user);
		user.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblPassword.setBounds(10, 152, 103, 22);
		contentPane.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setBounds(10, 174, 196, 22);
		contentPane.add(pass);
		

		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "3mr3sIeLy");
				stmt = con.createStatement();
				String sql = "Select * from users where user_id = '" + user.getText() + "' and privilege = '" + prvlg.getText() + "' and user_pass = '" + pass.getText().toString()+"'";
				ResultSet rs = stmt.executeQuery(sql);
				

				if (rs.next()) 
				{
					if (prvlg.getText().equals("admin")) 
					{
						Admin am1 = new Admin();
						am1.a_run();
						
						
					}
					else if (prvlg.getText().equals("patient")) 
					{
						Patient pat1 = new Patient();
						pat1.patient_run();
					}
					else if (prvlg.getText().equals("staff")) 
					{
						Staff saf1 = new Staff();
						saf1.stf();
					}
					else if (prvlg.getText().equals("scheduler")) 
					{
						Scheduler sch1 = new Scheduler();
						sch1.sch();
					}
					
					else 
						
					{
						JOptionPane.showMessageDialog(null, "Something wrong");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "Incorrect Credentials!");
				con.close();}
				
				frame.setVisible(false);
			}catch(Exception e1) {System.out.print(e1);}
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 19));
		btnNewButton.setBounds(10, 220, 97, 37);
		contentPane.add(btnNewButton);
		
		JLabel lblprivilege = new JLabel("Privilege");
		lblprivilege.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		lblprivilege.setBounds(10, 94, 103, 22);
		contentPane.add(lblprivilege);
		
		prvlg = new JTextField();
		prvlg.setColumns(10);
		prvlg.setBounds(10, 117, 196, 22);
		contentPane.add(prvlg);
	}
}
