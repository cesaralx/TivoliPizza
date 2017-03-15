package Ventana;

import java.awt.Color;
import java.awt.PageAttributes;
import java.awt.color.ColorSpace;
import javax.swing.JColorChooser;
import Modelo.Usuarios;

 public class frmMenu extends javax.swing.JFrame {
     Usuarios objUs = new Usuarios();
     int contadorcito=0;
     
    public frmMenu() {
        initComponents();
        
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSlider1 = new javax.swing.JSlider();
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
        jButton1 = new javax.swing.JButton();
        PanelInvetario = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        PanelPedidos = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        PanelUSuario = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        PanelReporte = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
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
        jtxUs = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

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
        jbnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jbnVenta.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jbnInventario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jbnPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jbnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jbnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jButton1.setText("Catalogo");

        javax.swing.GroupLayout PanelCatalogoLayout = new javax.swing.GroupLayout(PanelCatalogo);
        PanelCatalogo.setLayout(PanelCatalogoLayout);
        PanelCatalogoLayout.setHorizontalGroup(
            PanelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalogoLayout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(163, Short.MAX_VALUE))
        );
        PanelCatalogoLayout.setVerticalGroup(
            PanelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCatalogoLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(142, Short.MAX_VALUE))
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

        jButton3.setBackground(new java.awt.Color(255, 0, 0));
        jButton3.setText("Peidos");

        javax.swing.GroupLayout PanelPedidosLayout = new javax.swing.GroupLayout(PanelPedidos);
        PanelPedidos.setLayout(PanelPedidosLayout);
        PanelPedidosLayout.setHorizontalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelPedidosLayout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        PanelPedidosLayout.setVerticalGroup(
            PanelPedidosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPedidosLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(206, Short.MAX_VALUE))
        );

        PanelContenido.add(PanelPedidos, "card5");

        jButton5.setText("Usuarios");

        javax.swing.GroupLayout PanelUSuarioLayout = new javax.swing.GroupLayout(PanelUSuario);
        PanelUSuario.setLayout(PanelUSuarioLayout);
        PanelUSuarioLayout.setHorizontalGroup(
            PanelUSuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUSuarioLayout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(297, Short.MAX_VALUE))
        );
        PanelUSuarioLayout.setVerticalGroup(
            PanelUSuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUSuarioLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        PanelContenido.add(PanelUSuario, "card6");

        jButton6.setText("Reportes");

        javax.swing.GroupLayout PanelReporteLayout = new javax.swing.GroupLayout(PanelReporte);
        PanelReporte.setLayout(PanelReporteLayout);
        PanelReporteLayout.setHorizontalGroup(
            PanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReporteLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(557, Short.MAX_VALUE))
        );
        PanelReporteLayout.setVerticalGroup(
            PanelReporteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelReporteLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(389, Short.MAX_VALUE))
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
        jbnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbnCerrar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Close Window_60px.png"))); // NOI18N
        jbnCerrar.setSelected(true);
        jbnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbnCerrarMouseClicked(evt);
            }
        });

        jlbUsuario2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jlbUsuario2.setText("Usuario:");

        javax.swing.GroupLayout panelCuentaLayout = new javax.swing.GroupLayout(panelCuenta);
        panelCuenta.setLayout(panelCuentaLayout);
        panelCuentaLayout.setHorizontalGroup(
            panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuentaLayout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(iconUsr)
                .addGap(72, 72, 72)
                .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(jtxUs))
                .addGap(25, 25, 25)
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
                    .addComponent(iconUsr)
                    .addGroup(panelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(panelCuentaLayout.createSequentialGroup()
                            .addComponent(jtxUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jbnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
       PanelContenido.add(PanelUSuario);
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
    private javax.swing.JPanel PanelUSuario;
    private javax.swing.JPanel PanelVenta;
    private javax.swing.JLabel iconUsr;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JButton jbnCatalogo;
    private javax.swing.JButton jbnCerrar;
    private javax.swing.JButton jbnInventario;
    private javax.swing.JButton jbnPedidos;
    private javax.swing.JButton jbnReportes;
    private javax.swing.JButton jbnUsuarios;
    private javax.swing.JButton jbnVenta;
    private javax.swing.JLabel jlbUsuario1;
    private javax.swing.JLabel jlbUsuario2;
    private javax.swing.JLabel jlbUsuario3;
    private javax.swing.JLabel jlbUsuario4;
    private javax.swing.JTextField jtxUs;
    private javax.swing.JPanel panelCuenta;
    // End of variables declaration//GEN-END:variables
}
