package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Customer;

public class TableCustomer extends AbstractTableModel {
    private List<Customer> cs;
    private String[] columnNames = {"Id", "Nama", "Alamat", "NoHp"};

    public TableCustomer(List<Customer> cs) {
        this.cs = cs;
    }

    @Override
    public int getRowCount() {
        return cs.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length; 
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Customer customer = cs.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return customer.getId();
            case 1:
                return customer.getNama();
            case 2:
                return customer.getAlamat();
            case 3:
                return customer.getNoHp(); // Consistent with noHp
            default:
                return null;
        }
    }
}
