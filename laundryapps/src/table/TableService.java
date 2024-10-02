package table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Service;

public class TableService extends AbstractTableModel {
    private List<Service> sv;
    private String[] columnNames = {"Id", "Jenis", "Status", "Harga"};

    public TableService(List<Service> sv) {
        this.sv = sv;
    }

    @Override
    public int getRowCount() {
        return sv.size();
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
    	Service service = sv.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return service.getId();
            case 1:
                return service.getJenis();
            case 2:
                return service.getStatus();
            case 3:
                return service.getHarga(); 
            default:
                return null;
        }
    }
}
