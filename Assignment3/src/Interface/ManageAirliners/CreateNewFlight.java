/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliners;
import java.text.SimpleDateFormat;
import java.util.Date;

import Buisness.AirlineDirectory;
import Buisness.Airlines;
import Buisness.Flights;
import java.awt.CardLayout;
import java.awt.Component;
import static java.lang.String.format;
import java.text.DateFormat;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Harshitha
 */
public class CreateNewFlight extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlight
     */
    JPanel userProcessContainer;
   // AirlineDirectory airLineDir;
    Airlines air;
    SimpleDateFormat formatter;
           
    public CreateNewFlight(JPanel upc,Airlines a) {
        initComponents();
        formatter = new SimpleDateFormat("dd-MM-yyyy");
        userProcessContainer=upc;
        air=a;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sourceTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fliNoTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        noOFSeatsTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        todbox = new javax.swing.JComboBox();
        atime = new com.toedter.calendar.JDateChooser();
        dtime = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        priceTF = new javax.swing.JTextField();

        setBackground(new java.awt.Color(44, 62, 80));

        DesTF.setBackground(new java.awt.Color(108, 122, 137));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Flight Number");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Source");

        sourceTF.setBackground(new java.awt.Color(108, 122, 137));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("Arrival time");

        fliNoTF.setBackground(new java.awt.Color(108, 122, 137));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("No Of Seats");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Destination");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Time of Day:");

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("<<Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        noOFSeatsTF.setBackground(new java.awt.Color(108, 122, 137));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Departure Time");

        jButton1.setBackground(new java.awt.Color(34, 167, 240));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("Add Flight Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton3.setText("FLIGHT DETAILS");

        todbox.setBackground(new java.awt.Color(108, 122, 137));
        todbox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Morning", "AfterNoon", "Evening" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Price :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(189, 189, 189))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(2, 2, 2))
                                    .addComponent(jLabel6))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(atime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(priceTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(sourceTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fliNoTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(DesTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(noOFSeatsTF, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(todbox, javax.swing.GroupLayout.Alignment.LEADING, 0, 115, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel8))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jLabel1)))
                .addContainerGap(338, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fliNoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sourceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(DesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(jLabel5))
                    .addComponent(atime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(dtime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(noOFSeatsTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(todbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:|| DepTiimeTF.getText().equals("")
        try{
            if(fliNoTF.getText().equals("")|| sourceTF.getText().equals("") || DesTF.getText().equals("")  )
            {
               JOptionPane.showMessageDialog(null, "Please enter value for all text fields");
            }
            else
            {
        Flights fli = air.getFlightDir().addFlight();
        
       
        fli.setAirlineName(air.getAirlineName());
        
      //  SimpleDateFormat sdf = new SimpleDateFormat(format);
        fli.setFlightNumber(fliNoTF.getText());
        fli.setSource(sourceTF.getText());
        fli.setDestination(DesTF.getText());
        fli.setPrice(Double.parseDouble(priceTF.getText()));
        Date issuedate = atime.getDate();
       fli.setArrivalTime(issuedate);
                System.out.println(issuedate);
       // fli.setArrivalTime(formatter.parse(ArriTimeTF.getText()));
                Date depdate = dtime.getDate();
       fli.setDepratureTime(depdate);
                System.out.println(depdate);
       // fli.setDepratureTime(formatter.parse(DepTiimeTF.getText()));
        
        fli.setNoOfSeats(Integer.parseInt(noOFSeatsTF.getText()));
        fli.setTimeofday(todbox.getSelectedItem().toString());
        
        fli.addAisleList();
        fli.addMidleList();
        fli.addWindowList();
        
        JOptionPane.showMessageDialog(null, "Flight successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
        fliNoTF.setText("");
        sourceTF.setText("");
        DesTF.setText("");
       
                noOFSeatsTF.setText("");
            }
         }
            catch (Exception e)
                    {
                     JOptionPane.showMessageDialog(null,"Please enter valid value for the fields");
                    }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        
        Component component = componentArray[componentArray.length - 1];
       
        ViewAirlinerJPanel vap = (ViewAirlinerJPanel) component;
        vap.refreshTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DesTF;
    private com.toedter.calendar.JDateChooser atime;
    private com.toedter.calendar.JDateChooser dtime;
    private javax.swing.JTextField fliNoTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField noOFSeatsTF;
    private javax.swing.JTextField priceTF;
    private javax.swing.JTextField sourceTF;
    private javax.swing.JComboBox todbox;
    // End of variables declaration//GEN-END:variables
}
