package ui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import DAO.UserRepo;
import model.User;
import table.TableUser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class UserFrame extends JFrame {
    private JPanel contentPane;
    private JTextField txtName;
    private JTextField txtUsername;
    private JTextField txtPassword;
    private JTable TableUsers;

    UserRepo usr = new UserRepo();
    List<User> ls;
    public String id;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                UserFrame frame = new UserFrame();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public UserFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 547, 563);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Name");
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblNewLabel.setBounds(40, 44, 74, 14);
        contentPane.add(lblNewLabel);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblUsername.setBounds(40, 81, 74, 14);
        contentPane.add(lblUsername);

        txtName = new JTextField();
        txtName.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        txtName.setBounds(124, 42, 348, 20);
        contentPane.add(txtName);
        txtName.setColumns(10);

        txtUsername = new JTextField();
        txtUsername.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        txtUsername.setColumns(10);
        txtUsername.setBounds(124, 79, 348, 20);
        contentPane.add(txtUsername);

        txtPassword = new JTextField();
        txtPassword.setFont(new Font("Times New Roman", Font.PLAIN, 11));
        txtPassword.setColumns(10);
        txtPassword.setBounds(124, 118, 348, 20);
        contentPane.add(txtPassword);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 15));
        lblPassword.setBounds(40, 120, 74, 14);
        contentPane.add(lblPassword);

        JButton btnSave = new JButton("Save");
        btnSave.addActionListener(e -> {
            User user = new User();
            user.setNama(txtName.getText());
            user.setUsername(txtUsername.getText());
            user.setPassword(txtPassword.getText());
            usr.save(user);
            reset();
            loadTable();
        });
        btnSave.setFont(new Font("Times New Roman", Font.BOLD, 11));
        btnSave.setBounds(124, 159, 74, 23);
        contentPane.add(btnSave);

        JButton btnUpdate = new JButton("Update");
        btnUpdate.addActionListener(e -> {
            User user = new User();
            user.setNama(txtName.getText());
            user.setUsername(txtUsername.getText());
            user.setPassword(txtPassword.getText());
            user.setId(id);
            usr.update(user);
            reset();
            loadTable();
        });
        btnUpdate.setFont(new Font("Times New Roman", Font.BOLD, 11));
        btnUpdate.setBounds(208, 159, 74, 23);
        contentPane.add(btnUpdate);

        JButton btnDelete = new JButton("Delete");
        btnDelete.addActionListener(e -> {
            if (id != null) {
                usr.delete(id);
                reset();
                loadTable();
            } else {
                JOptionPane.showMessageDialog(null, "Silakan pilih data yang ingin dihapus.");
            }
        });
        btnDelete.setFont(new Font("Times New Roman", Font.BOLD, 11));
        btnDelete.setBounds(292, 159, 74, 23);
        contentPane.add(btnDelete);

        JButton btnCancel = new JButton("Cancel");
        btnCancel.setFont(new Font("Times New Roman", Font.BOLD, 11));
        btnCancel.setBounds(376, 159, 74, 23);
        contentPane.add(btnCancel);

        TableUsers = new JTable();
        TableUsers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                id = TableUsers.getValueAt(TableUsers.getSelectedRow(), 0).toString();
                txtName.setText(TableUsers.getValueAt(TableUsers.getSelectedRow(), 1).toString());
                txtUsername.setText(TableUsers.getValueAt(TableUsers.getSelectedRow(), 2).toString());
                txtPassword.setText(TableUsers.getValueAt(TableUsers.getSelectedRow(), 3).toString());
            }
        });
        TableUsers.setBounds(40, 200, 432, 300);
        contentPane.add(TableUsers);
        loadTable();
    }

    public void reset() {
        txtName.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
    }

    public void loadTable() {
        ls = usr.show();
        TableUser tu = new TableUser(ls);
        TableUsers.setModel(tu);
        TableUsers.getTableHeader().setVisible(true);
    }
}
