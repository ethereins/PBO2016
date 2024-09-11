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

public class SignIn{

	private JFrame frame;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignIn window = new SignIn();
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
	public SignIn() {
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
		
		JLabel lblMasukSebagaiManajer = new JLabel("Daftarkan akun anda");
		lblMasukSebagaiManajer.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasukSebagaiManajer.setForeground(Color.WHITE);
		lblMasukSebagaiManajer.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblMasukSebagaiManajer.setBounds(125, 57, 331, 26);
		frame.getContentPane().add(lblMasukSebagaiManajer);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		passwordField.setToolTipText("");
		passwordField.setBounds(174, 219, 239, 19);
		frame.getContentPane().add(passwordField);
		
		JFormattedTextField frmtdtxtfldEmail = new JFormattedTextField();
		frmtdtxtfldEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		frmtdtxtfldEmail.setBounds(174, 166, 239, 19);
		frame.getContentPane().add(frmtdtxtfldEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblEmail.setBounds(174, 142, 166, 26);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblKataSandi = new JLabel("Kata Sandi");
		lblKataSandi.setHorizontalAlignment(SwingConstants.LEFT);
		lblKataSandi.setForeground(Color.WHITE);
		lblKataSandi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblKataSandi.setBounds(174, 195, 166, 26);
		frame.getContentPane().add(lblKataSandi);
		
		JButton btnMasuk = new JButton("Daftar\r\n");
		btnMasuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMasuk.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnMasuk.setBounds(245, 306, 95, 40);
		frame.getContentPane().add(btnMasuk);
		
		JLabel lblKonfirmasiKataSandi = new JLabel("Konfirmasi Kata Sandi");
		lblKonfirmasiKataSandi.setHorizontalAlignment(SwingConstants.LEFT);
		lblKonfirmasiKataSandi.setForeground(Color.WHITE);
		lblKonfirmasiKataSandi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblKonfirmasiKataSandi.setBounds(174, 248, 166, 26);
		frame.getContentPane().add(lblKonfirmasiKataSandi);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		passwordField_1.setBounds(174, 273, 239, 19);
		frame.getContentPane().add(passwordField_1);
		
		JFormattedTextField frmtdtxtfldEmail_1 = new JFormattedTextField();
		frmtdtxtfldEmail_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		frmtdtxtfldEmail_1.setBounds(174, 115, 239, 19);
		frame.getContentPane().add(frmtdtxtfldEmail_1);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsername.setForeground(Color.WHITE);
		lblUsername.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblUsername.setBounds(174, 93, 166, 26);
		frame.getContentPane().add(lblUsername);
	}
}
