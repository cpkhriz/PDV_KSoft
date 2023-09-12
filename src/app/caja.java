package app;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Time;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class caja extends javax.swing.JFrame {
    
    Calendar fecha_actual = new GregorianCalendar();

    public caja() {
        initComponents();
        txtId.setVisible(false);
        txtPrecio.setVisible(false);
        
        jdFechaActual.setCalendar(fecha_actual);
        this.setLocationRelativeTo(null);
    }

    int fila = 0;
    double total = 0.00;
    double total21 = (0.00);
    //double iva = 1.21;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        txtTotal = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jdFechaActual = new com.toedter.calendar.JDateChooser();
        txtTotal21 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtEliminar = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnImpFac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CODIGO", "PRODUCTO", "CANTIDAD", "PRECIO"
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
        jScrollPane1.setViewportView(jTableProductos);

        txtTotal.setEditable(false);
        txtTotal.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotalActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Total: $");

        jLabel5.setText("Nombre de la empresa");

        jLabel6.setText("Cuit de la empresa");

        jLabel7.setText("Direccion fiscal");

        jLabel8.setText("Telefono o correo electronico");

        jLabel9.setText("Logo de la empresa");

        jdFechaActual.setDateFormatString("yyyy/MM/dd HH:mm:ss");

        txtTotal21.setEditable(false);
        txtTotal21.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        txtTotal21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTotal21ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setText("+ IVA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(195, 195, 195)
                        .addComponent(jLabel9))
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jdFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel10)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTotal21, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jdFechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtTotal21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 77, -1, -1));

        txtEliminar.setText("Eliminar");
        txtEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(txtEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 630, 100, 30));

        btnPagar.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        btnPagar.setText("Cobrar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });
        getContentPane().add(btnPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 597, 122, 38));

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });
        getContentPane().add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(559, 6, 15, 12));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(698, 6, 14, 12));

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCantidadKeyPressed(evt);
            }
        });
        getContentPane().add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 48, 132, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Cantidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 17, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 48, 285, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("Producto");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 17, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 17, -1, -1));

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });
        getContentPane().add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 48, 150, -1));

        btnImpFac.setText("Imprimir");
        getContentPane().add(btnImpFac, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCodigo.getText())) {
                try {

                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("SELECT id, nombre, precio FROM bd_producto WHERE codigo=? ");
                    ps.setString(1, txtCodigo.getText());
                    ResultSet resultado = ps.executeQuery();

                    if (resultado.next()) {
                        txtId.setText(resultado.getString("id"));
                        txtNombre.setText(resultado.getString("nombre"));
                        txtPrecio.setText(resultado.getString("precio"));
                        txtCantidad.requestFocusInWindow();
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro producto");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void txtCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {

            if (!"".equals(txtCantidad.getText())) {
                try {

                    double precio = Double.parseDouble(txtPrecio.getText());
                    int cantidad = Integer.parseInt(txtCantidad.getText());
                    int stock = 0;

                    Connection con = conexion.getConexion();
                    PreparedStatement ps = con.prepareStatement("SELECT stock FROM bd_producto WHERE codigo=? ");
                    ps.setString(1, txtCodigo.getText());
                    ResultSet resultado = ps.executeQuery();

                    if (resultado.next()) {
                        stock = resultado.getInt("stock");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontro producto");
                        return;
                    }

                    if (stock >= cantidad) {
                        DefaultTableModel temp = (DefaultTableModel) jTableProductos.getModel();
                        temp.addRow(new Object[1]);
                        int columna = 0;
                        jTableProductos.setValueAt(txtCodigo.getText(), fila, columna);
                        columna++;
                        jTableProductos.setValueAt(txtNombre.getText(), fila, columna);
                        columna++;
                        jTableProductos.setValueAt(txtCantidad.getText(), fila, columna);
                        columna++;
                        double importe = precio * cantidad;
                        jTableProductos.setValueAt(importe, fila, columna);

                        fila++;
                        limpiarCajas();
                        actualizaPago();
                        txtCodigo.requestFocusInWindow();

                    } else {
                        JOptionPane.showMessageDialog(null, "No hay stock suficiente de este articulo");
                    }

                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.toString());
                }
            }
        }
    }//GEN-LAST:event_txtCantidadKeyPressed

    private void txtEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEliminarActionPerformed

        DefaultTableModel temp = (DefaultTableModel) jTableProductos.getModel();
        temp.removeRow(jTableProductos.getSelectedRow());
        fila--;
        actualizaPago();
        txtCodigo.requestFocusInWindow();

    }//GEN-LAST:event_txtEliminarActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        if (fila == 0) {
            JOptionPane.showMessageDialog(null, "No hay articulos en la venta");
        } else {

            try {

                int idVenta = 0;

                Connection con = conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("INSERT INTO ventas (total, fecha) VALUES (?,NOW())", Statement.RETURN_GENERATED_KEYS);
                ps.setDouble(1, total);
                ps.setDouble(2,total21);

                /*java.util.Date fecha;
                fecha = new Date();
                long milisegundos = fecha.getTime();
                java.sql.Date horasql = new Date(milisegundos);
                Time tiempo = new Time(milisegundos);

                ps.setString(2, "" + horasql + " " + tiempo);*/
                ps.executeUpdate();

                ResultSet resultado = ps.getGeneratedKeys();
                resultado.next();
                idVenta = resultado.getInt(1);

                if (idVenta == 0) {
                    JOptionPane.showMessageDialog(null, "Error al guardar venta");
                    return;
                }

                agregaProductos(idVenta);

                limpiarCajas();
                limpiaTabla();
                total = 0.00;
                total21 = 0.00;
                txtTotal.setText("0.00");
                txtTotal21.setText("0.00");
                
                

                JOptionPane.showMessageDialog(null, "Venta completa");

                txtCodigo.requestFocus();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }//GEN-LAST:event_btnPagarActionPerformed

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void txtTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotalActionPerformed

    private void txtTotal21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTotal21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTotal21ActionPerformed

    private void limpiarCajas() {
        txtCodigo.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtCantidad.setText("");
        txtPrecio.setText("");
    }

    private void actualizaPago() {
        total = 0.00;
        total21 = 0.00;

        int numeroFilas = jTableProductos.getRowCount();

        for (int a = 0; a < numeroFilas; a++) {
            total = total + Double.parseDouble(String.valueOf(jTableProductos.getModel().getValueAt(a, 3)));
            total21 = total21 + Double.parseDouble(String.valueOf(jTableProductos.getModel().getValueAt(a, 3)));
        }
        txtTotal.setText(String.format("%.2f", total));
        txtTotal21.setText(String.format("%.2f", total21*1.21));
    }

    private void agregaProductos(int idVenta) {

        double precio;
        int id, cantidad;
        String codigo, nombre;
        int filasT = jTableProductos.getRowCount();

        Connection con = conexion.getConexion();

        for (int b = 0; b < filasT; b++) {
            codigo = (String) jTableProductos.getValueAt(b, 0);
            try {
                PreparedStatement ps = con.prepareStatement("SELECT id, nombre, precio FROM bd_producto WHERE codigo=? ");
                ps.setString(1, codigo);
                ResultSet resultado = ps.executeQuery();

                while (resultado.next()) {
                    id = Integer.parseInt(resultado.getString("id"));
                    nombre = resultado.getString("nombre");
                    precio = resultado.getDouble("precio");

                    cantidad = Integer.parseInt(jTableProductos.getValueAt(b, 2).toString());

                    PreparedStatement psI = con.prepareStatement("INSERT INTO detalle_venta_producto (id_venta, id_producto, nombre, precio, cantidad) VALUES (?,?,?,?,?)");
                    psI.setInt(1, idVenta);
                    psI.setInt(2, id);
                    psI.setString(3, nombre);
                    psI.setDouble(4, precio);
                    psI.setInt(5, cantidad);
                    psI.executeUpdate();

                    PreparedStatement psU = con.prepareStatement("UPDATE bd_producto SET stock = (stock-?) WHERE id=?");
                    psU.setInt(1, cantidad);
                    psU.setInt(2, id);
                    psU.executeUpdate();
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
    }

    private void limpiaTabla() {
        DefaultTableModel temp = (DefaultTableModel) jTableProductos.getModel();
        int filas = jTableProductos.getRowCount();

        for (int a = 0; filas > a; a++) {
            temp.removeRow(0);
        }

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
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(caja.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new caja().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnImpFac;
    private javax.swing.JButton btnPagar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableProductos;
    private com.toedter.calendar.JDateChooser jdFechaActual;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JButton txtEliminar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtTotal21;
    // End of variables declaration//GEN-END:variables
}
