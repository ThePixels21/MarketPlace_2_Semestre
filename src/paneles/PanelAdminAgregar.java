/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import controladores.ControladorVistaAdministrador;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import modelo.Usuario;
import org.netbeans.lib.awtextra.AbsoluteConstraints;

/**
 *
 * @author Pixels
 */
public class PanelAdminAgregar extends javax.swing.JPanel {
    ControladorVistaAdministrador controlador;

    /**
     * Creates new form panelAdministradorAgregar
     */
    public PanelAdminAgregar() {
        initComponents();
        controlador = new ControladorVistaAdministrador();
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
        txtPassword = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cboxDia = new javax.swing.JComboBox<>();
        cboxMes = new javax.swing.JComboBox<>();
        cboxAnio = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        panelAbsoluto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Agregar nuevos usuarios!");
        panelAbsoluto.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel2.setText("Usuario*");
        panelAbsoluto.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));
        panelAbsoluto.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, 80, -1));

        jLabel3.setText("Correo*");
        panelAbsoluto.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        panelAbsoluto.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 80, -1));

        jLabel4.setText("Nombres*");
        panelAbsoluto.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, -1, -1));
        panelAbsoluto.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 80, -1));

        jLabel5.setText("Apellidos*");
        panelAbsoluto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));
        panelAbsoluto.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 80, -1));

        jLabel6.setText("Documento*");
        panelAbsoluto.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));
        panelAbsoluto.add(txtApellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 80, -1));

        jLabel7.setText("Telefono*");
        panelAbsoluto.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, -1, -1));
        panelAbsoluto.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, -1));

        jLabel8.setText("Día*");
        panelAbsoluto.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        jLabel9.setText("Mes*");
        panelAbsoluto.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 40, -1, -1));

        jLabel10.setText("Año*");
        panelAbsoluto.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        cboxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        panelAbsoluto.add(cboxDia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 55, -1));

        cboxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        cboxMes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxMesItemStateChanged(evt);
            }
        });
        panelAbsoluto.add(cboxMes, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 70, 55, -1));

        cboxAnio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1900    ", "1901    ", "1902    ", "1903    ", "1904    ", "1905    ", "1906    ", "1907    ", "1908    ", "1909", "1910        ", "1911    ", "1912    ", "1913    ", "1914    ", "1915    ", "1916    ", "1917    ", "1918    ", "1919", "1920        ", "1921    ", "1922    ", "1923    ", "1924    ", "1925    ", "1926    ", "1927    ", "1928    ", "1929", "1930    ", "1931    ", "1932    ", "1933    ", "1934    ", "1935    ", "1936    ", "1937    ", "1938    ", "1939", "1940        ", "1941    ", "1942    ", "1943    ", "1944    ", "1945    ", "1946    ", "1947    ", "1948    ", "1949", "1950        ", "1951    ", "1952    ", "1953    ", "1954    ", "1955    ", "1956    ", "1957    ", "1958    ", "1959", "1960        ", "1961    ", "1962    ", "1963    ", "1964    ", "1965    ", "1966    ", "1967    ", "1968    ", "1969", "1970        ", "1971    ", "1972    ", "1973    ", "1974    ", "1975    ", "1976   ", "1977    ", "1978    ", "1979", "1980        ", "1981    ", "1982    ", "1983    ", "1984    ", "1985    ", "1986    ", "1987    ", "1988    ", "1989", "1990    ", "1991    ", "1992    ", "1993    ", "1994    ", "1995    ", "1996    ", "1997    ", "1998    ", "1999", "2000       ", "2001    ", "2002    ", "2003    ", "2004          ", "2005    ", "2006    ", "2007", "2008    ", "2009", "2010       ", "2011    ", "2012    ", "2013    ", "2014    ", "2015   ", "2016", "2017", "2018", "2019", "2020", "2021" }));
        cboxAnio.setSelectedIndex(121);
        cboxAnio.setToolTipText("");
        panelAbsoluto.add(cboxAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 60, -1));

        jLabel11.setText("Contraseña*");
        panelAbsoluto.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, -1, -1));
        panelAbsoluto.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 80, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelAbsoluto.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        panelAbsoluto.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAbsoluto, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if (txtUser.getText().isEmpty() || txtCorreo.getText().isEmpty() || txtPassword.getText().isEmpty()
                || txtNombres.getText().isEmpty() || txtApellidos.getText().isEmpty() || txtDocumento.getText().isEmpty()
                || txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor llene todos los campos");
        } else {
            if (validLtrs(txtNombres.getText()) && validLtrs(txtApellidos.getText())
                    && validNums(txtDocumento.getText()) && validNums(txtTelefono.getText())) {
                String user = txtUser.getText();
                String correo = txtCorreo.getText();
                String psw = txtPassword.getText();
                String nombre = txtNombres.getText();
                String apellido = txtApellidos.getText();
                String dni = txtDocumento.getText();
                String telefono = txtTelefono.getText();
                int dia = Integer.parseInt(cboxDia.getSelectedItem().toString().trim());
                int mes = Integer.parseInt(cboxMes.getSelectedItem().toString().trim());
                int anio = Integer.parseInt(cboxAnio.getSelectedItem().toString().trim());
                Usuario u = new Usuario(user, correo, psw, nombre, apellido, dni, telefono, Usuario.determinarEdad(dia, mes, anio));
                Usuario aux = controlador.buscar(u.getUser());
                boolean aux2 = controlador.validarUsuario(u);
                if (aux == null) {
                    if (aux2) {
                        boolean respuesta = controlador.registrar(u);
                        if (respuesta) {
                            JOptionPane.showMessageDialog(this, "Se registró satisfactoriamente");
                            btnVolver.doClick();
                        } else {
                            JOptionPane.showMessageDialog(this, "No se pudo registrar");
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "No se pudo registrar, intente cambiar el correo, el documento o el telefono");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "No se pudo registrar, el usuario ya existe");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor ingrese datos correctos para cada casilla");
            }
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        // TODO add your handling code here:
        PanelAdminUsuarios p = new PanelAdminUsuarios();
        p.setSize(635,194);
        
        panelAbsoluto.removeAll();
        panelAbsoluto.add(p, new AbsoluteConstraints(0,0,-1,-1));
        panelAbsoluto.revalidate();
        panelAbsoluto.repaint();
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cboxMesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxMesItemStateChanged
        // TODO add your handling code here:
        if(evt.getStateChange() == ItemEvent.SELECTED){
            cboxDia.setModel(new DefaultComboBoxModel(controlador.obtenerDiasMes(cboxMes.getSelectedItem().toString())));
        }
    }//GEN-LAST:event_cboxMesItemStateChanged

    private boolean validLtrs(String datos){
        return datos.matches("[a-zA-Z]*");
    }
    private boolean validNums(String datos){
        return datos.matches("[0-9]*");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cboxAnio;
    private javax.swing.JComboBox<String> cboxDia;
    private javax.swing.JComboBox<String> cboxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panelAbsoluto;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}