package inventariovehiculos;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
public class Agregar extends javax.swing.JFrame {
    private int mayor,cuantos,posicion;
    Tablas empleado=new Tablas();
    ResultSet resultado;
    private String cargo,sexo,edad,ID,valor;

    public Agregar() {
        initComponents();
        this.setLocationRelativeTo(null);  
        Bloquear();
    }
    public void Bloquear(){
        txtPrimerNombre.setEditable(false);
        txtSegundoNombre.setEditable(false);
        txtPrimerApellido.setEditable(false);
        txtSegundoApellido.setEditable(false);
        txtDireccion.setEditable(false);
        cmbEdad.setEnabled(false);
        rbtnMasculino.setEnabled(false);
        rbtnFemenino.setEnabled(false);
        rbtnJefe.setEnabled(false);
        rbtnVendedor.setEnabled(false);
        txtContraseña.setEditable(false);
    }
    public void Desbloquear(){
        txtPrimerNombre.setEditable(true);
        txtSegundoNombre.setEditable(true);
        txtPrimerApellido.setEditable(true);
        txtSegundoApellido.setEditable(true);
        txtDireccion.setEditable(true);
        cmbEdad.setEnabled(true);
        rbtnMasculino.setEnabled(true);
        rbtnFemenino.setEnabled(true);
        rbtnJefe.setEnabled(true);
        rbtnVendedor.setEnabled(true);
        txtContraseña.setEditable(true);
    }
    public void AgregarNuevo(){
        resultado=null;
        resultado=empleado.contarEmpleados();
        try{
            while(resultado.next()){
              cuantos=resultado.getInt(1);
              if(cuantos!=0){
                  resultado=null;
                  resultado=empleado.mayorRegistroEmpleados();
                  while(resultado.next()){
                      mayor=resultado.getInt(1) + 1;
                      if(mayor<10){
                          txtIdEmpleado.setText("00"+mayor);
                      }else if(mayor<100){
                          txtIdEmpleado.setText("0"+mayor);
                      }else{
                          txtIdEmpleado.setText(""+mayor);
                      }
                  }
              }else{
                  txtIdEmpleado.setText("00"+1);
              }   
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error "+ e.getMessage());
        }
        Limpiar();
        Desbloquear();
    }
    public void Limpiar(){
        txtPrimerNombre.setText("");
        txtSegundoNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtDireccion.setText("");
        cmbEdad.setSelectedIndex(0);
        btngSexos.clearSelection();
        btngCargos.clearSelection();
        txtContraseña.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btngSexos = new javax.swing.ButtonGroup();
        btngCargos = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        lblIdEmpleado = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JTextField();
        lblPrimerNombre = new javax.swing.JLabel();
        txtPrimerNombre = new javax.swing.JTextField();
        lblSegundoNombre = new javax.swing.JLabel();
        txtSegundoNombre = new javax.swing.JTextField();
        lblPrimerApellido = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblEdad = new javax.swing.JLabel();
        cmbEdad = new javax.swing.JComboBox<>();
        lblSexo = new javax.swing.JLabel();
        rbtnFemenino = new javax.swing.JRadioButton();
        rbtnMasculino = new javax.swing.JRadioButton();
        lblCargo = new javax.swing.JLabel();
        rbtnJefe = new javax.swing.JRadioButton();
        rbtnVendedor = new javax.swing.JRadioButton();
        lblContraseña = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(450, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Agregar nuevo empleado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        lblIdEmpleado.setText("Id Empleado");
        getContentPane().add(lblIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtIdEmpleado.setEditable(false);
        getContentPane().add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 47, -1));

        lblPrimerNombre.setText("Primer nombre");
        getContentPane().add(lblPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));
        getContentPane().add(txtPrimerNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 163, -1));

