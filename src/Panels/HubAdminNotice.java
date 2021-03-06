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
import Classes.PersonalCustomer;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author smart view
 */
public class HubAdminNotice extends javax.swing.JInternalFrame {

    /**
     * Creates new form HubAdminNotice
     */
    public HubAdminNotice(String id) {
        initComponents();
        li.HubAdmins();
        ArrayList<HubAdmin> hAlist = new ArrayList<>();
        hAlist = li.return_hubAdmin();
        li.HubStaff();
        li.LorryPilot();
        li.BusinessCustomer();
        li.PersonalCustomer();
        li.airCargoPilot();
        hSlist = li.return_hubStaff();
        lPlist = li.return_lorry();
        bClist = li.return_business();
        pClist = li.return_personal();
        aCPlist = li.return_pilot();
        for(HubAdmin obj : hAlist)
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
        jScrollPane1 = new javax.swing.JScrollPane();
        noticeText = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        destinationCombo = new javax.swing.JComboBox<>();
        idCombo = new javax.swing.JComboBox<>();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel1.setText("Type Down Below:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 21;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 36, 0, 0);
        getContentPane().add(jLabel1, gridBagConstraints);

        noticeText.setColumns(20);
        noticeText.setRows(5);
        jScrollPane1.setViewportView(noticeText);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 870;
        gridBagConstraints.ipady = 353;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 36, 0, 31);
        getContentPane().add(jScrollPane1, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(0, 204, 102));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setText("Night View");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.ipadx = 27;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 101, 0, 0);
        getContentPane().add(jButton1, gridBagConstraints);

        jButton2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton2.setText("Save PDF");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 55;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 12, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        destinationCombo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        destinationCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Notice Destination", "To All Hub Staff", "To a  Hub Staff", "To All Lorry Pilots", "To All Air Cargo Pilots", "To a Lorry Pilot", "To a Air Cargo Pilot", "To All Customers", "To All Personal Customers", "To All Business Customers", "To a Personal Customer", "To a BusinessCustomer" }));
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
        gridBagConstraints.ipadx = -21;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(23, 58, 0, 0);
        getContentPane().add(destinationCombo, gridBagConstraints);

