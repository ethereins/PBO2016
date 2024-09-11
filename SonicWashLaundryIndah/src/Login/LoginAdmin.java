package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginAdmin {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginAdmin window = new LoginAdmin();
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
	public LoginAdmin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 623, 423);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SonicWash");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblNewLabel.setBounds(211, 10, 160, 53);
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "EN"}));
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		comboBox.setBounds(546, 20, 53, 26);
		frame.getContentPane().add(comboBox);
		
		JLabel lblMasukSebagaiManajer = new JLabel("Masuk Sebagai Admin\r\n");
		lblMasukSebagaiManajer.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasukSebagaiManajer.setForeground(Color.WHITE);
		lblMasukSebagaiManajer.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblMasukSebagaiManajer.setBounds(125, 61, 331, 26);
		frame.getContentPane().add(lblMasukSebagaiManajer);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		passwordField.setToolTipText("");
		passwordField.setBounds(174, 236, 239, 19);
		frame.getContentPane().add(passwordField);
		
		JFormattedTextField frmtdtxtfldEmail = new JFormattedTextField();
		frmtdtxtfldEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		frmtdtxtfldEmail.setBounds(174, 185, 239, 19);
		frame.getContentPane().add(frmtdtxtfldEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblEmail.setBounds(174, 161, 166, 26);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblKataSandi = new JLabel("Kata Sandi");
		lblKataSandi.setHorizontalAlignment(SwingConstants.LEFT);
		lblKataSandi.setForeground(Color.WHITE);
		lblKataSandi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblKataSandi.setBounds(174, 214, 166, 26);
		frame.getContentPane().add(lblKataSandi);
		
		JLabel lblLupaKataSandi = new JLabel("Lupa kata sandi?");
		lblLupaKataSandi.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLupaKataSandi.setForeground(Color.WHITE);
		lblLupaKataSandi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblLupaKataSandi.setBounds(247, 252, 166, 26);
		frame.getContentPane().add(lblLupaKataSandi);
		
		JButton btnMasuk = new JButton("Masuk");
		btnMasuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMasuk.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnMasuk.setBounds(245, 300, 95, 40);
		frame.getContentPane().add(btnMasuk);
		
		JFormattedTextField frmtdtxtfldEmail_1 = new JFormattedTextField();
		frmtdtxtfldEmail_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		frmtdtxtfldEmail_1.setBounds(174, 132, 239, 19);
		frame.getContentPane().add(frmtdtxtfldEmail_1);
		
		JLabel lblIdAdmin = new JLabel("ID Admin");
		lblIdAdmin.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdAdmin.setForeground(Color.WHITE);
		lblIdAdmin.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblIdAdmin.setBounds(174, 108, 166, 26);
		frame.getContentPane().add(lblIdAdmin);
	}
}
