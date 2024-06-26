package Vista_Panel_Docente.Opciones;

import Funciones.Funciones;
import static Funciones.Funciones.EnterMouse;
import static Funciones.Funciones.LeftMouse;
import static Funciones.Funciones.Mouse_EnterTextbox;
import static Funciones.Funciones.Mouse_LeftTextbox;
import static Funciones.Funciones.showMessageDialog;
import static Funciones.Funciones.validarCampos;
import Modelos.Docente.Modelo_Asignacion_Actividades;
import Modelos.Docente.Modelo_Periodos;
import Modelos.Docente.Modelo_TipoActividad;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;

public final class Edicion_Actividad extends javax.swing.JFrame {

    private final Modelo_Periodos Objeto_Periodos = new Modelo_Periodos();
    private List<Modelo_Periodos> List_Periodos;

    private final Modelo_TipoActividad Objeto_TipoActividad = new Modelo_TipoActividad();
    private List<Modelo_TipoActividad> List_TipoActividad;

    private Modelo_Asignacion_Actividades Objeto_Actividades = new Modelo_Asignacion_Actividades();
    private final JTable tbl_Act;

    public Edicion_Actividad(Modelo_Asignacion_Actividades ObjetoEditable, JTable tbl_Actividades) {
        initComponents();
        Get_Periodos(Cb_Periodo);
        Get_TipoActividad(Cb_TipoActividad);
        this.Objeto_Actividades = ObjetoEditable;
        this.tbl_Act = tbl_Actividades;
        Cb_Periodo.setSelectedIndex(ObjetoEditable.getPeriodo() + 1);
        Cb_TipoActividad.setSelectedIndex(ObjetoEditable.getIdTipoActividad() - 1);

        System.out.println("id t " + ObjetoEditable.getIdTipoActividad() + " id p " + ObjetoEditable.getIdTipoActividad());
        TB_DescripcionActividad.setText(ObjetoEditable.getDescripcion());
        TB_NombreActividad.setText(ObjetoEditable.getNombreActividad());
    }

    public void Get_Periodos(JComboBox ComboBox) {

        DefaultComboBoxModel ModeloComboBox = new DefaultComboBoxModel();

        List_Periodos = Objeto_Periodos.Get_EstadosActividades();
        System.out.println("hay " + List_Periodos.size());

        for (Modelo_Periodos item : List_Periodos) {
            ModeloComboBox.addElement(item.getPeriodo());
        }

        ComboBox.setModel(ModeloComboBox);
    }

