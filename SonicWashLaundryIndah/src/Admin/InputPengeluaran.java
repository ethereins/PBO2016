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

public class InputPengeluaran{

	private JFrame frame;
	private JTextField txtMasukkanNamaPemesan;
	private JTextField txtMasukkanTanggalPemesanan;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InputPengeluaran window = new InputPengeluaran();
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
	public InputPengeluaran() {
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
		panel_3.setBounds(0, 224, 175, 20);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblAntrianPesanan = new JLabel("Input Pengeluaran");
		lblAntrianPesanan.setBounds(10, 0, 121, 20);
		panel_3.add(lblAntrianPesanan);
		lblAntrianPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblAntrianPesanan.setForeground(new Color(0, 128, 128));
		lblAntrianPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
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
		
		JLabel lblPembayaran_1_1 = new JLabel("Karyawan");
		lblPembayaran_1_1.setBounds(10, 194, 86, 20);
		panel.add(lblPembayaran_1_1);
		lblPembayaran_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblPembayaran_1_1.setForeground(new Color(255, 255, 255));
		lblPembayaran_1_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(146, 0, 827, 19);
		frame.getContentPane().add(panel_2);
		
		JLabel lblHaiKasir = new JLabel("Input Pengeluaran");
		lblHaiKasir.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiKasir.setForeground(new Color(0, 128, 128));
		lblHaiKasir.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblHaiKasir.setBackground(new Color(0, 128, 128));
		lblHaiKasir.setBounds(194, 39, 306, 34);
		frame.getContentPane().add(lblHaiKasir);
		
		JLabel lblJanganLupaAbsensi = new JLabel("ID Pengeluaran");
		lblJanganLupaAbsensi.setHorizontalAlignment(SwingConstants.LEFT);
		lblJanganLupaAbsensi.setForeground(new Color(0, 128, 128));
		lblJanganLupaAbsensi.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblJanganLupaAbsensi.setBounds(195, 103, 120, 26);
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
		
		JLabel lblNamaPelanggan = new JLabel("Tanggal Transaksi");
		lblNamaPelanggan.setHorizontalAlignment(SwingConstants.LEFT);
		lblNamaPelanggan.setForeground(new Color(0, 128, 128));
		lblNamaPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblNamaPelanggan.setBounds(194, 135, 120, 26);
		frame.getContentPane().add(lblNamaPelanggan);
		
		JLabel lblNoHp = new JLabel("Total Transaksi");
		lblNoHp.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoHp.setForeground(new Color(0, 128, 128));
		lblNoHp.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblNoHp.setBounds(194, 201, 120, 26);
		frame.getContentPane().add(lblNoHp);
		
		txtMasukkanNamaPemesan = new JTextField();
		txtMasukkanNamaPemesan.setHorizontalAlignment(SwingConstants.LEFT);
		txtMasukkanNamaPemesan.setForeground(new Color(0, 128, 128));
		txtMasukkanNamaPemesan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanNamaPemesan.setColumns(10);
		txtMasukkanNamaPemesan.setBounds(367, 138, 239, 19);
		frame.getContentPane().add(txtMasukkanNamaPemesan);
		
		txtMasukkanTanggalPemesanan = new JTextField();
		txtMasukkanTanggalPemesanan.setHorizontalAlignment(SwingConstants.LEFT);
		txtMasukkanTanggalPemesanan.setForeground(new Color(0, 128, 128));
		txtMasukkanTanggalPemesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanTanggalPemesanan.setColumns(10);
		txtMasukkanTanggalPemesanan.setBounds(367, 204, 239, 19);
		frame.getContentPane().add(txtMasukkanTanggalPemesanan);
		
		JButton btnOrder = new JButton("Tambah");
		btnOrder.setBackground(new Color(0, 128, 128));
		btnOrder.setForeground(new Color(255, 255, 255));
		btnOrder.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnOrder.setBounds(436, 238, 95, 40);
		frame.getContentPane().add(btnOrder);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 128, 128));
		textField_4.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_4.setDropMode(DropMode.INSERT);
		textField_4.setColumns(10);
		textField_4.setBounds(367, 106, 116, 19);
		frame.getContentPane().add(textField_4);
		
		JLabel lblIdPelanggan = new JLabel("Jenis Pengeluaran");
		lblIdPelanggan.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdPelanggan.setForeground(new Color(0, 128, 128));
		lblIdPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblIdPelanggan.setBounds(194, 168, 120, 26);
		frame.getContentPane().add(lblIdPelanggan);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pilih Jenis Pengeluaran", "Gaji", "Listrik", "Air", "Bahan Laundry"}));
		comboBox.setForeground(new Color(0, 128, 128));
		comboBox.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		comboBox.setBounds(367, 168, 239, 26);
		frame.getContentPane().add(comboBox);
	}
}
