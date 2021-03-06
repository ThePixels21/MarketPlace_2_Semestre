/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControladorVistaUsuarioVenta;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Categoria;
import modelo.Producto;
import modelo.Usuario;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Pixels
 */
public class PanelUsuarioVender extends javax.swing.JPanel {
    ControladorVistaUsuarioVenta controlador;
    Usuario usuario;

    /**
     * Creates new form panelUsuarioVender
     * @param usuario
     */
    public PanelUsuarioVender(Usuario usuario) {
        initComponents();
        controlador = new ControladorVistaUsuarioVenta();
        this.usuario = usuario;
        llenarBoxCategorias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAbsoluto = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnVender = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        cboxCategoria = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(700, 310));
        setPreferredSize(new java.awt.Dimension(700, 310));

        panelAbsoluto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setText("Vender producto");
        panelAbsoluto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");
        panelAbsoluto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Precio: ");
        panelAbsoluto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setText("Descripcion:");
        panelAbsoluto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setText("Categor??a:");
        panelAbsoluto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel6.setText("Stock:");
        panelAbsoluto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, -1, -1));

        btnVender.setText("Vender");
        btnVender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVenderActionPerformed(evt);
            }
        });
        panelAbsoluto.add(btnVender, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 190, 40));

        txtDescripcion.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelAbsoluto.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 190, -1));

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelAbsoluto.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 190, -1));

        txtPrecio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelAbsoluto.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 190, -1));

        txtStock.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        panelAbsoluto.add(txtStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 80, -1));

        cboxCategoria.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        cboxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tecnologia", "Electrodomesticos" }));
        panelAbsoluto.add(cboxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 190, -1));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel7.setText("$");
        panelAbsoluto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnVenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVenderActionPerformed
        // TODO add your handling code here:
        if (txtNombre.getText().isEmpty() || txtPrecio.getText().isEmpty() || txtDescripcion.getText().isEmpty()
                || txtStock.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        } else {
            if (validNums(txtPrecio.getText()) && validNums(txtStock.getText())) {
                String nombre = txtNombre.getText();
                double precio = Double.parseDouble(txtPrecio.getText());
                String descripcion = txtDescripcion.getText();
                int stock = Integer.parseInt(txtStock.getText());
                boolean estado = true;
                if (precio >= 0) {
                    if (stock >= 0) {
                        if(stock == 0){
                            estado = false;
                        }
                        Categoria categoria = new Categoria(cboxCategoria.getSelectedItem().toString());
                        
                        Producto p = new Producto(nombre, precio, descripcion, categoria, usuario, stock, estado);
                        
                        boolean respuesta = controlador.agregar(p);

                        if (respuesta) {
                            Producto publicacion = new Producto(nombre, precio, descripcion, categoria, usuario, p.getId());
                            controlador.registrarPublicacion(publicacion);
                            
                            if(p.isDisponible()){
                                JOptionPane.showMessageDialog(this, "Su producto se ha agregado a la venta");
                            }else{
                                JOptionPane.showMessageDialog(this, "Su producto ha sido a??adido a la secci??n no disponible"
                                        + " porque no tiene unidades para la venta");
                            }

                            PanelUsuarioEnVenta panel = new PanelUsuarioEnVenta(usuario);
                            panel.setSize(700, 310);

                            panelAbsoluto.removeAll();
                            panelAbsoluto.add(panel, new AbsoluteConstraints(0, 0, -1, -1));
                            panelAbsoluto.revalidate();
                            panelAbsoluto.repaint();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo vender");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "El stock debe ser mayor o igual a 0");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor ingrese un precio v??lido");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor llene los campos con caracteres correctos");
            }
        }
    }//GEN-LAST:event_btnVenderActionPerformed

    private void llenarBoxCategorias(){
        cboxCategoria.setModel(new DefaultComboBoxModel(controlador.obtenerCategorias()));
    }
    private boolean validNums(String datos){
        return datos.matches("[0-9]*");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVender;
    private javax.swing.JComboBox<String> cboxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel panelAbsoluto;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtStock;
    // End of variables declaration//GEN-END:variables
}
