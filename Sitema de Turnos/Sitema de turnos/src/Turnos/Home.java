
package Turnos;

import java.util.Locale;
/**
 *
 * @author fede0
 */
public class Home extends javax.swing.JFrame {

    
    public Home() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar = new javax.swing.JMenuBar();
        jMenuOpciones = new javax.swing.JMenu();
        jMConsultarTurno = new javax.swing.JMenuItem();
        jMSacarTurno = new javax.swing.JMenuItem();
        jmiLaboratorio = new javax.swing.JMenuItem();
        jmUsuarios = new javax.swing.JMenu();
        jMIngresar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Centro Medico");

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );

        jMenuBar.setName(""); // NOI18N

        jMenuOpciones.setText("Turnos");
        jMenuOpciones.setMargin(new java.awt.Insets(0, 10, 0, 10));

        jMConsultarTurno.setText("Consultar turno");
        jMConsultarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMConsultarTurnoActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMConsultarTurno);

        jMSacarTurno.setText("Sacar turno");
        jMSacarTurno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMSacarTurnoActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jMSacarTurno);

        jmiLaboratorio.setText("Laboratorio");
        jmiLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiLaboratorioActionPerformed(evt);
            }
        });
        jMenuOpciones.add(jmiLaboratorio);

        jMenuBar.add(jMenuOpciones);

        jmUsuarios.setText("Usuarios");
        jmUsuarios.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jmUsuarios.setMargin(new java.awt.Insets(0, 10, 0, 10));

        jMIngresar.setText("Ingresar");
        jMIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIngresarActionPerformed(evt);
            }
        });
        jmUsuarios.add(jMIngresar);

        jMenuBar.add(jmUsuarios);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMSacarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMSacarTurnoActionPerformed
    Especialista jifTurnoN = new Especialista();
        jDesktopPane1.add(jifTurnoN);
        jifTurnoN.setLocation(((jDesktopPane1.getSize()).width - (jifTurnoN.getSize()).width)/2, ((jDesktopPane1.getSize()).height- (jifTurnoN.getSize()).height)/2);
        jifTurnoN.show();
        
    }//GEN-LAST:event_jMSacarTurnoActionPerformed

    private void jMIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIngresarActionPerformed
        Login jifLogin = new Login();
        jDesktopPane1.add(jifLogin);
        jifLogin.setLocation(((jDesktopPane1.getSize()).width - (jifLogin.getSize()).width)/2, ((jDesktopPane1.getSize()).height- (jifLogin.getSize()).height)/2);
        jifLogin.show();
    }//GEN-LAST:event_jMIngresarActionPerformed

    private void jMConsultarTurnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMConsultarTurnoActionPerformed
        TurnoConsulta jifTurnoC = new TurnoConsulta();
        jDesktopPane1.add(jifTurnoC);
        jifTurnoC.setLocation(((jDesktopPane1.getSize()).width - (jifTurnoC.getSize()).width)/2, ((jDesktopPane1.getSize()).height- (jifTurnoC.getSize()).height)/2);
        jifTurnoC.show();
    }//GEN-LAST:event_jMConsultarTurnoActionPerformed

    private void jmiLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiLaboratorioActionPerformed
       Laboratorio labo=new Laboratorio();
       jDesktopPane1.add(labo);
       labo.setLocation(((jDesktopPane1.getSize()).width - (labo.getSize()).width)/2, ((jDesktopPane1.getSize()).height- (labo.getSize()).height)/2);
       labo.show();
    }//GEN-LAST:event_jmiLaboratorioActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMConsultarTurno;
    private javax.swing.JMenuItem jMIngresar;
    private javax.swing.JMenuItem jMSacarTurno;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu jMenuOpciones;
    private javax.swing.JMenu jmUsuarios;
    private javax.swing.JMenuItem jmiLaboratorio;
    // End of variables declaration//GEN-END:variables
}
