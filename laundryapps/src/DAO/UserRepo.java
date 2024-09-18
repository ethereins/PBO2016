package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import config.Database;
import model.User;

public class UserRepo implements UserDao{
	private Connection connection;
	final String insert = "INSERT INTO user (name, username, password) VALUES (?,?,?);";
	final String select = "SELECT * FROM user;";
	final String delete = "DELETE FROM user WHERE id = ?;";
	final String update = "UPDATE user SET name = ?, username = ?, password = ? WHERE id =?;";
	
public UserRepo() {
	connection = Database.koneksi();
}

@Override
public void save(User user) {
	PreparedStatement st = null;
	try {
		st = connection.prepareStatement(insert);
		st.setString(1, user.getNama());
		st.setString(2, user.getUsername());
		st.setString(3, user.getPassword());
		st.executeUpdate();
	} catch(SQLException e) {
		e.printStackTrace();
	} finally {
		try {
			st.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}

@Override
public List<User> show() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void delete(String id) {
	// TODO Auto-generated method stub
	
}

@Override
public void update(User user) {
	// TODO Auto-generated method stub
	
}
}
