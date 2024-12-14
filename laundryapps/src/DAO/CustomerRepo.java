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

import confg.Database;
import model.Customer;
import model.CustomerBuilder;

public class CustomerRepo implements CustomerDAO {
    private Connection connection;
    final String insert = "INSERT INTO Customer (id, nama, alamat, noHp) VALUES (?,?,?,?);";
	final String select = "SELECT * FROM Customer;";
	final String delete = "DELETE FROM Customer WHERE id=?;";
	final String update = "UPDATE Customer SET nama=?, alamat=?, noHp=? WHERE id=?;";
	
    public CustomerRepo() {
        connection = Database.getConnection();
    }
    

    @Override
    public List<Customer> show() {
	    List<Customer> ls = null;
	    try {
	        ls = new ArrayList<Customer>();
	        Statement st = connection.createStatement();
	        ResultSet rs = st.executeQuery(select);
	        while (rs.next()) {
	            Customer cs = new CustomerBuilder()
	                    .setId(rs.getString("id"))
	                    .setNama(rs.getString("nama"))
	                    .setAlamat(rs.getString("alamat"))
	                    .setnoHp(rs.getString("noHp"))
	                    .build();
	            		ls.add(cs);
	        }
	    } catch (SQLException e) {
	        Logger.getLogger(CustomerDAO.class.getName()).log(Level.SEVERE, null, e);
	    }
	    return ls;
	}

    @Override
    public void save(Customer cs) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(insert);
			st.setString(1, cs.getId());
			st.setString(2, cs.getNama());
			st.setString(3, cs.getAlamat());
			st.setString(4, cs.getnoHp());
			st.executeUpdate();	
		}catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

    @Override
    public void delete(String id) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(delete);
					st.setString(1,id);
			st.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

    @Override
    public void update (Customer cs) {
		PreparedStatement st = null;
		try {
			st = connection.prepareStatement(update);
			st.setString(1, cs.getNama());  
			st.setString(2, cs.getAlamat()); 
			st.setString(3, cs.getnoHp()); 
			st.setString(4, cs.getId());     
			st.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				st.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
