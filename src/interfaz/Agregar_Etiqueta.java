/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author SP
 */
public class Agregar_Etiqueta extends javax.swing.JDialog {

    /**
     * Creates new form Agregar_Etiqueta
     */
    public Agregar_Etiqueta(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmdGuardar = new javax.swing.JButton();
        cmdLimpiarDatos = new javax.swing.JButton();
        cmdSalir = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agregar Etiqueta");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Numero de fotos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtNumero.setOpaque(false);
        txtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroKeyTyped(evt);
            }
        });
        jPanel2.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 120, -1));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 84, -1, -1));

        txtNombre.setOpaque(false);
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 109, 120, -1));

        jLabel3.setText("Usuario");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 159, -1, -1));

        txtUsuario.setOpaque(false);
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel2.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 184, 120, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 220));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Galeria De Botones"));
        jPanel3.setOpaque(false);
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmdGuardar.setText("Guardar");
        cmdGuardar.setOpaque(false);
        cmdGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(cmdGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 27, 140, -1));

        cmdLimpiarDatos.setText("Limpiar Datos");
        cmdLimpiarDatos.setOpaque(false);
        cmdLimpiarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarDatosActionPerformed(evt);
            }
        });
        jPanel3.add(cmdLimpiarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 68, 140, -1));

        cmdSalir.setText("Salir");
        cmdSalir.setOpaque(false);
        cmdSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSalirActionPerformed(evt);
            }
        });
        jPanel3.add(cmdSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 109, 140, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, 150));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/red-bull-racing-wallpaper.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cmdGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdGuardarActionPerformed
   
        
        if (txtNumero.getText().trim().isEmpty()) {            
            JOptionPane.showMessageDialog(this, "Ingrese numero de fotos");            
            txtNumero.requestFocusInWindow();            
        } else if (txtNombre.getText().trim().isEmpty()) {            
            JOptionPane.showMessageDialog(this, "Ingrese nombre del cliente");            
            txtNombre.requestFocusInWindow();
        } else if (txtUsuario.getText().trim().isEmpty()) {            
            JOptionPane.showMessageDialog(this, "Ingrese usuario del cliente");            
            txtUsuario.requestFocusInWindow();
        } else {
            
            String numfotos;
            String nombre;
            String usuario;
            
            numfotos = txtNumero.getText();
            nombre = txtNombre.getText();
            usuario = txtUsuario.getText();
            
            JOptionPane.showMessageDialog(rootPane, "El numero de fotos registradas en el sistema son de: " + numfotos + " fotos ");
            JOptionPane.showMessageDialog(rootPane, "El nombre del cliente registrado es : " + nombre);
            JOptionPane.showMessageDialog(rootPane, "El usuario registrado en el sistema es: " + usuario);            
        }        
     
       
       
        
    }//GEN-LAST:event_cmdGuardarActionPerformed

    private void cmdLimpiarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarDatosActionPerformed
        
        txtNumero.setText("");
        txtNombre.setText("");
        txtUsuario.setText("");
    }//GEN-LAST:event_cmdLimpiarDatosActionPerformed

    private void cmdSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSalirActionPerformed
        
        if (JOptionPane.showConfirmDialog(rootPane, "¿Desea realmente salir del sistema?", "Salir del sistema", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_cmdSalirActionPerformed

    private void txtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroKeyTyped
        
        char c = evt.getKeyChar();
        if (Character.isSpace(c)) {
            getToolkit();
            evt.consume();
        }
    }//GEN-LAST:event_txtNumeroKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        
        char c = evt.getKeyChar();
        if (Character.isDigit(c)) {
            getToolkit();
            evt.consume();            
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        
        char c = evt.getKeyChar();
        if (Character.isSpace(c)) {
            getToolkit();
            evt.consume();            
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped
     
   
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
            java.util.logging.Logger.getLogger(Agregar_Etiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar_Etiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar_Etiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar_Etiqueta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Agregar_Etiqueta dialog = new Agregar_Etiqueta(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdGuardar;
    private javax.swing.JButton cmdLimpiarDatos;
    private javax.swing.JButton cmdSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
