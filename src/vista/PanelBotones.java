/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlEstudiante;


/**
 *
 * @author MandoInuzuka
 */
public class PanelBotones extends javax.swing.JPanel {

    /**
     * Creates new form PanelBotones
     */
    public PanelBotones() {
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

        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setBackground(javax.swing.UIManager.getDefaults().getColor("textHighlight"));

        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426203534_Add-Male-User.png"))); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.setToolTipText("Agregar estudiante");

        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426203706_sign-up.png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setEnabled(false);

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426203830_Remove-Male-User.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);

        btnConsultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426203891_Search-Male-User.png"))); // NOI18N
        btnConsultar.setText("Consultar");
        btnConsultar.setToolTipText("");

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426203938_Close_Box_Red.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnConsultar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnConsultar)
                    .addComponent(btnSalir))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    // End of variables declaration//GEN-END:variables

    public static final String BTN_AGREGAR = "Agregar";
    public static final String BTN_MODIFICAR = "Modificar";
    public static final String BTN_ELIMINAR = "Eliminar";
    public static final String BTN_CONSULTAR = "Consultar";
    public static final String BTN_SALIR = "Salir";

    public void escuchar(ControlEstudiante controlador) {
        
        this.btnAgregar.addActionListener(controlador);
        this.btnConsultar.addActionListener(controlador);
        this.btnEliminar.addActionListener(controlador);
        this.btnModificar.addActionListener(controlador);
        this.btnSalir.addActionListener(controlador);

    }
    
    public void enableEliMod(boolean estadoBtn){
        this.btnEliminar.setEnabled(estadoBtn);
        this.btnModificar.setEnabled(estadoBtn);
    }

}
