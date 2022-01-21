 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Turnos;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Especialista extends javax.swing.JInternalFrame {
private DefaultTableModel dtmTurnos;

    
    public Especialista() {
        initComponents();
        //cargarCombo();
        buttonGroup1.add(jRadioSi);
        buttonGroup1.add(jRadioNo);
        jRadioSi.setEnabled(false);
        jRadioNo.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jcmbEspecialidad = new javax.swing.JComboBox();
        jcmbMedico = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        String [] jTitulo = {"Nro","Dni Paciente","Medico","Estudio","Dia y Hora"};
        String [][] jDatos= {};

        dtmTurnos = new DefaultTableModel (jDatos,jTitulo);
        jTableTurnos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jElegir = new javax.swing.JButton();
        jTextDni = new javax.swing.JTextField();
        jcmbEstudios = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jRadioNo = new javax.swing.JRadioButton();
        jRadioSi = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setClosable(true);

        jcmbEspecialidad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar", "Pediatra", "Nutricionista", "Cardiologo", "Neurologo", "Psicologo", "Clinico", "Traumatologo" }));
        jcmbEspecialidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEspecialidadActionPerformed(evt);
            }
        });

        jcmbMedico.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar" }));
        jcmbMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbMedicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Especialidad");

        jLabel2.setText("Medico");

        jTableTurnos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTableTurnos.setModel(dtmTurnos);
        jScrollPane1.setViewportView(jTableTurnos);

        jLabel3.setText("Ingrese DNI");

        jElegir.setText("Reservar");
        jElegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jElegirActionPerformed(evt);
            }
        });

        jTextDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDniKeyTyped(evt);
            }
        });

        jcmbEstudios.setEnabled(false);
        jcmbEstudios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbEstudiosActionPerformed(evt);
            }
        });

        jLabel4.setText("Estudio");

        jRadioNo.setText("No");
        jRadioNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioNoActionPerformed(evt);
            }
        });

        jRadioSi.setText("Si");
        jRadioSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioSiActionPerformed(evt);
            }
        });

        jLabel5.setText("Turno para estudio");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcmbEspecialidad, 0, 168, Short.MAX_VALUE)
                                    .addComponent(jcmbMedico, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioSi)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioNo))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jcmbEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(jElegir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jcmbEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jRadioSi)
                    .addComponent(jRadioNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcmbMedico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcmbEstudios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jElegir))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcmbEspecialidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEspecialidadActionPerformed
        jRadioSi.setEnabled(true);
        jRadioNo.setEnabled(true);
        limpiarCombo(jcmbEstudios);
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
       // Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123123");
        Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
        Statement stm= cnx.createStatement();
        //obtengo los apellidos de los medicos dependiendo la especialidad
        ResultSet rst= stm.executeQuery("SELECT m.nombre,m.apellido FROM medico m INNER JOIN medico_especialidad me ON m.dni=me.dni_medico INNER JOIN especialidad e ON e.id=me.id_especialidad WHERE e.nombre='"+ jcmbEspecialidad.getSelectedItem()+"';");
        
        limpiarCombo(jcmbMedico);
        jcmbMedico.addItem(" ");
        while(rst.next()){
            jcmbMedico.addItem(rst.getString("apellido"));
        }
        cnx.close();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }//GEN-LAST:event_jcmbEspecialidadActionPerformed

    private void jcmbMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbMedicoActionPerformed
        try{
        Class.forName("org.gjt.mm.mysql.Driver");
        //Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123123");
        Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
        Statement stm= cnx.createStatement();
        ResultSet rst2= stm.executeQuery("select id from estudio where nombre='"+jcmbEstudios.getSelectedItem()+"';");
        int estudio=0;
        while(rst2.next()){
            estudio=Integer.parseInt(rst2.getString("id"));
        }
        //Saco los turnos disponibles
        // Saco los turnos de fechas anteriores 
        //ResultSet rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" and t.fecha>='"+ObtenerFecha()+"00:00:00' ORDER BY fecha;");
       // ResultSet rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" ORDER BY fecha;");
        ResultSet rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" and t.dni_paciente=0 ORDER BY fecha;");
        // System.out.println("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" ORDER BY fecha;");
        limpiarTabla();
        while(rst.next()){
            String [] registro= {rst.getString("id"),rst.getString("dni_paciente"),rst.getString("nombre") +" "+rst.getString("apellido"),rst.getString("e.nombre"),rst.getString("fecha")};
            dtmTurnos.addRow(registro);
        }
        cnx.close();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }//GEN-LAST:event_jcmbMedicoActionPerformed

    private void jElegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jElegirActionPerformed
        if (jTextDni.getText().isEmpty()){
            JOptionPane.showMessageDialog( this, "Ingrese DNI para reservar turno","Error", JOptionPane.ERROR_MESSAGE);
        }else{
        int dni= Integer.parseInt(jTextDni.getText());
        if (jTableTurnos.getSelectedRow()<0){
            JOptionPane.showMessageDialog( this, "Seleccione turno a reservar","Error", JOptionPane.ERROR_MESSAGE);
        }else{
        if (dni==0){
            JOptionPane.showMessageDialog( this, "Ingrese DNI para reservar el turno","Error", JOptionPane.ERROR_MESSAGE);
        }else{
        int fila=jTableTurnos.getSelectedRow();
        int vacio=Integer.parseInt(jTableTurnos.getModel().getValueAt(fila,1).toString());

        int info=Integer.parseInt(jTableTurnos.getModel().getValueAt(fila,0).toString());

        if (vacio==0){
        try{
                Class.forName("org.gjt.mm.mysql.Driver");
               // Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123123");
               Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
                Statement stm= cnx.createStatement();
                ResultSet rst2= stm.executeQuery("select id from estudio where nombre='"+jcmbEstudios.getSelectedItem()+"';");
                int estudio=0;
                while(rst2.next()){
                    estudio=Integer.parseInt(rst2.getString("id"));
                }   
                int res= stm.executeUpdate("UPDATE turno SET dni_paciente="+dni+" WHERE id="+info+";");
                if (res==0){System.out.print("Error, no se ejecuto");}
                limpiarTabla();
                ResultSet rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" ORDER BY fecha;");
            
                while(rst.next()){
                String [] registro= {rst.getString("id"),rst.getString("dni_paciente"),rst.getString("e.nombre") +" "+rst.getString("apellido"),rst.getString("fecha")};
                dtmTurnos.addRow(registro);
                }
                cnx.close();
             jTextDni.setText("");
             buttonGroup1.clearSelection();  
            }catch(ClassNotFoundException cnfe){
                cnfe.printStackTrace();
            }catch(SQLException sqle){
                sqle.printStackTrace();
            }
        }
        }
        }
        }
    }//GEN-LAST:event_jElegirActionPerformed

    private void jcmbEstudiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbEstudiosActionPerformed
    try{
        Class.forName("org.gjt.mm.mysql.Driver");
       // Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123123");
        Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
        Statement stm= cnx.createStatement();
        ResultSet rst2= stm.executeQuery("select id from estudio where nombre='"+jcmbEstudios.getSelectedItem()+"';");
        ResultSet rst;
        int estudio=0;
        while(rst2.next()){
            estudio=Integer.parseInt(rst2.getString("id"));
        }
        if (jRadioNo.isSelected()){
            rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" ORDER BY fecha;");
        } else{
       // ResultSet rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE m.apellido='"+ jcmbMedico.getSelectedItem()+"' and id_estudio="+estudio+" ORDER BY fecha;");
            rst= stm.executeQuery("SELECT t.id,t.dni_paciente,m.nombre,m.apellido,e.nombre,t.fecha FROM turno t INNER JOIN medico m ON m.dni=t.dni_medico INNER JOIN estudio e ON e.id=t.id_estudio WHERE id_estudio="+estudio+" and t.fecha >='"+ObtenerFecha()+" 00:00:00' ORDER BY fecha;");
        }
        limpiarTabla();
        while(rst.next()){
            String [] registro= {rst.getString("id"),rst.getString("dni_paciente"),rst.getString("nombre") +" "+rst.getString("apellido"),rst.getString("e.nombre"),rst.getString("fecha")};
            dtmTurnos.addRow(registro);
        }
        cnx.close();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
    }//GEN-LAST:event_jcmbEstudiosActionPerformed

    private void jRadioNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioNoActionPerformed
    //    jcmbEspecialidad.setEnabled(true);
        jcmbMedico.setEnabled(true);
        jcmbEstudios.setEnabled(false);
        jcmbEstudios.addItem("Consulta");
        jcmbEstudios.setSelectedItem("Consulta");
    }//GEN-LAST:event_jRadioNoActionPerformed

    private void jRadioSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioSiActionPerformed
   //     jcmbEspecialidad.setEnabled(true);
        jcmbMedico.setEnabled(false);
        jcmbEstudios.setEnabled(true);
        jcmbEstudios.removeItem("Consulta");
        int id_especialidad=0;
        if(jcmbEspecialidad.getSelectedItem().equals("Seleccionar")){
             JOptionPane.showMessageDialog(null, "Ingrese Especialidad","Error", JOptionPane.ERROR_MESSAGE);   
            }else {
                        try{
                                Class.forName("org.gjt.mm.mysql.Driver");
                                // Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123123");
                                Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
                                Statement stm= cnx.createStatement();
                                //busco el id de la especialidad
                                ResultSet rst_especialidad = stm.executeQuery("select id from especialidad where nombre='"+jcmbEspecialidad.getSelectedItem()+"';");
                                while(rst_especialidad.next()){
                                    id_especialidad=Integer.parseInt(rst_especialidad.getString("id"));
                                }
                                //Cargo los estudios
                                ResultSet rst_est=stm.executeQuery("select e.nombre from estudio e INNER JOIN medico_estudio_especialidad mee ON mee.id_estudio=e.id where mee.id_especialidad="+id_especialidad+";");
                                while(rst_est.next()){
                                    
                                    jcmbEstudios.addItem(rst_est.getString("e.nombre"));
                                }
                                cnx.close();
                            }catch(ClassNotFoundException cnfe){
                            cnfe.printStackTrace();
                            }catch (SQLException sqle){
                                sqle.printStackTrace();
                                                    }             
                                                 }
    }//GEN-LAST:event_jRadioSiActionPerformed

    private void jTextDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDniKeyTyped

        char vChar = evt.getKeyChar();

        if (!(Character.isDigit(vChar)
                || (vChar == KeyEvent.VK_BACK_SPACE)
                || (vChar == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
                                     

    }//GEN-LAST:event_jTextDniKeyTyped

private void cargarCombo(){
    try{
        Class.forName("org.gjt.mm.mysql.Driver");
       // Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123123");
        Connection cnx= DriverManager.getConnection("jdbc:mysql://localhost/cenMedico","root","123");
        Statement stm= cnx.createStatement();
        ResultSet rst= stm.executeQuery("SELECT nombre from estudio;");
        
        while(rst.next()){
            String registro=rst.getString("nombre");
            jcmbEstudios.addItem(registro);
        }
        cnx.close();
        }catch(ClassNotFoundException cnfe){
            cnfe.printStackTrace();
        }catch (SQLException sqle){
            sqle.printStackTrace();
        }
}
    
private void limpiarCombo(JComboBox cmb){
    int itemCant = cmb.getItemCount();

    for(int i=0;i<itemCant;i++){
        cmb.removeItemAt(0);
     }
}
    private void limpiarTabla (){
        for(int i=0;i<jTableTurnos.getRowCount();i++){
            dtmTurnos.removeRow(i);
            i--;
        }
    }
    private String ObtenerFecha(){
    Calendar calr = new GregorianCalendar();
    SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd");
    int año = calr.get(Calendar.YEAR);
    int mes = calr.get(Calendar.MONTH)+1;
    int dia = calr.get(Calendar.DAY_OF_MONTH);
    String fecha=año+"-"+mes+"-"+dia;
    return(fecha);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jElegir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioNo;
    private javax.swing.JRadioButton jRadioSi;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTurnos;
    private javax.swing.JTextField jTextDni;
    private javax.swing.JComboBox jcmbEspecialidad;
    private javax.swing.JComboBox jcmbEstudios;
    private javax.swing.JComboBox jcmbMedico;
    // End of variables declaration//GEN-END:variables
}
