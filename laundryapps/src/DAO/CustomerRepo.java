package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import config.Database;
import model.Customer;

public class CustomerRepo implements CustomerDAO {
    private Connection connection;
    final String insert = "INSERT INTO customer (id, nama, alamat, nomor_telepon) VALUES (?, ?, ?, ?);"; 
    final String select = "SELECT * FROM customer;";
    final String delete = "DELETE FROM customer WHERE id = ?;";
    final String update = "UPDATE customer SET nama = ?, alamat = ?, nomor_telepon = ? WHERE id = ?;"; 

    public CustomerRepo() {
        connection = Database.koneksi();
    }

    @Override
    public void save(Customer customer) {
        PreparedStatement ct = null;
        try {
            ct = connection.prepareStatement(insert);
            ct.setString(1, customer.getId());
            ct.setString(2, customer.getNama());
            ct.setString(3, customer.getAlamat());
            ct.setString(4, customer.getNoHp());
            ct.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ct != null) ct.close(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public List<Customer> show() {
        List<Customer> cs = new ArrayList<>(); 
        try (Statement ct = connection.createStatement();
             ResultSet rs = ct.executeQuery(select)) { 
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getString("id"));
                customer.setNama(rs.getString("nama"));
                customer.setAlamat(rs.getString("alamat"));
                customer.setNoHp(rs.getString("nomor_telepon")); 
                cs.add(customer);
            }
        } catch (SQLException e) {
            Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
        }
        return cs;
    }

    @Override
    public void delete(String id) {
        PreparedStatement ct = null;
        try {
            ct = connection.prepareStatement(delete);
            ct.setString(1, id);
            ct.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ct != null) ct.close(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void update(Customer customer) {
        PreparedStatement ct = null;
        try {
            ct = connection.prepareStatement(update);
            ct.setString(1, customer.getNama());
            ct.setString(2, customer.getAlamat());
            ct.setString(3, customer.getNoHp());
            ct.setString(4, customer.getId()); 
            ct.executeUpdate(); 
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ct != null) ct.close(); 
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
