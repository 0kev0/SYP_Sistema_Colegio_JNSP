package Vista_Panel_Docente.Opciones;

import Customizacion.TablaCusomizada;
import Funciones.Funciones;
import static Funciones.Funciones.ValidNIE;
import static Funciones.Funciones.ValidNombres;
import Modelos.Docente.Modelo_GestionNotas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public final class Gestion_Notas extends javax.swing.JInternalFrame {

    private final Modelos.Docente.Modelo_GestionNotas Objeto_GestionNotas = new Modelos.Docente.Modelo_GestionNotas();
    private List<Modelos.Docente.Modelo_GestionNotas> List_Notas;
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    public Gestion_Notas() {
        initComponents();
        modeloTabla = (DefaultTableModel) Tbl_RegistroNotas.getModel();
        DiseñoTabla(Tbl_RegistroNotas);
        Get_ListadoNotas(Tbl_RegistroNotas);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tbl_RegistroNotas = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Lb_Aerolinea1 = new javax.swing.JLabel();
        Cb_Busqueda = new javax.swing.JComboBox<>();
        Cb_Periodo = new javax.swing.JComboBox<>();
        TB_Buscar = new javax.swing.JTextField();
        errorTb_Busqueda = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(null);
        setTitle("Registro de notas ");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setEnabled(false);
        setFocusCycleRoot(false);
        setFocusable(false);
        setRequestFocusEnabled(false);
        setVerifyInputWhenFocusTarget(false);

        jPanel1.setBackground(new java.awt.Color(234, 223, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tbl_RegistroNotas.setAutoCreateRowSorter(true);
        Tbl_RegistroNotas.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 153, 51)));
        Tbl_RegistroNotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIE", "Apellidos", "Nombre", "Actividad 1 (10%)", "Actividad 2 (10%)", " Actividad 3 (10%)", "Actividad 4 (10%)", "Examen (50%)", "Auto-evaluacion (10%)", "Promedio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tbl_RegistroNotas);
        if (Tbl_RegistroNotas.getColumnModel().getColumnCount() > 0) {
            Tbl_RegistroNotas.getColumnModel().getColumn(0).setPreferredWidth(30);
            Tbl_RegistroNotas.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 200, 1040, 275));

        jPanel3.setBackground(new java.awt.Color(226, 215, 132));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea1.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea1.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea1.setText("Registro de Notas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_Aerolinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, -1, -1));

        Cb_Busqueda.setBackground(new java.awt.Color(224, 213, 170));
        Cb_Busqueda.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_Busqueda.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Busqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NIE", "Apellido", "Nombre" }));
        Cb_Busqueda.setToolTipText("");
        Cb_Busqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Buscar por: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        Cb_Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_BusquedaActionPerformed(evt);
            }
        });
        jPanel1.add(Cb_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 134, -1));

        Cb_Periodo.setBackground(new java.awt.Color(224, 213, 170));
        Cb_Periodo.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_Periodo.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er periodo", "2do periodo", "3er periodo", "4to periodo" }));
        Cb_Periodo.setToolTipText("");
        Cb_Periodo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Periodo: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        Cb_Periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_PeriodoActionPerformed(evt);
            }
        });
        jPanel1.add(Cb_Periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 140, 134, -1));

        TB_Buscar.setBackground(new java.awt.Color(224, 213, 170));
        TB_Buscar.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TB_Buscar.setForeground(new java.awt.Color(0, 0, 0));
        TB_Buscar.setText("Ingrese NIE");
        TB_Buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Buscar", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        TB_Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TB_BuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TB_BuscarMouseExited(evt);
            }
        });
        TB_Buscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TB_BuscarKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TB_BuscarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TB_BuscarKeyTyped(evt);
            }
        });
        jPanel1.add(TB_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 208, 50));

        errorTb_Busqueda.setBackground(new java.awt.Color(23, 42, 56));
        errorTb_Busqueda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorTb_Busqueda.setForeground(new java.awt.Color(23, 42, 56));
        errorTb_Busqueda.setText("Error");
        jPanel1.add(errorTb_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 280, -1));

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

    public String parametrobusqueda() {
        switch (Cb_Busqueda.getSelectedItem().toString()) {
            case "NIE" -> {
                System.out.println("NIE");
                return " TbEst.\"NIE\" ";

            }
            case "Apellido" -> {
                System.out.println("apellido");
                return " TbEst.\"Apellidos\"";

            }
            case "Nombre" -> {
                System.out.println("Nombres");
                return " TbEst.\"Nombres\"";

            }
            default ->
                throw new AssertionError();
        }
    }

    private void Cb_BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_BusquedaActionPerformed
        switch (Cb_Busqueda.getSelectedItem().toString()) {
            case "NIE" -> {

                TB_Buscar.setToolTipText("Introduzca NIE");
                Get_ListadoNotas(Tbl_RegistroNotas);
                TB_Buscar.setText("Ingrese NIE");

            }

            case "Apellido" -> {

                TB_Buscar.setToolTipText("Introduzca NIE");
                Get_ListadoNotas(Tbl_RegistroNotas);
                TB_Buscar.setText("Ingrese Apellido");

            }
            case "Nombre" -> {

                TB_Buscar.setToolTipText("Introduzca NIE");
                Get_ListadoNotas(Tbl_RegistroNotas);
                TB_Buscar.setText("Ingrese Nombre");

            }
            default ->
                throw new AssertionError();
        }

    }//GEN-LAST:event_Cb_BusquedaActionPerformed

    private void TB_BuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TB_BuscarKeyReleased
        String ParametroBusqueda = parametrobusqueda();
        String Palabra = TB_Buscar.getText();
        int i = Cb_Busqueda.getSelectedIndex();
        System.out.println("INDICE " + i);

        switch (i) {
            case 0 ->
                ValidNIE(TB_Buscar, errorTb_Busqueda);
            case 1 ->
                ValidNombres(TB_Buscar, errorTb_Busqueda);
            case 2 ->
                ValidNombres(TB_Buscar, errorTb_Busqueda);

            default ->
                throw new AssertionError();
        }

        if (Palabra.equals("")) {
            Get_ListadoNotas(Tbl_RegistroNotas);
            Funciones.clearScreen();

        } else {

            int periodo = Cb_Periodo.getSelectedIndex() + 1;
            modeloTabla.setNumRows(0);

            System.out.println("buscando periodo: " + periodo + " y parametro: " + ParametroBusqueda);

            List<Modelo_GestionNotas> obj;

            obj = Objeto_GestionNotas.getBusqueda(Palabra, ParametroBusqueda, periodo, 1);

            try {
                int size = obj.size();
                System.out.println("*** *** ***hay " + size);

                for (Modelo_GestionNotas item : obj) {
                    double prom = 0;
                    for (Double items : item.getNotas()) {
                        prom += items;
                    }
                    prom = prom / 6;

                    modeloTabla.addRow(new Object[]{
                        item.getNIE(),
                        item.getApellido(),
                        item.getNombre(),
                        item.getNotas().get(0),
                        item.getNotas().get(1),
                        item.getNotas().get(2),
                        item.getNotas().get(3),
                        item.getNotas().get(4),
                        item.getNotas().get(5),
                        Math.round(prom * 100.0) / 100.0
                    });
                }

                Tbl_RegistroNotas.setModel(modeloTabla);
            } catch (Error ex) {
                System.out.println("$$$La lista obtenida esta vacia");
            } catch (IndexOutOfBoundsException err) {
                System.out.println("$$$Indice fuera del tamaño de la lista.");

            }
        }
    }//GEN-LAST:event_TB_BuscarKeyReleased

    private void Cb_PeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_PeriodoActionPerformed
        String ParametroBusqueda = parametrobusqueda();
        String Palabra = TB_Buscar.getText();
        int periodo = Cb_Periodo.getSelectedIndex() + 1;
        modeloTabla.setNumRows(0);

        System.out.println("buscando periodo: " + periodo + " y parametro: " + ParametroBusqueda);

        List<Modelo_GestionNotas> obj;
        obj = Objeto_GestionNotas.GetRegistroNotas(1, periodo);
        System.out.println("*** *** ***hay " + obj.size());

        for (Modelo_GestionNotas item : obj) {
            double prom = 0;
            for (Double items : item.getNotas()) {
                prom += items;
            }
            prom = prom / 6;

            modeloTabla.addRow(new Object[]{
                item.getNIE(),
                item.getApellido(),
                item.getNombre(),
                item.getNotas().get(0),
                item.getNotas().get(1),
                item.getNotas().get(2),
                item.getNotas().get(3),
                item.getNotas().get(4),
                item.getNotas().get(5),
                Math.round(prom * 100.0) / 100.0
            });
        }

        Tbl_RegistroNotas.setModel(modeloTabla);

    }//GEN-LAST:event_Cb_PeriodoActionPerformed

    private void TB_BuscarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TB_BuscarKeyTyped


    }//GEN-LAST:event_TB_BuscarKeyTyped

    private void TB_BuscarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TB_BuscarKeyPressed
     }//GEN-LAST:event_TB_BuscarKeyPressed

    private void TB_BuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_BuscarMouseEntered
        Funciones.Mouse_EnterTextbox(TB_Buscar);
    }//GEN-LAST:event_TB_BuscarMouseEntered

    private void TB_BuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_BuscarMouseExited
        switch (Cb_Busqueda.getSelectedIndex()) {
            case 0 -> {
                Funciones.Mouse_LeftTextbox("Ingrese " + Cb_Busqueda.getItemAt(0), TB_Buscar);

            }

            case 1 -> {
                Funciones.Mouse_LeftTextbox("Ingrese " + Cb_Busqueda.getItemAt(1), TB_Buscar);

            }
            case 2 -> {
                Funciones.Mouse_LeftTextbox("Ingrese " + Cb_Busqueda.getItemAt(2), TB_Buscar);

            }
            default ->
                throw new AssertionError();
        }


    }//GEN-LAST:event_TB_BuscarMouseExited

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



        int numeroDeCeldas = 10; // Cambia este valor al número de celdas que necesites

        for (int i = 0; i < numeroDeCeldas; i++) {
            tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        
        tabla.getColumnModel().getColumn(1).setCellRenderer(leftRenderer);
        tabla.getColumnModel().getColumn(2).setCellRenderer(leftRenderer);

        JTableHeader header = tabla.getTableHeader();
        header.setPreferredSize(new Dimension(60, 45));

    }

    public void Get_ListadoNotas(JTable tabla) {
        System.out.println("CARGANDO TODAS LAS NOTAS");
//        int grado = Cb_Periodo.getSelectedIndex() + 1;

        modeloTabla.setNumRows(0);

        int periodo = Cb_Periodo.getSelectedIndex() + 1;
        System.out.println("buscando periodo: " + periodo);

        List_Notas = Objeto_GestionNotas.GetRegistroNotas(1, periodo);
        System.out.println("###hay " + List_Notas.size());

        for (Modelos.Docente.Modelo_GestionNotas item : List_Notas) {
            double prom = 0;
            for (Double items : item.getNotas()) {
                prom += items;
            }
            prom = prom / 6;

            modeloTabla.addRow(new Object[]{
                item.getNIE(),
                item.getApellido(),
                item.getNombre(),
                item.getNotas().get(0),
                item.getNotas().get(1),
                item.getNotas().get(2),
                item.getNotas().get(3),
                item.getNotas().get(4),
                item.getNotas().get(5),
                Math.round(prom * 100.0) / 100.0
            });
        }

        tabla.setModel(modeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cb_Busqueda;
    private javax.swing.JComboBox<String> Cb_Periodo;
    private javax.swing.JLabel Lb_Aerolinea1;
    private javax.swing.JTextField TB_Buscar;
    private javax.swing.JTable Tbl_RegistroNotas;
    private javax.swing.JLabel errorTb_Busqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
