package inventariovehiculos;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

public class Carros extends javax.swing.JFrame {
    Tablas nombre =new Tablas();
    private DefaultListModel marcas = new DefaultListModel();
    private DefaultListModel modelos = new DefaultListModel();
    private String marca,modelo,IdModelo;
    private Object valor;
    private int cuantos,mayor,marc,posicion;
    private ResultSet resultado=null;
     
    public Carros() {
        initComponents();
        this.setLocationRelativeTo(null);
        lstMarcas.setModel(marcas);
        lstModelos.setModel(modelos);
        //tblCaracteristicas.setModel(caracteristicas);
        resultado=nombre.buscarMarcas();
        try {
            while(resultado.next()){
                marca=resultado.getString(1);
                marcas.addElement(marca);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error "+ e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstMarcas = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstModelos = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblCaracteristicas = new javax.swing.JTable();
        btnCaracteristicas = new javax.swing.JButton();
        lblMarcas = new javax.swing.JLabel();
        lblModelos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lstMarcas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstMarcasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstMarcas);

        jScrollPane2.setViewportView(lstModelos);

        tblCaracteristicas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Marca", "Modelo", "Color", "Combustible", "Motor", "Tipo", "Disponible", "Precio", "Version"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblCaracteristicas);
        if (tblCaracteristicas.getColumnModel().getColumnCount() > 0) {
            tblCaracteristicas.getColumnModel().getColumn(0).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(1).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(2).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(3).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(4).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(5).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(6).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(7).setResizable(false);
            tblCaracteristicas.getColumnModel().getColumn(8).setResizable(false);
        }

        btnCaracteristicas.setText("Caracteristicas");
        btnCaracteristicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaracteristicasActionPerformed(evt);
            }
        });

        lblMarcas.setText("Marcas");

        lblModelos.setText("Modelos");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("MG16068");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(67, 67, 67)
                                .addComponent(btnCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(108, 108, 108)
                                .addComponent(lblMarcas)
                                .addGap(175, 175, 175)
                                .addComponent(lblModelos)))
                        .addGap(0, 103, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMarcas)
                            .addComponent(lblModelos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(btnCaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addGap(64, 64, 64))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lstMarcasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstMarcasValueChanged
      resultado=null;
      cuantos=marcas.getSize();
      //for(marc=0;marc<cuantos;marc++){
        marc=lstMarcas.getSelectedIndex();
        if(lstMarcas.isSelectedIndex(marc)){
          modelos.removeAllElements();
          String posicion=""+(marc+1);
          resultado=nombre.buscarModelos(posicion);
          try {
              while(resultado.next()){
               modelo=resultado.getString(1);
               modelos.addElement(modelo);
              }
          } catch (SQLException e) {
              JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
          }
       }
      //}        
    }//GEN-LAST:event_lstMarcasValueChanged

    private void btnCaracteristicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaracteristicasActionPerformed
        cuantos=modelos.getSize();
        for(posicion=0;posicion<cuantos;posicion++){
            if(lstModelos.isSelectedIndex(posicion)){
                String mod="0"+(lstMarcas.getSelectedIndex()+1);
                IdModelo=mod+"0"+(posicion+1);
                try{
                    resultado=nombre.llenarTabla(IdModelo);
                    while(resultado.next()){
                        for(marc=0;marc<9;marc++){
                           valor=resultado.getString(marc+1);
                           tblCaracteristicas.setValueAt(valor,0,marc );
                        }
                    }
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Error "+e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btnCaracteristicasActionPerformed

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
            java.util.logging.Logger.getLogger(Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCaracteristicas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblMarcas;
    private javax.swing.JLabel lblModelos;
    private javax.swing.JList<String> lstMarcas;
    private javax.swing.JList<String> lstModelos;
    private javax.swing.JTable tblCaracteristicas;
    // End of variables declaration//GEN-END:variables
}
