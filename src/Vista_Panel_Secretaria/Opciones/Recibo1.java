package Vista_Panel_Secretaria.Opciones;

import Funciones.Funciones;
import Modelos.Secretaria.Modelo_Transacciones;
import java.util.ArrayList;
import java.util.List;

public class Recibo1 extends javax.swing.JFrame {

    public Recibo1(List<Modelo_Transacciones> ResumenCompra, Modelo_Transacciones Datos) {
        initComponents();
        setLocationRelativeTo(this);
        Tb_Concepto.setLineWrap(true);
        String Detalle = "";

        lb_Responsable.setText("Responsable :" + Datos.getResponsable());
        Lb_Estudiante.setText("Estudiante : " + Datos.getEstudiante());

        Double sub_total = 0.0;
        for (Modelo_Transacciones item : ResumenCompra) {
            Detalle += "- " +  item.getDetalles() + "\nCantidad: " + item.getCantidades() + " Precio : "+ item.getPrecio() + " Sub-Total : " + item.getMontos() + "\n";
            sub_total += item.getMontos();
        }
Tb_Concepto.setText(Detalle);
        Lb_SubTotal.setText("Sub_Total: $ " + sub_total);

//        Double Descuent = sub_total * person_.getMembresia();
//        Lb_Descuento.setText("Descuento: (-) $ " + Descuent);
//
//        Double Descontado = sub_total - Descuent;
//
//        Double iva = Descontado * .13;
//
//        Lb_IVA.setText("IVA : (+) $ " + String.format("%.2f", iva));
//
//        Double Total = iva + Descontado;
//
//        Lb_Total.setText("Total por estadia : $ " + String.format("%.2f", Total));
//
//        Tbl_RegistroConsumo consumo = new Tbl_RegistroConsumo();
//        consumo.setIdCliente(person.getId());
//        consumo.setConsumo(sub_total);
//        consumo.setConsumoFinal(Total);
//        consumo.setCategoria("Reserva");
//        consumo.setDecuento_Aplicado(person_.getMembresia());
//
//        consumo.insertConsumos(consumo);
    }

//    public Recibo1(ArrayList<Tbl_Cartilla_productos> productos, Tbl_Cliente person) {
//        initComponents();
//        setLocationRelativeTo(this);
//
//        Tb_Concepto.setLineWrap(true);
//        this.person_ = person;
//
//        Lb_Membresia.setText("Membresia : " + person_.getTierMembresia() + "  %" + person_.getMembresia());
//
//        lb_Responsable.setText("Cliente :" + person_.getNombre());
//        Lb_Estudiante.setText("Documento : " + person_.getNum_doc());
//
//        String Concepto = "";
//        Double sub_total = 0.0;
//        String Categoria = "";
//
//        for (Tbl_Cartilla_productos producto : productos) {
//
//            Concepto += " - " + producto.getNombre() + "\tprecio unitario: $ " + producto.getPrecio() + "\tCantidad:" + producto.getCant() + "\n";
//            sub_total += (producto.getPrecio() * producto.getCant());
//            Categoria = producto.getCategoria();
//
//        }
//        System.out.println("CATEGORIA: " + Categoria);
//        Tb_Concepto.setText(Concepto);
//
//        Lb_SubTotal.setText("Sub_Total: $ " + sub_total);
//
//        Double Descontado = sub_total * person_.getMembresia();
//
//        Double Descuento = sub_total - Descontado;
//        Lb_Descuento.setText("Descuento: (-) $ " + Descontado);
//
//        Double iva = Descuento * .13;
//        Lb_IVA.setText("IVA : (+) $ " + String.format("%.2f", iva));
//
//        Double Total = iva + Descuento;
//        Lb_Total.setText("Total: $ " + String.format("%.2f", Total));
//
//        Tbl_RegistroConsumo consumo = new Tbl_RegistroConsumo();
//        consumo.setIdCliente(person.getId());
//        consumo.setConsumo(sub_total);
//        consumo.setConsumoFinal(Total);
//        consumo.setCategoria(Categoria);
//        consumo.setDecuento_Aplicado(person_.getMembresia());
//
//        consumo.insertConsumos(consumo);
//    }
//
//    public Recibo1(String Concepto, Tbl_Cliente person, Double precio) {
//        initComponents();
//        setLocationRelativeTo(this);
//
//        Tb_Concepto.setLineWrap(true);
//        this.person_ = person;
//
//        lb_Responsable.setText("Cliente :" + person_.getNombre());
//        Lb_Estudiante.setText("Documento : " + person_.getNum_doc());
//        Lb_Membresia.setText("Membresia adquirida : " + person_.getTierMembresia() + "  %" + person_.getMembresia());
//
//        Tb_Concepto.setText(" - " + Concepto);
//
//        Double sub_total = precio;
//        Lb_SubTotal.setText("Sub_Total: $ " + sub_total);
//
//        Lb_Descuento.setText("Descuento: (-) $ " + 0.0);
//
//        Double iva = sub_total * .13;
//
//        Lb_IVA.setText("IVA : (+) $ " + String.format("%.2f", iva));
//
//        Double Total = iva + sub_total;
//
//        Lb_Total.setText("Total : $ " + String.format("%.2f", Total));
//
//        Tbl_RegistroConsumo consumo = new Tbl_RegistroConsumo();
//        consumo.setIdCliente(person.getId());
//        consumo.setConsumo(sub_total);
//        consumo.setConsumoFinal(Total);
//        consumo.setCategoria("Membresia");
//        consumo.setDecuento_Aplicado(person_.getMembresia());
//
//        consumo.insertConsumos(consumo);
//
//    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        loading2 = new javax.swing.JLabel();
        Lb_SubTotal = new javax.swing.JLabel();
        Lb_IVA = new javax.swing.JLabel();
        Lb_Descuento = new javax.swing.JLabel();
        Lb_Total = new javax.swing.JLabel();
        Lb_Estudiante = new javax.swing.JLabel();
        lb_Responsable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tb_Concepto = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        Lb_Aerolinea9 = new javax.swing.JLabel();
        Lb_Ordenar = new javax.swing.JLabel();
        Lb_Correo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recibo");
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(23, 42, 56));

        loading2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        loading2.setForeground(new java.awt.Color(255, 255, 255));
        loading2.setText("Recibo");

        Lb_SubTotal.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Lb_SubTotal.setForeground(new java.awt.Color(255, 255, 255));
        Lb_SubTotal.setText(" Sub-Total : $ ");

        Lb_IVA.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Lb_IVA.setForeground(new java.awt.Color(255, 255, 255));
        Lb_IVA.setText("IVA : (-) $ ");

        Lb_Descuento.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Lb_Descuento.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Descuento.setText("Descuento: (-) $ ");

        Lb_Total.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Lb_Total.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Total.setText("Total por dia : $ ");

        Lb_Estudiante.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Lb_Estudiante.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Estudiante.setText("Estudiante :");

        lb_Responsable.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        lb_Responsable.setForeground(new java.awt.Color(255, 255, 255));
        lb_Responsable.setText("Responsable :");

        Tb_Concepto.setBackground(new java.awt.Color(61, 87, 88));
        Tb_Concepto.setColumns(20);
        Tb_Concepto.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        Tb_Concepto.setForeground(new java.awt.Color(255, 255, 255));
        Tb_Concepto.setRows(5);
        Tb_Concepto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Concepto:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(203, 174, 104))); // NOI18N
        jScrollPane1.setViewportView(Tb_Concepto);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO blsnco 80x80.jpg"))); // NOI18N

        Btn_Regresar.setBackground(new java.awt.Color(152, 5, 5));
        Btn_Regresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_RegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_RegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_RegresarMouseExited(evt);
            }
        });
        Btn_Regresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 10, 10));

        Lb_Aerolinea9.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea9.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Lb_Aerolinea9.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea9))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lb_Aerolinea9, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Btn_Regresar.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 149, 12));

        Lb_Ordenar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        Lb_Ordenar.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back (1).png"))); // NOI18N
        Lb_Ordenar.setText("Regresar");
        Lb_Ordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Regresar.add(Lb_Ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 130, 30));

        Lb_Correo.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        Lb_Correo.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Correo.setText("Correo :");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 211, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lb_IVA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_Descuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_SubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lb_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb_Responsable, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Estudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Lb_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loading2, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159)))
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loading2)
                        .addGap(18, 18, 18)
                        .addComponent(lb_Responsable))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lb_Estudiante)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Lb_Correo)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(Lb_SubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Descuento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_IVA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Lb_Total)))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseClicked

        dispose();
    }//GEN-LAST:event_Btn_RegresarMouseClicked

    private void Btn_RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseEntered
        Funciones.EnterMouse(Btn_Regresar, Lb_Ordenar, "#D90707", "#000000");
    }//GEN-LAST:event_Btn_RegresarMouseEntered

    private void Btn_RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseExited
        Funciones.LeftMouse(Btn_Regresar, Lb_Ordenar, "#980505", "#FFFFFF");
    }//GEN-LAST:event_Btn_RegresarMouseExited

    public Recibo1() {
        initComponents();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Recibo1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_Regresar;
    private javax.swing.JLabel Lb_Aerolinea9;
    private javax.swing.JLabel Lb_Correo;
    private javax.swing.JLabel Lb_Descuento;
    private javax.swing.JLabel Lb_Estudiante;
    private javax.swing.JLabel Lb_IVA;
    private javax.swing.JLabel Lb_Ordenar;
    private javax.swing.JLabel Lb_SubTotal;
    private javax.swing.JLabel Lb_Total;
    private javax.swing.JTextArea Tb_Concepto;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_Responsable;
    private javax.swing.JLabel loading2;
    // End of variables declaration//GEN-END:variables

}
