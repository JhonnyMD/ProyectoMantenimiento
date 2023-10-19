/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package co.edu.unicolombo.pb.ventanas;

import co.edu.unicolombo.pb.datos.Salones;
import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author POWERGROUP
 */
public class VentanaSalones extends javax.swing.JDialog {
    
    Salones salones;
    
    private String dispositivos[];

    /**
     * Creates new form VentanaSalones
     */
    public VentanaSalones(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtnombresalon = new javax.swing.JTextField();
        txttam = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        botoncancelar = new javax.swing.JButton();
        botonguardar = new javax.swing.JButton();
        botonbuscar = new javax.swing.JButton();
        botoneditar = new javax.swing.JButton();
        botoneliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ESPECIFICACIONES DE SALONES");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("FORMULARIO DE GESTION DE SALONES");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Especificaciones del salon", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Nombre del salon:");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("ingrese cantidad de dispositivos del salon: ");

        txtarea.setColumns(20);
        txtarea.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtarea.setRows(5);
        txtarea.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtarea.setEnabled(false);
        txtarea.setSelectionColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(txtarea);
        txtarea.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtnombresalon, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txttam, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)))
                .addGap(14, 14, 14))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnombresalon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/ventanas/icons/Icono salones.png"))); // NOI18N

        botoncancelar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botoncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/ventanas/icons/inconcancelar.png"))); // NOI18N
        botoncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncancelarActionPerformed(evt);
            }
        });

        botonguardar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/ventanas/icons/iconsave.png"))); // NOI18N
        botonguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardarActionPerformed(evt);
            }
        });

        botonbuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botonbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/ventanas/icons/iconbuscar.png"))); // NOI18N
        botonbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonbuscarActionPerformed(evt);
            }
        });

        botoneditar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botoneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/ventanas/icons/iconedit.png"))); // NOI18N
        botoneditar.setEnabled(false);
        botoneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneditarActionPerformed(evt);
            }
        });

        botoneliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        botoneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/co/edu/unicolombo/pb/ventanas/icons/icondelete.png"))); // NOI18N
        botoneliminar.setEnabled(false);
        botoneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoneliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(botoncancelar)
                                .addGap(81, 81, 81)
                                .addComponent(botoneliminar)
                                .addGap(86, 86, 86)
                                .addComponent(botoneditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(botonbuscar)
                                .addGap(78, 78, 78)
                                .addComponent(botonguardar)
                                .addGap(3, 3, 3))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonguardar)
                    .addComponent(botoncancelar)
                    .addComponent(botonbuscar)
                    .addComponent(botoneliminar)
                    .addComponent(botoneditar))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardarActionPerformed

         String nombresalon = txtnombresalon.getText();
         String taman = txttam.getText();

        try {
     int tamano = Integer.parseInt(taman);
        } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
         
         
         
         
         
         if(nombresalon.isEmpty() || taman.isEmpty()){
             
         JOptionPane.showMessageDialog(this, "Falta ingresar datos ", "Error", JOptionPane.ERROR_MESSAGE);
         
         }
         
         
         
       
         
         int tamano = Integer.parseInt(taman);
         String dispositivos = "";
          
          for (int i = 0; i < tamano; i++) {
              
              
              
              
              String dispositivo =   JOptionPane.showInputDialog(this, "ingrese dispositivo " + (i + 1));
              
              
              if(dispositivo.isEmpty()){
                  
                  
               JOptionPane.showMessageDialog(this, "No se encontro dispositivo ingresado, Dispositivo no registrado ", "Error", JOptionPane.ERROR_MESSAGE);

              
              
              
              }else{
              
              dispositivos += dispositivo.toLowerCase() + ",";
              
              
              }
              
        }
          
          
          
          Salones s = new Salones();
          
          s.nombresalon = nombresalon;
          s.dispositivos = dispositivos;
          
          if(Salones.salonesBD == null){
              
              Salones.salonesBD = new HashMap<String, Salones>();
      
          }
          
          
          if( Salones.salonesBD.containsKey(nombresalon)){
              
JOptionPane.showMessageDialog(this, "el salon " + nombresalon +" ya ha sido registrado !DATOS NO REGISTRADOS! ", "Error", JOptionPane.ERROR_MESSAGE);          
          } else{
          
              Salones.salonesBD.put(nombresalon, s);
              
              int cuentasalones = Salones.salonesBD.size();
              JOptionPane.showMessageDialog(this, "el salon " + nombresalon + " fue registrado con exito \n" 
                                                                                                + " Existen " + cuentasalones + " salones registrados ");
              
              

             
          
             limpiarcampos();
          }
          
          
          
          
          
          



    }//GEN-LAST:event_botonguardarActionPerformed

    public void limpiarcampos(){
    txtnombresalon.setText("");
    txttam.setText("");
    botoneditar.setEnabled(false);
    botoneliminar.setEnabled(false);
    
    
    }
    
    
    private void botonbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonbuscarActionPerformed
       
        String nombresalon = txtnombresalon.getText();
        
        if(Salones.salonesBD == null || Salones.salonesBD.isEmpty()){
            
         JOptionPane.showMessageDialog(this, "No existen salones en la base de datos ", "Error", JOptionPane.ERROR_MESSAGE);          
        
        }else{
            
            if(Salones.salonesBD.containsKey(nombresalon) ){
                
                  this.salones = Salones.salonesBD.get(nombresalon);
                
                txtarea.append("usted ha buscado el salon: " + this.salones.nombresalon+ ",que contiene los siguientes dispositivos: " + this.salones.dispositivos + "\n");
                
               botoneditar.setEnabled(true);
               botoneliminar.setEnabled(true);
            
            }else{
                
                
       JOptionPane.showMessageDialog(this, "el salon buscado no existe ", "Error", JOptionPane.ERROR_MESSAGE);          

            limpiarcampos();
            
            
            
            
            }
            
            
        
        }







    }//GEN-LAST:event_botonbuscarActionPerformed

    private void botoneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneditarActionPerformed
        botonbuscarActionPerformed(evt);
        
        
        if(txtnombresalon.getText() == null || txtnombresalon.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(this, "Para editar primero debe buscar un salon ", "Error", JOptionPane.ERROR_MESSAGE);          

            limpiarcampos();
            
            return;
        
        }
        
        if(txtnombresalon.getText().equals(this.salones.nombresalon) != true){
            
            JOptionPane.showMessageDialog(this, "el salon ingresado no coincide con el salon ingresado previamente ", "Error", JOptionPane.ERROR_MESSAGE);          

            limpiarcampos();
            
            return;
        
        }
        
        
        
        
         this.salones = Salones.salonesBD.get(txtnombresalon.getText());
        
        String nombresalon = txtnombresalon.getText();
         String taman = txttam.getText();
         
         try {
     int tamano = Integer.parseInt(taman);
        } catch (NumberFormatException e) {
    JOptionPane.showMessageDialog(this, "Por favor, ingrese un número entero válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
         
         int tamano = Integer.parseInt(taman);
         String dispositivos = "";
          
          for (int i = 0; i < tamano; i++) {
              
              
              
              
              String dispositivo =   JOptionPane.showInputDialog(this, "ingrese dispositivo " + (i + 1));
              
              
              if(dispositivo.isEmpty()){
                  
                  
               JOptionPane.showMessageDialog(this, "No se encontro dispositivo ingresado, Dispositivo no registrado ", "Error", JOptionPane.ERROR_MESSAGE);

              
              
              
              }else{
              
              dispositivos += dispositivo.toLowerCase() + ",";
              
              
              }
              
        }
          
          this.salones.nombresalon = nombresalon;
          this.salones.dispositivos = dispositivos;
          
          Salones.salonesBD.put(this.salones.nombresalon, salones);
          
          
          JOptionPane.showMessageDialog(this, "Salon modificado con exito");
         
         
        
        




    }//GEN-LAST:event_botoneditarActionPerformed

    private void botoneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoneliminarActionPerformed

    if(txtnombresalon.getText() == null || txtnombresalon.getText().isEmpty()){
            
             JOptionPane.showMessageDialog(this, "Para editar primero debe buscar un salon ", "Error", JOptionPane.ERROR_MESSAGE);          

            limpiarcampos();
            
            return;
        
        }
        
        if(txtnombresalon.getText().equals(this.salones.nombresalon) != true){
            
            JOptionPane.showMessageDialog(this, "el salon ingresado no coincide con el salon ingresado previamente ", "Error", JOptionPane.ERROR_MESSAGE);          

            limpiarcampos();
            
            return;
        
        }
        
        int respuesta = JOptionPane.showConfirmDialog(this, "seguro que desea eliminar el salon?" , "COMFIRMAR", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        
        if(respuesta == JOptionPane.YES_OPTION){
            
            Salones.salonesBD.remove(this.salones.nombresalon);
            
            int total = Salones.salonesBD.size();
            JOptionPane.showMessageDialog(this, "Salon eliminado con exito \ntotal de salones actual: "+ total);
                    
        
        }


    }//GEN-LAST:event_botoneliminarActionPerformed

    private void botoncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncancelarActionPerformed

        int opcion = JOptionPane.showConfirmDialog(this, "Desea cerrar la ventana?", "COMFIRMACION!!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) ;
            
        if(opcion == JOptionPane.YES_OPTION){
            
            this.dispose();
        
        }



    }//GEN-LAST:event_botoncancelarActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaSalones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaSalones dialog = new VentanaSalones(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonbuscar;
    private javax.swing.JButton botoncancelar;
    private javax.swing.JButton botoneditar;
    private javax.swing.JButton botoneliminar;
    private javax.swing.JButton botonguardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtarea;
    private javax.swing.JTextField txtnombresalon;
    private javax.swing.JTextField txttam;
    // End of variables declaration//GEN-END:variables
}
