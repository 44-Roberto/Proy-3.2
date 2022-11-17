/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;


import java.io.*;
import Funciones.AESencripter;
import Funciones.ArchivoSecuencial;
import Funciones.ArbolBinario;
import Funciones.SecuencialIndexado;
import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import jaco.mp3.player.MP3Player;





/**
 *
 * @author Roberto Moya
 */
public class ShowArtist extends javax.swing.JFrame {

    /**
     * Creates new form ShowArtist
     */
    public ShowArtist() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBTNMover = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JBTNReturn = new javax.swing.JButton();
        JBTNMostrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        JBTNMover.setBackground(new java.awt.Color(102, 102, 102));
        JBTNMover.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNMover.setForeground(new java.awt.Color(255, 255, 255));
        JBTNMover.setText("Mover Datos");
        JBTNMover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNMoverActionPerformed(evt);
            }
        });

        jTextArea1.setBackground(new java.awt.Color(102, 102, 102));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        JBTNReturn.setBackground(new java.awt.Color(102, 102, 102));
        JBTNReturn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNReturn.setForeground(new java.awt.Color(255, 255, 255));
        JBTNReturn.setText("Volver");
        JBTNReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNReturnActionPerformed(evt);
            }
        });

        JBTNMostrar.setBackground(new java.awt.Color(102, 102, 102));
        JBTNMostrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        JBTNMostrar.setForeground(new java.awt.Color(255, 255, 255));
        JBTNMostrar.setText("Mostrar Artistas en Orden");
        JBTNMostrar.setEnabled(false);
        JBTNMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBTNReturn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTNMostrar)
                    .addComponent(JBTNMover))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBTNMover)
                        .addGap(35, 35, 35)
                        .addComponent(JBTNMostrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JBTNReturn)))
                .addContainerGap(73, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBTNReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNReturnActionPerformed
        // TODO add your handling code here:
        
        Menu m1 = new Menu();
        m1.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_JBTNReturnActionPerformed

    public String ObtenerAdmin()
    {
        ArchivoSecuencial as = new ArchivoSecuencial();
        String[][] ArregloLinea=new String[9][2];
        ArregloLinea=as.getDescriptor("C:\\MEIA\\desc_usuario.txt");
        return ArregloLinea[2][1];
    }
    
    private void JBTNMoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNMoverActionPerformed
        // TODO add your handling code here:
        JBTNMostrar.setEnabled(true);
        //Limpiar el arbol cada que se inicia una nueva permutacion en el botón
       ArrayList<String> ListaCanciones = new ArrayList<>();
       String admin=ObtenerAdmin();
       String[] Cancion;
       Login l1=new Login();
       String User=l1.usertx;
       //Fecha
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDateTime date = LocalDateTime.now();
            String dt = dtf.format(date);
       
       ArchivoSecuencial as = new ArchivoSecuencial();
       ArbolBinario ab = new ArbolBinario();
       ListaCanciones=as.getAll(admin, "C:\\MEIA\\canciones.txt", "C:\\MEIA\\bitacora_canciones.txt");
       
       String llave,info;
       
       for(int i=0; i<ListaCanciones.size();i++)
       {
           Cancion=as.getArreglo(ListaCanciones.get(i));
           llave=String.join("|",Cancion[2],Cancion[0]);
           info=String.join("|",Cancion[1],Cancion[3],User, dt,"1");
           ab.Add(llave, info, "C:\\MEIA\\arbol_binario.txt", "C:\\MEIA\\desc_arbol_binario.txt", 2, User);
       }
        
    }//GEN-LAST:event_JBTNMoverActionPerformed

    private void JBTNMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNMostrarActionPerformed
        // TODO add your handling code here:
         ArbolBinario ab = new ArbolBinario();
        ArrayList<String> ListaCanciones = new ArrayList<>();
        ListaCanciones=ab.getAll("C:\\MEIA\\arbol_binario.txt");
        String[] LineaCancion;
        
        for(int i=0; i<ListaCanciones.size();i++)
        {
            LineaCancion=ab.getArreglo(ListaCanciones.get(i));
        }
        
        
        
        
    }//GEN-LAST:event_JBTNMostrarActionPerformed

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
            java.util.logging.Logger.getLogger(ShowArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowArtist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowArtist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTNMostrar;
    private javax.swing.JButton JBTNMover;
    private javax.swing.JButton JBTNReturn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