        idCombo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        idCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID" }));
        idCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                idComboFocusLost(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 59;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(24, 51, 0, 0);
        getContentPane().add(idCombo, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     void initializeIDCombo(int x)
    {
        selector = x;
        idCombo.removeAllItems();
        if(x==1)
        {
           for(HubStaff obj: hSlist)
           {
               idCombo.addItem(obj.getID());
           }
           idCombo.setVisible(true);
           idCombo.requestFocus();
        }
        else if(x==2)
        {
           for(LorryPilot obj: lPlist)
           {
               idCombo.addItem(obj.getID());
           }
           idCombo.setVisible(true);
           idCombo.requestFocus();
        }
        else if(x==3)
        {
           for(AirCargoPilot obj: aCPlist)
           {
               idCombo.addItem(obj.getID());
           }
           idCombo.setVisible(true);
           idCombo.requestFocus();
        }
        else if(x==3)
        {
           for(PersonalCustomer obj: pClist)
           {
               idCombo.addItem(obj.getID());
           }
           idCombo.setVisible(true);
           idCombo.requestFocus();
        }
        else if(x==4)
        {
           for(BusinessCustomer obj: bClist)
           {
               idCombo.addItem(obj.getID());
           }
           idCombo.setVisible(true);
           idCombo.requestFocus();
        }
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         if("Day View".equals(jButton1.getText())){
            noticeText.setBackground(Color.WHITE);
            noticeText.setForeground(Color.BLACK);
            jButton1.setText("Night View");
            jButton1.setBackground(Color.green);
       }
       else{
           noticeText.setBackground(Color.BLACK);
        noticeText.setForeground(Color.WHITE);
        jButton1.setText("Day View");
        jButton1.setBackground(Color.red);
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void destinationComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_destinationComboFocusLost
        if(destinationCombo.getSelectedIndex()==0)
        {
            destinationCombo.requestFocus();
        }
        if(destinationCombo.getSelectedIndex()==1)
        {
            noticeText.removeAll();
            noticeText.setText("Dear Hub Staffs,\n\n (Enter Text Here) \n\n Sincerely,\n\n"+username);

        }
        if(destinationCombo.getSelectedIndex()==2)
        {
            noticeText.removeAll();
            initializeIDCombo(1);
        }
        if(destinationCombo.getSelectedIndex()==3)
        {
            noticeText.removeAll();
            noticeText.setText("Dear Lorry Pilots,\n\n (Enter Text Here) \n\n Sincerely,\n\n"+username);
        }
        if(destinationCombo.getSelectedIndex()==4)
        {
            noticeText.removeAll();
            noticeText.setText("Dear Air Cargo Pilots,\n\n (Enter Text Here) \n\n Sincerely,\n\n"+username);
        }
        if(destinationCombo.getSelectedIndex()==5)
        {
            noticeText.removeAll();
            initializeIDCombo(2);
        }
        if(destinationCombo.getSelectedIndex()==6)
        {
            noticeText.removeAll();
            initializeIDCombo(3);
        }
        if(destinationCombo.getSelectedIndex()==7)
        {
            noticeText.removeAll();
            noticeText.setText("Dear Users,\n\n (Enter Text Here)\n\n Sincerely,\n\n"+username);
        }
        if(destinationCombo.getSelectedIndex()==8)
        {
            noticeText.removeAll();
            noticeText.setText("Dear Perosnal Account Users,\n\n (Enter Text Here)\n\nSincerely,\n\n"+username);
        }
        if(destinationCombo.getSelectedIndex()==9)
        {
            noticeText.removeAll();
            noticeText.setText("Dear Business Account Users,\n\n (Enter Text Here)\n\nSincerely,\n\n"+username);
        }
        if(destinationCombo.getSelectedIndex()==10)
        {
            noticeText.removeAll();
            initializeIDCombo(4);
            
        }
        if(destinationCombo.getSelectedIndex()==11)
        {
            noticeText.removeAll();
            initializeIDCombo(5);
        }

    }//GEN-LAST:event_destinationComboFocusLost

    private void destinationComboMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_destinationComboMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationComboMouseReleased

    private void idComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idComboFocusLost
        if(idCombo.getSelectedIndex()>0)
        {
            String id = idCombo.getItemAt(idCombo.getSelectedIndex());
            String name = null;
            if(selector == 1)
            {
            for(HubStaff obj:hSlist)
            {
                if(obj.getID().equals(id))
                {
                    name = obj.getName();
                }
            }
            }
            else if(selector ==2)
            {
            for(LorryPilot obj:lPlist)
            {
                if(obj.getID().equals(id))
                {
                    name = obj.getName();
                }
            }
            }
            else if(selector ==3)
            {
            for(AirCargoPilot obj:aCPlist)
            {
                if(obj.getID().equals(id))
                {
                    name = obj.getName();
                }
            }
            }
            else if(selector ==4)
            {
            for(BusinessCustomer obj:bClist)
            {
                if(obj.getID().equals(id))
                {
                    name = obj.getName();
                }
            }
            }
            else if(selector == 5)
            {
            for(PersonalCustomer obj:pClist)
            {
                if(obj.getID().equals(id))
                {
                    name = obj.getName();
                }
            }
            }
            noticeText.setText("Dear Mr. "+name+",\n\n(Enter Text Here)\n\n Sincerely, \n\n"+username);
        }
    }//GEN-LAST:event_idComboFocusLost
    Loader li = new Loader();
    ArrayList<HubStaff> hSlist = new ArrayList<>();
    ArrayList<LorryPilot> lPlist= new ArrayList<>();
    ArrayList<AirCargoPilot> aCPlist= new ArrayList<>();
    ArrayList<BusinessCustomer> bClist = new ArrayList<>();
    ArrayList<PersonalCustomer> pClist = new ArrayList<>();
    String username;
    int selector;
    private void destinationComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_destinationComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_destinationComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
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
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> destinationCombo;
    private javax.swing.JComboBox<String> idCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea noticeText;
    // End of variables declaration//GEN-END:variables
}
