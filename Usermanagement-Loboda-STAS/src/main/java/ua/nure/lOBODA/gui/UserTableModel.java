package main.java.ua.nure.loboda.gui;


import main.java.ua.nure.loboda.User;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Author Stas
 * created 04.11.2017.
 */
public class UserTableModel extends AbstractTableModel {

    private static final Class[] COLUMN_CLASSES = {Long.class, String.class, String.class};
    private static final String[] COLUMN_NAMES = {"ID", "First Name", "Last Name"};
    private List<User> users = null;

    public UserTableModel(Collection<User> users) {
        this.users = new ArrayList<>(users);
    }

    @Override
    public int getRowCount() {
        return users.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }


    public Class getColumnClass(int columnIndex) {
        return COLUMN_CLASSES[columnIndex];
    }


    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        User user = users.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return user.getId();
            case 1:
                return user.getFirstName();
            case 2:
                return user.getLastName();
        }
        return null;
    }

    public void addUsers(Collection<User> users) {
        this.users.addAll(users);

    }

    public void clearUsers() {
        this.users = new ArrayList<>();
    }
}