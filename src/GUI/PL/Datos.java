/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.PL;

import ProgramacionLineal.Reinstraints;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author ovall
 */
public class Datos extends javax.swing.JFrame {
    private String tipo;
    private Reinstraints restrinciones;
    /**
     * Creates new form Datos
     */
    public Datos(String tipo) {
        initComponents();
        ImageIcon escoba =  new ImageIcon("src/imágenes/limpia.png");
        Icon escobaIcon = new ImageIcon(escoba.getImage().getScaledInstance(65, 55, Image.SCALE_DEFAULT));
        limpia.setIcon(escobaIcon);
        ImageIcon flecha =  new ImageIcon("src/imágenes/flecha3.png");
        Icon flechaIcon = new ImageIcon(flecha.getImage().getScaledInstance(70, 60, Image.SCALE_DEFAULT));
        regresar.setIcon(flechaIcon);
        
        
        this.setLocationRelativeTo(null);
        this.tipo = tipo;
        if(tipo == "Minimización")
            jLabel4.setText("Minimización");
        restrinciones = new Reinstraints();
        
    }

    private Datos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.tipo = tipo;
        restrinciones = new Reinstraints();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        z = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reinstraintsTA = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        limpia = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método Gráfico");
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        z.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 170, -1));

        reinstraintsTA.setColumns(20);
        reinstraintsTA.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        reinstraintsTA.setRows(5);
        jScrollPane1.setViewportView(reinstraintsTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 333, 149));

        jLabel2.setFont(new java.awt.Font("Prestige Elite Std", 0, 26)); // NOI18N
        jLabel2.setText("Método gráfico");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Z = ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 62, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("Restrincciones");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Prestige Elite Std", 0, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 51));
        jLabel4.setText("Maximización");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 40));

        regresar.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/flecha3.png"))); // NOI18N
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 90, 60));

        jButton2.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        jButton2.setText("Solución");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, 50));

        jButton3.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        jButton3.setText("Ejemplo");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 113, 50));

        limpia.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        limpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/limpia.png"))); // NOI18N
        limpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiaActionPerformed(evt);
            }
        });
        getContentPane().add(limpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 80, 70));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/me.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Inicial p = new Inicial();
        p.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(!z.getText().equals("") && !reinstraintsTA.getText().equals(""))
            if(tipo == "Maximización")//Para el metodo de maximizacion
                //Valisar Z
                if(restrinciones.validarZ(z.getText()))
                    //Validamos las restrinciones
                    if(restrinciones.validarRestrinciones(reinstraintsTA.getText())){
                        restrinciones.obtenerValores();
                        restrinciones.evaluarCoordenadas();
                        Resultados r = new Resultados(restrinciones, this.tipo);
                        r.setVisible(true);
                        this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Escriba bien las restricciones","Programación Lineal",JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"Escriba bien Z","Programación Lineal",JOptionPane.ERROR_MESSAGE);   
            else{
                //Valisar Z
                if(restrinciones.validarZ(z.getText()))
                    //Validamos las restrinciones
                    if(restrinciones.validarRestrincionesMin(reinstraintsTA.getText())){
                        restrinciones.obtenerValoresMin();
                        restrinciones.evaluarCoordenadasMin();
                        Resultados r = new Resultados(restrinciones, this.tipo);
                        r.setVisible(true);
                        this.dispose();
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Escriba bien las restricciones","Programación Lineal",JOptionPane.ERROR_MESSAGE);
                else
                    JOptionPane.showMessageDialog(null,"Escriba bien Z","Programación Lineal",JOptionPane.ERROR_MESSAGE);
            }
        else
            JOptionPane.showMessageDialog(null,"Llene todo los campos","Programación Lineal",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(tipo == "Maximización"){
            z.setText("3x + 4y");
            reinstraintsTA.setText("2.5x + y <= 20\n3x + 3y <= 30\nx + 2y <= 16");
        }
        else{
            z.setText("120x + 60y");
            reinstraintsTA.setText("3x + y => 15\nx + 5y => 20\n3x + 2y => 24");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void limpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiaActionPerformed
        // TODO add your handling code here:
        z.setText("");
        reinstraintsTA.setText("");
    }//GEN-LAST:event_limpiaActionPerformed

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
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Datos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpia;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea reinstraintsTA;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables
}
