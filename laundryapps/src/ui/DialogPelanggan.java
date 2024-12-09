package ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CustomerRepo;
import model.Customer;
import table.TableCustomer;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import ui.OrderDetailFrame;
import java.awt.Color;

public class DialogPelanggan extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTable tableCostumer;
	private static OrderDetailFrame orderDetailFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DialogPelanggan dialog = new DialogPelanggan(orderDetailFrame);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.loadTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	CustomerRepo cst = new CustomerRepo();
	List<Customer> ls;
	public String id;
	
	public void loadTable() {
		ls = cst.show();
		TableCustomer tc = new TableCustomer(ls);
		tableCostumer.setModel(tc);
		tableCostumer.getTableHeader().setVisible(true);
	}

	/**
	 * Create the dialog.
	 */
	public DialogPelanggan(OrderDetailFrame orderDetailFrame) {
		getContentPane().setBackground(new Color(204, 204, 255));
		this.orderDetailFrame = orderDetailFrame;
		setBounds(100, 100, 600, 420);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(204, 204, 255));
		contentPanel.setBounds(0, 0, 586, 352);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 566, 332);
		contentPanel.add(scrollPane);
		
		tableCostumer = new JTable();
		tableCostumer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int selectedRow = tableCostumer.getSelectedRow();

                if (selectedRow != -1) {
                    Customer selectedCostumer = ((TableCustomer) tableCostumer.getModel()).getCostumerAt(selectedRow);
                    orderDetailFrame.setCostumer(selectedCostumer); // Update OrderDetailFrame
                    DialogPelanggan.this.dispose();
                }
                
				
			}
		});
		scrollPane.setViewportView(tableCostumer);
		
		
	}
}
