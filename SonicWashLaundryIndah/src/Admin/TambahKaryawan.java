package Admin;

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
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.DropMode;

public class TambahKaryawan{

	private JFrame frame;
	private JTextField txtMasukkanIdPesanan;
	private JTextField txtMasukkanTanggalPemesanan;
	private JTextField txtMasukkanAlamatPelanggan;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TambahKaryawan window = new TambahKaryawan();
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
	public TambahKaryawan() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 848, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 164, 603);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEmail = new JLabel("Rekap Data Transaksi");
		lblEmail.setBounds(10, 164, 144, 20);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		panel.add(lblEmail);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 194, 175, 20);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblPembayaran_1_1 = new JLabel("Karyawan");
		lblPembayaran_1_1.setBounds(10, 0, 86, 20);
		panel_3.add(lblPembayaran_1_1);
		lblPembayaran_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPembayaran_1_1.setForeground(new Color(0, 128, 128));
		lblPembayaran_1_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JLabel lblNewLabel = new JLabel("SonicWash");
		lblNewLabel.setBounds(10, 47, 144, 27);
		panel.add(lblNewLabel);
		lblNewLabel.setBackground(new Color(0, 128, 128));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 30));
		
		JPanel panel_4_2 = new JPanel();
		panel_4_2.setBounds(121, 31, 10, 10);
		panel.add(panel_4_2);
		panel_4_2.setLayout(null);
		
		JPanel panel_4_2_1 = new JPanel();
		panel_4_2_1.setBounds(133, 20, 10, 10);
		panel.add(panel_4_2_1);
		
		JPanel panel_4_3_1 = new JPanel();
		panel_4_2_1.add(panel_4_3_1);
		
		JPanel panel_4_2_2 = new JPanel();
		panel_4_2_2.setBounds(43, 76, 10, 10);
		panel.add(panel_4_2_2);
		
		JPanel panel_4_2_2_1 = new JPanel();
		panel_4_2_2_1.setBounds(30, 84, 10, 10);
		panel.add(panel_4_2_2_1);
		
		JLabel lblAntrianPesanan = new JLabel("Input Pengeluaran");
		lblAntrianPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblAntrianPesanan.setForeground(Color.WHITE);
		lblAntrianPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblAntrianPesanan.setBounds(10, 224, 121, 20);
		panel.add(lblAntrianPesanan);
		
		JLabel lblStatusPesanan = new JLabel("Membership");
		lblStatusPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblStatusPesanan.setForeground(Color.WHITE);
		lblStatusPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblStatusPesanan.setBounds(10, 254, 121, 20);
		panel.add(lblStatusPesanan);
		
		JLabel lblDashboard_1 = new JLabel("Dashboard");
		lblDashboard_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDashboard_1.setForeground(Color.WHITE);
		lblDashboard_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblDashboard_1.setBounds(10, 134, 86, 20);
		panel.add(lblDashboard_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(146, 0, 827, 19);
		frame.getContentPane().add(panel_2);
		
		JLabel lblHaiKasir = new JLabel("Tambah Karyawan");
		lblHaiKasir.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiKasir.setForeground(new Color(0, 128, 128));
		lblHaiKasir.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblHaiKasir.setBackground(new Color(0, 128, 128));
		lblHaiKasir.setBounds(194, 39, 306, 34);
		frame.getContentPane().add(lblHaiKasir);
		
		JLabel lblJanganLupaAbsensi = new JLabel("Username");
		lblJanganLupaAbsensi.setHorizontalAlignment(SwingConstants.LEFT);
		lblJanganLupaAbsensi.setForeground(new Color(0, 128, 128));
		lblJanganLupaAbsensi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblJanganLupaAbsensi.setBounds(194, 103, 120, 26);
		frame.getContentPane().add(lblJanganLupaAbsensi);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setBounds(771, 62, 53, 26);
		frame.getContentPane().add(comboBox_1);
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"ID", "EN"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JLabel lblSaturday = new JLabel("Saturday,\r\n 24/08/2024");
		lblSaturday.setHorizontalAlignment(SwingConstants.RIGHT);
		lblSaturday.setForeground(new Color(0, 128, 128));
		lblSaturday.setFont(new Font("Goudy Old Style", Font.PLAIN, 18));
		lblSaturday.setBounds(590, 23, 234, 40);
		frame.getContentPane().add(lblSaturday);
		
		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlamat.setForeground(new Color(0, 128, 128));
		lblAlamat.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblAlamat.setBounds(194, 193, 120, 26);
		frame.getContentPane().add(lblAlamat);
		
		JLabel lblNoHp = new JLabel("No. HP");
		lblNoHp.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoHp.setForeground(new Color(0, 128, 128));
		lblNoHp.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblNoHp.setBounds(195, 164, 120, 26);
		frame.getContentPane().add(lblNoHp);
		
		JLabel lblJenisLayanan = new JLabel("Kata Sandi");
		lblJenisLayanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblJenisLayanan.setForeground(new Color(0, 128, 128));
		lblJenisLayanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblJenisLayanan.setBounds(194, 221, 120, 26);
		frame.getContentPane().add(lblJenisLayanan);
		
		txtMasukkanIdPesanan = new JTextField();
		txtMasukkanIdPesanan.setDropMode(DropMode.INSERT);
		txtMasukkanIdPesanan.setForeground(new Color(0, 128, 128));
		txtMasukkanIdPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanIdPesanan.setBounds(367, 138, 239, 19);
		frame.getContentPane().add(txtMasukkanIdPesanan);
		txtMasukkanIdPesanan.setColumns(10);
		
		txtMasukkanTanggalPemesanan = new JTextField();
		txtMasukkanTanggalPemesanan.setHorizontalAlignment(SwingConstants.LEFT);
		txtMasukkanTanggalPemesanan.setForeground(new Color(0, 128, 128));
		txtMasukkanTanggalPemesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanTanggalPemesanan.setColumns(10);
		txtMasukkanTanggalPemesanan.setBounds(367, 167, 239, 19);
		frame.getContentPane().add(txtMasukkanTanggalPemesanan);
		
		txtMasukkanAlamatPelanggan = new JTextField();
		txtMasukkanAlamatPelanggan.setForeground(new Color(0, 128, 128));
		txtMasukkanAlamatPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanAlamatPelanggan.setColumns(10);
		txtMasukkanAlamatPelanggan.setBounds(367, 196, 391, 19);
		frame.getContentPane().add(txtMasukkanAlamatPelanggan);
		
		JButton btnOrder = new JButton("Tambah");
		btnOrder.setBackground(new Color(0, 128, 128));
		btnOrder.setForeground(new Color(255, 255, 255));
		btnOrder.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnOrder.setBounds(436, 297, 95, 40);
		frame.getContentPane().add(btnOrder);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 128, 128));
		textField_4.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_4.setDropMode(DropMode.INSERT);
		textField_4.setColumns(10);
		textField_4.setBounds(367, 106, 116, 19);
		frame.getContentPane().add(textField_4);
		
		JLabel lblIdPelanggan = new JLabel("Email");
		lblIdPelanggan.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdPelanggan.setForeground(new Color(0, 128, 128));
		lblIdPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblIdPelanggan.setBounds(194, 135, 120, 26);
		frame.getContentPane().add(lblIdPelanggan);
		
		passwordField = new JPasswordField();
		passwordField.setToolTipText("");
		passwordField.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		passwordField.setBounds(367, 225, 239, 19);
		frame.getContentPane().add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setToolTipText("");
		passwordField_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 13));
		passwordField_1.setBounds(367, 254, 239, 19);
		frame.getContentPane().add(passwordField_1);
		
		JLabel lblKonfirmasiKataSandi = new JLabel("Konfirmasi Kata Sandi");
		lblKonfirmasiKataSandi.setHorizontalAlignment(SwingConstants.LEFT);
		lblKonfirmasiKataSandi.setForeground(new Color(0, 128, 128));
		lblKonfirmasiKataSandi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblKonfirmasiKataSandi.setBounds(194, 250, 152, 26);
		frame.getContentPane().add(lblKonfirmasiKataSandi);
	}
}
