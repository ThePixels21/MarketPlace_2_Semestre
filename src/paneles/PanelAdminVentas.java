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
public class PanelAdminVentas extends javax.swing.JPanel {
    ControladorVistaAdministrador controlador;

    /**
     * Creates new form panelVentas
     */
    public PanelAdminVentas() {
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
        lblTitulo = new javax.swing.JLabel();
        lblVentasTotales = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableProductos = new javax.swing.JTable();
        txtId = new javax.swing.JTextField();
        btnInfo = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        btnFiltro = new javax.swing.JButton();
        btnRemoverFiltro = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblTitulo.setText("Ventas totales:");
        jPanel1.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblVentasTotales.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblVentasTotales.setText("0");
        jPanel1.add(lblVentasTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, -1));

        tableProductos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Venta", "Nombre", "Precio total", "Cantidad", "Vendedor", "Comprador", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableProductos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 480, 130));

        txtId.setText("Id venta o compra...");
        txtId.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIdMouseClicked(evt);
            }
        });
        jPanel1.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, 120, -1));

        btnInfo.setText("Info");
        btnInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInfoActionPerformed(evt);
            }
        });
        jPanel1.add(btnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, 70, -1));

        txtFiltro.setText("Vendedor...");
        txtFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMouseClicked(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 40, 120, -1));

        btnFiltro.setText("Filtrar");
        btnFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(btnFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, 70, -1));

        btnRemoverFiltro.setText("Remover filtro");
        btnRemoverFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverFiltroActionPerformed(evt);
            }
        });
        jPanel1.add(btnRemoverFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableProductosMouseClicked
        // TODO add your handling code here:
        int seleccionar = tableProductos.rowAtPoint(evt.getPoint());
        String idVenta = tableProductos.getValueAt(seleccionar, 0).toString();
        String user = tableProductos.getValueAt(seleccionar, 4).toString();
        txtId.setText(idVenta);
        txtFiltro.setText(user);
    }//GEN-LAST:event_tableProductosMouseClicked

    private void btnInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInfoActionPerformed
        // TODO add your handling code here:
        String idVenta = txtId.getText();
        Venta aux = controlador.buscarVenta(idVenta);
        if(aux!=null){
            JOptionPane.showMessageDialog(this, "Id Venta: "+aux.getId() + "\nNombre: "+aux.getProducto().getNombre()+
                    "\nDescripci??n: "+aux.getProducto().getDesc() + "\nCategor??a: " + aux.getProducto().getCategoria().getNombre() +
                    "\nPrecio por unidad: $"+aux.getProducto().getPrecio()+ "\nUnidades compradas: " + aux.getProducto().getCantidad() + 
                    "\nTotal pagado: $"+aux.getPrecioTotal() + "\nFecha: "+aux.getFechaVenta()+
                    "\n\nVendedor: "+aux.getVendedor().getNombre()+ "\nDocumento: "+aux.getVendedor().getDni() + 
                    "\n\nComprador: "+aux.getComprador().getNombre()+"\nDocumento: "+aux.getComprador().getDni());
        }else{
            JOptionPane.showMessageDialog(this, "Id de venta no encontrado");
        }
    }//GEN-LAST:event_btnInfoActionPerformed

    private void txtFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseClicked
        // TODO add your handling code here:
        txtFiltro.setText("");
    }//GEN-LAST:event_txtFiltroMouseClicked

    private void txtIdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIdMouseClicked
        // TODO add your handling code here:
        txtId.setText("");
    }//GEN-LAST:event_txtIdMouseClicked

    private void btnFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltroActionPerformed
        // TODO add your handling code here:
        String user = txtFiltro.getText();
        Usuario aux = controlador.buscar(user);
        if(aux != null){
            filtrarTabla(aux);
            lblTitulo.setText("Ventas usuario:");
            lblVentasTotales.setText(Integer.toString(controlador.obtenerVentasUsuario(aux.getUser())));
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
        txtFiltro.setText("Vendedor...");
        txtId.setText("Id venta o compra...");
    }//GEN-LAST:event_btnRemoverFiltroActionPerformed

    private void crearTabla(String mtrx[][]){
        tableProductos.setModel(new javax.swing.table.DefaultTableModel(
            mtrx,
            new String [] {
                "Id Venta", "Nombre", "Precio total", "Cantidad", "Vendedor", "Comprador", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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
    private void mostrarTabla(){
        crearTabla(controlador.construirMatrisVentasTotales());
    }
    private void filtrarTabla(Usuario u){
        crearTabla(controlador.matrisVentasUsuario(u));
    }
    private void restaurarPanel(){
        lblTitulo.setText("Ventas totales:");
        lblVentasTotales.setText(Integer.toString(controlador.obtenerVentasTotales()));
        btnRemoverFiltro.setVisible(false);
        btnFiltro.setVisible(true);
        txtFiltro.setEnabled(true);
        mostrarTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFiltro;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnRemoverFiltro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVentasTotales;
    private javax.swing.JTable tableProductos;
    private javax.swing.JTextField txtFiltro;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
