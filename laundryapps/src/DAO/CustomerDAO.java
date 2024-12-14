package DAO;

import java.util.List;
import model.Customer;

public interface CustomerDAO {
	void save(Customer cs);
	public void delete(String id);
	public void update(Customer cs);
	public List<Customer> show();
}
