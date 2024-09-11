package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Utama {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Utama window = new Utama();
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
	public Utama() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 128));
		frame.setBounds(100, 100, 873, 355);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("SonicWash");
		lblNewLabel.setBounds(332, 22, 160, 53);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(783, 10, 53, 26);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "EN"}));
		comboBox.setToolTipText("");
		comboBox.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Masuk Sebagai Admin");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnNewButton.setBounds(310, 159, 208, 40);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblSelamatDatangDi = new JLabel("Selamat Datang di SonicWash!");
		lblSelamatDatangDi.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelamatDatangDi.setForeground(Color.WHITE);
		lblSelamatDatangDi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblSelamatDatangDi.setBounds(249, 85, 331, 26);
		frame.getContentPane().add(lblSelamatDatangDi);
		
		JLabel lblAplikasiManajemenLaundry = new JLabel("Aplikasi manajemen laundry yang memudahkan dalam \r\nmengelola pesanan dan usaha laundry dengan layanan \r\nyang terintegrasi.");
		lblAplikasiManajemenLaundry.setHorizontalAlignment(SwingConstants.CENTER);
		lblAplikasiManajemenLaundry.setForeground(Color.WHITE);
		lblAplikasiManajemenLaundry.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblAplikasiManajemenLaundry.setBounds(34, 109, 777, 40);
		frame.getContentPane().add(lblAplikasiManajemenLaundry);
		
		JButton btnMasukSebagaiKaryawan = new JButton("Masuk Sebagai Kasir");
		btnMasukSebagaiKaryawan.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnMasukSebagaiKaryawan.setBounds(310, 218, 208, 40);
		frame.getContentPane().add(btnMasukSebagaiKaryawan);
		
		JLabel lblBelumPunyaAkun = new JLabel("Belum punya akun? Daftar di sini.");
		lblBelumPunyaAkun.setHorizontalAlignment(SwingConstants.CENTER);
		lblBelumPunyaAkun.setForeground(Color.WHITE);
		lblBelumPunyaAkun.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		lblBelumPunyaAkun.setBounds(264, 256, 304, 40);
		frame.getContentPane().add(lblBelumPunyaAkun);
	}
}
