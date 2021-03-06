/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControladorVistaAdministrador;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.Venta;

/**
 *
 * @author Pixels
 */
public class PanelAdminDineroGastado extends javax.swing.JPanel {
    ControladorVistaAdministrador controlador;

    /**
     * Creates new form panelTransacciones
     */
    public PanelAdminDineroGastado() {
        initComponents();
        controlador = new ControladorVistaAdministrador();
        restaurarPanel();
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
        jLabel1 = new javax.swing.JLabel();
        lblDinero = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableDinero = new javax.swing.JTable();
        btnInfo = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        btnFiltro = new javax.swing.JButton();
        btnRemoverFiltro = new javax.swing.JButton();
        txtInfo = new javax.swing.JTextField();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Dinero total gastado: $");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblDinero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDinero.setText("0");
        jPanel1.add(lblDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 120, -1));

        tableDinero.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id compra", "Nombre", "Comprador", "Dinero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDinero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDineroMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableDinero);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 470, 140));

        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 60, -1));

        txtFiltro.setText("Usuario...");
        txtFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMouseClicked(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 130, -1));

        btnFiltro.setText("Filtrar");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 80, -1));

        btnRemoverFiltro.setText("Remover filtro");
        btnRemoverFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoverFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, 100, -1));

        txtInfo.setText("Id compra o usuario...");
        txtInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtInfoMouseClicked(evt);
            }
        });
        jPanel1.add(txtInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableDineroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDineroMouseClicked
        // TODO add your handling code here:
        int fila = tableDinero.rowAtPoint(evt.getPoint());
        String idCompra = tableDinero.getValueAt(fila, 0).toString();
        String user = tableDinero.getValueAt(fila, 2).toString();
        txtInfo.setText(idCompra);
        txtFiltro.setText(user);
    }//GEN-LAST:event_tableDineroMouseClicked

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        if (validNums(txtInfo.getText())) {
            Venta aux = controlador.buscarVenta(txtInfo.getText());
            if (aux != null) {
                JOptionPane.showMessageDialog(this, "Gasto total: " + aux.getPrecioTotal() + "\nPrecio por unidad: " + aux.getProducto().getPrecio()
                        + "\nUnidades compradas: " + aux.getProducto().getCantidad() + "\n\nVendedor: " + aux.getVendedor().getUser()
                        + "\nComprador: " + aux.getComprador().getUser() + "\nFecha: " + aux.getFechaVenta());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontr?? la compra por el id ingresado");
            }
        } else {
            Usuario aux = controlador.buscar(txtInfo.getText());
            if(aux != null){
                double dinero = controlador.dineroTotalGastadoUsuario(aux.getUser());
                int compras = controlador.obtenerComprasUsuario(aux.getUser());
                JOptionPane.showMessageDialog(this, "El usuario: "+aux.getUser() + "\nHa gastado en la aplicaci??n un total de: $" + dinero +
                        "\nHa hecho un total de: " + compras + " compras.");
            }else{
                JOptionPane.showMessageDialog(this, "Usuario o id no encontrada");
            }
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        // TODO add your handling code here:
        String user = txtFiltro.getText();
        Usuario aux = controlador.buscar(user);
        if(aux != null){
            filtrarTabla(aux.getUser());
            lblDinero.setText(Double.toString(controlador.dineroTotalGastadoUsuario(aux.getUser())));
            btnFiltro.setVisible(false);
            txtFiltro.setEnabled(false);
            btnRemoverFiltro.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(this, "No se encontr?? el usuario");
        }
    }//GEN-LAST:event_btnFiltroActionPerformed

    private void btnRemoverFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverFiltroActionPerformed
        // TODO add your handling code here:
        restaurarPanel();
        txtFiltro.setText("Usuario...");
        txtInfo.setText("Id compra o usuario...");
    }//GEN-LAST:event_btnRemoverFiltroActionPerformed

    private void txtFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseClicked
        // TODO add your handling code here:
        txtFiltro.setText("");
    }//GEN-LAST:event_txtFiltroMouseClicked

    private void txtInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtInfoMouseClicked
        // TODO add your handling code here:
        txtInfo.setText("");
    }//GEN-LAST:event_txtInfoMouseClicked

    private void crearTabla(String mtrx[][]){
        tableDinero.setModel(new javax.swing.table.DefaultTableModel(
            mtrx,
            new String [] {
                "Id compra", "Nombre", "Comprador", "Dinero"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
    }
    public void mostrarTabla(){
        crearTabla(controlador.construirMatrisDineroTotalGastado());
    }
    private boolean validNums(String datos){
        return datos.matches("[0-9]*");
    }
    private void filtrarTabla(String user){
        crearTabla(controlador.filtrarMatrisDineroGastadoUsuario(user));
    }
    private void restaurarPanel(){
        lblDinero.setText(Double.toString(controlador.dineroTotalGastado()));
        btnRemoverFiltro.setVisible(false);
        btnFiltro.setVisible(true);
        txtFiltro.setEnabled(true);
        mostrarTabla();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnRemoverFiltro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDinero;
    private javax.swing.JTable tableDinero;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtInfo;
    // End of variables declaration//GEN-END:variables
}
