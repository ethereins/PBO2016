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

public class StatusPesanan{

	private JFrame frame;
	private JTextField txtMasukkanIdPesanan;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StatusPesanan window = new StatusPesanan();
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
	public StatusPesanan() {
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
		lblEmail.setForeground(new Color(255, 255, 255));
		lblEmail.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		panel.add(lblEmail);
		
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
		lblPembayaran.setForeground(new Color(255, 255, 255));
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
		lblStatusPesanan.setForeground(new Color(0, 128, 128));
		lblStatusPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblStatusPesanan.setBounds(10, 224, 121, 20);
		panel.add(lblStatusPesanan);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(0, 224, 175, 20);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 128, 128));
		panel_2.setBounds(146, 0, 827, 19);
		frame.getContentPane().add(panel_2);
		
		JLabel lblHaiKasir = new JLabel("Status Pesanan");
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
		
		JLabel lblNamaPelanggan = new JLabel("Status Pesanan Baru");
		lblNamaPelanggan.setHorizontalAlignment(SwingConstants.LEFT);
		lblNamaPelanggan.setForeground(new Color(0, 128, 128));
		lblNamaPelanggan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblNamaPelanggan.setBounds(194, 172, 133, 26);
		frame.getContentPane().add(lblNamaPelanggan);
		
		txtMasukkanIdPesanan = new JTextField();
		txtMasukkanIdPesanan.setDropMode(DropMode.INSERT);
		txtMasukkanIdPesanan.setForeground(new Color(0, 128, 128));
		txtMasukkanIdPesanan.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		txtMasukkanIdPesanan.setBounds(367, 142, 116, 19);
		frame.getContentPane().add(txtMasukkanIdPesanan);
		txtMasukkanIdPesanan.setColumns(10);
		
		JButton btnOrder = new JButton("Update");
		btnOrder.setBackground(new Color(0, 128, 128));
		btnOrder.setForeground(new Color(255, 255, 255));
		btnOrder.setFont(new Font("Goudy Old Style", Font.PLAIN, 15));
		btnOrder.setBounds(367, 218, 95, 40);
		frame.getContentPane().add(btnOrder);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Pilih Status Pesanan", "On-Progress", "Finished", "Completed"}));
		comboBox.setForeground(new Color(0, 128, 128));
		comboBox.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		comboBox.setBounds(367, 175, 245, 21);
		frame.getContentPane().add(comboBox);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 128, 128));
		textField.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		textField.setDropMode(DropMode.INSERT);
		textField.setColumns(10);
		textField.setBounds(367, 108, 116, 19);
		frame.getContentPane().add(textField);
		
		JLabel lblTanggalUpdate = new JLabel("Tanggal Update ");
		lblTanggalUpdate.setHorizontalAlignment(SwingConstants.LEFT);
		lblTanggalUpdate.setForeground(new Color(0, 128, 128));
		lblTanggalUpdate.setFont(new Font("Goudy Old Style", Font.PLAIN, 16));
		lblTanggalUpdate.setBounds(195, 139, 120, 26);
		frame.getContentPane().add(lblTanggalUpdate);
	}
}
