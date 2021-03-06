/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.BusinessCustomer;
import Classes.Loader;
import java.awt.Color;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import java.util.*;  
import javax.mail.*;  
import javax.mail.internet.*;  

/**
 *
 * @author smart view
 */

public class CustomerBusinessAccountCreatorPanel extends javax.swing.JInternalFrame {

    /**
     * Creates new form CustomerBusinessAccountCreatorPanel
     */
    
    public CustomerBusinessAccountCreatorPanel() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        fName = new javax.swing.JLabel();
        passLabel = new javax.swing.JLabel();
        fullNameField = new javax.swing.JTextField();
        passField = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        addrLabel = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        mobileLabel = new javax.swing.JLabel();
        mobileNumberField = new javax.swing.JTextField();
        rPassLabel = new javax.swing.JLabel();
        retypePassField = new javax.swing.JPasswordField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Business Account Creator");
        setToolTipText("");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        fName.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        fName.setText("Company Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(44, 81, 0, 0);
        getContentPane().add(fName, gridBagConstraints);

        passLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        passLabel.setText(" Password: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 81, 0, 0);
        getContentPane().add(passLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 234;
        gridBagConstraints.ipady = 28;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(48, 53, 0, 86);
        getContentPane().add(fullNameField, gridBagConstraints);

        passField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 234;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 53, 0, 86);
        getContentPane().add(passField, gridBagConstraints);

        jButton1.setBackground(new java.awt.Color(0, 153, 51));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setText("Create");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 357;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(26, 81, 20, 86);
        getContentPane().add(jButton1, gridBagConstraints);

        emailLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        emailLabel.setText("Company Email: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 81, 0, 0);
        getContentPane().add(emailLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 234;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 53, 0, 86);
        getContentPane().add(emailField, gridBagConstraints);

        addrLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        addrLabel.setText("Company Address: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 10;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 81, 0, 0);
        getContentPane().add(addrLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 234;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 53, 0, 86);
        getContentPane().add(addressField, gridBagConstraints);

        mobileLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        mobileLabel.setText("Contact Number:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 13;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(4, 81, 0, 0);
        getContentPane().add(mobileLabel, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.ipadx = 234;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 53, 0, 86);
        getContentPane().add(mobileNumberField, gridBagConstraints);

        rPassLabel.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        rPassLabel.setText("Re-Type Password: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 81, 0, 0);
        getContentPane().add(rPassLabel, gridBagConstraints);

        retypePassField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retypePassFieldActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 234;
        gridBagConstraints.ipady = 29;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(9, 53, 0, 86);
        getContentPane().add(retypePassField, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void start_business()
     {
        SwingWorker<Boolean,Void> worker = new SwingWorker<Boolean,Void>(){
            @Override
            public Boolean doInBackground() throws Exception{
                String fileName="BusinessCustomer.bin";
               File file = new File (fileName);
                ObjectOutputStream out = null;
                 boolean append=true;
                    try{
                        if (!file.exists () || !append) out =
                            new ObjectOutputStream (new FileOutputStream (fileName));
                        else out = 
                            new AppendableObjectOutputStream (new FileOutputStream (fileName, append));
                        out.writeObject(bC);
                        out.flush ();
                    }catch (Exception e){
                        //e.printStackTrace ();
                    }finally{
                        try{
                            if (out != null) out.close();
                        }catch (Exception e){
                            //e.printStackTrace();
                        }
        }
         //Get properties object    
          Properties props = new Properties();    
          props.put("mail.smtp.host", "smtp.gmail.com");    
          props.put("mail.smtp.socketFactory.port", "465");    
          props.put("mail.smtp.socketFactory.class",    
                    "javax.net.ssl.SSLSocketFactory");    
          props.put("mail.smtp.auth", "true");    
          props.put("mail.smtp.port", "465");    
          //get Session   
          Session session = Session.getDefaultInstance(props,    
           new javax.mail.Authenticator() {    
           protected PasswordAuthentication getPasswordAuthentication() {    
           return new PasswordAuthentication("rapidoteam2018@gmail.com","7951384620");  
           }    
          });    
          //compose message    
          try {    
           MimeMessage message = new MimeMessage(session);    
           message.addRecipient(Message.RecipientType.TO,new InternetAddress(emailField.getText()));    
           message.setSubject("Confirmation of Account Creation");    
           message.setText("Dear Sir, \n\nThis email is to confirm the creation of a Rapido account for "+fullNameField.getText()+". Your ID is: "+id+".\n\nWe look to provide you with the quickest and most secure shipping service of Bangladesh. \n\n Your's Sincerely, \n\n Rapido Team");    
           //send message  
           Transport.send(message);    
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {throw new RuntimeException(e);} 
                return true;
            }

        };
        worker.execute(); 
     }
    
    class AppendableObjectOutputStream extends ObjectOutputStream {
       public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }
  @Override
    protected void writeStreamHeader() throws IOException {}
    
  }
    
      
    boolean passCheck(char[] pass)
    {
        boolean foundUpper = false, foundLower = false, foundAlpha = false;
        
        if(pass.length<8)
        {
            return false;
        }
        
        for(int i = 0; i<pass.length; i++)        
        {
            if(Character.isAlphabetic(pass[i]))
            {
                foundAlpha = true;
                if(Character.isUpperCase(pass[i]))
                {
                    foundUpper = true;
                }
                else
                {
                    foundLower = true;
                }
            }
        }
        if(foundUpper == true && foundLower == true && foundAlpha == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //id
      String prev_id;
      //checkbools
      boolean name = false, em = false, addr = false, pass = false, rpass = false, mobile = false;
      //loadArrays
      li.BusinessCustomer();
      li.loadAllEmails();
      bClist = li.return_business();
      emailList = li.return_AllEmails();
      //namecheck
      if(fullNameField.getText().equals(""))
      {
          fName.setForeground(Color.red);
          fullNameField.requestFocus();
      }
      else
      {
          name = true;
          fName.setForeground(Color.black);
      }
      //emailFieldCheck
      if(emailField.getText().equals(""))
      {
          emailLabel.setForeground(Color.red);
          emailField.requestFocus();
      }
      else
      {
          em = true;
          emailLabel.setForeground(Color.black);
      }
      //emailExistCheck
      if(!emailList.isEmpty())
      {
          for(String emails : emailList)
          {
              if(emailField.getText().equals(emails))
              {
                  emailField.setForeground(Color.red);
                  em = false;
                  emailField.requestFocus();
                  break;
              }
          }
      }
      //addressCheck
      if(addressField.getText().equals(""))
      {
          addrLabel.setForeground(Color.red);
          addressField.requestFocus();
      }
      else
      {
          addr = true;
          addrLabel.setForeground(Color.black);
      }
      //passCheck
      if(passField.getPassword().length <8 || passCheck(passField.getPassword()) == false)
      {
          passLabel.setForeground(Color.red);
          passField.requestFocus();
          
      }
      else
      {
          passLabel.setForeground(Color.black);
          pass = true;
      }
      //RtypePassCheck
      if(!(String.valueOf(retypePassField.getPassword()).equals(String.valueOf(passField.getPassword()))) || retypePassField.getPassword().length == 0)
      {
          rPassLabel.setForeground(Color.red);
          retypePassField.requestFocus();
      }
      else
      {
          rPassLabel.setForeground(Color.black);
          rpass = true;  
      }
      //checkMobile
      if(mobileNumberField.getText().equals(""))
      {
          mobileLabel.setForeground(Color.red);
          mobileLabel.requestFocus();
      }
      else if(mobileNumberField.getText().length()!=11)
      {
          mobileLabel.setForeground(Color.red);
          mobileLabel.requestFocus();
      }
      else
      {
          mobileLabel.setForeground(Color.black);
          mobile = true;
      }
      //createBusinessAccount
      if(name == true && em == true && addr == true && pass == true && rpass == true &&  mobile == true)
      {
          if(bClist.isEmpty())
          {
              id = "FEDEXBC0";
          }
          else
          {
              prev_id = bClist.get(bClist.size()-1).getID();
              String[] split = prev_id.split("BC");
              int number = Integer.parseInt(split[1]);
              number++;
              id = "FEDEXBC"+number;
          }
      
        
          bC = new BusinessCustomer();
          bC.createBusinessCustomer(id, fullNameField.getText(), String.valueOf(passField.getPassword()),emailField.getText(), mobileNumberField.getText(), addressField.getText() );
          start_business();
        
          JOptionPane.showMessageDialog(null, "New Business Customer Account Created. Your ID has been emailed to you.", "Success", JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passFieldActionPerformed

    private void retypePassFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retypePassFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_retypePassFieldActionPerformed
Loader li = new Loader();
BusinessCustomer bC;
ArrayList <String> emailList = new ArrayList<>();
ArrayList <BusinessCustomer> bClist = new ArrayList<>();
String id = "";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addrLabel;
    private javax.swing.JTextField addressField;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fullNameField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileNumberField;
    private javax.swing.JPasswordField passField;
    private javax.swing.JLabel passLabel;
    private javax.swing.JLabel rPassLabel;
    private javax.swing.JPasswordField retypePassField;
    // End of variables declaration//GEN-END:variables
}
