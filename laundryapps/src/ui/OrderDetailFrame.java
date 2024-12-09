package ui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.OrderDetailRepo;
import DAO.OrderRepo;
import DAO.ServiceRepo;
import model.Customer;
import model.Order;
import model.OrderDetail;
import model.Service;
import table.TableOrderDetail;
import table.TableService;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

public class OrderDetailFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtOrderID;
	private JTextField txtHargaPerKg;
	private JTextField txtJumlahKg;
	private JTextField txtTotalHarga;
	private JDateChooser tanggal_masuk;
	private JDateChooser tanggal_kembali;
	private JComboBox boxStatusCucian;
	private JLabel lblTampilHarga;
	private JComboBox boxPembayaran;
	private JComboBox boxStatusBayar;
	private JTable tableService;
	private JTable tableOrderDetail;
	private JTextField txtCustomer;

	OrderDetailRepo ord_detail = new OrderDetailRepo();
	List<OrderDetail> ls_ord;
	OrderRepo order_repo = new OrderRepo();
	List<Order> ls_opo;
	ServiceRepo service_repo = new ServiceRepo();
	List<Service> ls_srv;

	//Deklarasi Variabel
	public String id;
	public String id_ord;
	public static String id_order;
	public int total_harga;
	public String tgl;
	public String tgl_kbl;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderDetailFrame frame = new OrderDetailFrame();
					frame.setVisible(true);
					frame.loadTable();
					frame.loadTableOrderDetail();

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	//method-method yang digunakan
	public void reset() {
		txtHargaPerKg.setText("");
		txtJumlahKg.setText("");
		txtTotalHarga.setText("");
	}
	
	
	public void resetOrder() {
		txtOrderID.setText("");
		
	}
	
	public void resetAll() {
		id_ord = null;
		id_order = null;
		total_harga = 0;
		tgl = null;
		tgl_kbl = null;
		setTxtCostumer("");
		setTanggal(null);
		setTanggal_kembali(null);
		setLblTotalHargaShow("");
	}
	
	public static void setId_order(String orderId) {
	    id_order = orderId; 

	}
	public void loadTable() {
		ls_srv = service_repo.show();
		TableService ts = new TableService(ls_srv);
		tableService.setModel(ts);
		tableService.getTableHeader().setVisible(true);
	}
	
	public void loadTableOrderDetail() {
		ls_ord = ord_detail.showById(id_order);
		TableOrderDetail tod = new TableOrderDetail(ls_ord);
		tableOrderDetail.setModel(tod);
		tableOrderDetail.getTableHeader().setVisible(true);
		updateTotalHarga();
		
	}
	
	public void updateTotalHarga() {
        int totalHarga = ord_detail.total(id_order);
        total_harga = totalHarga;
    }
	
	public void setCostumer(Customer customer) {
	    txtCustomer.setText(customer.getNama()); 
	}
	
	public void setOrderID(String id_order) {
	    txtOrderID.setText(id_order); 
	}
	
	public JTextField getTxtOrderId() {
        return txtOrderID; 
    }
	
	public void setTxtCostumer(String cust) {
		txtCustomer.setText(cust);
	}
	
	
	public void setTanggal(Date date) {
        tanggal_masuk.setDate(date); 
    }
	public void setTanggal_kembali(Date date) {
        tanggal_kembali.setDate(date); 
    }
	
	public void setStatus(String status) {
		boxStatusCucian.setSelectedItem(status);
	}
	public void setLblTotalHargaShow(String total) {
		lblTampilHarga.setText("Rp. " + total);
	}
	public void setBoxPembayaran(String pembayaran) {
		boxPembayaran.setSelectedItem(pembayaran);
	}
	public void setBoxPembayaran_1(String pembayaran) {
		boxStatusBayar.setSelectedItem(pembayaran);
	}
	/**
	 * Create the frame.
	 */
	public OrderDetailFrame() {
		setBackground(new Color(246, 246, 246));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOrderId = new JLabel("Order ID");
		lblOrderId.setForeground(new Color(0, 0, 0));
		lblOrderId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblOrderId.setBounds(20, 22, 92, 25);
		contentPane.add(lblOrderId);
		
		txtOrderID = new JTextField();
		txtOrderID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				id_order = txtOrderID.getText();
			}
		});
		txtOrderID.setBounds(20, 48, 117, 17);
		contentPane.add(txtOrderID);
		txtOrderID.setColumns(10);
		txtOrderID.setEnabled(false);
		
		JLabel lblPelanggan = new JLabel("Pelanggan");
		lblPelanggan.setForeground(new Color(0, 0, 0));
		lblPelanggan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPelanggan.setBounds(20, 75, 92, 25);
		contentPane.add(lblPelanggan);
		
		JLabel lblTanggal = new JLabel("Tanggal");
		lblTanggal.setForeground(new Color(0, 0, 0));
		lblTanggal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTanggal.setBounds(20, 124, 81, 25);
		contentPane.add(lblTanggal);
		
		JLabel lblStatus = new JLabel("Status");
		lblStatus.setForeground(new Color(0, 0, 0));
		lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblStatus.setBounds(20, 223, 81, 25);
		contentPane.add(lblStatus);
		
		JLabel lblTanggalPengambilan = new JLabel("Tanggal Pengambilan");
		lblTanggalPengambilan.setForeground(new Color(0, 0, 0));
		lblTanggalPengambilan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTanggalPengambilan.setBounds(20, 176, 170, 25);
		contentPane.add(lblTanggalPengambilan);
		
		
		boxStatusCucian = new JComboBox();
		boxStatusCucian.setModel(new DefaultComboBoxModel(new String[] {"Progress", "Selesai", "Diambil"}));
		boxStatusCucian.setBounds(20, 249, 170, 21);
		contentPane.add(boxStatusCucian);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setForeground(new Color(0, 0, 0));
		lblTotal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTotal.setBounds(20, 280, 53, 25);
		contentPane.add(lblTotal);
		
		JLabel lblStatusPembayaran = new JLabel("Status Pembayaran");
		lblStatusPembayaran.setForeground(new Color(0, 0, 0));
		lblStatusPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblStatusPembayaran.setBounds(20, 378, 148, 25);
		contentPane.add(lblStatusPembayaran);
		
		JLabel lblPembayaran = new JLabel("Pembayaran");
		lblPembayaran.setForeground(new Color(0, 0, 0));
		lblPembayaran.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPembayaran.setBounds(20, 324, 103, 25);
		contentPane.add(lblPembayaran);
		
		boxPembayaran = new JComboBox();
		boxPembayaran.setModel(new DefaultComboBoxModel(new String[] {"Tunai", "Non-Tunai"}));
		boxPembayaran.setBounds(20, 349, 170, 21);
		contentPane.add(boxPembayaran);
		
		boxStatusBayar = new JComboBox();
		boxStatusBayar.setModel(new DefaultComboBoxModel(new String[] {"Lunas", "Belum Lunas"}));
		boxStatusBayar.setBounds(20, 405, 170, 21);
		contentPane.add(boxStatusBayar);
		
		JLabel lblLayanan = new JLabel("Layanan");
		lblLayanan.setForeground(new Color(0, 0, 0));
		lblLayanan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblLayanan.setBounds(220, 22, 103, 25);
		contentPane.add(lblLayanan);
		
		JLabel lblHargakg = new JLabel("Harga/Kg");
		lblHargakg.setForeground(new Color(0, 0, 0));
		lblHargakg.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblHargakg.setBounds(220, 223, 103, 25);
		contentPane.add(lblHargakg);
		
		JLabel lblId_layanan = new JLabel("");
		lblId_layanan.setEnabled(false);
		lblId_layanan.setVisible(false);
		lblId_layanan.setBounds(400, 248, 326, 13);
		contentPane.add(lblId_layanan);
		
		txtHargaPerKg = new JTextField();
		txtHargaPerKg.setColumns(10);
		txtHargaPerKg.setBounds(220, 250, 170, 19);
		contentPane.add(txtHargaPerKg);
		txtHargaPerKg.setEnabled(false);
		
		JLabel lblJumlah = new JLabel("Jumlah");
		lblJumlah.setForeground(new Color(0, 0, 0));
		lblJumlah.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlah.setBounds(220, 279, 103, 25);
		contentPane.add(lblJumlah);
		
		txtJumlahKg = new JTextField();
		txtJumlahKg.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				String jumlahInput = txtJumlahKg.getText();
			    String hargaInput = txtHargaPerKg.getText();
			    if (!jumlahInput.isEmpty() && !hargaInput.isEmpty()) {
			        try {
			            int jumlah = Integer.parseInt(jumlahInput);
			            int hargaPerKg = Integer.parseInt(hargaInput);
			            int totalHarga = jumlah * hargaPerKg;
			            txtTotalHarga.setText(String.valueOf(totalHarga));
			        } catch (NumberFormatException ex) {
			            txtTotalHarga.setText("0");
			        }
			    } else {
			        txtTotalHarga.setText("0");
			    }
			}
		});
		txtJumlahKg.setColumns(10);
		txtJumlahKg.setBounds(220, 303, 170, 19);
		contentPane.add(txtJumlahKg);
		
		JLabel lblTotal_1 = new JLabel("Total");
		lblTotal_1.setForeground(new Color(0, 0, 0));
		lblTotal_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTotal_1.setBounds(400, 279, 103, 25);
		contentPane.add(lblTotal_1);
		
		JLabel lblId_order = new JLabel("");
		lblId_order.setEnabled(false);
		lblId_order.setVisible(false);
		lblId_order.setBounds(400, 248, 326, 13);
		contentPane.add(lblId_order);
		
		lblTampilHarga = new JLabel("Rp. " + ord_detail.total(txtOrderID.getText()));
		lblTampilHarga.setForeground(new Color(0, 0, 0));
		lblTampilHarga.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTampilHarga.setBounds(20, 299, 170, 25);
		contentPane.add(lblTampilHarga);
		updateTotalHarga();
		lblTampilHarga.setText("Rp. " + total_harga);
		
		tanggal_masuk = new JDateChooser();
		tanggal_masuk.setBounds(20, 147, 170, 19);
		contentPane.add(tanggal_masuk);
		tanggal_masuk.getDateEditor().addPropertyChangeListener("date", evt -> {
		    if (tanggal_masuk.getDate() != null) {
		        SimpleDateFormat sdf_tanggal = new SimpleDateFormat("yyyy-MM-dd");
		        tgl = sdf_tanggal.format(tanggal_masuk.getDate());
		    }

		});
		
		tanggal_kembali = new JDateChooser();
		tanggal_kembali.setBounds(20, 202, 170, 19);
		contentPane.add(tanggal_kembali);
		tanggal_kembali.getDateEditor().addPropertyChangeListener("date", evt -> {
		    if (tanggal_kembali.getDate() != null) {
		    	SimpleDateFormat sdf_tanggal_kembali = new SimpleDateFormat("yyy-MM-dd");
		        tgl_kbl = sdf_tanggal_kembali.format(tanggal_kembali.getDate());
		    }
		});
		
		txtTotalHarga = new JTextField();
		txtTotalHarga.setColumns(10);
		txtTotalHarga.setBounds(400, 303, 170, 19);
		contentPane.add(txtTotalHarga);
		txtTotalHarga.setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(220, 50, 556, 165);
		contentPane.add(scrollPane);
		
		tableService = new JTable();
		tableService.getTableHeader().setVisible(true);
		tableService.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tableService.getSelectedRow();
			    if (selectedRow != -1) {
			        String serviceId = tableService.getValueAt(selectedRow, 0).toString();
			        txtHargaPerKg.setText(tableService.getValueAt(selectedRow, 3).toString());
			        lblId_layanan.setText(serviceId);
			     
			        if (ord_detail.cekId_Order(id_order, serviceId)) {
			            JOptionPane.showMessageDialog(null, "Layanan sudah ada di order detail.");
			        } else {   
			        }

			    }
			}
		});
		scrollPane.setViewportView(tableService);
		
		JButton btnSimpan = new JButton("Simpan");
		btnSimpan.setBackground(new Color(240, 240, 240));
		btnSimpan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id_order != null) {
					if (id_order != null) {
			            String idLayanan = lblId_layanan.getText();
			            if (ord_detail.cekId_Order(id_order, idLayanan)) {
			                JOptionPane.showMessageDialog(null, "Layanan ini sudah ada", "Error", JOptionPane.ERROR_MESSAGE);
			            } else {
			                String jumlahText = txtJumlahKg.getText();
			                String totalText = txtTotalHarga.getText();

			                if (jumlahText.isEmpty()) {
			                    JOptionPane.showMessageDialog(null, "Jumlah kosong.", "Error", JOptionPane.ERROR_MESSAGE);
			                    return; 
			                }
			                
			                if (totalText.isEmpty()) {
			                    JOptionPane.showMessageDialog(null, "Total kosong.", "Error", JOptionPane.ERROR_MESSAGE);
			                    return;
			                }
			                try {
			                    int jumlah = Integer.parseInt(jumlahText);
			                    int total = Integer.parseInt(totalText);
			                    OrderDetail orderdetail = new OrderDetail();
			                    orderdetail.setId_order(id_order);
			                    orderdetail.setId_layanan(idLayanan);
			                    orderdetail.setJumlah(jumlah);
			                    orderdetail.setTotal(total);
			                    ord_detail.save(orderdetail);
			                    reset();
			                    loadTableOrderDetail();
			                    lblTampilHarga.setText("Rp. " + total_harga);
			                } catch (NumberFormatException ex) {
			                    JOptionPane.showMessageDialog(null, "Jumlah dan total harus berupa angka.", "Error", JOptionPane.ERROR_MESSAGE);
			                }
			            }
			        } else {
			            JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan disimpan");
			        }
				}
			}
		});
		btnSimpan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSimpan.setBounds(220, 336, 85, 34);
		contentPane.add(btnSimpan);
		
		JButton btnUbah = new JButton("Ubah");
		btnUbah.setBackground(new Color(240, 240, 240));
		btnUbah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id_ord != null) {
					OrderDetail orderdetail = new OrderDetail();
					orderdetail.setId_order(id_order);
					orderdetail.setId_layanan(lblId_layanan.getText());
					orderdetail.setJumlah(Integer.parseInt(txtJumlahKg.getText()));
					orderdetail.setTotal(Integer.parseInt(txtTotalHarga.getText()));
					orderdetail.setId_order_detail(id_ord);
					ord_detail.update(orderdetail);
					reset();
					loadTableOrderDetail();
					lblTampilHarga.setText("Rp. " + total_harga);
					
				}
				else {
					JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan diedit");
				}
			}
		});
		btnUbah.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnUbah.setBounds(317, 336, 85, 34);
		contentPane.add(btnUbah);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setBackground(new Color(240, 240, 240));
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id_ord != null) {
					ord_detail.delete(id_ord);
					reset();
					loadTableOrderDetail();
					lblTampilHarga.setText("Rp. " + total_harga);
					
				}else {
					JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan dihapus");
				}
			}
		});
		btnHapus.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnHapus.setBounds(413, 336, 85, 34);
		contentPane.add(btnHapus);
		
		JButton btnBatal = new JButton("Batal");
		btnBatal.setBackground(new Color(240, 240, 240));
		btnBatal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reset();
			}
		});
		btnBatal.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnBatal.setBounds(508, 336, 85, 34);
		contentPane.add(btnBatal);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(222, 383, 554, 170);
		contentPane.add(scrollPane_1);
		
		txtCustomer = new JTextField();
		txtCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DialogPelanggan dialog = new DialogPelanggan(OrderDetailFrame.this);
				dialog.setVisible(true);
				dialog.loadTable();
			}
		});
		txtCustomer.setColumns(10);
		txtCustomer.setBounds(20, 98, 117, 19);
		contentPane.add(txtCustomer);
		
		tableOrderDetail = new JTable();
		tableOrderDetail.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id_ord = tableOrderDetail.getValueAt(tableOrderDetail.getSelectedRow(), 0).toString();
				int selectedRow = tableOrderDetail.getSelectedRow();
				if (selectedRow != -1) {
					String idLayanan = tableOrderDetail.getValueAt(selectedRow, 2).toString();
					for (Service service : ls_srv) {
						if (service.getId().equals(idLayanan)) {
							txtHargaPerKg.setText(String.valueOf(service.getHarga()));
							break;
						}
					}
				}
				
				txtJumlahKg.setText(tableOrderDetail.getValueAt(tableOrderDetail.getSelectedRow(), 3).toString());
				txtTotalHarga.setText(tableOrderDetail.getValueAt(tableOrderDetail.getSelectedRow(), 4).toString());
				id_order = tableOrderDetail.getValueAt(tableOrderDetail.getSelectedRow(), 1).toString();
				lblId_layanan.setText(tableOrderDetail.getValueAt(tableOrderDetail.getSelectedRow(), 2).toString());
				
				
			}
		});
		scrollPane_1.setViewportView(tableOrderDetail);
		
		JButton btnSimpanOrder = new JButton("Simpan");
		btnSimpanOrder.setBackground(new Color(240, 240, 240));
		btnSimpanOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id_order != null) {
					Order order = new Order();
					order.setId_order(id_order);
					order.setNama(txtCustomer.getText());
					order.setTanggal(tgl);
					order.setTanggal_kembali(tgl_kbl);
					order.setStatus(boxStatusCucian.getSelectedItem().toString());
					order.setTotal_harga(total_harga);
					order.setPembayaran(boxPembayaran.getSelectedItem().toString());
					order.setStatus_bayar(boxStatusBayar.getSelectedItem().toString());
					order_repo.save(order);
					OrderFrame.loadTable();
					OrderDetailFrame.this.dispose();
					resetAll();
					
				}else {
					JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan disimpan");
				}
			}
		});
		btnSimpanOrder.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnSimpanOrder.setBounds(20, 436, 81, 34);
		contentPane.add(btnSimpanOrder);
		
		JButton btnBatalOrder = new JButton("Batal");
		btnBatalOrder.setBackground(new Color(240, 240, 240));
		btnBatalOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBatalOrder.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		btnBatalOrder.setBounds(105, 436, 85, 34);
		contentPane.add(btnBatalOrder);
		
		
	}
}
