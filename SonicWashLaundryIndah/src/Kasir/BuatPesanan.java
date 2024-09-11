package Kasir;

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

public class BuatPesanan{

	private JFrame frame;
	private JTextField txtMasukkanIdPesanan;
	private JTextField txtMasukkanNamaPemesan;
	private JTextField txtMasukkanTanggalPemesanan;
	private JTextField txtMasukkanAlamatPelanggan;
	private JTextField txtMasukkanNoHp;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BuatPesanan window = new BuatPesanan();
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
	public BuatPesanan() {
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
		
		JLabel lblEmail = new JLabel("Buat Pesanan");
		lblEmail.setBounds(10, 164, 121, 20);
		lblEmail.setHorizontalAlignment(SwingConstants.LEFT);
		lblEmail.setForeground(new Color(0, 128, 128));
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		panel.add(lblEmail);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 164, 175, 20);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
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
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setHorizontalAlignment(SwingConstants.LEFT);
		lblPembayaran.setForeground(Color.WHITE);
		lblPembayaran.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblPembayaran.setBounds(10, 194, 86, 20);
		panel.add(lblPembayaran);
		
		JLabel lblDashboard = new JLabel("Dashboard");
		lblDashboard.setBounds(10, 134, 62, 20);
		panel.add(lblDashboard);
		lblDashboard.setHorizontalAlignment(SwingConstants.LEFT);
		lblDashboard.setForeground(new Color(255, 255, 255));
		lblDashboard.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		
		JLabel lblStatusPesanan = new JLabel("Status Pesanan");
		lblStatusPesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblStatusPesanan.setForeground(Color.WHITE);
		lblStatusPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblStatusPesanan.setBounds(10, 224, 121, 20);
		panel.add(lblStatusPesanan);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(146, 0, 827, 19);
		frame.getContentPane().add(panel_2);
		
		JLabel lblHaiKasir = new JLabel("Buat Pesanan");
		lblHaiKasir.setHorizontalAlignment(SwingConstants.LEFT);
		lblHaiKasir.setForeground(new Color(0, 128, 128));
		lblHaiKasir.setFont(new Font("Goudy Old Style", Font.BOLD, 35));
		lblHaiKasir.setBackground(new Color(0, 128, 128));
		lblHaiKasir.setBounds(194, 39, 306, 34);
		frame.getContentPane().add(lblHaiKasir);
		
		JLabel lblJanganLupaAbsensi = new JLabel("ID Pesanan");
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
		
		JLabel lblNamaPelanggan = new JLabel("Nama Pelanggan");
		lblNamaPelanggan.setHorizontalAlignment(SwingConstants.LEFT);
		lblNamaPelanggan.setForeground(new Color(0, 128, 128));
		lblNamaPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblNamaPelanggan.setBounds(194, 168, 120, 26);
		frame.getContentPane().add(lblNamaPelanggan);
		
		JLabel lblTanggalPemesanan = new JLabel("Tanggal Pemesanan");
		lblTanggalPemesanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblTanggalPemesanan.setForeground(new Color(0, 128, 128));
		lblTanggalPemesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTanggalPemesanan.setBounds(194, 201, 120, 26);
		frame.getContentPane().add(lblTanggalPemesanan);
		
		JLabel lblAlamat = new JLabel("Alamat");
		lblAlamat.setHorizontalAlignment(SwingConstants.LEFT);
		lblAlamat.setForeground(new Color(0, 128, 128));
		lblAlamat.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblAlamat.setBounds(195, 232, 120, 26);
		frame.getContentPane().add(lblAlamat);
		
		JLabel lblNoHp = new JLabel("No. HP");
		lblNoHp.setHorizontalAlignment(SwingConstants.LEFT);
		lblNoHp.setForeground(new Color(0, 128, 128));
		lblNoHp.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblNoHp.setBounds(195, 263, 120, 26);
		frame.getContentPane().add(lblNoHp);
		
		JLabel lblJenisLayanan = new JLabel("Jenis Layanan");
		lblJenisLayanan.setHorizontalAlignment(SwingConstants.LEFT);
		lblJenisLayanan.setForeground(new Color(0, 128, 128));
		lblJenisLayanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblJenisLayanan.setBounds(194, 296, 120, 26);
		frame.getContentPane().add(lblJenisLayanan);
		
		JLabel lblHargakg = new JLabel("Harga/kg");
		lblHargakg.setHorizontalAlignment(SwingConstants.LEFT);
		lblHargakg.setForeground(new Color(0, 128, 128));
		lblHargakg.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblHargakg.setBounds(194, 327, 120, 26);
		frame.getContentPane().add(lblHargakg);
		
		JLabel lblMetodePengambilan = new JLabel("Estimasi Berat");
		lblMetodePengambilan.setHorizontalAlignment(SwingConstants.LEFT);
		lblMetodePengambilan.setForeground(new Color(0, 128, 128));
		lblMetodePengambilan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblMetodePengambilan.setBounds(194, 355, 170, 26);
		frame.getContentPane().add(lblMetodePengambilan);
		
		JLabel lblTotal = new JLabel("Metode Pengambilan");
		lblTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal.setForeground(new Color(0, 128, 128));
		lblTotal.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTotal.setBounds(194, 384, 133, 26);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblTotal_2 = new JLabel("Total");
		lblTotal_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal_2.setForeground(new Color(0, 128, 128));
		lblTotal_2.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTotal_2.setBounds(195, 440, 133, 26);
		frame.getContentPane().add(lblTotal_2);
		
