package Presentation;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JButton;

public class MainGUI extends JFrame {

	private JPanel contentPane;
	private JTextField txtDate;
	private JTextField txtCity;
	private JTextField txtCases;
	private JTextField txtDeaths;
	private JTextField txtRecoveries;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI frame = new MainGUI();
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
	public MainGUI() {
		setTitle("Main Window");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenuItem mnItemPrint = new JMenuItem("Print");
		mnItemPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PrintData pd = new PrintData();
				pd.setVisible(true);
			}
		});
		menuBar.add(mnItemPrint);
		
		JMenuItem mnItemUpdate = new JMenuItem("Update");
		mnItemUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Update up = new Update();
				up.setVisible(true);
			}
		});
		menuBar.add(mnItemUpdate);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(6, 2, 0, 0));
		
		JLabel lblDate = new JLabel("Date of reporting: ");
		contentPane.add(lblDate);
		
		txtDate = new JTextField();
		contentPane.add(txtDate);
		txtDate.setColumns(10);
		
		JLabel lblCity = new JLabel("Name of city:");
		contentPane.add(lblCity);
		
		txtCity = new JTextField();
		txtCity.setColumns(10);
		contentPane.add(txtCity);
		
		JLabel lblCases = new JLabel("Number of cases: ");
		contentPane.add(lblCases);
		
		txtCases = new JTextField();
		txtCases.setColumns(10);
		contentPane.add(txtCases);
		
		JLabel lblDeaths = new JLabel("Number of deaths: ");
		contentPane.add(lblDeaths);
		
		txtDeaths = new JTextField();
		txtDeaths.setColumns(10);
		contentPane.add(txtDeaths);
		
		JLabel lblRecoveries = new JLabel("Number of recoveries: ");
		contentPane.add(lblRecoveries);
		
		txtRecoveries = new JTextField();
		txtRecoveries.setColumns(10);
		contentPane.add(txtRecoveries);
		
		JButton btnSubmit = new JButton("Submit");
		contentPane.add(btnSubmit);
	}
}
