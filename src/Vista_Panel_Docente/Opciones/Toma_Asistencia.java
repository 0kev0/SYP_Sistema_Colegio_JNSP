package Vista_Panel_Docente.Opciones;

import Customizacion.TablaCusomizada;
import Modelos.Docente.Modelo_Asignacion_Actividades;
import Modelos.Docente.Modelo_TomaAsistencia;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Toma_Asistencia extends javax.swing.JInternalFrame {

    private final Modelo_TomaAsistencia Objeto = new Modelo_TomaAsistencia();
    private List<Modelo_TomaAsistencia> ListObjeto;
    private DefaultTableModel modeloTabla;

    public Toma_Asistencia() {
        initComponents();
        DiseñoTabla(Tbl_ListadoAsistencia);
        Cargar_ListadoAsistencia(Tbl_ListadoAsistencia);
        Lb_FechaActual.setText(obtenerFechaActual());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_ListadoAsistencia = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Lb_FechaActual = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lb_Aerolinea2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Lb_Aerolinea3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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

        Tbl_ListadoAsistencia.setAutoCreateRowSorter(true);
        Tbl_ListadoAsistencia.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 153, 51)));
        Tbl_ListadoAsistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIE", "Nombres", "Apellidos", "Presente", "", "Ausente", "", "Justificado", "", "Justificacion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tbl_ListadoAsistencia);
        if (Tbl_ListadoAsistencia.getColumnModel().getColumnCount() > 0) {
            Tbl_ListadoAsistencia.getColumnModel().getColumn(0).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(0).setPreferredWidth(80);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(1).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(1).setPreferredWidth(250);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(2).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(2).setPreferredWidth(250);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(3).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(3).setPreferredWidth(80);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(4).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(4).setPreferredWidth(0);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(5).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(6).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(6).setPreferredWidth(0);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(7).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(7).setPreferredWidth(80);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(8).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(8).setPreferredWidth(0);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(9).setResizable(false);
            Tbl_ListadoAsistencia.getColumnModel().getColumn(9).setPreferredWidth(150);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 940, 350));

        jPanel3.setBackground(new java.awt.Color(226, 215, 132));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 8, new java.awt.Color(255, 153, 51)));

        Lb_FechaActual.setBackground(new java.awt.Color(255, 255, 255));
        Lb_FechaActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Lb_FechaActual.setForeground(new java.awt.Color(0, 0, 0));
        Lb_FechaActual.setText("Fecha");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Lb_FechaActual, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Lb_FechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 10, 270, -1));

        jPanel4.setBackground(new java.awt.Color(226, 215, 132));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea2.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea2.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea2.setText("Toma de Asistencia");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Aerolinea2)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 300, -1));

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

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Que se tome la fecha actual y esta se muestre en el label fecha, y se suba a la base de datos ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 510, -1));

        jPanel6.setBackground(new java.awt.Color(226, 215, 132));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 8, 0, new java.awt.Color(255, 153, 51)));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        Lb_Aerolinea4.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea4.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Aerolinea4.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea4.setText("Confirmar asistencia");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                    .addContainerGap(10, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea4)
                    .addContainerGap(14, Short.MAX_VALUE)))
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

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 450, 200, 50));

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

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        Date fecha = new Date();

        modeloTabla = (DefaultTableModel) Tbl_ListadoAsistencia.getModel();

        for (int i = 0; i < modeloTabla.getRowCount(); i++) {
            System.out.println("vuelta");

            int NIE = Integer.parseInt(modeloTabla.getValueAt(i, 0).toString());
            System.out.println("NIE" + NIE);

            String Justificacion = modeloTabla.getValueAt(i, 6).toString();
            System.out.println("justificacion" + ((Justificacion == null) ? "diferente" : Justificacion));

            int EstadoAsistencia = 0;

            if ((boolean) modeloTabla.getValueAt(i, 3)) {
                EstadoAsistencia = 1;//presente
            }
            if ((boolean) modeloTabla.getValueAt(i, 5)) {
                EstadoAsistencia = 2;//ausente
            }
            if ((boolean) modeloTabla.getValueAt(i, 7)) {
                EstadoAsistencia = 3;//justificado
            }

            System.out.println("estado" + 1);

            Modelo_TomaAsistencia Asistencia = new Modelo_TomaAsistencia();

            Asistencia.setIdDocente(9876);
            Asistencia.setNIE(NIE);
            Asistencia.setFecha(fecha);
            Asistencia.setIdEstadoAsistencia(EstadoAsistencia);
            Asistencia.setJustificacion(Justificacion);

            Asistencia.RegistrarAsistencia(Asistencia);

        }
    }//GEN-LAST:event_jPanel6MouseClicked

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

public void Cargar_ListadoAsistencia(JTable tabla) {
    modeloTabla = (DefaultTableModel) tabla.getModel();
    modeloTabla.setNumRows(0);

    ListObjeto = Objeto.GetListado(1);
    System.out.println("Hay " + ListObjeto.size() + " registros en la lista.");

    for (Modelo_TomaAsistencia item : ListObjeto) {
        modeloTabla.addRow(new Object[]{
            item.getNIE(),
            item.getNombreEstudiante(),
            item.getApellidoEstudiante(),

        });
    }

    tabla.setModel(modeloTabla);
}


    public static String obtenerFechaActual() {
        // Obtener la fecha y hora actual
        Date fecha = new Date();

        // Formatear la fecha como una cadena
        SimpleDateFormat formato = new SimpleDateFormat("EEEE / dd / MMMM / yyyy", new Locale("es"));
        String fechaFormateada = formato.format(fecha);

        return fechaFormateada;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lb_Aerolinea2;
    private javax.swing.JLabel Lb_Aerolinea3;
    private javax.swing.JLabel Lb_Aerolinea4;
    private javax.swing.JLabel Lb_FechaActual;
    private javax.swing.JTable Tbl_ListadoAsistencia;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
