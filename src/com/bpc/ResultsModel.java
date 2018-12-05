package com.bpc;

import java.sql.*;
import javax.swing.table.*;
import java.util.Vector;

public class ResultsModel extends AbstractTableModel {

    String[] columnNames = new String[0];
    Vector dataRows;              // vecteur vide, de lignes 

    ResultsModel() {
        super();
        refresh();
    }

    public void setResultSet(ResultSet rs) {
        try {
            ResultSetMetaData metadata = rs.getMetaData();
            int columns = metadata.getColumnCount();
            columnNames = new String[columns];

            for (int i = 0; i < columns; i++) {
                columnNames[i] = metadata.getColumnLabel(i + 1);
            }

            dataRows = new Vector();
            String[] rowData;

            while (rs.next()) {
                rowData = new String[columns];
                for (int i = 0; i < columns; i++) {
                    rowData[i] = rs.getString(i + 1);
                }

                dataRows.addElement(rowData);
            }

        } catch (SQLException sqle) {
            System.err.println(sqle);
        }
    }

    public void refresh() {
        fireTableDataChanged();
        fireTableChanged(null);
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        if (dataRows == null) {
            return 0;
        } else {
            return dataRows.size();
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        return ((String[]) (dataRows.elementAt(row)))[column];
    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column] == null ? "Sans nom" : columnNames[column];
    }
}
