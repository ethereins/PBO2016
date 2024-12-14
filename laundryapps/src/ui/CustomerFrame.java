package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CustomerRepo;
import model.Customer;
import model.CustomerBuilder;
import table.TableCustomer;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class CustomerFrame extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField txtId;
    private JTextField txtNama;
    private JTextField txtAlamat;
    private JTextField txtnoHp;
    private JTable tableCustomer;
    
    public String id;
    List<Customer> ls; 
    CustomerRepo cst = new CustomerRepo();
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
        	public void run() {
	            try {
	                CustomerFrame frame = new CustomerFrame();
	                frame.setVisible(true);
	                frame.loadTable();
	            } catch (Exception e) {
	                e.printStackTrace();
	            }
        	}
        });
    }
    
    public void loadTable() {
        ls = cst.show();
        TableCustomer tc = new TableCustomer(ls);
        tableCustomer.setModel(tc);
        tableCustomer.getTableHeader().setVisible(true);
    }
    
    public void reset() {
        txtId.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtnoHp.setText("");
        id = null; 
    }

    public CustomerFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 420);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblId = new JLabel("ID");
        lblId.setForeground(new Color(0, 0, 0));
        lblId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblId.setBounds(34, 38, 79, 29);
        contentPane.add(lblId);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setForeground(new Color(0, 0, 0));
        lblNama.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNama.setBounds(34, 65, 79, 29);
        contentPane.add(lblNama);

        JLabel lblAlamat = new JLabel("Alamat");
        lblAlamat.setForeground(new Color(0, 0, 0));
        lblAlamat.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblAlamat.setBounds(34, 90, 79, 29);
        contentPane.add(lblAlamat);

        JLabel lblNomorTelepon = new JLabel("No. HP");
        lblNomorTelepon.setForeground(new Color(0, 0, 0));
        lblNomorTelepon.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNomorTelepon.setBounds(34, 119, 128, 29);
        contentPane.add(lblNomorTelepon);

        txtId = new JTextField();
        txtId.setBounds(138, 43, 354, 20);
        contentPane.add(txtId);
        txtId.setColumns(10);

        txtNama = new JTextField();
        txtNama.setColumns(10);
        txtNama.setBounds(138, 70, 354, 20);
        contentPane.add(txtNama);

        txtAlamat = new JTextField();
        txtAlamat.setColumns(10);
        txtAlamat.setBounds(138, 95, 354, 20);
        contentPane.add(txtAlamat);

        txtnoHp = new JTextField();
        txtnoHp.setColumns(10);
        txtnoHp.setBounds(138, 124, 354, 20);
        contentPane.add(txtnoHp);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				Customer customer = new CustomerBuilder()
						.setId(txtId.getText())
						.setNama(txtNama.getText())
						.setAlamat(txtAlamat.getText())
						.setnoHp(txtnoHp.getText())
						.build();
				cst.save(customer);
				reset();
				loadTable();
			}
		});
        btnSave.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnSave.setBounds(138, 155, 79, 23);
        contentPane.add(btnSave);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (id == null || id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin diupdate.");
                    return;
                }
                Customer customer = new CustomerBuilder()
                        .setId(id)
                        .setNama(txtNama.getText())
                        .setAlamat(txtAlamat.getText())
                        .setnoHp(txtnoHp.getText())
                        .build();
                cst.update(customer); 
                reset(); 
                loadTable(); 
            }
        });

        btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnUpdate.setBounds(235, 155, 79, 23);
        contentPane.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (id != null) {
                    cst.delete(id);
                    reset();
                    loadTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin dihapus.");
                }
            }
        });
        btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnDelete.setBounds(324, 155, 79, 23);
        contentPane.add(btnDelete);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.addActionListener(e -> reset());
        btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnCancel.setBounds(413, 155, 79, 23);
        contentPane.add(btnCancel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(34, 200, 458, 150);
        contentPane.add(scrollPane);

        tableCustomer = new JTable();
        scrollPane.setViewportView(tableCustomer);
        tableCustomer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableCustomer.getSelectedRow();
                if (selectedRow != -1) {
                    id = tableCustomer.getValueAt(selectedRow, 0).toString(); 
                    txtId.setText(id); 
                    txtNama.setText(tableCustomer.getValueAt(selectedRow, 1).toString());
                    txtAlamat.setText(tableCustomer.getValueAt(selectedRow, 2).toString());
                    txtnoHp.setText(tableCustomer.getValueAt(selectedRow, 3).toString());
                }
            }
        });

        loadTable(); 
    }
}