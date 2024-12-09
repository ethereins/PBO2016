package ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CustomerRepo;
import DAO.OrderRepo;
import DAO.UserRepo;
import model.Customer;
import model.Order;
import model.User;
import table.TableCustomer;
import table.TableOrder;
import table.TableUser;

import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.util.Date;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.awt.Color;
import javax.swing.SwingConstants;

public class OrderFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static JTable tableOrder;
	private static OrderDetailFrame orderDetailFrame;
	static OrderRepo ord = new OrderRepo();
	static List<Order> ls;
	public String id_order;
	public String nama;
	public String tanggal_masuk;
	public String tanggal_kembali;
	public String status;
	public String total_harga;
	public String pembayaran;
	public String status_bayar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderFrame frame = new OrderFrame();
					frame.setVisible(true);
					frame.loadTable();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public OrderFrame() {
		orderDetailFrame = new OrderDetailFrame();
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				id_order = null;
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 255));
		panel.setBounds(10, 10, 766, 94);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblDataOrderan = new JLabel("Data Orderan");
		lblDataOrderan.setForeground(new Color(0, 0, 0));
		lblDataOrderan.setHorizontalAlignment(SwingConstants.CENTER);
		lblDataOrderan.setFont(new Font("Times New Roman", Font.PLAIN, 28));
		lblDataOrderan.setBounds(276, 10, 208, 25);
		panel.add(lblDataOrderan);
		
		JButton btnOrder = new JButton("Buat Orderan");
		btnOrder.setBackground(new Color(240, 240, 240));
		btnOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newOrderId = autoOrderID();
				orderDetailFrame.setOrderID(newOrderId);
				OrderDetailFrame.setId_order(newOrderId);
				orderDetailFrame.setVisible(true);
				orderDetailFrame.getTxtOrderId().setText(newOrderId);
				orderDetailFrame.loadTable();
				orderDetailFrame.loadTableOrderDetail();
				
				
			}
		});
		btnOrder.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnOrder.setBounds(10, 60, 99, 25);
		panel.add(btnOrder);
		
		JButton btnHapus = new JButton("Hapus");
		btnHapus.setBackground(new Color(240, 240, 240));
		btnHapus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id_order != null) {
					ord.delete(id_order);
					id_order = null;
					loadTable();
				}
				else {
					JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan dihapus");
				}
			}
		});
		btnHapus.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnHapus.setBounds(576, 60, 85, 25);
		panel.add(btnHapus);
		
		JButton btnEdit = new JButton("Edit/Detail\r\n");
		btnEdit.setBackground(new Color(240, 240, 240));
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(id_order != null) {
					orderDetailFrame.setOrderID(id_order);
					OrderDetailFrame.setId_order(id_order);
					orderDetailFrame.setTxtCostumer(nama);
					SimpleDateFormat sdf_tanggal = new SimpleDateFormat("yyyy-MM-dd");
		            try {
		                Date parsedDate_tanggal = sdf_tanggal.parse(tanggal_masuk); 
		                orderDetailFrame.setTanggal(parsedDate_tanggal); 
		            } catch (ParseException ex) {
		                ex.printStackTrace();
		            }
		            SimpleDateFormat sdf_tanggal_kembali = new SimpleDateFormat("yyyy-MM-dd");
		            try {
		                Date parsedDate = sdf_tanggal_kembali.parse(tanggal_kembali);
		                orderDetailFrame.setTanggal_kembali(parsedDate); 
		            } catch (ParseException ex) {
		                ex.printStackTrace();
		            }
		            orderDetailFrame.setStatus(status);
		            orderDetailFrame.setLblTotalHargaShow(total_harga);
		            orderDetailFrame.setBoxPembayaran(pembayaran);
		            orderDetailFrame.setBoxPembayaran_1(status_bayar);
		            
					orderDetailFrame.setVisible(true);
					orderDetailFrame.loadTable();
					orderDetailFrame.loadTableOrderDetail();
					
				}else {
					JOptionPane.showMessageDialog(null, "Silahkan pilih data yang akan diedit");
				}
			}
		});
		btnEdit.setFont(new Font("Times New Roman", Font.PLAIN, 11));
		btnEdit.setBounds(671, 60, 85, 25);
		panel.add(btnEdit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 114, 766, 439);
		contentPane.add(scrollPane);
		
		tableOrder = new JTable();
		tableOrder.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectedRow = tableOrder.getSelectedRow();
                if (selectedRow != -1) { 
                    id_order = tableOrder.getValueAt(selectedRow, 0).toString(); 
                }
                
                nama = tableOrder.getValueAt(tableOrder.getSelectedRow(), 1).toString();
                tanggal_masuk = tableOrder.getValueAt(tableOrder.getSelectedRow(), 2).toString();
                tanggal_kembali = tableOrder.getValueAt(tableOrder.getSelectedRow(), 3).toString();
                status = tableOrder.getValueAt(tableOrder.getSelectedRow(), 4).toString();
                total_harga = tableOrder.getValueAt(tableOrder.getSelectedRow(), 5).toString();
                pembayaran = tableOrder.getValueAt(tableOrder.getSelectedRow(), 6).toString();
                status_bayar = tableOrder.getValueAt(tableOrder.getSelectedRow(), 7).toString();
			}	
		});
		scrollPane.setViewportView(tableOrder);
	}
	
	public String autoOrderID() {
		List<Order> order_id = ord.show();
	    int highestId = 0;
	   
	    for (Order order : order_id) {
	        String orderId = order.getId_order(); 
	        if (orderId.startsWith("TRX-")) {
	            int numericId = Integer.parseInt(orderId.substring(4)); 
	            if (numericId > highestId) {
	                highestId = numericId;
	            }
	        }
	    }

	    highestId++;
	    return String.format("TRX-%04d", highestId);

	}
	
	public static void loadTable() {
		ls = ord.show();
		TableOrder to = new TableOrder(ls);
		tableOrder.setModel(to);
		tableOrder.getTableHeader().setVisible(true);
	}
	
	

}
