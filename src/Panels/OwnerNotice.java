/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.AirCargoPilot;
import Classes.BusinessCustomer;
import Classes.HubAdmin;
import Classes.HubStaff;
import Classes.Loader;
import Classes.LorryPilot;
import Classes.Owner;
import Classes.PersonalCustomer;
import Classes.Shipment;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;

/**
 *
 * @author smart view
 */
public class OwnerNotice extends javax.swing.JInternalFrame {

    /**
     * Creates new form OwnerNotice
     */
    private boolean day = true;
    public OwnerNotice(String id) {
        initComponents();
        idCombo.setVisible(false);
        destinationCombo.requestFocus();
        li.HubAdmins();
        li.Owner();
        hAlist = li.return_hubAdmin();
        oWlist = li.return_Owner();
        for(Owner obj : oWlist)
        {
            if(obj.getID().equals(id))
            {
                username = obj.getName();
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        noticeText = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        destinationCombo = new javax.swing.JComboBox<>();
        idCombo = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Type from below:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(25, 55, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(0, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Save PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 101, 4, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        noticeText.setColumns(20);
        noticeText.setRows(5);
        jScrollPane2.setViewportView(noticeText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 784;
        gridBagConstraints.ipady = 267;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(7, 55, 0, 0);
        getContentPane().add(jScrollPane2, gridBagConstraints);

        jButton3.setBackground(new java.awt.Color(0, 153, 102));
        jButton3.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton3.setText("Night  View");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 86, 0, 0);
        getContentPane().add(jButton3, gridBagConstraints);

        destinationCombo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        destinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Notice Destination", "To All Hub Admin", "To a  Hub Admin" }));
        destinationCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                destinationComboFocusLost(evt);
            }
        });
        destinationCombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                destinationComboMouseReleased(evt);
            }
        });
        destinationCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                destinationComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = -21;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 66, 0, 0);
        getContentPane().add(destinationCombo, gridBagConstraints);

        idCombo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        idCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        idCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idComboFocusLost(evt);
            }
        });
        idCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idComboActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 51, 0, 0);
        getContentPane().add(idCombo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      JFileChooser chooser = new JFileChooser();
        if(chooser.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
          File file = chooser.getSelectedFile();
        try{
            Document doc = new Document();
            PdfWriter writer  = PdfWriter.getInstance(doc,new FileOutputStream(file.getAbsolutePath()+".pdf"));
            doc.open();
            doc.add(new Paragraph("Notice"));
            doc.add(new Paragraph(noticeText.getText()));
           
            doc.add(new Paragraph("\nDate Printed: "+LocalDate.now()));
            doc.close();
            writer.close();
            JOptionPane.showMessageDialog(null,"File created successfully");
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+"Report on Shipments of Customer "+username+".pdf");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
        

       if(jButton3.getText()=="Day View"){
            noticeText.setBackground(Color.WHITE);
            noticeText.setForeground(Color.BLACK);
            jButton3.setText("Night View");
            jButton3.setBackground(Color.green);
       }
       else{
           noticeText.setBackground(Color.BLACK);
        noticeText.setForeground(Color.WHITE);
        jButton3.setText("Day View");
        jButton3.setBackground(Color.red);
       }
           
        
        
    }//GEN-LAST:event_jButton3ActionPerformed
    void initializeIDCombo()
    {
        idCombo.removeAllItems();
           for(HubAdmin obj: hAlist)
           {
               idCombo.addItem(obj.getID());
           }
           idCombo.setVisible(true);
           idCombo.requestFocus();
   
    }
    private void destinationComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_destinationComboFocusLost
       if(destinationCombo.getSelectedIndex()==0)
       {
           destinationCombo.requestFocus();
       }
       if(destinationCombo.getSelectedIndex()==1)
       {
         noticeText.removeAll();
           noticeText.setText("Dear Hub Admins,\n\n(Enter Text Here) \n\nSincerely, \n\n"+username);
       }
       if(destinationCombo.getSelectedIndex()==2)
       {
           noticeText.removeAll();
           initializeIDCombo();
       }
       
       
    }//GEN-LAST:event_destinationComboFocusLost

    private void idComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idComboFocusLost
       if(idCombo.getSelectedIndex()>0)
       {
           id = idCombo.getItemAt(idCombo.getSelectedIndex());
           String name = null;
           for(HubAdmin obj:hAlist)
           {
               if(obj.getID().equals(id))
               {
                   name = obj.getName();
               }
           }
           noticeText.setText("Dear Mr. "+name+",\n\n (Enter Text Here)\n\nSincerely,\n\n"+username);
       }
    }//GEN-LAST:event_idComboFocusLost

    private void destinationComboMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationComboMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationComboMouseReleased

    private void idComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idComboActionPerformed

    private void destinationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationComboActionPerformed
    Loader li = new Loader();
    ArrayList<HubAdmin> hAlist = new ArrayList<>();
    ArrayList<String> emails = new ArrayList<>();
    ArrayList<String> emailList= new ArrayList<>();
    ArrayList<Owner> oWlist = new ArrayList<>();
    String username;
     String id ;
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> destinationCombo;
    private javax.swing.JComboBox<String> idCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea noticeText;
    // End of variables declaration//GEN-END:variables
}