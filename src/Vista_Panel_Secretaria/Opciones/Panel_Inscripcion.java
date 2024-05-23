package Vista_Panel_Secretaria.Opciones;


import Funciones.Funciones;
import Vista_Panel_Secretaria.Panel_Secretaria;
import javax.swing.JOptionPane;

public class Panel_Inscripcion extends javax.swing.JFrame {

    public Panel_Inscripcion() {
        initComponents();
        setLocationRelativeTo(this);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        TxbApellidoMaterno = new javax.swing.JTextField();
        TxbNombre = new javax.swing.JTextField();
        TxbDireccion = new javax.swing.JTextField();
        TxbTelefono = new javax.swing.JTextField();
        TxbCorreo = new javax.swing.JTextField();
        CbTipoDoc = new javax.swing.JComboBox<>();
        errorNombre = new javax.swing.JLabel();
        errorApellidoMaterno = new javax.swing.JLabel();
        LbErrorDirecc = new javax.swing.JLabel();
        LbErrorCorreo = new javax.swing.JLabel();
        Btn_Regresar = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        Lb_Aerolinea7 = new javax.swing.JLabel();
        Lb_Ordenar = new javax.swing.JLabel();
        Btn_CrearCuenta = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        Lb_Aerolinea6 = new javax.swing.JLabel();
        Lb_Crearcuenta = new javax.swing.JLabel();
        LbErrorTel = new javax.swing.JLabel();
        TxbNombre1 = new javax.swing.JTextField();
        TxbNombre2 = new javax.swing.JTextField();
        LbErrorTel1 = new javax.swing.JLabel();
        TxbTelefono1 = new javax.swing.JTextField();
        errorNombre2 = new javax.swing.JLabel();
        TxbApellidoMaterno1 = new javax.swing.JTextField();
        TxbNombre3 = new javax.swing.JTextField();
        errorNombre3 = new javax.swing.JLabel();
        errorNombre4 = new javax.swing.JLabel();
        errorNombre5 = new javax.swing.JLabel();
        TxbApellidoMaterno2 = new javax.swing.JTextField();
        TxbNombre4 = new javax.swing.JTextField();
        errorNombre6 = new javax.swing.JLabel();
        CbTipoDoc1 = new javax.swing.JComboBox<>();
        loading1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel5.setBackground(new java.awt.Color(17, 66, 50));

        TxbApellidoMaterno.setBackground(new java.awt.Color(17, 66, 50));
        TxbApellidoMaterno.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbApellidoMaterno.setForeground(new java.awt.Color(255, 255, 255));
        TxbApellidoMaterno.setText("ingrese su apellidos");
        TxbApellidoMaterno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido materno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbApellidoMaterno.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbApellidoMaterno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbApellidoMaternoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbApellidoMaternoMouseExited(evt);
            }
        });
        TxbApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbApellidoMaternoKeyTyped(evt);
            }
        });

        TxbNombre.setBackground(new java.awt.Color(17, 66, 50));
        TxbNombre.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbNombre.setForeground(new java.awt.Color(255, 255, 255));
        TxbNombre.setText("ingrese su nombre");
        TxbNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbNombre.setCaretColor(new java.awt.Color(17, 66, 50));
        TxbNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbNombreMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbNombreMouseExited(evt);
            }
        });
        TxbNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbNombreKeyTyped(evt);
            }
        });

        TxbDireccion.setBackground(new java.awt.Color(17, 66, 50));
        TxbDireccion.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbDireccion.setForeground(new java.awt.Color(255, 255, 255));
        TxbDireccion.setText("ingrese su direccion");
        TxbDireccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Direccion", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbDireccion.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbDireccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbDireccionMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbDireccionMouseExited(evt);
            }
        });

        TxbTelefono.setBackground(new java.awt.Color(17, 66, 50));
        TxbTelefono.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbTelefono.setForeground(new java.awt.Color(255, 255, 255));
        TxbTelefono.setText("ingrese su numero de telefono");
        TxbTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbTelefono.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbTelefonoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbTelefonoMouseExited(evt);
            }
        });
        TxbTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbTelefonoKeyTyped(evt);
            }
        });

        TxbCorreo.setBackground(new java.awt.Color(17, 66, 50));
        TxbCorreo.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbCorreo.setForeground(new java.awt.Color(255, 255, 255));
        TxbCorreo.setText("ingrese su correo");
        TxbCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Correo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbCorreo.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbCorreoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbCorreoMouseExited(evt);
            }
        });
        TxbCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbCorreoKeyTyped(evt);
            }
        });

        CbTipoDoc.setBackground(new java.awt.Color(17, 66, 50));
        CbTipoDoc.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        CbTipoDoc.setForeground(new java.awt.Color(255, 255, 255));
        CbTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DUI", "Pasaporte", "Nit", "" }));
        CbTipoDoc.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de responsable A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(203, 174, 104))); // NOI18N
        CbTipoDoc.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoDocItemStateChanged(evt);
            }
        });

        errorNombre.setBackground(new java.awt.Color(23, 42, 56));
        errorNombre.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorNombre.setForeground(new java.awt.Color(23, 42, 56));
        errorNombre.setText("Error");

        errorApellidoMaterno.setBackground(new java.awt.Color(23, 42, 56));
        errorApellidoMaterno.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorApellidoMaterno.setForeground(new java.awt.Color(23, 42, 56));
        errorApellidoMaterno.setText("Error");

        LbErrorDirecc.setBackground(new java.awt.Color(23, 42, 56));
        LbErrorDirecc.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LbErrorDirecc.setForeground(new java.awt.Color(23, 42, 56));
        LbErrorDirecc.setText("Error");

        LbErrorCorreo.setBackground(new java.awt.Color(23, 42, 56));
        LbErrorCorreo.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LbErrorCorreo.setForeground(new java.awt.Color(23, 42, 56));
        LbErrorCorreo.setText("Error");

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

        jPanel8.setBackground(new java.awt.Color(255, 10, 10));

        Lb_Aerolinea7.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea7.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Lb_Aerolinea7.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea7))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lb_Aerolinea7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Btn_Regresar.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 35, 149, 12));

        Lb_Ordenar.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        Lb_Ordenar.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Ordenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/back (1).png"))); // NOI18N
        Lb_Ordenar.setText("Regresar");
        Lb_Ordenar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_Regresar.add(Lb_Ordenar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 2, 130, 30));

        Btn_CrearCuenta.setBackground(new java.awt.Color(64, 124, 62));
        Btn_CrearCuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Btn_CrearCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_CrearCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Btn_CrearCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Btn_CrearCuentaMouseExited(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(40, 200, 35));

        Lb_Aerolinea6.setBackground(new java.awt.Color(255, 255, 255));
        Lb_Aerolinea6.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        Lb_Aerolinea6.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Lb_Aerolinea6))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lb_Aerolinea6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        Lb_Crearcuenta.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        Lb_Crearcuenta.setForeground(new java.awt.Color(255, 255, 255));
        Lb_Crearcuenta.setText("Crear cuenta");
        Lb_Crearcuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout Btn_CrearCuentaLayout = new javax.swing.GroupLayout(Btn_CrearCuenta);
        Btn_CrearCuenta.setLayout(Btn_CrearCuentaLayout);
        Btn_CrearCuentaLayout.setHorizontalGroup(
            Btn_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_CrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Crearcuenta)
                .addContainerGap(16, Short.MAX_VALUE))
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Btn_CrearCuentaLayout.setVerticalGroup(
            Btn_CrearCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Btn_CrearCuentaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lb_Crearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        LbErrorTel.setBackground(new java.awt.Color(23, 42, 56));
        LbErrorTel.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LbErrorTel.setForeground(new java.awt.Color(23, 42, 56));
        LbErrorTel.setText("Error");

        TxbNombre1.setBackground(new java.awt.Color(17, 66, 50));
        TxbNombre1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbNombre1.setForeground(new java.awt.Color(255, 255, 255));
        TxbNombre1.setText("ingrese edad");
        TxbNombre1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Edad", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbNombre1.setCaretColor(new java.awt.Color(17, 66, 50));
        TxbNombre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbNombre1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbNombre1MouseExited(evt);
            }
        });
        TxbNombre1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbNombre1KeyTyped(evt);
            }
        });

        TxbNombre2.setBackground(new java.awt.Color(17, 66, 50));
        TxbNombre2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbNombre2.setForeground(new java.awt.Color(255, 255, 255));
        TxbNombre2.setText("Ingrese grado a matricular");
        TxbNombre2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Grado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbNombre2.setCaretColor(new java.awt.Color(17, 66, 50));
        TxbNombre2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbNombre2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbNombre2MouseExited(evt);
            }
        });
        TxbNombre2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbNombre2KeyTyped(evt);
            }
        });

        LbErrorTel1.setBackground(new java.awt.Color(23, 42, 56));
        LbErrorTel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        LbErrorTel1.setForeground(new java.awt.Color(23, 42, 56));
        LbErrorTel1.setText("Error");

        TxbTelefono1.setBackground(new java.awt.Color(17, 66, 50));
        TxbTelefono1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbTelefono1.setForeground(new java.awt.Color(255, 255, 255));
        TxbTelefono1.setText("ingrese su numero de telefono");
        TxbTelefono1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefono", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbTelefono1.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbTelefono1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbTelefono1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbTelefono1MouseExited(evt);
            }
        });
        TxbTelefono1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbTelefono1KeyTyped(evt);
            }
        });

        errorNombre2.setBackground(new java.awt.Color(23, 42, 56));
        errorNombre2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorNombre2.setForeground(new java.awt.Color(23, 42, 56));
        errorNombre2.setText("Error");

        TxbApellidoMaterno1.setBackground(new java.awt.Color(17, 66, 50));
        TxbApellidoMaterno1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbApellidoMaterno1.setForeground(new java.awt.Color(255, 255, 255));
        TxbApellidoMaterno1.setText("ingrese su apellidos");
        TxbApellidoMaterno1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellidos responsable A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbApellidoMaterno1.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbApellidoMaterno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbApellidoMaterno1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbApellidoMaterno1MouseExited(evt);
            }
        });
        TxbApellidoMaterno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbApellidoMaterno1KeyTyped(evt);
            }
        });

        TxbNombre3.setBackground(new java.awt.Color(17, 66, 50));
        TxbNombre3.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbNombre3.setForeground(new java.awt.Color(255, 255, 255));
        TxbNombre3.setText("ingrese su nombre");
        TxbNombre3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres Responsable A", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbNombre3.setCaretColor(new java.awt.Color(17, 66, 50));
        TxbNombre3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbNombre3MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbNombre3MouseExited(evt);
            }
        });
        TxbNombre3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbNombre3KeyTyped(evt);
            }
        });

        errorNombre3.setBackground(new java.awt.Color(23, 42, 56));
        errorNombre3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorNombre3.setForeground(new java.awt.Color(23, 42, 56));
        errorNombre3.setText("Error");

        errorNombre4.setBackground(new java.awt.Color(23, 42, 56));
        errorNombre4.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorNombre4.setForeground(new java.awt.Color(23, 42, 56));
        errorNombre4.setText("Error");

        errorNombre5.setBackground(new java.awt.Color(23, 42, 56));
        errorNombre5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorNombre5.setForeground(new java.awt.Color(23, 42, 56));
        errorNombre5.setText("Error");

        TxbApellidoMaterno2.setBackground(new java.awt.Color(17, 66, 50));
        TxbApellidoMaterno2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbApellidoMaterno2.setForeground(new java.awt.Color(255, 255, 255));
        TxbApellidoMaterno2.setText("ingrese su apellidos");
        TxbApellidoMaterno2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellidos responsable B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbApellidoMaterno2.setCaretColor(new java.awt.Color(203, 174, 104));
        TxbApellidoMaterno2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbApellidoMaterno2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbApellidoMaterno2MouseExited(evt);
            }
        });
        TxbApellidoMaterno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbApellidoMaterno2KeyTyped(evt);
            }
        });

        TxbNombre4.setBackground(new java.awt.Color(17, 66, 50));
        TxbNombre4.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        TxbNombre4.setForeground(new java.awt.Color(255, 255, 255));
        TxbNombre4.setText("ingrese su nombre");
        TxbNombre4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombres Responsable B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 196, 54))); // NOI18N
        TxbNombre4.setCaretColor(new java.awt.Color(17, 66, 50));
        TxbNombre4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TxbNombre4MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TxbNombre4MouseExited(evt);
            }
        });
        TxbNombre4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxbNombre4KeyTyped(evt);
            }
        });

        errorNombre6.setBackground(new java.awt.Color(23, 42, 56));
        errorNombre6.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        errorNombre6.setForeground(new java.awt.Color(23, 42, 56));
        errorNombre6.setText("Error");

        CbTipoDoc1.setBackground(new java.awt.Color(17, 66, 50));
        CbTipoDoc1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        CbTipoDoc1.setForeground(new java.awt.Color(255, 255, 255));
        CbTipoDoc1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DUI", "Pasaporte", "Nit", "" }));
        CbTipoDoc1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de responsable B", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(203, 174, 104))); // NOI18N
        CbTipoDoc1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipoDoc1ItemStateChanged(evt);
            }
        });

        loading1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        loading1.setForeground(new java.awt.Color(203, 174, 104));
        loading1.setText("Inscripcion");
        loading1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 5, 0, new java.awt.Color(203, 174, 104)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbErrorDirecc, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LbErrorCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(TxbCorreo)
                                .addGap(165, 165, 165))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Btn_CrearCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(errorNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(errorNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(TxbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TxbApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(errorApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(TxbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(42, 42, 42)
                                        .addComponent(TxbNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(52, 52, 52))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(errorNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(errorNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(TxbNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(TxbApellidoMaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(LbErrorTel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(TxbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(errorNombre6, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(errorNombre5, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(TxbNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(TxbApellidoMaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(TxbTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CbTipoDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LbErrorTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(loading1))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(loading1)
                .addGap(42, 42, 42)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxbApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(errorNombre)
                                    .addComponent(errorNombre2)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxbNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxbNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(errorApellidoMaterno)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxbNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxbApellidoMaterno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(errorNombre3)
                                    .addComponent(errorNombre4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxbTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CbTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LbErrorTel)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxbNombre4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxbApellidoMaterno2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(errorNombre6)
                            .addComponent(errorNombre5)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxbTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbTipoDoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbErrorTel1)))
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TxbDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbErrorDirecc))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(TxbCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LbErrorCorreo)))
                .addGap(88, 88, 88)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_CrearCuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxbNombre4KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbNombre4KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre4KeyTyped

    private void TxbNombre4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre4MouseExited

    private void TxbNombre4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre4MouseClicked

    private void TxbApellidoMaterno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbApellidoMaterno2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbApellidoMaterno2KeyTyped

    private void TxbApellidoMaterno2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbApellidoMaterno2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbApellidoMaterno2MouseExited

    private void TxbApellidoMaterno2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbApellidoMaterno2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbApellidoMaterno2MouseClicked

    private void TxbNombre3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbNombre3KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre3KeyTyped

    private void TxbNombre3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre3MouseExited

    private void TxbNombre3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre3MouseClicked

    private void TxbApellidoMaterno1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbApellidoMaterno1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbApellidoMaterno1KeyTyped

    private void TxbApellidoMaterno1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbApellidoMaterno1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbApellidoMaterno1MouseExited

    private void TxbApellidoMaterno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbApellidoMaterno1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbApellidoMaterno1MouseClicked

    private void TxbTelefono1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbTelefono1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbTelefono1KeyTyped

    private void TxbTelefono1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbTelefono1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbTelefono1MouseExited

    private void TxbTelefono1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbTelefono1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbTelefono1MouseClicked

    private void TxbNombre2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbNombre2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre2KeyTyped

    private void TxbNombre2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre2MouseExited

    private void TxbNombre2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre2MouseClicked

    private void TxbNombre1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbNombre1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre1KeyTyped

    private void TxbNombre1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre1MouseExited

    private void TxbNombre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombre1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TxbNombre1MouseClicked

    private void Btn_CrearCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearCuentaMouseExited
        Funciones.LeftMouse(Btn_CrearCuenta, Lb_Crearcuenta, "#407C3E", "#FFFFFF");
    }//GEN-LAST:event_Btn_CrearCuentaMouseExited

    private void Btn_CrearCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearCuentaMouseEntered
        Funciones.EnterMouse(Btn_CrearCuenta, Lb_Crearcuenta, "#7BC778", "#000000");
    }//GEN-LAST:event_Btn_CrearCuentaMouseEntered

    private void Btn_CrearCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_CrearCuentaMouseClicked
//        if (Funciones.validarCampos(jPanel5)) {
//            if (!TxbContraseña.getText().equals(Funciones.TxbVerificarContraseña.getText())) {
//                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden", "Error ", 0);
//            } else {
//                //                Tbl_Cliente persona = new Tbl_Cliente();
//                //
//                //                persona.setNombre(TxbNombre.getText());
//                //                persona.setApellido_paterno(TxbApellidoPaterno.getText());
//                //                persona.setApellido_materno(TxbApellidoMaterno.getText());
//                //                persona.setTipo_doc(CbTipoDoc.getSelectedItem().toString());
//                //                persona.setNum_doc(TxbDocIdentidad.getText());
//                //                persona.setDireccion(TxbDireccion.getText());
//                //                persona.setTelefono(TxbTelefono.getText());
//                //                persona.setEmail(TxbCorreo.getText());
//                //                persona.setPassword(TxbContraseña.getText());
//                //                persona.setIdMembresia(4);
//                //
//                //                if (persona.insertNuevoCliente(persona) > 0) {
//                    //                    JOptionPane.showConfirmDialog(rootPane, "CUENTA CREADA SATISFACTORIAMENTE");
//                    //                }
//
//            }
//        }

    }//GEN-LAST:event_Btn_CrearCuentaMouseClicked

    private void Btn_RegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseExited
        Funciones.LeftMouse(Btn_Regresar, Lb_Ordenar, "#980505", "#FFFFFF");
    }//GEN-LAST:event_Btn_RegresarMouseExited

    private void Btn_RegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseEntered
        Funciones.EnterMouse(Btn_Regresar, Lb_Ordenar, "#D90707", "#000000");
    }//GEN-LAST:event_Btn_RegresarMouseEntered

    private void Btn_RegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_RegresarMouseClicked
        Panel_Secretaria log = new Panel_Secretaria();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_Btn_RegresarMouseClicked

    private void CbTipoDocItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoDocItemStateChanged
        String doc = CbTipoDoc.getSelectedItem().toString();
//        TxbDocIdentidad.setText("Ingrese su " + doc);
    }//GEN-LAST:event_CbTipoDocItemStateChanged

    private void TxbCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbCorreoKeyTyped

    }//GEN-LAST:event_TxbCorreoKeyTyped

    private void TxbCorreoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbCorreoMouseExited
        if (TxbCorreo.getText().equals("")) {
            TxbCorreo.setText("Ingrese su correo");
        }
    }//GEN-LAST:event_TxbCorreoMouseExited

    private void TxbCorreoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbCorreoMouseClicked
        TxbCorreo.setText("");
    }//GEN-LAST:event_TxbCorreoMouseClicked

    private void TxbTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbTelefonoKeyTyped
        Funciones.ValidNumeroTel(TxbTelefono, LbErrorTel);
    }//GEN-LAST:event_TxbTelefonoKeyTyped

    private void TxbTelefonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbTelefonoMouseExited
        if (TxbTelefono.getText().equals("")) {
            TxbTelefono.setText("Ingrese su numero de telefono");
        }
    }//GEN-LAST:event_TxbTelefonoMouseExited

    private void TxbTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbTelefonoMouseClicked
        TxbTelefono.setText("");
    }//GEN-LAST:event_TxbTelefonoMouseClicked

    private void TxbDireccionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbDireccionMouseExited
        if (TxbDireccion.getText().equals("")) {
            TxbDireccion.setText("Ingrese su direccion");
        }
    }//GEN-LAST:event_TxbDireccionMouseExited

    private void TxbDireccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbDireccionMouseClicked
        TxbDireccion.setText("");
    }//GEN-LAST:event_TxbDireccionMouseClicked

    private void TxbNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbNombreKeyTyped
        Funciones.ValidNombres(TxbNombre, errorNombre);
    }//GEN-LAST:event_TxbNombreKeyTyped

    private void TxbNombreMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombreMouseExited
        if (TxbNombre.getText().equals("")) {
            TxbNombre.setText("Ingrese su nombre");
        }
    }//GEN-LAST:event_TxbNombreMouseExited

    private void TxbNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbNombreMouseClicked
        TxbNombre.setText("");
    }//GEN-LAST:event_TxbNombreMouseClicked

    private void TxbApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxbApellidoMaternoKeyTyped
        Funciones.ValidNombres(TxbApellidoMaterno, errorApellidoMaterno);
    }//GEN-LAST:event_TxbApellidoMaternoKeyTyped

    private void TxbApellidoMaternoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbApellidoMaternoMouseExited
        if (TxbApellidoMaterno.getText().equals("")) {
            TxbApellidoMaterno.setText("Ingrese su apellido materno");
        }
    }//GEN-LAST:event_TxbApellidoMaternoMouseExited

    private void TxbApellidoMaternoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TxbApellidoMaternoMouseClicked
        TxbApellidoMaterno.setText("");
    }//GEN-LAST:event_TxbApellidoMaternoMouseClicked

    private void CbTipoDoc1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipoDoc1ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_CbTipoDoc1ItemStateChanged

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_Inscripcion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Btn_CrearCuenta;
    private javax.swing.JPanel Btn_Regresar;
    private javax.swing.JComboBox<String> CbTipoDoc;
    private javax.swing.JComboBox<String> CbTipoDoc1;
    private javax.swing.JLabel LbErrorCorreo;
    private javax.swing.JLabel LbErrorDirecc;
    private javax.swing.JLabel LbErrorTel;
    private javax.swing.JLabel LbErrorTel1;
    private javax.swing.JLabel Lb_Aerolinea6;
    private javax.swing.JLabel Lb_Aerolinea7;
    private javax.swing.JLabel Lb_Crearcuenta;
    private javax.swing.JLabel Lb_Ordenar;
    private javax.swing.JTextField TxbApellidoMaterno;
    private javax.swing.JTextField TxbApellidoMaterno1;
    private javax.swing.JTextField TxbApellidoMaterno2;
    private javax.swing.JTextField TxbCorreo;
    private javax.swing.JTextField TxbDireccion;
    private javax.swing.JTextField TxbNombre;
    private javax.swing.JTextField TxbNombre1;
    private javax.swing.JTextField TxbNombre2;
    private javax.swing.JTextField TxbNombre3;
    private javax.swing.JTextField TxbNombre4;
    private javax.swing.JTextField TxbTelefono;
    private javax.swing.JTextField TxbTelefono1;
    private javax.swing.JLabel errorApellidoMaterno;
    private javax.swing.JLabel errorNombre;
    private javax.swing.JLabel errorNombre2;
    private javax.swing.JLabel errorNombre3;
    private javax.swing.JLabel errorNombre4;
    private javax.swing.JLabel errorNombre5;
    private javax.swing.JLabel errorNombre6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel loading1;
    // End of variables declaration//GEN-END:variables
}
