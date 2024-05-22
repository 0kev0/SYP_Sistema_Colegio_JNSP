package Vista_Panel_Director;

import static Funciones.Funciones.EnterMouse;
import static Funciones.Funciones.LeftMouse;
import java.awt.Color;
import Customizacion.*;

public class Panel_Director extends javax.swing.JFrame {

    public Panel_Director() {
        getContentPane().setBackground(new Color(250, 250, 250));

        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel_bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Lb_Info = new javax.swing.JLabel();
        Lb_Salmo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Lb_Aerolinea1 = new javax.swing.JLabel();
        Lb_Logo = new javax.swing.JLabel();
        PAnel_Der = new javax.swing.JPanel();
        Btn_Modificar_cuenta = new javax.swing.JPanel();
        Lb_ModificarCuenta = new javax.swing.JLabel();
        Btn_Inventario = new javax.swing.JPanel();
        Btn_ResumenNotas = new javax.swing.JPanel();
        Lb_RecordNotas = new javax.swing.JLabel();
        Btn_Inventario7 = new javax.swing.JPanel();
        Btn_Extra1 = new javax.swing.JPanel();
        Lb_Extra1 = new javax.swing.JLabel();
        Btn_Inventario9 = new javax.swing.JPanel();
        Btn_Extra2 = new javax.swing.JPanel();
        Lb_Extra2 = new javax.swing.JLabel();
        Btn_Inventario11 = new javax.swing.JPanel();
        Panel_Izq = new javax.swing.JPanel();
        Btn_Matriculas_ = new javax.swing.JPanel();
        Lb_MAtricula = new javax.swing.JLabel();
        Btn_Inventario8 = new javax.swing.JPanel();
        Btn_Empleados_ = new javax.swing.JPanel();
        Lb_Empleado = new javax.swing.JLabel();
        Btn_Inventario10 = new javax.swing.JPanel();
        Btn_Inventario_ = new Customizacion.Custom_Buttons();
        Btn_Inventario1 = new javax.swing.JPanel();
        Lb_Inventario = new javax.swing.JLabel();
        Btn_RegistroVentas = new javax.swing.JPanel();
        Btn_Inventario13 = new javax.swing.JPanel();
        Lb_RegistroVentas = new javax.swing.JLabel();
        Btn_Regresar1 = new javax.swing.JPanel();
        Lb_Ordenar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel_bg.setBackground(new java.awt.Color(247, 246, 187));
        Panel_bg.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 5, 0, 5, new java.awt.Color(0, 126, 112)));
        Panel_bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(247, 246, 187));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BG_Custom.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 420, -1));

        Lb_Info.setBackground(new java.awt.Color(17, 66, 50));
        Lb_Info.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Info.setForeground(new java.awt.Color(17, 66, 50));
        Lb_Info.setText("Bienvenido Director");
        jPanel2.add(Lb_Info, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, -1, -1));

        Lb_Salmo1.setBackground(new java.awt.Color(17, 66, 50));
        Lb_Salmo1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Salmo1.setForeground(new java.awt.Color(17, 66, 50));
        Lb_Salmo1.setText("EL salmo del dia");
        jPanel2.add(Lb_Salmo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        Panel_bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 420, 350));

        jPanel3.setBackground(new java.awt.Color(17, 66, 50));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(0, 126, 112)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lb_Aerolinea1.setBackground(new java.awt.Color(251, 238, 122));
        Lb_Aerolinea1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Lb_Aerolinea1.setForeground(new java.awt.Color(203, 202, 104));
        Lb_Aerolinea1.setText("Colegio Josefino Nuestra Señora De La Paz ");
        jPanel3.add(Lb_Aerolinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 540, 70));

        Lb_Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO blsnco 80x80_1.jpg"))); // NOI18N
        jPanel3.add(Lb_Logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 70));

        Panel_bg.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 80));

        PAnel_Der.setBackground(new java.awt.Color(17, 66, 50));

        Btn_Modificar_cuenta.setBackground(new java.awt.Color(250, 244, 208));
        Btn_Modificar_cuenta.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(255, 204, 0)));
        Btn_Modificar_cuenta.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_Modificar_cuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Modificar_cuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Modificar_cuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Modificar_cuentaMouseExited(evt);
            }
        });

        Lb_ModificarCuenta.setBackground(new java.awt.Color(7, 3, 26));
        Lb_ModificarCuenta.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_ModificarCuenta.setForeground(new java.awt.Color(7, 3, 26));
        Lb_ModificarCuenta.setText("Modificar Cuenta");

        Btn_Inventario.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_InventarioLayout = new javax.swing.GroupLayout(Btn_Inventario);
        Btn_Inventario.setLayout(Btn_InventarioLayout);
        Btn_InventarioLayout.setHorizontalGroup(
            Btn_InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Btn_InventarioLayout.setVerticalGroup(
            Btn_InventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Btn_Modificar_cuentaLayout = new javax.swing.GroupLayout(Btn_Modificar_cuenta);
        Btn_Modificar_cuenta.setLayout(Btn_Modificar_cuentaLayout);
        Btn_Modificar_cuentaLayout.setHorizontalGroup(
            Btn_Modificar_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_Modificar_cuentaLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(Lb_ModificarCuenta)
                .addContainerGap())
        );
        Btn_Modificar_cuentaLayout.setVerticalGroup(
            Btn_Modificar_cuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_Modificar_cuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_ModificarCuenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Btn_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Btn_ResumenNotas.setBackground(new java.awt.Color(250, 244, 208));
        Btn_ResumenNotas.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(255, 204, 0)));
        Btn_ResumenNotas.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_ResumenNotas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_ResumenNotasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_ResumenNotasMouseExited(evt);
            }
        });

        Lb_RecordNotas.setBackground(new java.awt.Color(7, 3, 26));
        Lb_RecordNotas.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_RecordNotas.setForeground(new java.awt.Color(7, 3, 26));
        Lb_RecordNotas.setText("Record de notas");

        Btn_Inventario7.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario7.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario7.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario7Layout = new javax.swing.GroupLayout(Btn_Inventario7);
        Btn_Inventario7.setLayout(Btn_Inventario7Layout);
        Btn_Inventario7Layout.setHorizontalGroup(
            Btn_Inventario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        Btn_Inventario7Layout.setVerticalGroup(
            Btn_Inventario7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Btn_ResumenNotasLayout = new javax.swing.GroupLayout(Btn_ResumenNotas);
        Btn_ResumenNotas.setLayout(Btn_ResumenNotasLayout);
        Btn_ResumenNotasLayout.setHorizontalGroup(
            Btn_ResumenNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario7, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(Btn_ResumenNotasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_RecordNotas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Btn_ResumenNotasLayout.setVerticalGroup(
            Btn_ResumenNotasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_ResumenNotasLayout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Lb_RecordNotas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Inventario7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Btn_Extra1.setBackground(new java.awt.Color(250, 244, 208));
        Btn_Extra1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(255, 204, 0)));
        Btn_Extra1.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_Extra1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Extra1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Extra1MouseExited(evt);
            }
        });

        Lb_Extra1.setBackground(new java.awt.Color(7, 3, 26));
        Lb_Extra1.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Extra1.setForeground(new java.awt.Color(7, 3, 26));
        Lb_Extra1.setText("Empleados");

        Btn_Inventario9.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario9.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario9.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario9Layout = new javax.swing.GroupLayout(Btn_Inventario9);
        Btn_Inventario9.setLayout(Btn_Inventario9Layout);
        Btn_Inventario9Layout.setHorizontalGroup(
            Btn_Inventario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Btn_Inventario9Layout.setVerticalGroup(
            Btn_Inventario9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Btn_Extra1Layout = new javax.swing.GroupLayout(Btn_Extra1);
        Btn_Extra1.setLayout(Btn_Extra1Layout);
        Btn_Extra1Layout.setHorizontalGroup(
            Btn_Extra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_Extra1Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(Lb_Extra1)
                .addContainerGap())
        );
        Btn_Extra1Layout.setVerticalGroup(
            Btn_Extra1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_Extra1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Extra1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Btn_Inventario9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Btn_Extra2.setBackground(new java.awt.Color(250, 244, 208));
        Btn_Extra2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 0, new java.awt.Color(255, 204, 0)));
        Btn_Extra2.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_Extra2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Extra2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Extra2MouseExited(evt);
            }
        });

        Lb_Extra2.setBackground(new java.awt.Color(7, 3, 26));
        Lb_Extra2.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Extra2.setForeground(new java.awt.Color(7, 3, 26));
        Lb_Extra2.setText("Registros");

        Btn_Inventario11.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario11.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario11.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario11Layout = new javax.swing.GroupLayout(Btn_Inventario11);
        Btn_Inventario11.setLayout(Btn_Inventario11Layout);
        Btn_Inventario11Layout.setHorizontalGroup(
            Btn_Inventario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        Btn_Inventario11Layout.setVerticalGroup(
            Btn_Inventario11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Btn_Extra2Layout = new javax.swing.GroupLayout(Btn_Extra2);
        Btn_Extra2.setLayout(Btn_Extra2Layout);
        Btn_Extra2Layout.setHorizontalGroup(
            Btn_Extra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(Btn_Extra2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Extra2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Btn_Extra2Layout.setVerticalGroup(
            Btn_Extra2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_Extra2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Lb_Extra2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Inventario11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PAnel_DerLayout = new javax.swing.GroupLayout(PAnel_Der);
        PAnel_Der.setLayout(PAnel_DerLayout);
        PAnel_DerLayout.setHorizontalGroup(
            PAnel_DerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PAnel_DerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PAnel_DerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Modificar_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_ResumenNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Extra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Extra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        PAnel_DerLayout.setVerticalGroup(
            PAnel_DerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PAnel_DerLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Btn_Modificar_cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_ResumenNotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Extra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Extra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        Panel_bg.add(PAnel_Der, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 80, 190, 390));

        Panel_Izq.setBackground(new java.awt.Color(17, 66, 50));

        Btn_Matriculas_.setBackground(new java.awt.Color(250, 244, 208));
        Btn_Matriculas_.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(255, 204, 0)));
        Btn_Matriculas_.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_Matriculas_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Matriculas_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Matriculas_MouseExited(evt);
            }
        });

        Lb_MAtricula.setBackground(new java.awt.Color(7, 3, 26));
        Lb_MAtricula.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_MAtricula.setForeground(new java.awt.Color(7, 3, 26));
        Lb_MAtricula.setText("Matriculas");

        Btn_Inventario8.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario8.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario8Layout = new javax.swing.GroupLayout(Btn_Inventario8);
        Btn_Inventario8.setLayout(Btn_Inventario8Layout);
        Btn_Inventario8Layout.setHorizontalGroup(
            Btn_Inventario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 177, Short.MAX_VALUE)
        );
        Btn_Inventario8Layout.setVerticalGroup(
            Btn_Inventario8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Btn_Matriculas_Layout = new javax.swing.GroupLayout(Btn_Matriculas_);
        Btn_Matriculas_.setLayout(Btn_Matriculas_Layout);
        Btn_Matriculas_Layout.setHorizontalGroup(
            Btn_Matriculas_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario8, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(Btn_Matriculas_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_MAtricula)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Btn_Matriculas_Layout.setVerticalGroup(
            Btn_Matriculas_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_Matriculas_Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Lb_MAtricula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Inventario8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Btn_Empleados_.setBackground(new java.awt.Color(250, 244, 208));
        Btn_Empleados_.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(255, 204, 0)));
        Btn_Empleados_.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_Empleados_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Empleados_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Empleados_MouseExited(evt);
            }
        });

        Lb_Empleado.setBackground(new java.awt.Color(7, 3, 26));
        Lb_Empleado.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Empleado.setForeground(new java.awt.Color(7, 3, 26));
        Lb_Empleado.setText("Empleados");

        Btn_Inventario10.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario10.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario10.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario10Layout = new javax.swing.GroupLayout(Btn_Inventario10);
        Btn_Inventario10.setLayout(Btn_Inventario10Layout);
        Btn_Inventario10Layout.setHorizontalGroup(
            Btn_Inventario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Btn_Inventario10Layout.setVerticalGroup(
            Btn_Inventario10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Btn_Empleados_Layout = new javax.swing.GroupLayout(Btn_Empleados_);
        Btn_Empleados_.setLayout(Btn_Empleados_Layout);
        Btn_Empleados_Layout.setHorizontalGroup(
            Btn_Empleados_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Btn_Empleados_Layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addComponent(Lb_Empleado)
                .addContainerGap())
        );
        Btn_Empleados_Layout.setVerticalGroup(
            Btn_Empleados_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_Empleados_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Empleado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Btn_Inventario10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Btn_Inventario_.setBackground(new java.awt.Color(250, 244, 208));
        Btn_Inventario_.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(255, 204, 0)));
        Btn_Inventario_.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_Inventario_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Inventario_MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Inventario_MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Inventario_MouseExited(evt);
            }
        });

        Btn_Inventario1.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario1.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario1Layout = new javax.swing.GroupLayout(Btn_Inventario1);
        Btn_Inventario1.setLayout(Btn_Inventario1Layout);
        Btn_Inventario1Layout.setHorizontalGroup(
            Btn_Inventario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Btn_Inventario1Layout.setVerticalGroup(
            Btn_Inventario1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        Lb_Inventario.setBackground(new java.awt.Color(7, 3, 26));
        Lb_Inventario.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_Inventario.setForeground(new java.awt.Color(7, 3, 26));
        Lb_Inventario.setText("Registos Inventario");

        javax.swing.GroupLayout Btn_Inventario_Layout = new javax.swing.GroupLayout(Btn_Inventario_);
        Btn_Inventario_.setLayout(Btn_Inventario_Layout);
        Btn_Inventario_Layout.setHorizontalGroup(
            Btn_Inventario_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
            .addGroup(Btn_Inventario_Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Inventario)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Btn_Inventario_Layout.setVerticalGroup(
            Btn_Inventario_Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_Inventario_Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(Lb_Inventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_Inventario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Btn_RegistroVentas.setBackground(new java.awt.Color(250, 244, 208));
        Btn_RegistroVentas.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 3, 3, new java.awt.Color(255, 204, 0)));
        Btn_RegistroVentas.setPreferredSize(new java.awt.Dimension(180, 60));
        Btn_RegistroVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_RegistroVentasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_RegistroVentasMouseExited(evt);
            }
        });

        Btn_Inventario13.setBackground(new java.awt.Color(255, 255, 102));
        Btn_Inventario13.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(255, 153, 0)));
        Btn_Inventario13.setPreferredSize(new java.awt.Dimension(2, 15));

        javax.swing.GroupLayout Btn_Inventario13Layout = new javax.swing.GroupLayout(Btn_Inventario13);
        Btn_Inventario13.setLayout(Btn_Inventario13Layout);
        Btn_Inventario13Layout.setHorizontalGroup(
            Btn_Inventario13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        Btn_Inventario13Layout.setVerticalGroup(
            Btn_Inventario13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        Lb_RegistroVentas.setBackground(new java.awt.Color(7, 3, 26));
        Lb_RegistroVentas.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        Lb_RegistroVentas.setForeground(new java.awt.Color(7, 3, 26));
        Lb_RegistroVentas.setText("Registros de ventas");

        javax.swing.GroupLayout Btn_RegistroVentasLayout = new javax.swing.GroupLayout(Btn_RegistroVentas);
        Btn_RegistroVentas.setLayout(Btn_RegistroVentasLayout);
        Btn_RegistroVentasLayout.setHorizontalGroup(
            Btn_RegistroVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Btn_Inventario13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
            .addGroup(Btn_RegistroVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_RegistroVentas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Btn_RegistroVentasLayout.setVerticalGroup(
            Btn_RegistroVentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_RegistroVentasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_RegistroVentas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(Btn_Inventario13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Panel_IzqLayout = new javax.swing.GroupLayout(Panel_Izq);
        Panel_Izq.setLayout(Panel_IzqLayout);
        Panel_IzqLayout.setHorizontalGroup(
            Panel_IzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IzqLayout.createSequentialGroup()
                .addGroup(Panel_IzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Inventario_, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_RegistroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Matriculas_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Empleados_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 9, Short.MAX_VALUE))
        );
        Panel_IzqLayout.setVerticalGroup(
            Panel_IzqLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel_IzqLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(Btn_Inventario_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Matriculas_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_Empleados_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_RegistroVentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        Panel_bg.add(Panel_Izq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 190, 390));

        Btn_Regresar1.setBackground(new java.awt.Color(152, 5, 5));
        Btn_Regresar1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 10, 0, new java.awt.Color(247, 17, 17)));
        Btn_Regresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Regresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_Regresar1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_Regresar1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_Regresar1MouseExited(evt);
            }
        });
        Btn_Regresar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lb_Ordenar1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        Lb_Ordenar1.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Ordenar1.setText("Regresar");
        Lb_Ordenar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Regresar1.add(Lb_Ordenar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 40));

        Panel_bg.add(Btn_Regresar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_bg, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_Modificar_cuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Modificar_cuentaMouseEntered
        EnterMouse(Btn_Modificar_cuenta, Lb_ModificarCuenta, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_Modificar_cuentaMouseEntered

    private void Btn_Modificar_cuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Modificar_cuentaMouseExited
        LeftMouse(Btn_Modificar_cuenta, Lb_ModificarCuenta, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_Modificar_cuentaMouseExited

    private void Btn_ResumenNotasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ResumenNotasMouseEntered
        EnterMouse(Btn_ResumenNotas, Lb_RecordNotas, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_ResumenNotasMouseEntered

    private void Btn_ResumenNotasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_ResumenNotasMouseExited
        LeftMouse(Btn_ResumenNotas, Lb_RecordNotas, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_ResumenNotasMouseExited

    private void Btn_Extra1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Extra1MouseEntered
        EnterMouse(Btn_Extra1, Lb_Extra1, "#FFF099", "#FF9900");

    }//GEN-LAST:event_Btn_Extra1MouseEntered

    private void Btn_Extra1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Extra1MouseExited
        LeftMouse(Btn_Extra1, Lb_Extra1, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_Extra1MouseExited

    private void Btn_Extra2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Extra2MouseEntered
        EnterMouse(Btn_Extra2, Lb_Extra2, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_Extra2MouseEntered

    private void Btn_Extra2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Extra2MouseExited
        LeftMouse(Btn_Extra2, Lb_Extra2, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_Extra2MouseExited

    private void Btn_Regresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Regresar1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Regresar1MouseClicked

    private void Btn_Regresar1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Regresar1MouseEntered
        EnterMouse(Btn_Extra1, Lb_Extra1, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_Regresar1MouseEntered

    private void Btn_Regresar1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Regresar1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Regresar1MouseExited

    private void Btn_Matriculas_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Matriculas_MouseEntered
        EnterMouse(Btn_Matriculas_, Lb_MAtricula, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_Matriculas_MouseEntered

    private void Btn_Matriculas_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Matriculas_MouseExited
        LeftMouse(Btn_Matriculas_, Lb_MAtricula, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_Matriculas_MouseExited

    private void Btn_Empleados_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Empleados_MouseEntered
        EnterMouse(Btn_Empleados_, Lb_Empleado, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_Empleados_MouseEntered

    private void Btn_Empleados_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Empleados_MouseExited
        LeftMouse(Btn_Empleados_, Lb_Empleado, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_Empleados_MouseExited

    private void Btn_Inventario_MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Inventario_MouseEntered
        EnterMouse(Btn_Inventario_, Lb_Inventario, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_Inventario_MouseEntered

    private void Btn_Inventario_MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Inventario_MouseExited
        LeftMouse(Btn_Inventario_, Lb_Inventario, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_Inventario_MouseExited

    private void Btn_RegistroVentasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegistroVentasMouseEntered
        EnterMouse(Btn_RegistroVentas, Lb_RegistroVentas, "#FFF099", "#FF9900");
    }//GEN-LAST:event_Btn_RegistroVentasMouseEntered

    private void Btn_RegistroVentasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegistroVentasMouseExited
        LeftMouse(Btn_RegistroVentas, Lb_RegistroVentas, "#FAF4D0", "#000000");
    }//GEN-LAST:event_Btn_RegistroVentasMouseExited

    private void Btn_Modificar_cuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Modificar_cuentaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Btn_Modificar_cuentaMouseClicked

    private void Btn_Inventario_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_Inventario_MouseClicked
        Gestion_Transacciones gest = new Gestion_Transacciones();
        dispose();
        gest.setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_Btn_Inventario_MouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Director().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_Empleados_;
    private javax.swing.JPanel Btn_Extra1;
    private javax.swing.JPanel Btn_Extra2;
    private javax.swing.JPanel Btn_Inventario;
    private javax.swing.JPanel Btn_Inventario1;
    private javax.swing.JPanel Btn_Inventario10;
    private javax.swing.JPanel Btn_Inventario11;
    private javax.swing.JPanel Btn_Inventario13;
    private javax.swing.JPanel Btn_Inventario7;
    private javax.swing.JPanel Btn_Inventario8;
    private javax.swing.JPanel Btn_Inventario9;
    private javax.swing.JPanel Btn_Inventario_;
    private javax.swing.JPanel Btn_Matriculas_;
    private javax.swing.JPanel Btn_Modificar_cuenta;
    private javax.swing.JPanel Btn_RegistroVentas;
    private javax.swing.JPanel Btn_Regresar1;
    private javax.swing.JPanel Btn_ResumenNotas;
    private javax.swing.JLabel Lb_Aerolinea1;
    private javax.swing.JLabel Lb_Empleado;
    private javax.swing.JLabel Lb_Extra1;
    private javax.swing.JLabel Lb_Extra2;
    private javax.swing.JLabel Lb_Info;
    private javax.swing.JLabel Lb_Inventario;
    private javax.swing.JLabel Lb_Logo;
    private javax.swing.JLabel Lb_MAtricula;
    private javax.swing.JLabel Lb_ModificarCuenta;
    private javax.swing.JLabel Lb_Ordenar1;
    private javax.swing.JLabel Lb_RecordNotas;
    private javax.swing.JLabel Lb_RegistroVentas;
    private javax.swing.JLabel Lb_Salmo1;
    private javax.swing.JPanel PAnel_Der;
    private javax.swing.JPanel Panel_Izq;
    private javax.swing.JPanel Panel_bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
