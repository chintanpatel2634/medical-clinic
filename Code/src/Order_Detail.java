import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.mysql.jdbc.ResultSet;
import net.proteanit.sql.DbUtils;


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

import javax.swing.*;
import java.awt.BorderLayout;
public class Order_Detail {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void O_D() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order_Detail window = new Order_Detail();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Order_Detail() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		

		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 779, 495);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblOrderId = new JLabel("Order ID: 1231");
		lblOrderId.setBounds(0, 0, 761, 22);
		lblOrderId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		frame.getContentPane().add(lblOrderId);
		
		JLabel lblPatientId = new JLabel("Patient ID: 9717");
		lblPatientId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPatientId.setBounds(0, 64, 761, 22);
		frame.getContentPane().add(lblPatientId);
		
		JLabel lblStaffId = new JLabel("Staff ID: 9716");
		lblStaffId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblStaffId.setBounds(0, 135, 761, 22);
		frame.getContentPane().add(lblStaffId);
		
		JLabel lblDiognosticId = new JLabel("Diognostic ID: 1001");
		lblDiognosticId.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblDiognosticId.setBounds(0, 216, 761, 22);
		frame.getContentPane().add(lblDiognosticId);
		
		JLabel lblResultsAttentionNeeded = new JLabel("Results: Attention Needed");
		lblResultsAttentionNeeded.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResultsAttentionNeeded.setBounds(0, 311, 761, 22);
		frame.getContentPane().add(lblResultsAttentionNeeded);
		try
		{
		  Connection c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "3mr3sIeLy");
	   
			Statement statement = c.createStatement();
			
			 String query = "SELECT * FROM orders";
			 
			 java.sql.ResultSet rs = statement.executeQuery(query);
				
			 
			// scrollPane.setModel(DbUtils.resultSetToTableModel(rs);)
			  
			       
			   
			 
			 
			 
			
			
		}
		catch (Exception ee) {
	         System.err.println( ee.getClass().getName()+": "+ ee.getMessage() );
	         System.exit(0);
	      }
	
	
	}
}
