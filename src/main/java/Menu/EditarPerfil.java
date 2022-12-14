/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Menu;

import static Menu.Registrar.mensajeAlerta;

/**
 *
 * @author corre
 */
public class EditarPerfil extends javax.swing.JFrame {

    private String usser;
    private String pass;
    
    public EditarPerfil(){
        
    }
    
    public EditarPerfil(String usuario, String contraseña) {
        usser=usuario;
        pass=contraseña;
        /*
        for(Perfil p : ControladorPerfil.perfiles)
            if(p.usuario.equals(usser) && p.contraseña.equals(pass)){
                nombreText.setText(p.getNombre());
                correoText.setText(p.getCorreo());
                alturaText.setText(Double.toString(p.getAltura()));
                pesoText.setText(Double.toString(p.getPeso()));
                usuarioText.setText(p.getUsuario());
                contraseñaText.setText(p.getContraseña());
            }
        */
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contraseñaText = new javax.swing.JTextField();
        alturaLabel = new javax.swing.JLabel();
        pesoLabel = new javax.swing.JLabel();
        usuarioLabel = new javax.swing.JLabel();
        correolabel = new javax.swing.JLabel();
        correoText = new javax.swing.JTextField();
        contraseñaLabel = new javax.swing.JLabel();
        nombreLabel = new javax.swing.JLabel();
        registrarButton = new javax.swing.JButton();
        nombreText = new javax.swing.JTextField();
        atrasButton = new javax.swing.JButton();
        alturaText = new javax.swing.JTextField();
        usuarioText = new javax.swing.JTextField();
        pesoText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        alturaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        alturaLabel.setText("Altura:");

        pesoLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pesoLabel.setText("Peso:");

        usuarioLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        usuarioLabel.setText("Usuario:");

        correolabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        correolabel.setText("Correo:");

        contraseñaLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        contraseñaLabel.setText("Contraseña:");

        nombreLabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        nombreLabel.setText("Nombre:");

        registrarButton.setText("Registrar");
        registrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarButtonActionPerformed(evt);
            }
        });

        nombreText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nombreTextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreTextKeyTyped(evt);
            }
        });

        atrasButton.setText("Atras");
        atrasButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasButtonActionPerformed(evt);
            }
        });

        alturaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alturaTextActionPerformed(evt);
            }
        });
        alturaText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                alturaTextKeyTyped(evt);
            }
        });

        pesoText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesoTextActionPerformed(evt);
            }
        });
        pesoText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pesoTextKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(atrasButton)
                        .addGap(59, 59, 59)
                        .addComponent(registrarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nombreLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(usuarioLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(correolabel, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                            .addComponent(alturaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(contraseñaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
                            .addComponent(pesoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(contraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(correoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(correolabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alturaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(alturaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pesoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pesoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contraseñaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(atrasButton, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarButtonActionPerformed
        for(Perfil p : ControladorPerfil.perfiles)
            if(p.usuario.equals(usser) && p.contraseña.equals(pass)){
                p.setNombre(nombreText.getText());
                p.setCorreo(correoText.getText());
                p.setAltura(Double.parseDouble(alturaText.getText().replace(',', '.')));
                p.setPeso(Double.parseDouble(pesoText.getText().replace(',', '.')));
                p.setUsuario(usuarioText.getText());
                p.setContraseña(contraseñaText.getText());
                Usuario u = new Usuario(usuarioText.getText(),nombreText.getText(),correoText.getText(),contraseñaText.getText(),Double.parseDouble(alturaText.getText().replace(',', '.')),Double.parseDouble(pesoText.getText().replace(',', '.')));
                p.setIMC(u.getImc());
                p.setEstado(u.getEstado());
            }
        MostrarEditado m = new MostrarEditado(usuarioText.getText(),contraseñaText.getText());
        m.setVisible(true);
            
    }//GEN-LAST:event_registrarButtonActionPerformed

    private void nombreTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreTextKeyPressed

    private void nombreTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreTextKeyTyped

    }//GEN-LAST:event_nombreTextKeyTyped

    private void atrasButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasButtonActionPerformed
        dispose();
    }//GEN-LAST:event_atrasButtonActionPerformed

    private void alturaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alturaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alturaTextActionPerformed

    private void alturaTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_alturaTextKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || validar == ' '){
            getToolkit().beep();
            evt.consume();
            mensajeAlerta("Caracter incorrecto","Registro");
        }
    }//GEN-LAST:event_alturaTextKeyTyped

    private void pesoTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesoTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pesoTextActionPerformed

    private void pesoTextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pesoTextKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isLetter(validar) || validar == ' '){
            getToolkit().beep();
            evt.consume();
            mensajeAlerta("Caracter incorrecto","Registro");
        }
    }//GEN-LAST:event_pesoTextKeyTyped

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
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarPerfil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarPerfil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alturaLabel;
    private javax.swing.JTextField alturaText;
    private javax.swing.JButton atrasButton;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JTextField contraseñaText;
    private javax.swing.JTextField correoText;
    private javax.swing.JLabel correolabel;
    private javax.swing.JLabel nombreLabel;
    private javax.swing.JTextField nombreText;
    private javax.swing.JLabel pesoLabel;
    private javax.swing.JTextField pesoText;
    private javax.swing.JButton registrarButton;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JTextField usuarioText;
    // End of variables declaration//GEN-END:variables
}
