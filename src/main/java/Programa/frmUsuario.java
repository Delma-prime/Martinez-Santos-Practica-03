/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Programa;

/**
 *
 * @author OCA-UIE
 */
public class frmUsuario extends javax.swing.JFrame {

    /** Creates new form frmUsuario */
    public frmUsuario() {
        initComponents();
        
        
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panTitulo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        panControles = new javax.swing.JPanel();
        lblPaterno = new javax.swing.JLabel();
        txtPaterno = new javax.swing.JTextField();
        lblMaterno = new javax.swing.JLabel();
        txtMaterno = new javax.swing.JTextField();
        lblNombres = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        lblDocumento = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        lblTipoDoc = new javax.swing.JLabel();
        cboTipoDocumento = new javax.swing.JComboBox<>();
        lblMonto = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        txtPasaje = new javax.swing.JTextField();
        lblPaterno2 = new javax.swing.JLabel();
        panBotones = new javax.swing.JPanel();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnImprimir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panTitulo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("Registrar Usuario");
        panTitulo.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 13, -1, -1));

        getContentPane().add(panTitulo, java.awt.BorderLayout.NORTH);

        panControles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPaterno.setText("Paterno");
        panControles.add(lblPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        txtPaterno.setToolTipText("");
        panControles.add(txtPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 110, 20));

        lblMaterno.setText("Materno");
        panControles.add(lblMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));
        panControles.add(txtMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 110, 20));

        lblNombres.setText("Nombres");
        panControles.add(lblNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));
        panControles.add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 110, 20));

        lblDocumento.setText("Documento");
        panControles.add(lblDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));
        panControles.add(txtDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 110, -1));

        lblTipoDoc.setText("Tipo Doc.");
        panControles.add(lblTipoDoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, -1, -1));

        cboTipoDocumento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DNI", "PASAPORTE" }));
        panControles.add(cboTipoDocumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        lblMonto.setText("Monto");
        panControles.add(lblMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        txtMonto.setToolTipText("");
        panControles.add(txtMonto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, 110, 20));

        txtPasaje.setToolTipText("");
        panControles.add(txtPasaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 110, 20));

        lblPaterno2.setText("Pasaje");
        panControles.add(lblPaterno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        getContentPane().add(panControles, java.awt.BorderLayout.CENTER);

        panBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAgregar.setText("Agregar");
        panBotones.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, 40));

        btnSalir.setText("Salir");
        panBotones.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 100, 40));

        btnImprimir.setText("Imprimir");
        panBotones.add(btnImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 100, 40));

        getContentPane().add(panBotones, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnImprimir;
    public javax.swing.JButton btnSalir;
    public javax.swing.JComboBox<String> cboTipoDocumento;
    private javax.swing.JLabel lblDocumento;
    private javax.swing.JLabel lblMaterno;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblNombres;
    private javax.swing.JLabel lblPaterno;
    private javax.swing.JLabel lblPaterno2;
    private javax.swing.JLabel lblTipoDoc;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel panBotones;
    private javax.swing.JPanel panControles;
    private javax.swing.JPanel panTitulo;
    public javax.swing.JTextField txtDocumento;
    public javax.swing.JTextField txtMaterno;
    public javax.swing.JTextField txtMonto;
    public javax.swing.JTextField txtNombres;
    public javax.swing.JTextField txtPasaje;
    public javax.swing.JTextField txtPaterno;
    // End of variables declaration//GEN-END:variables

}
