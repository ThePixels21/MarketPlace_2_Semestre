/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;
import paneles.PanelAdminVentas;
import paneles.PanelAdminUsuarios;
import paneles.PanelAdminModificarCuenta;
import paneles.PanelAdminProductos;
import paneles.PanelAdminDineroGastado;
import javax.swing.JPanel;
import modelo.Usuario;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import paneles.PanelAdminCategorias;
import paneles.PanelAdminDineroGenerado;
import paneles.PanelAdminRegistroPublicaciones;

/**
 *
 * @author Pixels
 */
public class vistaAdministrador extends javax.swing.JFrame {
    Usuario admin;

    /**
     * Creates new form vistaAdministrador
     * @param admin
     */
    public vistaAdministrador(Usuario admin) {
        initComponents();
        this.setLocationRelativeTo(null);
        PanelAdminUsuarios pUsuarios = new PanelAdminUsuarios();
        this.admin = admin;
        mostrarPanel(pUsuarios);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelContent = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnUsuarios = new javax.swing.JMenu();
        btnVentas = new javax.swing.JMenu();
        btnProductos = new javax.swing.JMenuItem();
        btnVendidos = new javax.swing.JMenuItem();
        btnRegistroPublicaciones = new javax.swing.JMenuItem();
        btnTransacciones = new javax.swing.JMenu();
        btnDineroGenerado = new javax.swing.JMenuItem();
        btnDineroGastado = new javax.swing.JMenuItem();
        btnCategorias = new javax.swing.JMenu();
        btnAdministrador = new javax.swing.JMenu();
        btnGestionar = new javax.swing.JMenuItem();
        btnAccederUsuario = new javax.swing.JMenuItem();
        btnCerrarSesion = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panelContent.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUsuarios.setText("Usuarios");
        btnUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUsuariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnUsuarios);

        btnVentas.setText("Ventas");

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        btnVentas.add(btnProductos);

        btnVendidos.setText("Vendido");
        btnVendidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendidosActionPerformed(evt);
            }
        });
        btnVentas.add(btnVendidos);

        btnRegistroPublicaciones.setText("Registro publicaciones");
        btnRegistroPublicaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroPublicacionesActionPerformed(evt);
            }
        });
        btnVentas.add(btnRegistroPublicaciones);

        jMenuBar1.add(btnVentas);

        btnTransacciones.setText("Transacciones");

        btnDineroGenerado.setText("Dinero generado");
        btnDineroGenerado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDineroGeneradoActionPerformed(evt);
            }
        });
        btnTransacciones.add(btnDineroGenerado);

        btnDineroGastado.setText("Dinero gastado");
        btnDineroGastado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDineroGastadoActionPerformed(evt);
            }
        });
        btnTransacciones.add(btnDineroGastado);

        jMenuBar1.add(btnTransacciones);

        btnCategorias.setText("Categorías");
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnCategorias);

        btnAdministrador.setText("Cuenta administrador");

        btnGestionar.setText("Gestionar");
        btnGestionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGestionarActionPerformed(evt);
            }
        });
        btnAdministrador.add(btnGestionar);

        btnAccederUsuario.setText("Acceder como Usuario");
        btnAccederUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederUsuarioActionPerformed(evt);
            }
        });
        btnAdministrador.add(btnAccederUsuario);

        btnCerrarSesion.setText("Cerrar sesión");
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });
        btnAdministrador.add(btnCerrarSesion);

        jMenuBar1.add(btnAdministrador);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelContent, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelContent, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUsuariosMouseClicked
        // TODO add your handling code here:
        PanelAdminUsuarios pUsuarios = new PanelAdminUsuarios();
        mostrarPanel(pUsuarios);
    }//GEN-LAST:event_btnUsuariosMouseClicked

    private void btnGestionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGestionarActionPerformed
        // TODO add your handling code here:
        PanelAdminModificarCuenta pGestionar = new PanelAdminModificarCuenta(admin);
        mostrarPanel(pGestionar);
    }//GEN-LAST:event_btnGestionarActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        // TODO add your handling code here:
        new vistaLogin().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        // TODO add your handling code here:
        PanelAdminProductos pEnVenta = new PanelAdminProductos();
        mostrarPanel(pEnVenta);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnVendidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendidosActionPerformed
        // TODO add your handling code here:
        PanelAdminVentas pVentas = new PanelAdminVentas();
        mostrarPanel(pVentas);
    }//GEN-LAST:event_btnVendidosActionPerformed

    private void btnAccederUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederUsuarioActionPerformed
        // TODO add your handling code here:
        int i = JOptionPane.showConfirmDialog(this, "¿Está seguro de acceder como un usuario?");
        if(i == 0){
            new vistaUsuario(admin).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnAccederUsuarioActionPerformed

    private void btnRegistroPublicacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroPublicacionesActionPerformed
        // TODO add your handling code here:
        PanelAdminRegistroPublicaciones pRegistro = new PanelAdminRegistroPublicaciones();
        mostrarPanel(pRegistro);
    }//GEN-LAST:event_btnRegistroPublicacionesActionPerformed

    private void btnCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseClicked
        // TODO add your handling code here:
        PanelAdminCategorias pCategorias = new PanelAdminCategorias();
        mostrarPanel(pCategorias);
    }//GEN-LAST:event_btnCategoriasMouseClicked

    private void btnDineroGeneradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDineroGeneradoActionPerformed
        // TODO add your handling code here:
        PanelAdminDineroGenerado pDineroGenerado = new PanelAdminDineroGenerado();
        mostrarPanel(pDineroGenerado);
    }//GEN-LAST:event_btnDineroGeneradoActionPerformed

    private void btnDineroGastadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDineroGastadoActionPerformed
        // TODO add your handling code here:
        PanelAdminDineroGastado pDineroGastado = new PanelAdminDineroGastado();
        mostrarPanel(pDineroGastado);
    }//GEN-LAST:event_btnDineroGastadoActionPerformed

    private void mostrarPanel(JPanel p){
        p.setSize(635,194);
        
        panelContent.removeAll();
        panelContent.add(p, new AbsoluteConstraints(0,0,-1,-1));
        panelContent.revalidate();
        panelContent.repaint();
    }
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
            java.util.logging.Logger.getLogger(vistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaAdministrador(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnAccederUsuario;
    private javax.swing.JMenu btnAdministrador;
    private javax.swing.JMenu btnCategorias;
    private javax.swing.JMenuItem btnCerrarSesion;
    private javax.swing.JMenuItem btnDineroGastado;
    private javax.swing.JMenuItem btnDineroGenerado;
    private javax.swing.JMenuItem btnGestionar;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenuItem btnRegistroPublicaciones;
    private javax.swing.JMenu btnTransacciones;
    private javax.swing.JMenu btnUsuarios;
    private javax.swing.JMenuItem btnVendidos;
    private javax.swing.JMenu btnVentas;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel panelContent;
    // End of variables declaration//GEN-END:variables
}