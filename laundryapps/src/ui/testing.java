package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.DefaultComboBoxModel;
import java.awt.Component;
import javax.swing.Box;

public class testing extends JFrame {

	private JPanel contentPane;
	private JTextField txtOrderID;
	private JTextField txtTanggalPemesanan;
	private JTextField txtTanggalPengambilan;
	private JTable tableLayanan;
	private JTextField txtHargakg;
	private JTextField txtJumlah;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					testing frame = new testing();
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
	public testing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 714);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOrderID = new JLabel("Order ID");
		lblOrderID.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblOrderID.setBounds(37, 77, 94, 14);
		contentPane.add(lblOrderID);
		
		txtOrderID = new JTextField();
		txtOrderID.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtOrderID.setBounds(37, 97, 161, 20);
		contentPane.add(txtOrderID);
		txtOrderID.setColumns(10);
		
		JLabel lblPelanggan = new JLabel("Pelanggan");
		lblPelanggan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPelanggan.setBounds(37, 129, 94, 14);
		contentPane.add(lblPelanggan);
		
		JComboBox cbPelanggan = new JComboBox();
		cbPelanggan.setModel(new DefaultComboBoxModel(new String[] {"Pilih"}));
		cbPelanggan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cbPelanggan.setBounds(37, 147, 161, 22);
		contentPane.add(cbPelanggan);
		
		JLabel lblTanggalPemesanan = new JLabel("Tanggal Pemesanan");
		lblTanggalPemesanan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTanggalPemesanan.setBounds(37, 180, 161, 14);
		contentPane.add(lblTanggalPemesanan);
		
		txtTanggalPemesanan = new JTextField();
		txtTanggalPemesanan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTanggalPemesanan.setColumns(10);
		txtTanggalPemesanan.setBounds(37, 196, 161, 20);
		contentPane.add(txtTanggalPemesanan);
		
		JLabel lblTanggalPengambilan = new JLabel("Tanggal Pengambilan");
		lblTanggalPengambilan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTanggalPengambilan.setBounds(37, 227, 161, 14);
		contentPane.add(lblTanggalPengambilan);
		
		txtTanggalPengambilan = new JTextField();
		txtTanggalPengambilan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtTanggalPengambilan.setColumns(10);
		txtTanggalPengambilan.setBounds(37, 245, 161, 20);
		contentPane.add(txtTanggalPengambilan);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblStatus.setBounds(37, 276, 161, 14);
		contentPane.add(lblStatus);
		
		JComboBox cbStatus = new JComboBox();
		cbStatus.setModel(new DefaultComboBoxModel(new String[] {"Pilih", "Proses", "Selesai"}));
		cbStatus.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cbStatus.setBounds(37, 292, 161, 22);
		contentPane.add(cbStatus);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTotal.setBounds(37, 346, 161, 14);
		contentPane.add(lblTotal);
		
		JLabel lblTotalRp = new JLabel("Rp");
		lblTotalRp.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblTotalRp.setBounds(37, 371, 161, 14);
		contentPane.add(lblTotalRp);
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblPembayaran.setBounds(37, 420, 161, 14);
		contentPane.add(lblPembayaran);
		
		JComboBox cbPembayaran = new JComboBox();
		cbPembayaran.setModel(new DefaultComboBoxModel(new String[] {"Pilih ", "Cash ", "Tunai"}));
		cbPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cbPembayaran.setBounds(37, 438, 161, 22);
		contentPane.add(cbPembayaran);
		
		JLabel lblStatusPembayaran = new JLabel("Status Pembayaran");
		lblStatusPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblStatusPembayaran.setBounds(37, 471, 161, 14);
		contentPane.add(lblStatusPembayaran);
		
		JComboBox cbStatusPembayaran = new JComboBox();
		cbStatusPembayaran.setModel(new DefaultComboBoxModel(new String[] {"Pilih ", "Lunas", "Belum lunas"}));
		cbStatusPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		cbStatusPembayaran.setBounds(37, 488, 161, 22);
		contentPane.add(cbStatusPembayaran);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSimpan.setBounds(37, 543, 77, 23);
		contentPane.add(btnSimpan);
		
		JButton btnBatal = new JButton("Batal");
		btnBatal.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBatal.setBounds(127, 543, 71, 23);
		contentPane.add(btnBatal);
		
		JLabel lblLayanan = new JLabel("Layanan");
		lblLayanan.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblLayanan.setBounds(311, 26, 94, 14);
		contentPane.add(lblLayanan);
		
		tableLayanan = new JTable();
		tableLayanan.setBounds(311, 165, 388, -118);
		contentPane.add(tableLayanan);
		
		JLabel lblHargakg = new JLabel("Harga/kg");
		lblHargakg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblHargakg.setBounds(311, 180, 94, 14);
		contentPane.add(lblHargakg);
		
		txtHargakg = new JTextField();
		txtHargakg.setEditable(false);
		txtHargakg.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtHargakg.setColumns(10);
		txtHargakg.setBounds(311, 196, 161, 20);
		contentPane.add(txtHargakg);
		
		JLabel lblJumlah = new JLabel("Jumlah");
		lblJumlah.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblJumlah.setBounds(311, 227, 94, 14);
		contentPane.add(lblJumlah);
		
		txtJumlah = new JTextField();
		txtJumlah.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		txtJumlah.setColumns(10);
		txtJumlah.setBounds(311, 245, 161, 20);
		contentPane.add(txtJumlah);
		
		JLabel lblTotalHarga = new JLabel("Total Harga");
		lblTotalHarga.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		lblTotalHarga.setBounds(538, 227, 94, 14);
		contentPane.add(lblTotalHarga);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		textField.setColumns(10);
		textField.setBounds(538, 245, 161, 20);
		contentPane.add(textField);
		
		JButton btnSimpan_1 = new JButton("Simpan");
		btnSimpan_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnSimpan_1.setBounds(311, 292, 77, 23);
		contentPane.add(btnSimpan_1);
		
		JButton btnBatal_1 = new JButton("Batal");
		btnBatal_1.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnBatal_1.setBounds(628, 292, 71, 23);
		contentPane.add(btnBatal_1);
		
		JButton btnUbah = new JButton("Ubah");
		btnUbah.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnUbah.setBounds(419, 292, 71, 23);
		contentPane.add(btnUbah);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		btnHapus.setBounds(526, 292, 71, 23);
		contentPane.add(btnHapus);
		
		table = new JTable();
		table.setBounds(311, 631, 350, -284);
		contentPane.add(table);
	}
}
