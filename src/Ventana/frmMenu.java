package Ventana;

import java.awt.Color;
import java.awt.PageAttributes;
import java.awt.color.ColorSpace;
import javax.swing.JColorChooser;
import Modelo.Usuarios;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.*;

import javax.swing.table.DefaultTableModel;
import java.util.Date;
import javax.swing.RowFilter;
import javax.swing.table.TableRowSorter;

 public class frmMenu extends javax.swing.JFrame {
     Usuarios objUs = new Usuarios();
     int contadorcito=0;
     Date date = new Date();
     DefaultTableModel modeloUsuario = new DefaultTableModel();
     private TableRowSorter trsfiltro;
     
    public frmMenu() {
        initComponents();  
        setLlenado();
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelMenu = new javax.swing.JPanel();
        jbnCatalogo = new javax.swing.JButton();
        jbnVenta = new javax.swing.JButton();
        jbnInventario = new javax.swing.JButton();
        jbnPedidos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jbnReportes = new javax.swing.JButton();
        jbnUsuarios = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        PanelContenido = new javax.swing.JPanel();
        PanelCatalogo = new javax.swing.JPanel();
        PanelInvetario = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        PanelPedidos = new javax.swing.JPanel();
        jtxUsuario1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jtxContrasena1 = new javax.swing.JTextField();
        jlbContrasena1 = new javax.swing.JLabel();
        jlbStatus1 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jcmEstatusUsr1 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbUsuario1 = new javax.swing.JTable();
        jbnActualizarUsr1 = new javax.swing.JButton();
        jbnRegistrarUsr1 = new javax.swing.JButton();
        jlbUsu1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbBuscarPedido = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jtxBuscarUsuario1 = new javax.swing.JTextField();
        PanelUsuario = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jlbContrasena = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuario = new javax.swing.JTable();
        jlbUsu = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jlbBuscarUsuario = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jtxBuscarUsuario = new javax.swing.JTextField();
        jtxUsuario = new javax.swing.JTextField();
        jtxContrasena = new javax.swing.JTextField();
        jlbStatus = new javax.swing.JLabel();
        jcmEstatusUsr = new javax.swing.JComboBox<>();
        jbnActualizarUsr = new javax.swing.JButton();
        jbnRegistrarUsr = new javax.swing.JButton();
        PanelReporte = new javax.swing.JPanel();
        PanelVenta = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jlbUsuario1 = new javax.swing.JLabel();
        jlbUsuario3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jlbUsuario4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        Panel = new javax.swing.JPanel();
        panelCuenta = new javax.swing.JPanel();
        iconUsr = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbnCerrar = new javax.swing.JButton();
        jlbUsuario2 = new javax.swing.JLabel();
        jlbLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelMenu.setBackground(new java.awt.Color(145, 36, 36));
        PanelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbnCatalogo.setBackground(new java.awt.Color(145, 36, 36));
        jbnCatalogo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        jbnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pizza_48px.png"))); // NOI18N
        jbnCatalogo.setText("Catalogo");
        jbnCatalogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnCatalogo.setContentAreaFilled(false);
        jbnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnCatalogo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbnCatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbnCatalogoMouseExited(evt);
            }
        });
        jbnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCatalogoActionPerformed(evt);
            }
        });
        PanelMenu.add(jbnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 140, 60));

        jbnVenta.setBackground(new java.awt.Color(145, 36, 36));
        jbnVenta.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnVenta.setForeground(new java.awt.Color(255, 255, 255));
        jbnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Buy_48px_1.png"))); // NOI18N
        jbnVenta.setText("Venta");
        jbnVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnVenta.setContentAreaFilled(false);
        jbnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnVenta.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbnVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbnVentaMouseExited(evt);
            }
        });
        jbnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnVentaActionPerformed(evt);
            }
        });
        PanelMenu.add(jbnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 140, 60));

        jbnInventario.setBackground(new java.awt.Color(145, 36, 36));
        jbnInventario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnInventario.setForeground(new java.awt.Color(255, 255, 255));
        jbnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Purchase Order_48px.png"))); // NOI18N
        jbnInventario.setText("Inventario");
        jbnInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnInventario.setContentAreaFilled(false);
        jbnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnInventario.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbnInventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbnInventarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbnInventarioMouseExited(evt);
            }
        });
        jbnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnInventarioActionPerformed(evt);
            }
        });
        PanelMenu.add(jbnInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 140, 60));

        jbnPedidos.setBackground(new java.awt.Color(145, 36, 36));
        jbnPedidos.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnPedidos.setForeground(new java.awt.Color(255, 255, 255));
        jbnPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Scooter_48px_5.png"))); // NOI18N
        jbnPedidos.setText("Pedidos");
        jbnPedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnPedidos.setContentAreaFilled(false);
        jbnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnPedidos.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbnPedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbnPedidosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbnPedidosMouseExited(evt);
            }
        });
        jbnPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnPedidosActionPerformed(evt);
            }
        });
        PanelMenu.add(jbnPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 140, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo5.png"))); // NOI18N
        PanelMenu.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, 100));

        jbnReportes.setBackground(new java.awt.Color(145, 36, 36));
        jbnReportes.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnReportes.setForeground(new java.awt.Color(255, 255, 255));
        jbnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Pie Chart_48px_3.png"))); // NOI18N
        jbnReportes.setText("Reportes");
        jbnReportes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnReportes.setContentAreaFilled(false);
        jbnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnReportes.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbnReportesMouseExited(evt);
            }
        });
        jbnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnReportesActionPerformed(evt);
            }
        });
        PanelMenu.add(jbnReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 140, 60));

        jbnUsuarios.setBackground(new java.awt.Color(145, 36, 36));
        jbnUsuarios.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        jbnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User Group Man Man_48px.png"))); // NOI18N
        jbnUsuarios.setText("Usuarios");
        jbnUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnUsuarios.setContentAreaFilled(false);
        jbnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnUsuarios.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jbnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbnUsuariosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbnUsuariosMouseExited(evt);
            }
        });
        jbnUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnUsuariosActionPerformed(evt);
            }
        });
        PanelMenu.add(jbnUsuarios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 140, 60));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Menu_35px.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Menu_40px_1.png"))); // NOI18N
        jButton4.setSelected(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelMenu.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 50, -1));

        getContentPane().add(PanelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 140, 540));

        PanelContenido.setBackground(new java.awt.Color(204, 204, 204));
        PanelContenido.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout PanelCatalogoLayout = new javax.swing.GroupLayout(PanelCatalogo);
        PanelCatalogo.setLayout(PanelCatalogoLayout);
        PanelCatalogoLayout.setHorizontalGroup(
            PanelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        PanelCatalogoLayout.setVerticalGroup(
            PanelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        PanelContenido.add(PanelCatalogo, "card3");

        jButton2.setText("Inventario");

        javax.swing.GroupLayout PanelInvetarioLayout = new javax.swing.GroupLayout(PanelInvetario);
        PanelInvetario.setLayout(PanelInvetarioLayout);
        PanelInvetarioLayout.setHorizontalGroup(
            PanelInvetarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInvetarioLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        PanelInvetarioLayout.setVerticalGroup(
            PanelInvetarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInvetarioLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        PanelContenido.add(PanelInvetario, "card4");

        PanelPedidos.setBackground(new java.awt.Color(255, 255, 255));

        jtxUsuario1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxUsuario1.setBorder(null);

        jSeparator5.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator5.setForeground(new java.awt.Color(204, 204, 204));

        jtxContrasena1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxContrasena1.setBorder(null);

        jlbContrasena1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbContrasena1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User Credentials_48px_1.png"))); // NOI18N
        jlbContrasena1.setText("Contraseña:");

        jlbStatus1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbStatus1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Heart Monitor_48px_3.png"))); // NOI18N
        jlbStatus1.setText("Estatus");

        jSeparator6.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator6.setForeground(new java.awt.Color(204, 204, 204));

        jcmEstatusUsr1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcmEstatusUsr1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Activo", "Bloqueado", "Baja" }));

        jtbUsuario1.setModel(modeloUsuario);
        jScrollPane2.setViewportView(jtbUsuario1);

        jbnActualizarUsr1.setText("Actualizar");
        jbnActualizarUsr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnActualizarUsr1ActionPerformed(evt);
            }
        });

        jbnRegistrarUsr1.setText("Registrar");
        jbnRegistrarUsr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarUsr1ActionPerformed(evt);
            }
        });

        jlbUsu1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User Group Man Man_48px.png"))); // NOI18N
        jlbUsu1.setText("Usuario:");

        jPanel2.setBackground(new java.awt.Color(145, 36, 36));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbBuscarPedido.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbBuscarPedido.setForeground(new java.awt.Color(255, 255, 255));
        jlbBuscarPedido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_48px_8.png"))); // NOI18N
        jlbBuscarPedido.setText("Buscar");
        jlbBuscarPedido.setToolTipText("");
        jlbBuscarPedido.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlbBuscarPedido.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator7.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator7.setForeground(new java.awt.Color(204, 204, 204));

        jtxBuscarUsuario1.setBackground(new java.awt.Color(145, 36, 36));
        jtxBuscarUsuario1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxBuscarUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jtxBuscarUsuario1.setBorder(null);
        jtxBuscarUsuario1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtxBuscarUsuario1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxBuscarUsuario1KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbBuscarPedido)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jtxBuscarUsuario1)
                    .addGap(113, 113, 113)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbBuscarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jtxBuscarUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout PanelPedidosLayout = new javax.swing.GroupLayout(PanelPedidos);
        PanelPedidos.setLayout(PanelPedidosLayout);
        PanelPedidosLayout.setHorizontalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPedidosLayout.createSequentialGroup()
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jlbUsu1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                                        .addComponent(jtxUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 74, Short.MAX_VALUE))
                                    .addComponent(jSeparator5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbContrasena1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxContrasena1)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbnRegistrarUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jbnActualizarUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)))
                        .addGap(27, 27, 27)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jlbStatus1)
                .addGap(18, 18, 18)
                .addComponent(jcmEstatusUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelPedidosLayout.setVerticalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPedidosLayout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelPedidosLayout.createSequentialGroup()
                                .addComponent(jtxContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlbUsu1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbContrasena1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbStatus1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmEstatusUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnActualizarUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnRegistrarUsr1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelContenido.add(PanelPedidos, "card5");

        PanelUsuario.setBackground(new java.awt.Color(255, 255, 255));
        PanelUsuario.setPreferredSize(new java.awt.Dimension(710, 480));

        jSeparator2.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator2.setForeground(new java.awt.Color(204, 204, 204));

        jlbContrasena.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbContrasena.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User Credentials_48px_1.png"))); // NOI18N
        jlbContrasena.setText("Contraseña:");

        jSeparator3.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        jtbUsuario.setModel(modeloUsuario);
        jScrollPane1.setViewportView(jtbUsuario);

        jlbUsu.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/User Group Man Man_48px.png"))); // NOI18N
        jlbUsu.setText("Usuario:");

        jPanel1.setBackground(new java.awt.Color(145, 36, 36));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jlbBuscarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlbBuscarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Search_48px_8.png"))); // NOI18N
        jlbBuscarUsuario.setText("Buscar");
        jlbBuscarUsuario.setToolTipText("");
        jlbBuscarUsuario.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jlbBuscarUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jSeparator4.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator4.setForeground(new java.awt.Color(204, 204, 204));

        jtxBuscarUsuario.setBackground(new java.awt.Color(145, 36, 36));
        jtxBuscarUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxBuscarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxBuscarUsuario.setBorder(null);
        jtxBuscarUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxBuscarUsuarioKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jlbBuscarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(125, 125, 125)
                    .addComponent(jtxBuscarUsuario)
                    .addGap(113, 113, 113)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlbBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jtxBuscarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        jtxUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxUsuario.setBorder(null);

        jtxContrasena.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxContrasena.setBorder(null);

        jlbStatus.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Heart Monitor_48px_3.png"))); // NOI18N
        jlbStatus.setText("Estatus");

        jcmEstatusUsr.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jcmEstatusUsr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una opción", "Activo", "Bloqueado", "Baja" }));

        jbnActualizarUsr.setText("Actualizar");
        jbnActualizarUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnActualizarUsrActionPerformed(evt);
            }
        });

        jbnRegistrarUsr.setText("Registrar");
        jbnRegistrarUsr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnRegistrarUsrActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(jlbUsu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                                        .addComponent(jtxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 74, Short.MAX_VALUE))
                                    .addComponent(jSeparator2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jlbContrasena)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtxContrasena)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jbnRegistrarUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(97, 97, 97)
                                .addComponent(jbnActualizarUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(126, 126, 126)))
                        .addGap(27, 27, 27)))
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jlbStatus)
                .addGap(18, 18, 18)
                .addComponent(jcmEstatusUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                                .addComponent(jtxContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlbUsu, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlbContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jtxUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmEstatusUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbnActualizarUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnRegistrarUsr, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        PanelContenido.add(PanelUsuario, "card6");

        PanelReporte.setBackground(new java.awt.Color(245, 245, 186));

        javax.swing.GroupLayout PanelReporteLayout = new javax.swing.GroupLayout(PanelReporte);
        PanelReporte.setLayout(PanelReporteLayout);
        PanelReporteLayout.setHorizontalGroup(
            PanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        PanelReporteLayout.setVerticalGroup(
            PanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        PanelContenido.add(PanelReporte, "card7");

        PanelVenta.setBackground(new java.awt.Color(204, 204, 204));

        jlbUsuario1.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsuario1.setText("Nombre:");

        jlbUsuario3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsuario3.setText("Folio:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jlbUsuario4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsuario4.setText("Codigo Pizza:");

        javax.swing.GroupLayout PanelVentaLayout = new javax.swing.GroupLayout(PanelVenta);
        PanelVenta.setLayout(PanelVentaLayout);
        PanelVentaLayout.setHorizontalGroup(
            PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentaLayout.createSequentialGroup()
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlbUsuario3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelVentaLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jlbUsuario4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jlbUsuario1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        PanelVentaLayout.setVerticalGroup(
            PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelVentaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsuario3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelVentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbUsuario4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbUsuario1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(358, Short.MAX_VALUE))
        );

        PanelContenido.add(PanelVenta, "card8");

        Panel.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout PanelLayout = new javax.swing.GroupLayout(Panel);
        Panel.setLayout(PanelLayout);
        PanelLayout.setHorizontalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
        );
        PanelLayout.setVerticalGroup(
            PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        PanelContenido.add(Panel, "card2");

        getContentPane().add(PanelContenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 710, 480));

        panelCuenta.setBackground(new java.awt.Color(255, 255, 255));

        iconUsr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Administrator Male_48px.png"))); // NOI18N

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jbnCerrar.setBackground(new java.awt.Color(255, 255, 255));
        jbnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close Window_48px_5.png"))); // NOI18N
        jbnCerrar.setBorderPainted(false);
        jbnCerrar.setContentAreaFilled(false);
        jbnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbnCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close Window_60px.png"))); // NOI18N
        jbnCerrar.setSelected(true);
        jbnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnCerrarMouseClicked(evt);
            }
        });

        jlbUsuario2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsuario2.setText("Usuario:");

        jlbLogin.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N

        javax.swing.GroupLayout panelCuentaLayout = new javax.swing.GroupLayout(panelCuenta);
        panelCuenta.setLayout(panelCuentaLayout);
        panelCuentaLayout.setHorizontalGroup(
            panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentaLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(iconUsr)
                .addGap(72, 72, 72)
                .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jbnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentaLayout.createSequentialGroup()
                    .addContainerGap(550, Short.MAX_VALUE)
                    .addComponent(jlbUsuario2)
                    .addGap(247, 247, 247)))
        );
        panelCuentaLayout.setVerticalGroup(
            panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentaLayout.createSequentialGroup()
                .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelCuentaLayout.createSequentialGroup()
                            .addGap(48, 48, 48)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentaLayout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jbnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(iconUsr)))
                .addGap(21, 21, 21))
            .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuentaLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbUsuario2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(panelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
 public void setLlenado(){
  objUs.consultaTodo(modeloUsuario);
 }
 public void filtroCodigoUsr(){     
     String buscarUsr=jtxBuscarUsuario.getText();
     trsfiltro.setRowFilter(RowFilter.regexFilter(String.valueOf(buscarUsr)));      
 }
    
 
    private void jbnCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jbnCerrarMouseClicked

    private void jbnCatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnCatalogoMouseEntered
        //jbnVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbnCatalogo.setBorder(null);
        jbnCatalogo.setContentAreaFilled(true);
        jbnCatalogo.setBackground(new java.awt.Color(148,0,0));        // TODO add your handling code here:

    }//GEN-LAST:event_jbnCatalogoMouseEntered

    private void jbnCatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnCatalogoMouseExited
     jbnCatalogo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
     jbnCatalogo.setContentAreaFilled(false);
     jbnCatalogo.setBackground(new java.awt.Color(132,36,36));
    }//GEN-LAST:event_jbnCatalogoMouseExited

    private void jbnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnVentaMouseEntered
        jbnVenta.setBorder(null);
        jbnVenta.setContentAreaFilled(true);
        jbnVenta.setBackground(new java.awt.Color(148,0,0));
    }//GEN-LAST:event_jbnVentaMouseEntered

    private void jbnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnVentaMouseExited
        jbnVenta.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnVenta.setContentAreaFilled(false);
        jbnVenta.setBackground(new java.awt.Color(132,36,36));
    
    }//GEN-LAST:event_jbnVentaMouseExited

    private void jbnInventarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnInventarioMouseEntered
        jbnInventario.setBorder(null);
        jbnInventario.setContentAreaFilled(true);
        jbnInventario.setBackground(new java.awt.Color(148,0,0));
    }//GEN-LAST:event_jbnInventarioMouseEntered

    private void jbnInventarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnInventarioMouseExited
        jbnInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnInventario.setContentAreaFilled(false);
        jbnInventario.setBackground(new java.awt.Color(132,36,36));
    }//GEN-LAST:event_jbnInventarioMouseExited

    private void jbnPedidosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnPedidosMouseEntered
        jbnPedidos.setBorder(null);
        jbnPedidos.setContentAreaFilled(true);
        jbnPedidos.setBackground(new java.awt.Color(148,0,0));
    }//GEN-LAST:event_jbnPedidosMouseEntered

    private void jbnPedidosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnPedidosMouseExited
        jbnPedidos.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnPedidos.setContentAreaFilled(false);
        jbnPedidos.setBackground(new java.awt.Color(132,36,36));
    }//GEN-LAST:event_jbnPedidosMouseExited

    private void jbnUsuariosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnUsuariosMouseEntered
        jbnUsuarios.setBorder(null);
        jbnUsuarios.setContentAreaFilled(true);
        jbnUsuarios.setBackground(new java.awt.Color(148,0,0));
    }//GEN-LAST:event_jbnUsuariosMouseEntered

    private void jbnUsuariosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnUsuariosMouseExited
        jbnUsuarios.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnUsuarios.setContentAreaFilled(false);
        jbnUsuarios.setBackground(new java.awt.Color(132,36,36));
    }//GEN-LAST:event_jbnUsuariosMouseExited

    private void jbnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnReportesMouseEntered
        jbnReportes.setBorder(null);
        jbnReportes.setContentAreaFilled(true);
        jbnReportes.setBackground(new java.awt.Color(148,0,0));
    }//GEN-LAST:event_jbnReportesMouseEntered

    private void jbnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbnReportesMouseExited
        jbnReportes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbnReportes.setContentAreaFilled(false);
        jbnReportes.setBackground(new java.awt.Color(132,36,36));
    }//GEN-LAST:event_jbnReportesMouseExited

    private void jbnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnVentaActionPerformed
       PanelContenido.removeAll();
       PanelContenido.add(PanelVenta);
       PanelContenido.repaint();
       PanelContenido.revalidate();
    }//GEN-LAST:event_jbnVentaActionPerformed

    private void jbnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCatalogoActionPerformed
       PanelContenido.removeAll();
       PanelContenido.add(PanelCatalogo);
       PanelContenido.repaint();
       PanelContenido.revalidate();
    }//GEN-LAST:event_jbnCatalogoActionPerformed

    private void jbnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnInventarioActionPerformed
       PanelContenido.removeAll();
       PanelContenido.add(PanelInvetario);
       PanelContenido.repaint();
       PanelContenido.revalidate();
    }//GEN-LAST:event_jbnInventarioActionPerformed

    private void jbnPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnPedidosActionPerformed
       PanelContenido.removeAll();
       PanelContenido.add(PanelPedidos);
       PanelContenido.repaint();
       PanelContenido.revalidate();
                                          
    }//GEN-LAST:event_jbnPedidosActionPerformed

    private void jbnUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnUsuariosActionPerformed
       PanelContenido.removeAll();
       PanelContenido.add(PanelUsuario);
       PanelContenido.repaint();
       PanelContenido.revalidate();
    }//GEN-LAST:event_jbnUsuariosActionPerformed

    private void jbnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnReportesActionPerformed
       PanelContenido.removeAll();
       PanelContenido.add(PanelReporte);
       PanelContenido.repaint();
       PanelContenido.revalidate();
    }//GEN-LAST:event_jbnReportesActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          contadorcito++;
       
         if((contadorcito%2)!=0){
           PanelMenu.setSize(70,540);
            jLabel1.setSize(0,0);
        }
        if((contadorcito%2)==0){
        PanelMenu.setSize(140,540);
        jLabel1.setSize(120,100 );
        
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jbnRegistrarUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarUsrActionPerformed
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        objUs.setUsrNombre(jtxUsuario.getText());
        objUs.setPassword(jtxContrasena.getText());
        objUs.setFechaAlta(dateFormat.format(date));
        objUs.setEstatusUsu((String) jcmEstatusUsr.getSelectedItem());
        objUs.altaUsuario();
        modeloUsuario.setRowCount(0);
        setLlenado();

       
                
    }//GEN-LAST:event_jbnRegistrarUsrActionPerformed

    private void jbnActualizarUsrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnActualizarUsrActionPerformed
        
        
    }//GEN-LAST:event_jbnActualizarUsrActionPerformed

    private void jtxBuscarUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxBuscarUsuarioKeyTyped
    jtxBuscarUsuario.addKeyListener(new KeyAdapter() {
         public void keyTyped(final KeyEvent e){
             repaint();
             filtroCodigoUsr();       
             
    }
         });
        trsfiltro = new TableRowSorter(modeloUsuario);
        jtbUsuario.setRowSorter(trsfiltro);
    }//GEN-LAST:event_jtxBuscarUsuarioKeyTyped

    private void jbnActualizarUsr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnActualizarUsr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnActualizarUsr1ActionPerformed

    private void jbnRegistrarUsr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnRegistrarUsr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbnRegistrarUsr1ActionPerformed

    private void jtxBuscarUsuario1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxBuscarUsuario1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxBuscarUsuario1KeyTyped

    private void jtxBuscarUsuario1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxBuscarUsuario1KeyPressed
              repaint();
             filtroCodigoUsr();       
             
    
         
        trsfiltro = new TableRowSorter(modeloUsuario);
        jtbUsuario.setRowSorter(trsfiltro);        // TODO add your handling code here:
    }//GEN-LAST:event_jtxBuscarUsuario1KeyPressed
    
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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel;
    private javax.swing.JPanel PanelCatalogo;
    private javax.swing.JPanel PanelContenido;
    private javax.swing.JPanel PanelInvetario;
    private javax.swing.JPanel PanelMenu;
    private javax.swing.JPanel PanelPedidos;
    private javax.swing.JPanel PanelReporte;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JPanel PanelVenta;
    private javax.swing.JLabel iconUsr;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbnActualizarUsr;
    private javax.swing.JButton jbnActualizarUsr1;
    private javax.swing.JButton jbnCatalogo;
    private javax.swing.JButton jbnCerrar;
    private javax.swing.JButton jbnInventario;
    private javax.swing.JButton jbnPedidos;
    private javax.swing.JButton jbnRegistrarUsr;
    private javax.swing.JButton jbnRegistrarUsr1;
    private javax.swing.JButton jbnReportes;
    private javax.swing.JButton jbnUsuarios;
    private javax.swing.JButton jbnVenta;
    private javax.swing.JComboBox<String> jcmEstatusUsr;
    private javax.swing.JComboBox<String> jcmEstatusUsr1;
    private javax.swing.JLabel jlbBuscarPedido;
    private javax.swing.JLabel jlbBuscarUsuario;
    private javax.swing.JLabel jlbContrasena;
    private javax.swing.JLabel jlbContrasena1;
    public javax.swing.JLabel jlbLogin;
    private javax.swing.JLabel jlbStatus;
    private javax.swing.JLabel jlbStatus1;
    private javax.swing.JLabel jlbUsu;
    private javax.swing.JLabel jlbUsu1;
    private javax.swing.JLabel jlbUsuario1;
    private javax.swing.JLabel jlbUsuario2;
    private javax.swing.JLabel jlbUsuario3;
    private javax.swing.JLabel jlbUsuario4;
    private javax.swing.JTable jtbUsuario;
    private javax.swing.JTable jtbUsuario1;
    private javax.swing.JTextField jtxBuscarUsuario;
    private javax.swing.JTextField jtxBuscarUsuario1;
    private javax.swing.JTextField jtxContrasena;
    private javax.swing.JTextField jtxContrasena1;
    private javax.swing.JTextField jtxUsuario;
    private javax.swing.JTextField jtxUsuario1;
    private javax.swing.JPanel panelCuenta;
    // End of variables declaration//GEN-END:variables
}
