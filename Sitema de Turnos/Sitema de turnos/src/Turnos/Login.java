
package Turnos;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.*;
import static Turnos.Home.jDesktopPane1;
public class Login extends javax.swing.JInternalFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextUsuario = new javax.swing.JTextField();
        jbtnOk = new javax.swing.JButton();
        jTextPassword = new javax.swing.JPasswordField();

        setClosable(true);

        jLabel1.setText("Usuario");

        jLabel2.setText("Contraseña");

        jbtnOk.setText("OK");
        jbtnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnOkActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbtnOk, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(jTextPassword))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(jbtnOk)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnOkActionPerformed
    if (jTextUsuario.getText().equals("")) {
               JOptionPane.showMessageDialog( this, "Ingrese un nombre de usuario","Error", JOptionPane.ERROR_MESSAGE);
               return;

                }
        String Password= String.valueOf(jTextPassword.getText().replace("'","''"));
            if (Password.equals("")) {
               JOptionPane.showMessageDialog( this, "Ingrese una contraseña","Error", JOptionPane.ERROR_MESSAGE);
               return;

                }
            try{
                Class.forName("org.gjt.mm.mysql.Driver");
               // Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost:3306/cenMedico","root","123123");
               Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
                Statement stm= cnx.createStatement();
                ResultSet rst = stm.executeQuery("select id from usuario where nick= '" + jTextUsuario.getText().replace("'","''") + "' and password ='" + Password + "'");
                if (rst.next()){
                    TurnoDoc jifTurnoD = new TurnoDoc(Integer.parseInt(rst.getString("id")));
                    Home.jDesktopPane1.add(jifTurnoD);
                    jifTurnoD.setLocation(((jDesktopPane1.getSize()).width - (jifTurnoD.getSize()).width)/2, ((jDesktopPane1.getSize()).height- (jifTurnoD.getSize()).height)/2);
                    jifTurnoD.show();
                    this.hide();
                    
                }
                else{ 
                JOptionPane.showMessageDialog(this, "Logeo erroneo, Intente Nuevamente","Acceso denegado",JOptionPane.ERROR_MESSAGE);
                }
                cnx.close();

            }catch(ClassNotFoundException cnfe){
                cnfe.printStackTrace();
            }catch(SQLException sqle){
                sqle.printStackTrace();
            }
    }//GEN-LAST:event_jbtnOkActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPasswordField jTextPassword;
    private javax.swing.JTextField jTextUsuario;
    private javax.swing.JButton jbtnOk;
    // End of variables declaration//GEN-END:variables
}
