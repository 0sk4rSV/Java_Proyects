/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.time.LocalDate;
import logica.EntradaLog;
import oovv.Persona;
import static oovv.Persona.DTF;

/**
 *
 * @author ÓSCAR SUÁREZ
 */
public class EntradaDiag extends javax.swing.JDialog {

    /**
     * Creates new form EntradaDialogo
     */
    public EntradaDiag(java.awt.Frame parent, boolean modal) {
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

        bgTieneCoche = new javax.swing.ButtonGroup();
        jpFormulario = new javax.swing.JPanel();
        jlNombre = new javax.swing.JLabel();
        jlApellidos = new javax.swing.JLabel();
        jlFechaNacimineto = new javax.swing.JLabel();
        jlTieneCoche = new javax.swing.JLabel();
        tfNombre = new javax.swing.JTextField();
        tfApellidos = new javax.swing.JTextField();
        rbSi = new javax.swing.JRadioButton();
        rbNo = new javax.swing.JRadioButton();
        jlDia = new javax.swing.JLabel();
        jlMes = new javax.swing.JLabel();
        jlAño = new javax.swing.JLabel();
        tfDia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        tfMes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        tfAño = new javax.swing.JTextField();
        bIntroducir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jlTitulo = new javax.swing.JLabel();
        jlDNI = new javax.swing.JLabel();
        tfDNI = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jlNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlNombre.setText("Nombre:");

        jlApellidos.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlApellidos.setText("Apellidos:");

        jlFechaNacimineto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlFechaNacimineto.setText("Fecha de nacimineto:");

        jlTieneCoche.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlTieneCoche.setText("Tiene coche:");

        tfNombre.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        tfApellidos.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        bgTieneCoche.add(rbSi);
        rbSi.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbSi.setText("Si");

        bgTieneCoche.add(rbNo);
        rbNo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        rbNo.setSelected(true);
        rbNo.setText("No");

        jlDia.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlDia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlDia.setText("Dia");

        jlMes.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlMes.setText("Mes");

        jlAño.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jlAño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlAño.setText("Año");

        tfDia.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel10.setText("/");

        tfMes.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 22)); // NOI18N
        jLabel11.setText("/");

        tfAño.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout jpFormularioLayout = new javax.swing.GroupLayout(jpFormulario);
        jpFormulario.setLayout(jpFormularioLayout);
        jpFormularioLayout.setHorizontalGroup(
            jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addComponent(jlNombre)
                        .addGap(18, 18, 18)
                        .addComponent(tfNombre))
                    .addGroup(jpFormularioLayout.createSequentialGroup()
                        .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jpFormularioLayout.createSequentialGroup()
                                .addComponent(jlFechaNacimineto)
                                .addGap(18, 18, 18)
                                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jpFormularioLayout.createSequentialGroup()
                                        .addComponent(jlDia)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlMes)
                                        .addGap(18, 18, 18)
                                        .addComponent(jlAño, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE))
                                    .addGroup(jpFormularioLayout.createSequentialGroup()
                                        .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tfAño))))
                            .addGroup(jpFormularioLayout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlApellidos)
                            .addGroup(jpFormularioLayout.createSequentialGroup()
                                .addComponent(jlTieneCoche)
                                .addGap(18, 18, 18)
                                .addComponent(rbNo)
                                .addGap(18, 18, 18)
                                .addComponent(rbSi)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jpFormularioLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jlDia, jlMes, tfDia, tfMes});

        jpFormularioLayout.setVerticalGroup(
            jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormularioLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlApellidos)
                    .addComponent(tfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlAño, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlDia)
                        .addComponent(jlMes)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlFechaNacimineto)
                    .addComponent(tfDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tfAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jpFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlTieneCoche)
                    .addComponent(rbSi)
                    .addComponent(rbNo))
                .addContainerGap())
        );

        bIntroducir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bIntroducir.setText("Introducir");
        bIntroducir.setActionCommand("introducir");

        bCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        bCancelar.setText("Cancelar");
        bCancelar.setActionCommand("cancelar");

        jlTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlTitulo.setForeground(new java.awt.Color(255, 102, 0));
        jlTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTitulo.setText("R E G I S T R O    DE    P E R S O N A S");
        jlTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jlDNI.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlDNI.setText("DNI:");

        tfDNI.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(bIntroducir, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jpFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jlDNI)
                        .addGap(18, 18, 18)
                        .addComponent(tfDNI)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDNI)
                    .addComponent(tfDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bIntroducir))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {bCancelar, bIntroducir});

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
            java.util.logging.Logger.getLogger(EntradaDiag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaDiag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaDiag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaDiag.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EntradaDiag dialog = new EntradaDiag(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bIntroducir;
    private javax.swing.ButtonGroup bgTieneCoche;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jlApellidos;
    private javax.swing.JLabel jlAño;
    private javax.swing.JLabel jlDNI;
    private javax.swing.JLabel jlDia;
    private javax.swing.JLabel jlFechaNacimineto;
    private javax.swing.JLabel jlMes;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlTieneCoche;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JPanel jpFormulario;
    private javax.swing.JRadioButton rbNo;
    private javax.swing.JRadioButton rbSi;
    private javax.swing.JTextField tfApellidos;
    private javax.swing.JTextField tfAño;
    private javax.swing.JTextField tfDNI;
    private javax.swing.JTextField tfDia;
    private javax.swing.JTextField tfMes;
    private javax.swing.JTextField tfNombre;
    // End of variables declaration//GEN-END:variables

    public void setOyente(EntradaLog oyente) {
        bIntroducir.addActionListener(oyente);
        bCancelar.addActionListener(oyente);
    }

    public Persona getDatos() {

        return new Persona(tfDNI.getText(), tfNombre.getText(), tfApellidos.getText(), getFechaNacimiento().format(DTF), getTieneCoche());
    }

    public LocalDate getFechaNacimiento() {
        int dia = 0, mes = 0, año = 0;
        dia = Integer.parseInt(tfDia.getText().trim());
        mes = Integer.parseInt(tfMes.getText().trim());
        año = Integer.parseInt(tfAño.getText().trim());
        return LocalDate.of(año, mes, dia);
    }

    public boolean getTieneCoche() {
        if (rbNo.isSelected()) {
            return false;
        }
        return true;
    }

    public String getDNI() {
        return tfDNI.getText();
    }

    public void setAccion(String accion) {
        if (accion == "modifica" || accion == "elimina") {
            Component[] componentes = jpFormulario.getComponents();
            for (Component componente : componentes) {
                componente.setEnabled(false);
                bIntroducir.setText("Buscar");
            }
            if (accion == "modifica") {
                bIntroducir.setActionCommand("buscar modificar");
            }
            if (accion == "elimina") {
                bIntroducir.setActionCommand("buscar eliminar");
            }
        }
    }

    public void muestraModificar() {
        Component[] componentes = jpFormulario.getComponents();
        for (Component componente : componentes) {
            componente.setEnabled(true);
        }
        bIntroducir.setText("Modificar");
        bIntroducir.setActionCommand("modificar");
    }

    public void muestraEliminar() {
        bIntroducir.setText("Eliminar");
        bIntroducir.setActionCommand("eliminar");
    }

    public void muestraDatosPersona(Persona persona) {
        tfDNI.setText(persona.getDNI());
        tfNombre.setText(persona.getNombre());
        tfApellidos.setText(persona.getApellidos());
        tfDia.setText(Integer.toString(persona.getFechaNacimiento().getDayOfMonth()));
        tfMes.setText(Integer.toString(persona.getFechaNacimiento().getMonthValue()));
        tfAño.setText(Integer.toString(persona.getFechaNacimiento().getYear()));
        if (persona.getTieneCoche()) {
            rbSi.setSelected(true);
        }
        rbNo.setSelected(false);
    }

}
