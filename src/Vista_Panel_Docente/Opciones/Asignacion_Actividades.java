package Vista_Panel_Docente.Opciones;

import Customizacion.TablaCusomizada;
import Modelos.Docente.Modelo_Asignacion_Actividades;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Asignacion_Actividades extends javax.swing.JInternalFrame {

    private final Modelo_Asignacion_Actividades Objeto = new Modelo_Asignacion_Actividades();
    private List<Modelo_Asignacion_Actividades> ListObjeto;
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    public Asignacion_Actividades() {
        initComponents();
        CArgar_Actividades(Tbl_Actividades);
        DiseñoTabla(Tbl_Actividades);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_Actividades = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Lb_Aerolinea1 = new javax.swing.JLabel();
        Cb_Busqueda = new javax.swing.JComboBox<>();
        Cb_Periodo = new javax.swing.JComboBox<>();
        TB_NombreActividad = new javax.swing.JTextField();
        TB_DescripcionActividad1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Lb_Aerolinea2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Lb_Aerolinea3 = new javax.swing.JLabel();
        Cb_Asignatura = new javax.swing.JComboBox<>();
        jPanel6 = new javax.swing.JPanel();
        Lb_Aerolinea4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(null);
        setTitle("Asignacion de actividades");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(234, 223, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tbl_Actividades.setAutoCreateRowSorter(true);
        Tbl_Actividades.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 153, 51)));
        Tbl_Actividades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No#", "Nombre actividad", "Asignatura", "Tipo", "Descripcion", "Ponderacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tbl_Actividades);
        if (Tbl_Actividades.getColumnModel().getColumnCount() > 0) {
            Tbl_Actividades.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Actividades.getColumnModel().getColumn(0).setPreferredWidth(50);
            Tbl_Actividades.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Actividades.getColumnModel().getColumn(1).setPreferredWidth(150);
            Tbl_Actividades.getColumnModel().getColumn(2).setResizable(false);
            Tbl_Actividades.getColumnModel().getColumn(2).setPreferredWidth(150);
            Tbl_Actividades.getColumnModel().getColumn(3).setResizable(false);
            Tbl_Actividades.getColumnModel().getColumn(3).setPreferredWidth(100);
            Tbl_Actividades.getColumnModel().getColumn(4).setResizable(false);
            Tbl_Actividades.getColumnModel().getColumn(4).setPreferredWidth(300);
            Tbl_Actividades.getColumnModel().getColumn(5).setResizable(false);
            Tbl_Actividades.getColumnModel().getColumn(5).setPreferredWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 760, 350));

        jPanel3.setBackground(new java.awt.Color(226, 215, 132));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 8, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea1.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea1.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea1.setText("1er Periodo");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(104, 104, 104)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 10, 180, -1));

        Cb_Busqueda.setBackground(new java.awt.Color(224, 213, 170));
        Cb_Busqueda.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_Busqueda.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarea", "Examen", "Auto-Evaluacion", "Expocicion" }));
        Cb_Busqueda.setToolTipText("");
        Cb_Busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Tipo de actividad:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel1.add(Cb_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 134, -1));

        Cb_Periodo.setBackground(new java.awt.Color(224, 213, 170));
        Cb_Periodo.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_Periodo.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er periodo", "2do periodo", "3er periodo", "4to periodo" }));
        Cb_Periodo.setToolTipText("");
        Cb_Periodo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Periodo: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel1.add(Cb_Periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 134, -1));

        TB_NombreActividad.setBackground(new java.awt.Color(224, 213, 170));
        TB_NombreActividad.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TB_NombreActividad.setForeground(new java.awt.Color(0, 0, 0));
        TB_NombreActividad.setText("Introduzca el nombre");
        TB_NombreActividad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Nombre de la actividad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel1.add(TB_NombreActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 208, 50));

        TB_DescripcionActividad1.setBackground(new java.awt.Color(224, 213, 170));
        TB_DescripcionActividad1.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TB_DescripcionActividad1.setForeground(new java.awt.Color(0, 0, 0));
        TB_DescripcionActividad1.setText("Añada descripcion");
        TB_DescripcionActividad1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Descripcion de la actividad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel1.add(TB_DescripcionActividad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 208, 50));

        jPanel4.setBackground(new java.awt.Color(226, 215, 132));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea2.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea2.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea2.setText("Asignacion de actividades");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Aerolinea2, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 370, -1));

        jPanel5.setBackground(new java.awt.Color(226, 215, 132));
        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea3.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea3.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea3.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea3.setText("Asignacion de notas");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 51, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 300, -1));

        Cb_Asignatura.setBackground(new java.awt.Color(224, 213, 170));
        Cb_Asignatura.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_Asignatura.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Asignatura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Matematicas", "Lenguaje", "Ciencias", "Sociales" }));
        Cb_Asignatura.setToolTipText("");
        Cb_Asignatura.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Materia :", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        jPanel1.add(Cb_Asignatura, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 134, -1));

        jPanel6.setBackground(new java.awt.Color(226, 215, 132));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea4.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea4.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Aerolinea4.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea4.setText("Guardar actividad");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1099, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        public void CArgar_Actividades(JTable tabla) {

        modeloTabla = (DefaultTableModel) tabla.getModel();
        modeloTabla.setNumRows(0);

        ListObjeto = Objeto.GetActividades();
        System.out.println("hay " + ListObjeto.size());

        for (Modelo_Asignacion_Actividades item : ListObjeto) {

            modeloTabla.addRow(new Object[]{
                1,
                item.getNombreActividad(),
                item.getMateria(),
                item.getTipoActividad(),
                item.getDescripcion(),
                item.getPonderacion(),
            });
        }

        tabla.setModel(modeloTabla);
    }
    
    
    public void DiseñoTabla(JTable tabla) {
        tabla.setDefaultRenderer(Object.class,
                new TablaCusomizada());
        tabla.setRowHeight(40);
        tabla.getTableHeader().setBackground(Color.decode("#5C636E"));
        tabla.getTableHeader().setForeground(Color.white);
        Font fuente = new Font("Roboto", Font.BOLD, 12);
        tabla.setFont(fuente);
        tabla.getTableHeader().setFont(fuente);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        int numeroDeCeldas = 4; // Cambia este valor al número de celdas que necesites

        for (int i = 0; i < numeroDeCeldas; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JTableHeader header = tabla.getTableHeader();
        header.setPreferredSize(new Dimension(60, 45));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_Asignatura;
    private javax.swing.JComboBox<String> Cb_Busqueda;
    private javax.swing.JComboBox<String> Cb_Periodo;
    private javax.swing.JLabel Lb_Aerolinea1;
    private javax.swing.JLabel Lb_Aerolinea2;
    private javax.swing.JLabel Lb_Aerolinea3;
    private javax.swing.JLabel Lb_Aerolinea4;
    private javax.swing.JTextField TB_DescripcionActividad1;
    private javax.swing.JTextField TB_NombreActividad;
    private javax.swing.JTable Tbl_Actividades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}