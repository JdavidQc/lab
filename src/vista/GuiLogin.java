/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import funcionalidad.AccesoLogin;
import Joption.Joption;
import Joption.Joptionx;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import vista.GuiPrincipal;
import utilidad.PhpMysqlConnection;
import java.sql.Connection;
import modelo.Usuario;

/**
 *
 * @author E5450
 */
public class GuiLogin extends javax.swing.JFrame {
   Joption icon = new Joption();
   Joptionx save = new Joptionx();
   Connection con=PhpMysqlConnection.getConnection();

    /**
     * Creates new form Login
     */
    public GuiLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Accesso de Usuarios");
        setIconImage(new ImageIcon(getClass().getResource("")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("../img/fondos.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }
    
     void cancelar(){
         pass.setText("");
        
    }
     
  
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        ETI_USU = new javax.swing.JLabel();
        ETI_PASS = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        admin = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        txtMatricula = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        reg = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenu2.setText("File");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/user.png"))); // NOI18N
        jLabel1.setText(" ");

        ETI_USU.setBackground(new java.awt.Color(204, 204, 204));
        ETI_USU.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ETI_USU.setForeground(new java.awt.Color(204, 204, 204));
        ETI_USU.setText("USUARIO");

        ETI_PASS.setBackground(new java.awt.Color(204, 204, 204));
        ETI_PASS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ETI_PASS.setForeground(new java.awt.Color(204, 204, 204));
        ETI_PASS.setText("CONTRASEÑA");

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        admin.setText("INGRESAR");
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        cancelar.setText("CANCELAR");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jMenu1.setText("ADMINISTRAR");

        reg.setText("USUARIO NUEVO");
        reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regActionPerformed(evt);
            }
        });
        jMenu1.add(reg);

        jMenuItem2.setText("SALIR");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ETI_USU, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ETI_PASS, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pass, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                            .addComponent(txtMatricula)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ETI_USU)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ETI_PASS)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(admin)
                    .addComponent(cancelar))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         this.dispose();
      JOptionPane.showMessageDialog(null,"Sistema Finalizado","ADIOS",JOptionPane.INFORMATION_MESSAGE,
              icon.getIcon("../img/done.png", 50, 50));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regActionPerformed
        GuiRegistroUsuario re= new GuiRegistroUsuario();
        re.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
         cancelar();
    }//GEN-LAST:event_cancelarActionPerformed
   public static String matricula,password;
    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
         if(txtMatricula.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Seleccione Un Tipo de Accesso!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
            if(String.valueOf(pass.getPassword()).equals("")){
             JOptionPane.showMessageDialog(null,"Sin Contraseña!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
          AccesoLogin ca=new AccesoLogin();
        Usuario use=  ca.Acceso(txtMatricula.getText(),String.valueOf(pass.getPassword()));
        if(use != null){    this.dispose();
            GuiPrincipal as = new GuiPrincipal();
                if (use.getRol().getNombreRol().equals("ADMINISTRADOR")) {
                    JOptionPane.showMessageDialog(null, "Bienvenido Administrador:" + use.getNombre());
                   as.jButton2.setEnabled(false);  
                } else {
                    JOptionPane.showMessageDialog(null, "Bienvenido Alumno: " + use.getNombre());
              
                    as.jButton1.setEnabled(false);
                    as.jButton3.setEnabled(false);
                }
               this.matricula= use.getMatricula();this.password=use.getPassword();
                as.setLocationRelativeTo(null);
                as.usuario.setText(use.getNombre().toUpperCase()+"--"+ use.getRol().getNombreRol());
                as.setVisible(true);  
        }else {
                JOptionPane.showMessageDialog(null, "Usuario NO AUTORIZADO!", "ERROR", JOptionPane.ERROR_MESSAGE, save);

            }
         
      
    }//GEN-LAST:event_adminActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuiLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuiLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ETI_PASS;
    private javax.swing.JLabel ETI_USU;
    private javax.swing.JButton admin;
    private javax.swing.JButton cancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem2;
    public static javax.swing.JPasswordField pass;
    private javax.swing.JMenuItem reg;
    private javax.swing.JTextField txtMatricula;
    // End of variables declaration//GEN-END:variables
}