    public void Get_TipoActividad(JComboBox ComboBox) {
        try {
            DefaultComboBoxModel ModeloComboBox = new DefaultComboBoxModel();

            List_TipoActividad = Objeto_TipoActividad.Get_EstadosActividades();
            System.out.println("hay " + List_TipoActividad.size());

            for (Modelo_TipoActividad item : List_TipoActividad) {
                ModeloComboBox.addElement(item.getTipoActividad());
            }

            ComboBox.setModel(ModeloComboBox);
        } catch (Exception e) {
            // Manejo de excepciones aquí
            System.err.println("Error al cargar los elementos en el combo box: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cb_TipoActividad = new javax.swing.JComboBox<>();
        Cb_Periodo = new javax.swing.JComboBox<>();
        TB_NombreActividad = new javax.swing.JTextField();
        TB_DescripcionActividad = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        Lb_Aerolinea2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Lb_Aerolinea3 = new javax.swing.JLabel();
        Btn_GuardarActividad = new javax.swing.JPanel();
        Lb_Guardar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(234, 223, 180));
        jPanel1.setPreferredSize(new java.awt.Dimension(1100, 540));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cb_TipoActividad.setBackground(new java.awt.Color(224, 213, 170));
        Cb_TipoActividad.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_TipoActividad.setForeground(new java.awt.Color(0, 0, 0));
        Cb_TipoActividad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tarea", "Examen", "Auto-Evaluacion", "Expocicion" }));
        Cb_TipoActividad.setToolTipText("");
        Cb_TipoActividad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Tipo de actividad:", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        Cb_TipoActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_TipoActividadActionPerformed(evt);
            }
        });
        jPanel1.add(Cb_TipoActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 134, -1));

        Cb_Periodo.setBackground(new java.awt.Color(224, 213, 170));
        Cb_Periodo.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        Cb_Periodo.setForeground(new java.awt.Color(0, 0, 0));
        Cb_Periodo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1er periodo", "2do periodo", "3er periodo", "4to periodo" }));
        Cb_Periodo.setToolTipText("");
        Cb_Periodo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Periodo: ", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        Cb_Periodo.setEnabled(false);
        Cb_Periodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_PeriodoActionPerformed(evt);
            }
        });
        jPanel1.add(Cb_Periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 134, -1));

        TB_NombreActividad.setBackground(new java.awt.Color(224, 213, 170));
        TB_NombreActividad.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TB_NombreActividad.setForeground(new java.awt.Color(0, 0, 0));
        TB_NombreActividad.setText("Ingrese el nombre");
        TB_NombreActividad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Nombre de la actividad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        TB_NombreActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TB_NombreActividadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TB_NombreActividadMouseExited(evt);
            }
        });
        jPanel1.add(TB_NombreActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 208, 50));

        TB_DescripcionActividad.setBackground(new java.awt.Color(224, 213, 170));
        TB_DescripcionActividad.setFont(new java.awt.Font("SimSun", 1, 14)); // NOI18N
        TB_DescripcionActividad.setForeground(new java.awt.Color(0, 0, 0));
        TB_DescripcionActividad.setText("Ingrese descripcion");
        TB_DescripcionActividad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 153, 51)), "Descripcion de la actividad", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP, new java.awt.Font("Segoe UI Variable", 1, 14), new java.awt.Color(255, 153, 51))); // NOI18N
        TB_DescripcionActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TB_DescripcionActividadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TB_DescripcionActividadMouseExited(evt);
            }
        });
        jPanel1.add(TB_DescripcionActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 208, 50));

        jPanel4.setBackground(new java.awt.Color(226, 215, 132));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 8, 8, 0, new java.awt.Color(255, 153, 51)));

        Lb_Aerolinea2.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea2.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        Lb_Aerolinea2.setForeground(new java.awt.Color(0, 0, 0));
        Lb_Aerolinea2.setText("Editor de actividad");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Aerolinea2, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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
        Lb_Guardar.setText("Guardar actividad");

        javax.swing.GroupLayout Btn_GuardarActividadLayout = new javax.swing.GroupLayout(Btn_GuardarActividad);
        Btn_GuardarActividad.setLayout(Btn_GuardarActividadLayout);
        Btn_GuardarActividadLayout.setHorizontalGroup(
            Btn_GuardarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
            .addGroup(Btn_GuardarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_GuardarActividadLayout.createSequentialGroup()
                    .addContainerGap(21, Short.MAX_VALUE)
                    .addComponent(Lb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        Btn_GuardarActividadLayout.setVerticalGroup(
            Btn_GuardarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
            .addGroup(Btn_GuardarActividadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_GuardarActividadLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Lb_Guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel1.add(Btn_GuardarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 200, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Cb_TipoActividadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_TipoActividadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_TipoActividadActionPerformed

    private void Cb_PeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_PeriodoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Cb_PeriodoActionPerformed

    private void TB_NombreActividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_NombreActividadMouseEntered
        Funciones.Mouse_EnterTextbox(TB_NombreActividad);
    }//GEN-LAST:event_TB_NombreActividadMouseEntered

    private void TB_NombreActividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_NombreActividadMouseExited
        Mouse_LeftTextbox("Ingrese nombre", TB_NombreActividad);
    }//GEN-LAST:event_TB_NombreActividadMouseExited

    private void TB_DescripcionActividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_DescripcionActividadMouseEntered
        Mouse_EnterTextbox(TB_DescripcionActividad);
    }//GEN-LAST:event_TB_DescripcionActividadMouseEntered

    private void TB_DescripcionActividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TB_DescripcionActividadMouseExited
        Mouse_LeftTextbox("Ingrese descripcion", TB_DescripcionActividad);
    }//GEN-LAST:event_TB_DescripcionActividadMouseExited

    private void Btn_GuardarActividadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarActividadMouseClicked

        if (!validarCampos(jPanel1)) {
            System.out.println("faltan campos");
        } else {
            Modelo_Asignacion_Actividades edit = new Modelo_Asignacion_Actividades();
            edit.setNombreActividad(TB_NombreActividad.getText());
            edit.setIdTipoActividad(Cb_TipoActividad.getSelectedIndex()+1);
            edit.setDescripcion(TB_DescripcionActividad.getText());
            edit.setIdActividad(Objeto_Actividades.getIdActividad());

            edit.Edit_Actividad(edit);

            showMessageDialog("Edicion exitosa", "la actividad fue editada exitosamente");
            Asignacion_Actividades Objeto_Actividades = new Asignacion_Actividades();

            Objeto_Actividades.Get_Tbl_Actividades(tbl_Act);

            dispose();
        }


    }//GEN-LAST:event_Btn_GuardarActividadMouseClicked

    private void Btn_GuardarActividadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarActividadMouseEntered
        EnterMouse(Btn_GuardarActividad, Lb_Guardar, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_GuardarActividadMouseEntered

    private void Btn_GuardarActividadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_GuardarActividadMouseExited
        LeftMouse(Btn_GuardarActividad, Lb_Guardar, "#E2D784", "#000000");
    }//GEN-LAST:event_Btn_GuardarActividadMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edicion_Actividad.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edicion_Actividad.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edicion_Actividad.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edicion_Actividad.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_GuardarActividad;
    private javax.swing.JComboBox<String> Cb_Periodo;
    private javax.swing.JComboBox<String> Cb_TipoActividad;
    private javax.swing.JLabel Lb_Aerolinea2;
    private javax.swing.JLabel Lb_Aerolinea3;
    private javax.swing.JLabel Lb_Guardar;
    private javax.swing.JTextField TB_DescripcionActividad;
    private javax.swing.JTextField TB_NombreActividad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables

}
