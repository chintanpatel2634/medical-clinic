
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Patient extends JFrame implements ActionListener {

	String[] messageStrings = {"Message 1", "Message 2", "Message 3"};
	
	JComboBox patientList = new JComboBox(messageStrings);
	JLabel lblText = new JLabel();
	
	
	String[] messageStrings2 = {"Message 11", "Message 22", "Message 33"};
	JComboBox patientList2 = new JComboBox(messageStrings2);
	JLabel lblText2 = new JLabel();
	private final JLabel lblNewLabel = new JLabel("View your orders");
	private final JLabel lblNewLabel_1 = new JLabel("View bills");
	private final JLabel lblNewLabel_2 = new JLabel("Patient");
	private final JButton btnMedicalRecord = new JButton("Medical Record");


	/**
	 * Launch the application.
	 */
	
	public static void patient_run() {
		
		Patient fr = new Patient();
		fr.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public Patient() {
		setSize(400,300);
		setTitle("Patient Example");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		patientList.setBounds(15, 57, 78, 20);
		
		patientList.setSelectedIndex(1);
		patientList.addActionListener(this);
		getContentPane().setLayout(null);
		getContentPane().add(patientList);
		patientList2.setBounds(15, 113, 84, 20);
		
		patientList2.setSelectedIndex(1);
		patientList2.addActionListener(this);
		getContentPane().add(patientList2);
		lblText.setBounds(277, 15, 0, 0);
		getContentPane().add(lblText);
		lblText2.setBounds(282, 15, 0, 0);
		getContentPane().add(lblText2);
		lblNewLabel.setBounds(15, 32, 357, 14);
		
		getContentPane().add(lblNewLabel);
		lblNewLabel_1.setBounds(15, 88, 367, 14);
		
		patientList.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Order_Detail od = new  Order_Detail();
			  od.O_D();
		  }
		});
		
		
		getContentPane().add(lblNewLabel_1);
		lblNewLabel_2.setBounds(161, 0, 48, 14);
		
		patientList2.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Bills bpp = new  Bills();
			  bpp.bill_pay();
		  }
		});
		
		
		
		getContentPane().add(lblNewLabel_2);
		btnMedicalRecord.setBounds(15, 159, 146, 23);
		
		getContentPane().add(btnMedicalRecord);
		
		btnMedicalRecord.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
			  Order_Detail od = new  Order_Detail();
			  od.O_D();
		  }
		});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == patientList) {
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
		
		if (e.getSource() == patientList2) {
			JComboBox cb2 = (JComboBox)e.getSource();
			String msg2 = (String)cb2.getSelectedItem();
			JOptionPane.showMessageDialog(null, msg2);
//			
			}
		
	}
}
