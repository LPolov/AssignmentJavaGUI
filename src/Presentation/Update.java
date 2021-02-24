package Presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Update extends JFrame {

	private JPanel contentPane;
	private JTextField txtDateUpdate;
	private JTextField txtCityUpdate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Update frame = new Update();
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
	public Update() {
		setTitle("Update Data");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDateUpdate = new JLabel("Date: ");
		lblDateUpdate.setBounds(45, 26, 61, 16);
		contentPane.add(lblDateUpdate);
		
		JLabel lblCityUpdate = new JLabel("City: ");
		lblCityUpdate.setBounds(45, 72, 61, 16);
		contentPane.add(lblCityUpdate);
		
		txtDateUpdate = new JTextField();
		txtDateUpdate.setBounds(118, 21, 262, 26);
		contentPane.add(txtDateUpdate);
		txtDateUpdate.setColumns(10);
		
		txtCityUpdate = new JTextField();
		txtCityUpdate.setColumns(10);
		txtCityUpdate.setBounds(118, 67, 262, 26);
		contentPane.add(txtCityUpdate);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(160, 193, 134, 47);
		contentPane.add(btnUpdate);
	}

}
