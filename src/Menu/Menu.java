/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menu;


import GUI.MS.Simplex;
import GUI.PL.Inicial;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author ovall
 */
public class Menu extends javax.swing.JFrame {
    private Simplex ms;
    private Inicial mg;

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(800, 550);
        ImageIcon logo1 =  new ImageIcon("src/imágenes/descarga.png");
        ImageIcon logo2 =  new ImageIcon("src/imágenes/upiiz.png");
        ImageIcon fondoL =  new ImageIcon("src/imágenes/HojaPapel.png");
//        Icon hoja = new ImageIcon(fondoL.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT));
        Icon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(poli.getWidth(), poli.getHeight(), Image.SCALE_DEFAULT));
        Icon icono2 = new ImageIcon(logo2.getImage().getScaledInstance(upiiz.getWidth(), upiiz.getHeight(), Image.SCALE_DEFAULT));
        poli.setIcon(icono1);
        upiiz.setIcon(icono2);
//        fondo.setIcon(hoja);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titulo = new javax.swing.JLabel();
        poli = new javax.swing.JLabel();
        upiiz = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        MG = new javax.swing.JButton();
        MS = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Programación Lineal");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        titulo.setText("PARA LA TOMA DE DECISIONES");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 40));

        poli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/descarga.png"))); // NOI18N
        getContentPane().add(poli, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 110, 110));

        upiiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/upiiz.png"))); // NOI18N
        getContentPane().add(upiiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 40, 130, 120));

        titulo1.setFont(new java.awt.Font("Prestige Elite Std", 0, 26)); // NOI18N
        titulo1.setText("Programación lineal");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, 310, 60));

        titulo2.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        titulo2.setText("MÉTODOS CUANTITATIVOS");
        getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, 40));

        MG.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        MG.setText("Método Gráfico");
        MG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MGActionPerformed(evt);
            }
        });
        getContentPane().add(MG, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, 80));

        MS.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        MS.setText("Método Simplex");
        MS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSActionPerformed(evt);
            }
        });
        getContentPane().add(MS, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, -1, 80));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 430, 30));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 0))), "Elaborado por:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 0, 0))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Juan Antonio Ovalle Patiño");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Miguel Ángel Cervantes García");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cynthia Nayetzi Baeza García");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(107, 107, 107))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 410, 130));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Manual de Usuario");
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 213, -1, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MGActionPerformed
       //Método gráfico
        mg = new Inicial();
        mg.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MGActionPerformed

    private void MSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSActionPerformed
        //Método Simplex
        ms = new Simplex();
        ms.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MSActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MG;
    private javax.swing.JButton MS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel poli;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel upiiz;
    // End of variables declaration//GEN-END:variables
}
