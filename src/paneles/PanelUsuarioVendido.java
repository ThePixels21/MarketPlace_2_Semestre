/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControladorVistaUsuarioVenta;
import javax.swing.JOptionPane;
import modelo.Usuario;
import modelo.Venta;

/**
 *
 * @author Pixels
 */
public class PanelUsuarioVendido extends javax.swing.JPanel {
    ControladorVistaUsuarioVenta controlador;
    Usuario usuario;

    /**
     * Creates new form panelUsuarioVendido
     * @param usuario
     */
    public PanelUsuarioVendido(Usuario usuario) {
        initComponents();
        controlador = new ControladorVistaUsuarioVenta();
        this.usuario = usuario;
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
        lblResumenVentas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableVentas = new javax.swing.JTable();
        btnDetalles = new javax.swing.JButton();
        txtFiltro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lblDinero = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(700, 310));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 310));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Total ventas:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lblResumenVentas.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblResumenVentas.setText("0");
        jPanel1.add(lblResumenVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 50, -1));

        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id venta", "Comprador", "Producto", "Pago total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableVentasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableVentas);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 520, 250));

        btnDetalles.setText("Ver detalles");
        btnDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetallesActionPerformed(evt);
            }
        });
        jPanel1.add(btnDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 150, 120, 30));

        txtFiltro.setText("Id venta...");
        txtFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFiltroMouseClicked(evt);
            }
        });
        jPanel1.add(txtFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, 100, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Dinero generado: $");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, -1, -1));

        lblDinero.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblDinero.setText("0");
        jPanel1.add(lblDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 140, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFiltroMouseClicked
        // TODO add your handling code here:
        txtFiltro.setText("");
    }//GEN-LAST:event_txtFiltroMouseClicked

    private void btnDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetallesActionPerformed
        // TODO add your handling code here:
        Venta aux = controlador.buscarVenta(txtFiltro.getText());
        if(aux!=null && aux.getVendedor().getUser().equals(usuario.getUser())){
            JOptionPane.showMessageDialog(this, "Producto:\n\nNombre: "+aux.getProducto().getNombre()+"\nDescripci??n: "+
                    aux.getProducto().getDesc() + "\nCategor??a: "+aux.getProducto().getCategoria().getNombre()+"\nCantidad: "+
                    aux.getProducto().getCantidad() + "\nPrecio individual: $"+aux.getProducto().getPrecio()+"\n\nComprador: \n\n"+
                    "Nombre: "+aux.getComprador().getNombre()+"\nApellido: "+aux.getComprador().getApellido() + "\nDocumento: "+
                    aux.getComprador().getDni()+"\n\nGanancia total: $"+aux.getPrecioTotal()+"\nFecha: "+aux.getFechaVenta());
        }else{
            JOptionPane.showMessageDialog(this, "Id de venta no encontrada");
        }
    }//GEN-LAST:event_btnDetallesActionPerformed

    private void tableVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableVentasMouseClicked
        // TODO add your handling code here:
        int seleccionar = tableVentas.rowAtPoint(evt.getPoint());
        String idVenta = tableVentas.getValueAt(seleccionar, 0).toString();
        txtFiltro.setText(idVenta);
    }//GEN-LAST:event_tableVentasMouseClicked

    private void mostrarTabla(){
        tableVentas.setModel(new javax.swing.table.DefaultTableModel(
            controlador.construirMatrisVentasUsuario(usuario),
            new String [] {
                "Id venta", "Comprador", "Producto", "Pago total", "Fecha"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
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
    private void restaurarPanel(){
        lblResumenVentas.setText(Integer.toString(controlador.obtenerVentasUsuario(usuario.getUser())));
        lblDinero.setText(Double.toString(controlador.dineroGeneradoUsuario(usuario.getUser())));
        mostrarTabla();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDetalles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDinero;
    private javax.swing.JLabel lblResumenVentas;
    private javax.swing.JTable tableVentas;
    private javax.swing.JTextField txtFiltro;
    // End of variables declaration//GEN-END:variables
}
