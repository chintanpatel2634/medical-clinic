
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class Bills extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void bill_pay() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bills frame = new Bills();
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
	public Bills() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBills = new JLabel("Bills");
		lblBills.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblBills.setBounds(181, 11, 80, 16);
		contentPane.add(lblBills);
		
		JLabel lblOrderId = new JLabel("Order ID:");
		lblOrderId.setBounds(6, 45, 61, 16);
		contentPane.add(lblOrderId);
		
		JLabel lblD = new JLabel("Diagnostic Type:");
		lblD.setBounds(6, 89, 121, 16);
		contentPane.add(lblD);
		
		JLabel lblCost = new JLabel("Cost:");
		lblCost.setBounds(6, 135, 61, 16);
		contentPane.add(lblCost);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setBounds(6, 181, 61, 16);
		contentPane.add(lblTotal);
		
		textField = new JTextField();
		textField.setBounds(74, 40, 130, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(126, 84, 130, 26);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(46, 130, 130, 26);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(46, 176, 130, 26);
		contentPane.add(textField_3);
	}

}
