import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;

public class CreateOrder extends JFrame {

	private JPanel contentPane;
	private JTextField o_i;
	private JTextField p_i;
	private JTextField s_i;
	private JTextField d_i;
	public static CreateOrder frame;

	/**
	 * Launch the application.
	 */
	public static void C_Order() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 frame = new CreateOrder();
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
	public CreateOrder() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 475, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Order ID");
		lblNewLabel.setBounds(40, 33, 68, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblPatientId = new JLabel("Patient ID");
		lblPatientId.setBounds(40, 87, 68, 14);
		contentPane.add(lblPatientId);
		
		JLabel lblStaffId = new JLabel("Staff ID");
		lblStaffId.setBounds(40, 129, 48, 14);
		contentPane.add(lblStaffId);
		
		JLabel lblDiagnosticId = new JLabel("Diagnostic ID");
		lblDiagnosticId.setBounds(40, 169, 96, 14);
		contentPane.add(lblDiagnosticId);
		
		JLabel lblResults = new JLabel("Results");
		lblResults.setBounds(40, 209, 48, 14);
		contentPane.add(lblResults);
		
		o_i = new JTextField();
		o_i.setBounds(129, 38, 96, 20);
		contentPane.add(o_i);
		o_i.setColumns(10);
		
		p_i = new JTextField();
		p_i.setBounds(129, 84, 96, 20);
		contentPane.add(p_i);
		p_i.setColumns(10);
		
		s_i = new JTextField();
		s_i.setBounds(129, 126, 96, 20);
		contentPane.add(s_i);
		s_i.setColumns(10);
		
		d_i = new JTextField();
		d_i.setBounds(129, 166, 96, 20);
		contentPane.add(d_i);
		d_i.setColumns(10);
		
		JTextPane result = new JTextPane();
		result.setBounds(129, 199, 106, 38);
		contentPane.add(result);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(189, 248, 89, 23);
		contentPane.add(btnSubmit);
		

		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					 
			     try {
			    	 
			    	String order_id = o_i.getText().toString();
			 		String patient_id = p_i.getText().toString();
			 		String staff_id = s_i.getText().toString();
			 		String diogn_id= d_i.getText().toString();
			 		String res = result.getText().toString();
			 		
			 		
			    	   Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "3mr3sIeLy");
			    	 
			  
						Statement statement = c.createStatement();
						
									
					
						

			
				         String sql2 = "INSERT INTO orders (order_id, customer_id, staff_id, diagnostic_id, results) "
				            + "VALUES (" + order_id + ", " + patient_id + " , " + staff_id + " , " +diogn_id + " , '" + res + "'); ";
				         
				         System.out.println(sql2);
				        
				         statement.executeUpdate(sql2);
				        
				         c.close();
				         
				         JOptionPane.showMessageDialog(null, "New Order Created");
				         
				         frame.setVisible(false);
				        
				         
				         
				      } catch (Exception ee) {
				         System.err.println( ee.getClass().getName()+": "+ ee.getMessage() );
				         System.exit(0);
				      }
			}
		});
		
		
	}
}
