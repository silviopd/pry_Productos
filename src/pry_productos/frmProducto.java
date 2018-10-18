/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pry_productos;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import util.Funciones;

/**
 *
 * @author laboratorio_computo
 */
public class frmProducto extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();
    
    public frmProducto() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        txtDescuento.setEnabled(false);
        rbPerecible.setSelected(true);
        
        llenarCombo();
        configurarCabeceraTabla();
        
        habilitarodesabilitar(false);
    }
    
    private void llenarCombo(){
        cboCategoria.removeAllItems();
        cboCategoria.addItem("");
        cboCategoria.addItem("Lácteos");
        cboCategoria.addItem("Gaseosa");
        cboCategoria.addItem("Higiene");
    }
    
    private void habilitarodesabilitar(boolean tf){
        txtCodigo.setEnabled(tf);
        txtNombre.setEnabled(tf);
        txtPrecio.setEnabled(tf);
        cboCategoria.setEnabled(tf);
        rbNoPerecible.setEnabled(tf);
        rbPerecible.setEnabled(tf);
        chkDescuento.setEnabled(tf);
        
        if (tf==true) {
            btnNuevo.setEnabled(false);
            btnRegistrar.setEnabled(true);
        }else if (tf==false) {
            btnNuevo.setEnabled(true);
            btnRegistrar.setEnabled(false);
        }

    }
    
    private void configurarCabeceraTabla() {
        modelo.addColumn("Código");
        modelo.addColumn("Nombre del producto");
        modelo.addColumn("Precio");
        modelo.addColumn("Categoria");
        modelo.addColumn("Tipo Producto");
        modelo.addColumn("Tiene Descuento");
        modelo.addColumn("Descuento");
        modelo.addColumn("Total");

        tblListado.setModel(modelo);

        tblListado.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        tblListado.getColumnModel().getColumn(0).setPreferredWidth(100);
        tblListado.getColumnModel().getColumn(1).setPreferredWidth(250);
        tblListado.getColumnModel().getColumn(2).setPreferredWidth(70);
        tblListado.getColumnModel().getColumn(3).setPreferredWidth(180);
        tblListado.getColumnModel().getColumn(4).setPreferredWidth(100);
        tblListado.getColumnModel().getColumn(5).setPreferredWidth(120);
        tblListado.getColumnModel().getColumn(6).setPreferredWidth(70);
        tblListado.getColumnModel().getColumn(7).setPreferredWidth(100);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngrPerecible = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        cboCategoria = new javax.swing.JComboBox();
        rbPerecible = new javax.swing.JRadioButton();
        rbNoPerecible = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        chkDescuento = new javax.swing.JCheckBox();
        txtDescuento = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Precio");

        jLabel5.setText("Categoria");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoKeyTyped(evt);
            }
        });

        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });

        cboCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btngrPerecible.add(rbPerecible);
        rbPerecible.setText("Perecible");

        btngrPerecible.add(rbNoPerecible);
        rbNoPerecible.setText("No Perecible");

        jLabel6.setText("Producto");

        chkDescuento.setText("Tiene Descuento");
        chkDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDescuentoActionPerformed(evt);
            }
        });

        txtDescuento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescuentoKeyTyped(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Guardar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        tblListado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblListado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chkDescuento)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbPerecible)
                                    .addComponent(rbNoPerecible)
                                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel6))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(rbPerecible)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbNoPerecible)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chkDescuento)
                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        habilitarodesabilitar(true);
        this.txtCodigo.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if (txtCodigo.getText().isEmpty()) {
            Funciones.mensajeAdvertencia("Codigo vacio...", "Verifique");
            txtCodigo.requestFocus();
            return;
        }else if (txtNombre.getText().isEmpty()) {
            Funciones.mensajeAdvertencia("Nombre vacio...", "Verifique");
            txtNombre.requestFocus();
            return;
        }else if (txtPrecio.getText().isEmpty()) {
            Funciones.mensajeAdvertencia("Precio vacio...", "Verifique");
            txtPrecio.requestFocus();
            return;
        }if (cboCategoria.getSelectedIndex()==0) {
            Funciones.mensajeAdvertencia("Seleccione una categoria", "Verifique");
            cboCategoria.requestFocus();
            return;
        }
        
        String codigo,nombre,categoria,producto,tienedescuento;
        double precio;
        int descuento = 0;        
        Double total;
        
        codigo = txtCodigo.getText();
        nombre = txtNombre.getText();
        precio = Double.parseDouble(txtPrecio.getText());
        categoria = cboCategoria.getSelectedItem().toString();
        
        if (rbPerecible.isSelected()) {
            producto = "Producto Perecible";
        }else{
            producto = "Producto No Perecible";
        }
        
        if (chkDescuento.isSelected()) {
            tienedescuento = "SI";
            descuento = Integer.parseInt(txtDescuento.getText());
            total=precio-(precio*descuento)/100;
        }else{
            tienedescuento = "NO";
            total=precio;
        }
        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Estas seguro de guardar?", "Confirmar", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);

        if (confirmacion == 0) {
        Object datos[] = new Object[8];
        datos[0]=codigo;
        datos[1]=nombre;
        datos[2]=precio;
        datos[3]=categoria;
        datos[4]=producto;
        datos[5]=tienedescuento;
        datos[6]=descuento;
        datos[7]=total;
        
        modelo.addRow(datos);
        tblListado.setModel(modelo);
        
        txtCodigo.setText("");
        txtNombre.setText("");
        txtPrecio.setText("");
        txtDescuento.setEnabled(false);
        txtDescuento.setText("");
        cboCategoria.setSelectedIndex(0);
        rbPerecible.setSelected(true);
        chkDescuento.setSelected(false);
        txtCodigo.requestFocus();
        
        habilitarodesabilitar(false);
        }else {
        return;
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void chkDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDescuentoActionPerformed
        if (chkDescuento.isSelected()) {
            txtDescuento.setEnabled(true);
        } else {
            txtDescuento.setEnabled(false);
        }
    }//GEN-LAST:event_chkDescuentoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int fila = tblListado.getSelectedRow();
        if (fila < 0) {
            Funciones.mensajeError("Debe seleccionar una fila", "Verifique");
            return;
        } 
        
        int confirmacion = Funciones.mensajeConfirmacion("Desea Eliminar...", "Confirme");
        
        if (confirmacion==0) {
            modelo.removeRow(fila);        
            tblListado.setModel(modelo);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        Funciones.soloNumerosDecimal(evt, txtPrecio, 10);
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txtDescuentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescuentoKeyTyped
        Funciones.soloNumerosDecimal(evt, txtDescuento, 3);
    }//GEN-LAST:event_txtDescuentoKeyTyped

    private void txtCodigoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyTyped
        Funciones.soloNumeros(evt, txtCodigo, 10);
    }//GEN-LAST:event_txtCodigoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        Funciones.soloLetras(evt, txtNombre, 30);
    }//GEN-LAST:event_txtNombreKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup btngrPerecible;
    private javax.swing.JComboBox cboCategoria;
    private javax.swing.JCheckBox chkDescuento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbNoPerecible;
    private javax.swing.JRadioButton rbPerecible;
    private javax.swing.JTable tblListado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}
