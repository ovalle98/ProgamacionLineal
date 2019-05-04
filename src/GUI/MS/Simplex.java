/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.MS;

import Menu.Menu;
import MetodoSimplex.Matriz;
import MetodoSimplex.ValidarSimplex;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;



/**
 *
 * @author PUMPKIN
 */
public class Simplex extends javax.swing.JFrame {
    Matriz matriz;
    ValidarSimplex simplex;
    String matrizInicial;
    /**
     * Creates new form Simplex
     */
    public Simplex() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setSize(880, 720);
        ImageIcon logo1 =  new ImageIcon("src/imágenes/descarga.png");
        ImageIcon logo2 =  new ImageIcon("src/imágenes/upiiz.png");
        ImageIcon escoba =  new ImageIcon("src/imágenes/limpia.png");
        Icon escobaIcon = new ImageIcon(escoba.getImage().getScaledInstance(45, 45, Image.SCALE_DEFAULT));
        Icon icono1 = new ImageIcon(logo1.getImage().getScaledInstance(poli.getWidth(), poli.getHeight(), Image.SCALE_DEFAULT));
        Icon icono2 = new ImageIcon(logo2.getImage().getScaledInstance(upiiz.getWidth(), upiiz.getHeight(), Image.SCALE_DEFAULT));
        poli.setIcon(icono1);
        upiiz.setIcon(icono2);
        limpia.setIcon(escobaIcon);
        ImageIcon home =  new ImageIcon("src/imágenes/casita.png");
        Icon homeIcon = new ImageIcon(home.getImage().getScaledInstance(60, 50, Image.SCALE_DEFAULT));
        regresar.setIcon(homeIcon);
        inical.setEnabled(false);
        finalT.setEnabled(false);
        lasDos.setEnabled(false);
        falso.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Tablas = new javax.swing.ButtonGroup();
        Tablas_tipo = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        reinstraintsTA = new javax.swing.JTextArea();
        Resolve = new javax.swing.JButton();
        Example = new javax.swing.JButton();
        z = new javax.swing.JTextField();
        poli = new javax.swing.JLabel();
        titulo2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        upiiz = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        limpia = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        finalT = new javax.swing.JRadioButton();
        inical = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        process = new javax.swing.JTextArea();
        lasDos = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        solution = new javax.swing.JTextArea();
        falso = new javax.swing.JRadioButton();
        regresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Método Simplex");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reinstraintsTA.setColumns(20);
        reinstraintsTA.setRows(5);
        jScrollPane1.setViewportView(reinstraintsTA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 240, 155));

        Resolve.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Resolve.setText("Resolver");
        Resolve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResolveActionPerformed(evt);
            }
        });
        getContentPane().add(Resolve, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 100, 40));

        Example.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Example.setText("Ejemplo");
        Example.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExampleActionPerformed(evt);
            }
        });
        getContentPane().add(Example, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, 90, 40));

        z.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        getContentPane().add(z, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 140, 30));

        poli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/descarga.png"))); // NOI18N
        getContentPane().add(poli, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 110, 110));

        titulo2.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        titulo2.setText("MÉTODOS CUANTITATIVOS");
        getContentPane().add(titulo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, 40));

        titulo.setFont(new java.awt.Font("Prestige Elite Std", 0, 24)); // NOI18N
        titulo.setText("PARA LA TOMA DE DECISIONES");
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, 40));

        titulo1.setFont(new java.awt.Font("Prestige Elite Std", 0, 26)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("Método Simplex");
        getContentPane().add(titulo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 310, 60));

        upiiz.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/upiiz.png"))); // NOI18N
        getContentPane().add(upiiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, 130, 120));

        jLabel2.setFont(new java.awt.Font("Prestige Elite Std", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Maximización");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 200, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 0));
        jLabel1.setText("Tablas:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 120, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 0));
        jLabel3.setText("Z = ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 30, 30));

        limpia.setFont(new java.awt.Font("Prestige Elite Std", 0, 16)); // NOI18N
        limpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imágenes/limpia.png"))); // NOI18N
        limpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiaActionPerformed(evt);
            }
        });
        getContentPane().add(limpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 50, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 0));
        jLabel4.setText("Restricciones:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 140, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 430, 10));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 0));
        jLabel5.setText("Solución:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, 140, 40));

        Tablas_tipo.add(finalT);
        finalT.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        finalT.setText("Final");
        finalT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalTActionPerformed(evt);
            }
        });
        getContentPane().add(finalT, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        Tablas_tipo.add(inical);
        inical.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        inical.setText("Inical");
        inical.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicalActionPerformed(evt);
            }
        });
        getContentPane().add(inical, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, -1));

        process.setEditable(false);
        process.setColumns(20);
        process.setRows(5);
        jScrollPane2.setViewportView(process);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 240, 390, 320));

        Tablas_tipo.add(lasDos);
        lasDos.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lasDos.setText("Las Dos");
        lasDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lasDosActionPerformed(evt);
            }
        });
        getContentPane().add(lasDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        solution.setEditable(false);
        solution.setColumns(20);
        solution.setRows(5);
        jScrollPane3.setViewportView(solution);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 580, 640, 80));

        Tablas_tipo.add(falso);
        falso.setText("falso");
        getContentPane().add(falso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, -1, -1));

        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });
        getContentPane().add(regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 590, 80, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExampleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExampleActionPerformed
        this.reinstraintsTA.setText("2.5x + y <= 20\n"+"3x + 3y <= 30\n"+"x + 2y <= 16");
        this.z.setText("3x + 4y");
    }//GEN-LAST:event_ExampleActionPerformed

    private void limpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiaActionPerformed
        //LIMPIAR
        z.setText("");
        reinstraintsTA.setText("");
        solution.setText("");
        process.setText("");
        inical.setSelected(false);
        finalT.setSelected(false);
        lasDos.setSelected(false);
        lasDos.updateUI();
        inical.setEnabled(false);
        finalT.setEnabled(false);
        lasDos.setEnabled(false);
        falso.setSelected(true);
        this.repaint();
    }//GEN-LAST:event_limpiaActionPerformed

    private void ResolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResolveActionPerformed
        // TODO add your handling code here:
        inical.setEnabled(true);
        finalT.setEnabled(true);
        lasDos.setEnabled(true);
        try{
            this.simplex=new ValidarSimplex();
            if(this.simplex.validarZ(this.z.getText())){
                if(this.simplex.validarRestriccionesMax(this.reinstraintsTA.getText())){
                    this.matriz= new Matriz();
                    this.matriz.crearMatriz(simplex);
                    this.matrizInicial=matriz.mostrarMatriz();
                    matriz.resolverMaximizacion();
                    matriz.intrepretacion();
                    this.solution.setText(matriz.intrepretacion()); 
                } else JOptionPane.showMessageDialog(null,"Introduzca restricciones validas");
            }else JOptionPane.showMessageDialog(null,"Introduzca una función objetivo valido");
        }catch(StringIndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null,"Introduzca introcciones");
        }
    }//GEN-LAST:event_ResolveActionPerformed

    private void inicalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicalActionPerformed
        // Mostrar tabla inicail
        this.process.setText("           TABLA INCIAL           \n"+matriz.variables()+"\n"+matrizInicial);
    }//GEN-LAST:event_inicalActionPerformed

    private void finalTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalTActionPerformed
        // Mostrar tabla final
        this.process.setText("           TABLA FINAL           \n"+matriz.variables()+"\n"+matriz.mostrarMatriz());
    }//GEN-LAST:event_finalTActionPerformed

    private void lasDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lasDosActionPerformed
        // TODO add your handling code here:
        this.process.setText("           TABLA INCIAL           \n"+matriz.variables()+"\n"+matrizInicial
        +"\n\n           TABLA FINAL           \n"+matriz.variables()+"\n"+matriz.mostrarMatriz());
    }//GEN-LAST:event_lasDosActionPerformed

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        // TODO add your handling code here:
        Menu d = new Menu();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_regresarActionPerformed

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
            java.util.logging.Logger.getLogger(Simplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Simplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Simplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Simplex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Simplex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Example;
    private javax.swing.JButton Resolve;
    private javax.swing.ButtonGroup Tablas;
    private javax.swing.ButtonGroup Tablas_tipo;
    private javax.swing.JRadioButton falso;
    private javax.swing.JRadioButton finalT;
    private javax.swing.JRadioButton inical;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JRadioButton lasDos;
    private javax.swing.JButton limpia;
    private javax.swing.JLabel poli;
    private javax.swing.JTextArea process;
    private javax.swing.JButton regresar;
    private javax.swing.JTextArea reinstraintsTA;
    private javax.swing.JTextArea solution;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    private javax.swing.JLabel titulo2;
    private javax.swing.JLabel upiiz;
    private javax.swing.JTextField z;
    // End of variables declaration//GEN-END:variables
}
