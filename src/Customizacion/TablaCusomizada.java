package Customizacion;

import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class TablaCusomizada extends DefaultTableCellRenderer {

public class CheckBoxTableExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Table Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        String[] columnNames = {"Columna 1", "Columna 2", "Columna 3"};
        Object[][] data = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };

        DefaultTableModel model = new DefaultTableModel(data, columnNames) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return Boolean.class; // Todas las columnas son de tipo Boolean (checkbox)
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                // Solo permite editar una celda a la vez
                return getColumnClass(column) == Boolean.class;
            }
        };

        JTable table = new JTable(model);
        table.setDefaultRenderer(Boolean.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                JCheckBox checkBox = new JCheckBox();
                checkBox.setSelected((Boolean) value);
                checkBox.addItemListener((ItemEvent e) -> {
                    if (e.getStateChange() == ItemEvent.SELECTED) {
                        // Deshabilita otros checkboxes en la misma fila
                        for (int i = 0; i < table.getColumnCount(); i++) {
                            if (i != column) {
                                model.setValueAt(false, row, i);
                            }
                        }
                    }
                });
                return checkBox;
            }
        });

        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane);

        frame.setVisible(true);
    }

}}