        lblSegundoNombre.setText("Segundo nombre");
        getContentPane().add(lblSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));
        getContentPane().add(txtSegundoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 163, -1));

        lblPrimerApellido.setText("Primer apellido");
        getContentPane().add(lblPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));
        getContentPane().add(txtPrimerApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 163, -1));

        lblDireccion.setText("Direccion");
        getContentPane().add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, -1, -1));
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 163, -1));

        lblEdad.setText("Edad");
        getContentPane().add(lblEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        cmbEdad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Seleccione>", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" }));
        getContentPane().add(cmbEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 128, -1));

        lblSexo.setText("Sexo");
        getContentPane().add(lblSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        btngSexos.add(rbtnFemenino);
        rbtnFemenino.setText("Femenino");
        getContentPane().add(rbtnFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, -1, -1));

        btngSexos.add(rbtnMasculino);
        rbtnMasculino.setText("Masculino");
        getContentPane().add(rbtnMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        lblCargo.setText("Cargo");
        getContentPane().add(lblCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        btngCargos.add(rbtnJefe);
        rbtnJefe.setText("Jefe");
        getContentPane().add(rbtnJefe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, -1, -1));

        btngCargos.add(rbtnVendedor);
        rbtnVendedor.setText("Vendedor");
        getContentPane().add(rbtnVendedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 400, -1, -1));

        lblContraseña.setText("Contraseña");
        getContentPane().add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, -1, -1));
        getContentPane().add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 163, -1));

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/guardar.jpg"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 120, 30));

        jLabel2.setText("Segundo apellido");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));
        getContentPane().add(txtSegundoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 220, 160, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 100, 30));

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(353, 480, 100, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("MG16068");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 550, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if(txtPrimerNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese primer nombre");
        }else if(txtSegundoNombre.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese segundo nombre");
        }else if(txtPrimerApellido.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese primer apellido");
        }else if(txtSegundoApellido.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese segundo apellido ");
        }else if(txtDireccion.getText().equals("")){
            JOptionPane.showMessageDialog(null,"Ingrese Direccion");
        }else if(cmbEdad.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(null,"Seleccione edad");
        }else if(!rbtnMasculino.isSelected() && !rbtnFemenino.isSelected()){
            JOptionPane.showMessageDialog(null,"Seleccione sexo");
        }else if(!rbtnJefe.isSelected() && !rbtnVendedor.isSelected()){
            JOptionPane.showMessageDialog(null,"Ingrese cargo");
        }
        if(rbtnMasculino.isSelected()){
            sexo="Masculino";
        }else if(rbtnFemenino.isSelected()){
            sexo="Fememnino";
        }
        if(rbtnJefe.isSelected()){
            cargo="2";
        }else if(rbtnVendedor.isSelected()){
            cargo="1";
        }
        empleado.insertarEmpleado(txtIdEmpleado.getText(), txtPrimerNombre.getText(), txtSegundoNombre.getText(), txtPrimerApellido.getText(), txtSegundoApellido.getText(), txtDireccion.getText(), ((String)cmbEdad.getSelectedItem()), sexo, cargo, txtContraseña.getText());
        JOptionPane.showMessageDialog(null,"Empleado Agregado");
        AgregarNuevo();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        ID=JOptionPane.showInputDialog("Ingrese Id del empleado");
        resultado=empleado.buscarEmpleados(ID);
        if(resultado!=null){
            try{
             while(resultado.next()){
                txtIdEmpleado.setText(ID);
                txtPrimerNombre.setText(resultado.getString(2));
                txtSegundoNombre.setText(resultado.getString(3));
                txtPrimerApellido.setText(resultado.getString(4));
                txtSegundoApellido.setText(resultado.getString(5));
                txtDireccion.setText(resultado.getString(6));
                
                if(resultado.getString(8).equals("Masculino")){
                    rbtnMasculino.setSelected(true);
                }else if(resultado.getString(8).equals("Femenino")){
                    rbtnFemenino.setSelected(true);
                }
                if(resultado.getString(9).equals("02")){
                    rbtnJefe.setSelected(true);
                }else if(resultado.getString(8).equals("01")){
                    rbtnVendedor.setSelected(true);
                }
                for(posicion=0;posicion<=13;posicion++){
                    if(resultado.getString(7).equals(cmbEdad.getItemAt(posicion))){
                        cmbEdad.setSelectedIndex(posicion);
                    }
                }
                txtContraseña.setText(resultado.getString(10));
             }   
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
            }
        }
        Bloquear();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        AgregarNuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.ButtonGroup btngCargos;
    private javax.swing.ButtonGroup btngSexos;
    private javax.swing.JComboBox<String> cmbEdad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblIdEmpleado;
    private javax.swing.JLabel lblPrimerApellido;
    private javax.swing.JLabel lblPrimerNombre;
    private javax.swing.JLabel lblSegundoNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JRadioButton rbtnFemenino;
    private javax.swing.JRadioButton rbtnJefe;
    private javax.swing.JRadioButton rbtnMasculino;
    private javax.swing.JRadioButton rbtnVendedor;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdEmpleado;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtPrimerNombre;
    private javax.swing.JTextField txtSegundoApellido;
    private javax.swing.JTextField txtSegundoNombre;
    // End of variables declaration//GEN-END:variables
}
