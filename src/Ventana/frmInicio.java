
package Ventana;

import Modelo.Usuarios;
import javax.swing.JOptionPane;
public class frmInicio extends javax.swing.JFrame {
    public frmInicio() {
        initComponents();
    }
  //Objetos
  Usuarios objUsu= new Usuarios();
  private frmMenu menu;
  int validar=0;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel1 = new javax.swing.JPanel();
        jlbUsuario = new javax.swing.JLabel();
        jlbInicioSesion = new javax.swing.JLabel();
        jlbPAssword = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jtxUsuario = new javax.swing.JTextField();
        jpsContrasena = new javax.swing.JPasswordField();
        jbnAceptar = new javax.swing.JButton();
        iconPassword = new javax.swing.JLabel();
        iconUsu = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jpanel1.setBackground(new java.awt.Color(145, 36, 36));
        jpanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jpanel1.setForeground(new java.awt.Color(255, 255, 255));
        jpanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbUsuario.setBackground(new java.awt.Color(255, 255, 255));
        jlbUsuario.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jlbUsuario.setText("Usuario:");
        jpanel1.add(jlbUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 80, -1));

        jlbInicioSesion.setBackground(new java.awt.Color(0, 0, 0));
        jlbInicioSesion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        jlbInicioSesion.setText("                 Inicio de Sesión");
        jpanel1.add(jlbInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jlbPAssword.setBackground(new java.awt.Color(255, 255, 255));
        jlbPAssword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jlbPAssword.setForeground(new java.awt.Color(255, 255, 255));
        jlbPAssword.setText("  Contraseña:");
        jpanel1.add(jlbPAssword, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, -1));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        jpanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 260, 30));

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jpanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 10));

        jtxUsuario.setBackground(new java.awt.Color(142, 36, 36));
        jtxUsuario.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jtxUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtxUsuario.setText("Ingresa tu usuario");
        jtxUsuario.setBorder(null);
        jtxUsuario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtxUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxUsuarioMouseClicked(evt);
            }
        });
        jpanel1.add(jtxUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 30));

        jpsContrasena.setBackground(new java.awt.Color(142, 36, 36));
        jpsContrasena.setForeground(new java.awt.Color(255, 255, 255));
        jpsContrasena.setText("contrasena");
        jpsContrasena.setToolTipText("");
        jpsContrasena.setBorder(null);
        jpsContrasena.setDisabledTextColor(new java.awt.Color(142, 36, 36));
        jpsContrasena.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jpsContrasenaFocusGained(evt);
            }
        });
        jpsContrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jpsContrasenaMouseClicked(evt);
            }
        });
        jpsContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpsContrasenaActionPerformed(evt);
            }
        });
        jpanel1.add(jpsContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 260, 30));

        jbnAceptar.setBackground(new java.awt.Color(255, 255, 255));
        jbnAceptar.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jbnAceptar.setText("Aceptar");
        jbnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnAceptarActionPerformed(evt);
            }
        });
        jpanel1.add(jbnAceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 100, 50));

        iconPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Forgot Password_48px.png"))); // NOI18N
        jpanel1.add(iconPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, -1, -1));

        iconUsu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/Administrator Male_48px.png"))); // NOI18N
        jpanel1.add(iconUsu, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, 60));

        getContentPane().add(jpanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 330, 510));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo15.png"))); // NOI18N
        jPanel2.add(jlbLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 310, 270));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jpsContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpsContrasenaActionPerformed

    }//GEN-LAST:event_jpsContrasenaActionPerformed

    private void jtxUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxUsuarioMouseClicked
        jtxUsuario.setText("");
    }//GEN-LAST:event_jtxUsuarioMouseClicked

    private void jpsContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpsContrasenaMouseClicked
         jpsContrasena.setText("");
    }//GEN-LAST:event_jpsContrasenaMouseClicked

    private void jpsContrasenaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jpsContrasenaFocusGained
        jpsContrasena.setText("");
    }//GEN-LAST:event_jpsContrasenaFocusGained

    private void jbnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnAceptarActionPerformed
    
        objUsu.setUsrNombre(jtxUsuario.getText());
        objUsu.setPassword(jpsContrasena.getText());
        validar=objUsu.validarUsuario();
        menu = new frmMenu();
        
        if(validar==1){
        this.setVisible(false);
        menu.setVisible(true);
      
        }
        if(validar==2){
        JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
        
        }
                  
    }//GEN-LAST:event_jbnAceptarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel iconPassword;
    private javax.swing.JLabel iconUsu;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton jbnAceptar;
    private javax.swing.JLabel jlbInicioSesion;
    private javax.swing.JLabel jlbLogo;
    private javax.swing.JLabel jlbPAssword;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JPanel jpanel1;
    private javax.swing.JPasswordField jpsContrasena;
    private javax.swing.JTextField jtxUsuario;
    // End of variables declaration//GEN-END:variables
}
