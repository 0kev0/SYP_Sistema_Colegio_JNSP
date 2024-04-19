package Vista_Panel_Docente.Opciones;

import Customizacion.TablaCusomizada;
import Funciones.Funciones;
import static Funciones.Funciones.ValidNIE;
import static Funciones.Funciones.ValidNombres;
import Modelos.Docente.Modelo_GestionNotas;
import Modelos.Docente.Modelo_GestionPromedios;
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

public final class Gestion_Voleta_Notas extends javax.swing.JInternalFrame {

    private final Modelos.Docente.Modelo_GestionPromedios Objeto_Modelo_GestionPromedios = new Modelos.Docente.Modelo_GestionPromedios();
    private List<Modelos.Docente.Modelo_GestionPromedios> List_Modelo_GestionPromedios;
    private DefaultTableModel modeloTabla = new DefaultTableModel();

    public Gestion_Voleta_Notas() {
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
        Btn_GuardarActividad = new javax.swing.JPanel();
        Lb_Guardar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Lb_Aerolinea4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Lb_Aerolinea3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Lb_Aerolinea2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(null);
        setTitle("Registro voleta de notas");
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
                "Materias", "Act 1", "Act 2", "Act 3", "Act 4", "60%", "10%", "Examen", "30%", "Promedio", "T1", "T2", "T3", "T4", "NF"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Tbl_RegistroNotas);
        if (Tbl_RegistroNotas.getColumnModel().getColumnCount() > 0) {
            Tbl_RegistroNotas.getColumnModel().getColumn(0).setPreferredWidth(200);
            Tbl_RegistroNotas.getColumnModel().getColumn(1).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(2).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(3).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(4).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(5).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(6).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(7).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(8).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(9).setPreferredWidth(80);
            Tbl_RegistroNotas.getColumnModel().getColumn(10).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(11).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(12).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(13).setPreferredWidth(60);
            Tbl_RegistroNotas.getColumnModel().getColumn(14).setPreferredWidth(60);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 165, 1040, 290));

        jPanel3.setBackground(new java.awt.Color(226, 215, 132));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea1.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea1.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea1.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea1.setText("Registro voleta de notas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Aerolinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 6, 370, -1));

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
        jPanel1.add(Cb_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 134, -1));

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
        jPanel1.add(Cb_Periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 134, -1));

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
        jPanel1.add(TB_Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 10, 208, 50));

        errorTb_Busqueda.setBackground(new java.awt.Color(23, 42, 56));
        errorTb_Busqueda.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorTb_Busqueda.setForeground(new java.awt.Color(23, 42, 56));
        errorTb_Busqueda.setText("Error");
        jPanel1.add(errorTb_Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 280, -1));

        Btn_GuardarActividad.setBackground(new java.awt.Color(226, 215, 132));
        Btn_GuardarActividad.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 8, 0, new java.awt.Color(255, 153, 51)));
        Btn_GuardarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_GuardarActividadMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_GuardarActividadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_GuardarActividadMouseExited(evt);
            }
        });

        Lb_Guardar.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Guardar.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Guardar.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Guardar.setText("Generar boleta de notas");

        javax.swing.GroupLayout Btn_GuardarActividadLayout = new javax.swing.GroupLayout(Btn_GuardarActividad);
        Btn_GuardarActividad.setLayout(Btn_GuardarActividadLayout);
        Btn_GuardarActividadLayout.setHorizontalGroup(
            Btn_GuardarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_GuardarActividadLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(Lb_Guardar)
                .addGap(14, 14, 14))
        );
        Btn_GuardarActividadLayout.setVerticalGroup(
            Btn_GuardarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_GuardarActividadLayout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(Lb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Btn_GuardarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 470, 240, 40));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        Lb_Aerolinea4.setBackground(new java.awt.Color(204, 204, 204));
        Lb_Aerolinea4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lb_Aerolinea4.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea4.setText("Trimestres");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Lb_Aerolinea4)
                .addContainerGap(157, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(Lb_Aerolinea4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 140, 300, 30));

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        Lb_Aerolinea3.setBackground(new java.awt.Color(204, 204, 204));
        Lb_Aerolinea3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lb_Aerolinea3.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea3.setText("P.O");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, 130, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        Lb_Aerolinea2.setBackground(new java.awt.Color(204, 204, 204));
        Lb_Aerolinea2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Lb_Aerolinea2.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea2.setText("Actividad");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(Lb_Aerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addComponent(Lb_Aerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 350, 30));

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

            List_Modelo_GestionPromedios = Objeto_Modelo_GestionPromedios.Get_Promedio(1234, 1,1);

            try {
                int size = List_Modelo_GestionPromedios.size();
                System.out.println("*** *** ***hay " + size);

                for (Modelo_GestionPromedios item : List_Modelo_GestionPromedios) {

                    modeloTabla.addRow(new Object[]{
                        item.getNombre(),
                        0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,
                        item.getNota1(),                        
                        item.getNota2(),
                        item.getNota3(),
                        item.getNota4(),
                    
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
//        String ParametroBusqueda = parametrobusqueda();
//        String Palabra = TB_Buscar.getText();
//        int periodo = Cb_Periodo.getSelectedIndex() + 1;
//        modeloTabla.setNumRows(0);
//
//        System.out.println("buscando periodo: " + periodo + " y parametro: " + ParametroBusqueda);
//
//        List<Modelo_GestionNotas> obj;
//        obj = Objeto_Modelo_GestionPromedios.GetRegistroNotas(1, periodo);
//        System.out.println("*** *** ***hay " + obj.size());
//
//        for (Modelo_GestionNotas item : obj) {
//            double prom = 0;
//            for (Double items : item.getNotas()) {
//                prom += items;
//            }
//            prom = prom / 3;
//
//            modeloTabla.addRow(new Object[]{
//                item.getNIE(),
//                item.getApellido(),
//                item.getNombre(),
//                item.getNotas().get(0),
//                item.getNotas().get(1),
//                item.getNotas().get(2),
//                item.getNotas().get(3),
//                item.getNotas().get(4),
//                item.getNotas().get(5),
//                Math.round(prom * 100.0) / 100.0
//            });
//        }
//
//        Tbl_RegistroNotas.setModel(modeloTabla);

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

    private void Btn_GuardarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarActividadMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_GuardarActividadMouseClicked

    private void Btn_GuardarActividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarActividadMouseEntered
        Funciones.EnterMouse(Btn_GuardarActividad, Lb_Guardar, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_GuardarActividadMouseEntered

    private void Btn_GuardarActividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarActividadMouseExited
        Funciones.LeftMouse(Btn_GuardarActividad, Lb_Guardar, "#E2D784", "#000000");
    }//GEN-LAST:event_Btn_GuardarActividadMouseExited

public void DiseñoTabla(JTable tabla) {
    tabla.setDefaultRenderer(Object.class, new TablaCusomizada());
    tabla.setRowHeight(30); // Altura de las filas de datos
    tabla.getTableHeader().setBackground(Color.decode("#5C636E"));
    tabla.getTableHeader().setForeground(Color.white);
    Font fuente = new Font("Roboto", Font.BOLD, 12);
    tabla.setFont(fuente);
    tabla.getTableHeader().setFont(fuente);

    DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
    centerRenderer.setHorizontalAlignment(JLabel.CENTER);

    int numeroDeCeldas = 14; // Cambia este valor al número de celdas que necesites

    for (int i = 0; i < numeroDeCeldas; i++) {
        tabla.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    

    DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
    leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);

    tabla.getColumnModel().getColumn(0).setCellRenderer(leftRenderer);

    JTableHeader header = tabla.getTableHeader();
    header.setPreferredSize(new Dimension(60, 50)); // Ajusta la altura del encabezado
}



    public void Get_ListadoNotas(JTable tabla) {
        System.out.println("CARGANDO TODAS LAS NOTAS");
//        int grado = Cb_Periodo.getSelectedIndex() + 1;

        modeloTabla.setNumRows(0);

        int periodo = Cb_Periodo.getSelectedIndex() + 1;
        System.out.println("buscando periodo: " + periodo);

        List_Modelo_GestionPromedios = Objeto_Modelo_GestionPromedios.Get_Promedio(1234,1,1);
        System.out.println("###hay " + List_Modelo_GestionPromedios.size());

                for (Modelo_GestionPromedios item : List_Modelo_GestionPromedios) {

                    modeloTabla.addRow(new Object[]{
                        item.getNombre(),
                        item.getNotas().get(0),
                        item.getNotas().get(1),
                        item.getNotas().get(2),
                        item.getNotas().get(3),
                        0.0,0.0,0.0,0.0,0.0,
                        item.getNota1(),                        
                        item.getNota2(),
                        item.getNota3(),
                        item.getNota4(),
                        item.getNota1() + item.getNota2() + item.getNota3() + item.getNota4()
                    
                    });
                }

        tabla.setModel(modeloTabla);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_GuardarActividad;
    private javax.swing.JComboBox<String> Cb_Busqueda;
    private javax.swing.JComboBox<String> Cb_Periodo;
    private javax.swing.JLabel Lb_Aerolinea1;
    private javax.swing.JLabel Lb_Aerolinea2;
    private javax.swing.JLabel Lb_Aerolinea3;
    private javax.swing.JLabel Lb_Aerolinea4;
    private javax.swing.JLabel Lb_Guardar;
    private javax.swing.JTextField TB_Buscar;
    private javax.swing.JTable Tbl_RegistroNotas;
    private javax.swing.JLabel errorTb_Busqueda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
