/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 
 */
public class Prestamo extends javax.swing.JFrame {

    /**
     * Creates new form Prestamo
     */
    public Prestamo() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.jComboBox1Estudiantes.removeAllItems();
        this.jComboBox1Libros.removeAllItems();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1Estudiante = new javax.swing.JLabel();
        jLabel1Fecha = new javax.swing.JLabel();
        jLabel1Libro = new javax.swing.JLabel();
        jComboBox1Libros = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jComboBox1Estudiantes = new javax.swing.JComboBox<>();
        jButton1CrearLibro = new javax.swing.JButton();
        jButton2CrearEst = new javax.swing.JButton();
        jButton3BorrarLibro = new javax.swing.JButton();
        jButton4BorrarEst = new javax.swing.JButton();
        jButton1RegistroPrestamo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1Estudiante.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Estudiante.setText("Estudiante");

        jLabel1Fecha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Fecha.setText("Fecha");

        jLabel1Libro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Libro.setText("Libro");

        jComboBox1Libros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1Libros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1LibrosActionPerformed(evt);
            }
        });

        jComboBox1Estudiantes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1EstudiantesActionPerformed(evt);
            }
        });

        jButton1CrearLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1CrearLibro.setText("Crear");
        jButton1CrearLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1CrearLibroActionPerformed(evt);
            }
        });

        jButton2CrearEst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2CrearEst.setText("Crear");
        jButton2CrearEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CrearEstActionPerformed(evt);
            }
        });

        jButton3BorrarLibro.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3BorrarLibro.setText("Borrar");

        jButton4BorrarEst.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4BorrarEst.setText("Borrar");

        jButton1RegistroPrestamo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1RegistroPrestamo.setText("Registrar Prestamo");
        jButton1RegistroPrestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1RegistroPrestamoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1Libro)
                    .addComponent(jLabel1Fecha)
                    .addComponent(jLabel1Estudiante))
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1Libros, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(jComboBox1Estudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1CrearLibro)
                    .addComponent(jButton2CrearEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3BorrarLibro)
                    .addComponent(jButton4BorrarEst))
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jButton1RegistroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1Libro)
                            .addComponent(jComboBox1Libros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1CrearLibro)
                            .addComponent(jButton3BorrarLibro))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel1Fecha))
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1Estudiante)
                    .addComponent(jComboBox1Estudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2CrearEst)
                    .addComponent(jButton4BorrarEst))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jButton1RegistroPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1LibrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1LibrosActionPerformed
        
    }//GEN-LAST:event_jComboBox1LibrosActionPerformed

    private void jButton1RegistroPrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1RegistroPrestamoActionPerformed
        RegistroPrestamo b = new RegistroPrestamo();
        b.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1RegistroPrestamoActionPerformed

    private void jComboBox1EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1EstudiantesActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1EstudiantesActionPerformed

    private void jButton1CrearLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1CrearLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1CrearLibroActionPerformed

    private void jButton2CrearEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CrearEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2CrearEstActionPerformed

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
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prestamo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        Conexion con=new Conexion();
        con.conectar();
        con.cerrrarConexion();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prestamo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1CrearLibro;
    private javax.swing.JButton jButton1RegistroPrestamo;
    private javax.swing.JButton jButton2CrearEst;
    private javax.swing.JButton jButton3BorrarLibro;
    private javax.swing.JButton jButton4BorrarEst;
    private javax.swing.JComboBox<String> jComboBox1Estudiantes;
    private javax.swing.JComboBox<String> jComboBox1Libros;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1Estudiante;
    private javax.swing.JLabel jLabel1Fecha;
    private javax.swing.JLabel jLabel1Libro;
    // End of variables declaration//GEN-END:variables
}
