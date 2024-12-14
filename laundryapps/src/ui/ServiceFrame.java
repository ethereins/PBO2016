package ui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;

import DAO.ServiceRepo;
import model.Service;
import table.TableService;
import javax.swing.JScrollPane;

public class ServiceFrame extends JFrame {

    private JPanel contentPane;
    private JTextField txtId;
    private JTextField txtJenis;
    private JTextField txtStatus;
    private JTextField txtHarga;
    private JTable tableService;

    private ServiceRepo serviceRepo = new ServiceRepo();
    private List<Service> services;
    private String id;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                ServiceFrame frame = new ServiceFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public ServiceFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 550, 450);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(204, 204, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblId = new JLabel("ID");
        lblId.setForeground(new Color(0, 0, 0));
        lblId.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblId.setBounds(25, 37, 92, 22);
        contentPane.add(lblId);

        JLabel lblJenis = new JLabel("Jenis");
        lblJenis.setForeground(new Color(0, 0, 0));
        lblJenis.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblJenis.setBounds(25, 61, 92, 22);
        contentPane.add(lblJenis);

        JLabel lblStatus = new JLabel("Status");
        lblStatus.setForeground(new Color(0, 0, 0));
        lblStatus.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblStatus.setBounds(25, 86, 92, 22);
        contentPane.add(lblStatus);

        JLabel lblHarga = new JLabel("Harga");
        lblHarga.setForeground(new Color(0, 0, 0));
        lblHarga.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblHarga.setBounds(25, 110, 92, 22);
        contentPane.add(lblHarga);

        txtId = new JTextField();
        txtId.setBounds(120, 39, 343, 20);
        contentPane.add(txtId);
        txtId.setColumns(10);

        txtJenis = new JTextField();
        txtJenis.setBounds(120, 63, 343, 20);
        contentPane.add(txtJenis);
        txtJenis.setColumns(10);

        txtStatus = new JTextField();
        txtStatus.setBounds(120, 88, 343, 20);
        contentPane.add(txtStatus);
        txtStatus.setColumns(10);

        txtHarga = new JTextField();
        txtHarga.setBounds(120, 112, 343, 20);
        contentPane.add(txtHarga);
        txtHarga.setColumns(10);

        JButton btnSave = new JButton("Save");
        btnSave.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnSave.setBounds(120, 143, 80, 23);
        btnSave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Service service = new Service();
                service.setId(txtId.getText());
                service.setJenis(txtJenis.getText());
                service.setStatus(txtStatus.getText());
                service.setHarga(Long.parseLong(txtHarga.getText())); // Ensure parsing is correct
                serviceRepo.save(service);
                reset();
                loadTable();
            }
        });
        contentPane.add(btnSave);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnUpdate.setBounds(210, 143, 80, 23);
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (id != null) {
                    Service service = new Service();
                    service.setId(id); 
                    service.setJenis(txtJenis.getText());
                    service.setStatus(txtStatus.getText());
                    service.setHarga(Long.parseLong(txtHarga.getText()));
                    serviceRepo.update(service);
                    reset();
                    loadTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin diupdate.");
                }
            }
        });
        contentPane.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnDelete.setBounds(300, 143, 80, 23);
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (id != null) {
                    serviceRepo.delete(id);
                    reset();
                    loadTable();
                } else {
                    JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin dihapus.");
                }
            }
        });
        contentPane.add(btnDelete);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 13));
        btnCancel.setBounds(390, 143, 80, 23);
        btnCancel.addActionListener(e -> reset());
        contentPane.add(btnCancel);
        
        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(25, 200, 440, 200);
        contentPane.add(scrollPane);

        tableService = new JTable();
        scrollPane.setViewportView(tableService);
        tableService.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = tableService.getSelectedRow();
                if (selectedRow != -1) {
                    id = tableService.getValueAt(selectedRow, 0).toString();
                    txtJenis.setText(tableService.getValueAt(selectedRow, 1).toString());
                    txtStatus.setText(tableService.getValueAt(selectedRow, 2).toString());
                    txtHarga.setText(tableService.getValueAt(selectedRow, 3).toString());
                }
            }
        });

        loadTable(); // Load the service data into the table when the frame is created
    }

    private void reset() {
        txtId.setText("");
        txtJenis.setText("");
        txtStatus.setText("");
        txtHarga.setText("");
        id = null; // Reset the id_order when canceling
    }

    public void loadTable() {
        services = serviceRepo.show();
        TableService ts = new TableService(services);
        tableService.setModel(ts);
        tableService.getTableHeader().setVisible(true);
    }
}
