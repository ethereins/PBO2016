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

public class LupaPassword{

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LupaPassword window = new LupaPassword();
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
	public LupaPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setForeground(new Color(255, 255, 255));
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
		
		JLabel lblMasukSebagaiManajer = new JLabel("Lupa kata sandi?");
		lblMasukSebagaiManajer.setHorizontalAlignment(SwingConstants.CENTER);
		lblMasukSebagaiManajer.setForeground(Color.WHITE);
		lblMasukSebagaiManajer.setFont(new Font("Goudy Old Style", Font.PLAIN, 20));
		lblMasukSebagaiManajer.setBounds(124, 62, 331, 26);
		frame.getContentPane().add(lblMasukSebagaiManajer);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		passwordField.setToolTipText("");
		passwordField.setBounds(174, 244, 239, 19);
		frame.getContentPane().add(passwordField);
		
		JFormattedTextField frmtdtxtfldEmail = new JFormattedTextField();
		frmtdtxtfldEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		frmtdtxtfldEmail.setBounds(174, 133, 239, 19);
		frame.getContentPane().add(frmtdtxtfldEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(Color.WHITE);
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblEmail.setBounds(174, 109, 166, 26);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblKataSandi = new JLabel("Kata Sandi Baru");
		lblKataSandi.setHorizontalAlignment(SwingConstants.LEFT);
		lblKataSandi.setForeground(Color.WHITE);
		lblKataSandi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblKataSandi.setBounds(174, 219, 166, 26);
		frame.getContentPane().add(lblKataSandi);
		
		JButton btnMasuk = new JButton("Kirim Link Reset");
		btnMasuk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMasuk.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnMasuk.setBounds(226, 162, 132, 26);
		frame.getContentPane().add(btnMasuk);
		
		JButton btnUbah = new JButton("Ubah");
		btnUbah.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnUbah.setBounds(246, 273, 86, 26);
		frame.getContentPane().add(btnUbah);
		
		JLabel lblSudahPunyaAkun = new JLabel("Sudah punya akun? Masuk.");
		lblSudahPunyaAkun.setHorizontalAlignment(SwingConstants.CENTER);
		lblSudahPunyaAkun.setForeground(Color.WHITE);
		lblSudahPunyaAkun.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		lblSudahPunyaAkun.setBounds(135, 301, 304, 40);
		frame.getContentPane().add(lblSudahPunyaAkun);
	}
}
