package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import DAO.CustomerRepo;
import model.Customer;
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

public class CustomerFrame extends JFrame {

    private JPanel contentPane;
    private JTextField txtId;
    private JTextField txtNama;
    private JTextField txtAlamat;
    private JTextField txtNoHp;

    private CustomerRepo cst = new CustomerRepo();
    private List<Customer> cs;
    private String id; 
    private JTable tableCustomer;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                CustomerFrame frame = new CustomerFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public CustomerFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 420);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(64, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblId = new JLabel("ID");
        lblId.setForeground(Color.WHITE);
        lblId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblId.setBounds(34, 38, 79, 29);
        contentPane.add(lblId);

        JLabel lblNama = new JLabel("Nama");
        lblNama.setForeground(Color.WHITE);
        lblNama.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNama.setBounds(34, 65, 79, 29);
        contentPane.add(lblNama);

        JLabel lblAlamat = new JLabel("Alamat");
        lblAlamat.setForeground(Color.WHITE);
        lblAlamat.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblAlamat.setBounds(34, 90, 79, 29);
        contentPane.add(lblAlamat);

        JLabel lblNomorTelepon = new JLabel("Nomor Telepon");
        lblNomorTelepon.setForeground(Color.WHITE);
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

        txtNoHp = new JTextField();
        txtNoHp.setColumns(10);
        txtNoHp.setBounds(138, 124, 354, 20);
        contentPane.add(txtNoHp);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Customer customer = new Customer();
                customer.setId(txtId.getText());
                customer.setNama(txtNama.getText());
                customer.setAlamat(txtAlamat.getText());
                customer.setNoHp(txtNoHp.getText());
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
                if (id != null) {
                    Customer customer = new Customer();
                    customer.setId(id); // Use the existing id
                    customer.setNama(txtNama.getText());
                    customer.setAlamat(txtAlamat.getText());
                    customer.setNoHp(txtNoHp.getText());
                    cst.update(customer);
                    reset();
                    loadTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin diupdate.");
                }
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

        tableCustomer = new JTable();
        tableCustomer.setBounds(34, 200, 458, 150);
        contentPane.add(tableCustomer);
        tableCustomer.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableCustomer.getSelectedRow();
                if (selectedRow != -1) {
                    id = tableCustomer.getValueAt(selectedRow, 0).toString();
                    txtNama.setText(tableCustomer.getValueAt(selectedRow, 1).toString());
                    txtAlamat.setText(tableCustomer.getValueAt(selectedRow, 2).toString());
                    txtNoHp.setText(tableCustomer.getValueAt(selectedRow, 3).toString());
                }
            }
        });

        loadTable(); // Load the customer data into the table when the frame is created
    }

    private void reset() {
        txtId.setText("");
        txtNama.setText("");
        txtAlamat.setText("");
        txtNoHp.setText("");
        id = null; // Reset the id when canceling
    }

    private void loadTable() {
        cs = cst.show();
        TableCustomer tc = new TableCustomer(cs);
        tableCustomer.setModel(tc);
        tableCustomer.getTableHeader().setVisible(true);
    }
}
