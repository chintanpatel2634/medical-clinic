
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class BusinessReport extends JFrame implements ActionListener {	

	String[] messageStrings = {"Lab", "MRI", "XRay", "Office Visit"};
	
	JComboBox revenueDiagnostic = new JComboBox(messageStrings);
	JLabel lblText = new JLabel();
	
	
	String[] messageStrings2 = {"Doctor 1", "Doctor 2", "Doctor 3"};
	
	JComboBox revenueDoctor = new JComboBox(messageStrings2);
	JLabel lblText2 = new JLabel();
	
	private final JLabel lblNewLabel = new JLabel("Total revenue from diagnostic");
	private final JLabel lblNewLabel_1 = new JLabel("Total revenue from a doctor");
	
	private final JLabel lblNewLabel_2 = new JLabel("Revenue");
	private final JTextField textField = new JTextField();
	private final JTextField textField_1 = new JTextField();
	private final JComboBox comboBox = new JComboBox(new Object[]{});


	/**
	 * Launch the application.
	 */
	
	public static void B_report() {
		
		BusinessReport fr = new BusinessReport();
		fr.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public BusinessReport() {
		textField_1.setBounds(181, 57, 96, 20);
		textField_1.setColumns(10);
		textField.setBounds(174, 123, 96, 20);
		textField.setColumns(10);
		setSize(400,300);
		setTitle("Business Report example");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		revenueDiagnostic.setBounds(60, 57, 84, 20);
		
		revenueDiagnostic.setSelectedIndex(1);
		revenueDiagnostic.addActionListener(this);
		getContentPane().setLayout(null);
		getContentPane().add(revenueDiagnostic);
		
		revenueDoctor.setSelectedIndex(1);
		revenueDoctor.addActionListener(this);
		getContentPane().add(revenueDoctor);
		lblText.setBounds(277, 15, 0, 0);
		getContentPane().add(lblText);
		lblText2.setBounds(282, 15, 0, 0);
		getContentPane().add(lblText2);
		lblNewLabel.setBounds(15, 32, 357, 14);
		
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(15, 88, 367, 14);
		
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setBounds(174, 1, 121, 14);
		
		getContentPane().add(lblNewLabel_2);
		
		getContentPane().add(textField);
		
		getContentPane().add(textField_1);
		comboBox.setSelectedIndex(1);
		comboBox.setBounds(60, 123, 84, 20);
		
		getContentPane().add(comboBox);
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == revenueDiagnostic) {
			JComboBox cb = (JComboBox)e.getSource();
			String msg = (String)cb.getSelectedItem();
			JOptionPane.showMessageDialog(null, msg);
//			switch (msg) {
//			case "Message 1": lblText.setText("You selected Message 1. :=)");
//			break;
//			case "Message 2": lblText.setText("You selected Message 2. :=)");
//			break;
//			case "Message 3": lblText.setText("You selected Message 3. :=)");
//			break;
//			default:lblText.setText("Whoops. We seem to have an error.");
//			}
			}
		
		if (e.getSource() == revenueDoctor) {
			JComboBox cb2 = (JComboBox)e.getSource();
			String msg2 = (String)cb2.getSelectedItem();
			JOptionPane.showMessageDialog(null, msg2);
//			
			}
		
	}
}