		txtMasukkanIdPesanan = new JTextField();
		txtMasukkanIdPesanan.setDropMode(DropMode.INSERT);
		txtMasukkanIdPesanan.setForeground(new Color(0, 128, 128));
		txtMasukkanIdPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanIdPesanan.setBounds(367, 138, 116, 19);
		frame.getContentPane().add(txtMasukkanIdPesanan);
		txtMasukkanIdPesanan.setColumns(10);
		
		txtMasukkanNamaPemesan = new JTextField();
		txtMasukkanNamaPemesan.setHorizontalAlignment(SwingConstants.LEFT);
		txtMasukkanNamaPemesan.setForeground(new Color(0, 128, 128));
		txtMasukkanNamaPemesan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanNamaPemesan.setColumns(10);
		txtMasukkanNamaPemesan.setBounds(367, 171, 245, 19);
		frame.getContentPane().add(txtMasukkanNamaPemesan);
		
		txtMasukkanTanggalPemesanan = new JTextField();
		txtMasukkanTanggalPemesanan.setHorizontalAlignment(SwingConstants.LEFT);
		txtMasukkanTanggalPemesanan.setForeground(new Color(0, 128, 128));
		txtMasukkanTanggalPemesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanTanggalPemesanan.setColumns(10);
		txtMasukkanTanggalPemesanan.setBounds(367, 204, 245, 19);
		frame.getContentPane().add(txtMasukkanTanggalPemesanan);
		
		txtMasukkanAlamatPelanggan = new JTextField();
		txtMasukkanAlamatPelanggan.setForeground(new Color(0, 128, 128));
		txtMasukkanAlamatPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanAlamatPelanggan.setColumns(10);
		txtMasukkanAlamatPelanggan.setBounds(367, 235, 391, 19);
		frame.getContentPane().add(txtMasukkanAlamatPelanggan);
		
		txtMasukkanNoHp = new JTextField();
		txtMasukkanNoHp.setForeground(new Color(0, 128, 128));
		txtMasukkanNoHp.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanNoHp.setColumns(10);
		txtMasukkanNoHp.setBounds(367, 266, 245, 19);
		frame.getContentPane().add(txtMasukkanNoHp);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setForeground(new Color(0, 128, 128));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pilih Jenis Layanan", "Cuci Setrika", "Cuci Saja", "Setrika Saja"}));
		comboBox.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		comboBox.setBounds(367, 299, 245, 21);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 128, 128));
		textField.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField.setColumns(10);
		textField.setBounds(367, 330, 116, 19);
		frame.getContentPane().add(textField);
		
		textField_1 = new JTextField();
		textField_1.setForeground(new Color(0, 128, 128));
		textField_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_1.setColumns(10);
		textField_1.setBounds(367, 358, 53, 19);
		frame.getContentPane().add(textField_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Pilih Metode Pengambilan", "Antar", "Jemput"}));
		comboBox_2.setForeground(new Color(0, 128, 128));
		comboBox_2.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		comboBox_2.setBounds(367, 387, 245, 21);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lblTanggalDiantar = new JLabel("Tanggal Diantar");
		lblTanggalDiantar.setHorizontalAlignment(SwingConstants.LEFT);
		lblTanggalDiantar.setForeground(new Color(0, 128, 128));
		lblTanggalDiantar.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTanggalDiantar.setBounds(367, 415, 133, 26);
		frame.getContentPane().add(lblTanggalDiantar);
		
		textField_2 = new JTextField();
		textField_2.setForeground(new Color(0, 128, 128));
		textField_2.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_2.setColumns(10);
		textField_2.setBounds(476, 418, 136, 19);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setForeground(new Color(0, 128, 128));
		textField_3.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(367, 447, 116, 19);
		frame.getContentPane().add(textField_3);
		
		JButton btnOrder = new JButton("Order");
		btnOrder.setBackground(new Color(0, 128, 128));
		btnOrder.setForeground(new Color(255, 255, 255));
		btnOrder.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnOrder.setBounds(430, 496, 95, 40);
		frame.getContentPane().add(btnOrder);
		
		JLabel lblTotal_2_1 = new JLabel("kg");
		lblTotal_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotal_2_1.setForeground(new Color(0, 128, 128));
		lblTotal_2_1.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTotal_2_1.setBounds(430, 355, 133, 26);
		frame.getContentPane().add(lblTotal_2_1);
		
		textField_4 = new JTextField();
		textField_4.setForeground(new Color(0, 128, 128));
		textField_4.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField_4.setDropMode(DropMode.INSERT);
		textField_4.setColumns(10);
		textField_4.setBounds(367, 106, 116, 19);
		frame.getContentPane().add(textField_4);
		
		JLabel lblIdPelanggan = new JLabel("ID Pelanggan");
		lblIdPelanggan.setHorizontalAlignment(SwingConstants.LEFT);
		lblIdPelanggan.setForeground(new Color(0, 128, 128));
		lblIdPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblIdPelanggan.setBounds(194, 135, 120, 26);
		frame.getContentPane().add(lblIdPelanggan);
	}
}
