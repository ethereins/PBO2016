package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 377);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(184, 184, 220));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Laundry Apps");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 23));
		lblNewLabel.setBounds(195, 34, 203, 38);
		contentPane.add(lblNewLabel);
		
		JButton btnPesanan = new JButton("Pesanan");
		btnPesanan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPesanan.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnPesanan.setBounds(123, 100, 99, 46);
		contentPane.add(btnPesanan);
		
		JButton btnLayanan = new JButton("Layanan");
		btnLayanan.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnLayanan.setBounds(248, 100, 99, 46);
		contentPane.add(btnLayanan);
		
		JButton btnPelanggan = new JButton("Pelanggan");
		btnPelanggan.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnPelanggan.setBounds(370, 100, 99, 46);
		contentPane.add(btnPelanggan);
		
		JButton btnPengguna = new JButton("Pengguna");
		btnPengguna.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnPengguna.setBounds(123, 168, 99, 46);
		contentPane.add(btnPengguna);
		
		JButton btnLaporan = new JButton("Laporan");
		btnLaporan.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnLaporan.setBounds(248, 168, 99, 46);
		contentPane.add(btnLaporan);
		
		JButton btnProfil = new JButton("Profil");
		btnProfil.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnProfil.setBounds(370, 168, 99, 46);
		contentPane.add(btnProfil);
		
		JButton btnKeluar = new JButton("Keluar");
		btnKeluar.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		btnKeluar.setBounds(248, 270, 99, 27);
		contentPane.add(btnKeluar);
	}

}
