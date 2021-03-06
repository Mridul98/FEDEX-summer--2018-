/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.AirCargoPilot;
import Classes.HubStaff;
import Classes.Loader;
import Classes.LorryPilot;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smart view
 */
public class ShowStaffDetails extends javax.swing.JInternalFrame {

    /**
     * Creates new form ShowStaffDetails
     */
    public ShowStaffDetails() {
        initComponents();
        dm = (DefaultTableModel) table.getModel();
        li.HubStaff();
        li.LorryPilot();
        li.airCargoPilot();
        hSlist = li.return_hubStaff();
        lPlist = li.return_lorry();
        aCPlist = li.return_pilot();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jobCombo = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jobCombo.setBackground(new java.awt.Color(0, 153, 51));
        jobCombo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jobCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Job Type", "Hub Staff", "Lorry Pilot", "AirCargoPilot", "All Employees" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jobCombo, 0, 351, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jobCombo, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        jButton2.setBackground(new java.awt.Color(0, 204, 0));
        jButton2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton2.setText("Create Document");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Hub Name", " ID", " Name", "Joining Date", "Contact Number", "Address", "Division"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(557, 557, 557)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        jButton1.setBackground(new java.awt.Color(204, 102, 0));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setText("Load Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = dm.getRowCount();
          for(int i = 0; i<row; i++)
          {
          dm.removeRow(dm.getRowCount()-1);
          }
     
        if(jobCombo.getSelectedIndex()==0)
     {
        jobCombo.requestFocus();
     }
        else if(jobCombo.getSelectedIndex()==1)
     {
         for(HubStaff obj : hSlist)
         {
             dm.addRow(new Object[]{obj.getBranch(), obj.getID(), obj.getName(), obj.get_Jdate().toString(), obj.get_mobile(), obj.get_address(), obj.get_division()});
         }
     }
        else if(jobCombo.getSelectedIndex()==2)
     {
         for(LorryPilot obj : lPlist)
         {
             if(obj.getBranch().equals(jobCombo.getItemAt(jobCombo.getSelectedIndex())))
             {
             dm.addRow(new Object[]{obj.getBranch(), obj.getID(), obj.getName(), obj.get_Jdate().toString(), obj.get_mobile(), obj.get_address(), obj.get_division()});
             }
         }
     }
        else if(jobCombo.getSelectedIndex()==3)
        {
           for(AirCargoPilot obj : aCPlist)
         {
             if(obj.getBranch().equals(jobCombo.getItemAt(jobCombo.getSelectedIndex())))
             {
             dm.addRow(new Object[]{obj.getBranch(), obj.getID(), obj.getName(), obj.get_Jdate().toString(), obj.get_mobile(), obj.get_address(), obj.get_division()});
             }
         } 
        }
        else if (jobCombo.getSelectedIndex()==4)
        {
           for(HubStaff obj : hSlist)
         {
             dm.addRow(new Object[]{obj.getBranch(), obj.getID(), obj.getName(), obj.get_Jdate().toString(), obj.get_mobile(), obj.get_address(), obj.get_division()});
         } 
           for(LorryPilot obj : lPlist)
         {
             if(obj.getBranch().equals(jobCombo.getItemAt(jobCombo.getSelectedIndex())))
             {
             dm.addRow(new Object[]{obj.getBranch(), obj.getID(), obj.getName(), obj.get_Jdate().toString(), obj.get_mobile(), obj.get_address(), obj.get_division()});
             }
         }
           for(AirCargoPilot obj : aCPlist)
         {
             if(obj.getBranch().equals(jobCombo.getItemAt(jobCombo.getSelectedIndex())))
             {
             dm.addRow(new Object[]{obj.getBranch(), obj.getID(), obj.getName(), obj.get_Jdate().toString(), obj.get_mobile(), obj.get_address(), obj.get_division()});
             }
         } 
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            Document doc = new Document();
            
            String filename = jobCombo.getItemAt(jobCombo.getSelectedIndex());
            System.out.println(filename);
            PdfWriter writer  = PdfWriter.getInstance(doc,new FileOutputStream(filename+".pdf"));
            
            
            doc.open();
      
            doc.add(new Paragraph("Details of "+jobCombo.getItemAt(jobCombo.getSelectedIndex())));
            doc.add(new Paragraph("\n"));
            //PDF table
            PdfPTable p = new PdfPTable(7);             
            p.addCell("Hub Name");   
            p.addCell("ID");
            p.addCell("Name");
            p.addCell("Joining Date");
            p.addCell("Contact Number");
            p.addCell("Address");
            p.addCell("Division");
            
            DefaultTableModel model= (DefaultTableModel) table.getModel();
          
            for(int i=0;i<model.getRowCount();i++){
                for(int j=0;j<model.getColumnCount();j++){
                    p.addCell((String) model.getValueAt(i, j));
                }
            }
          
            doc.add(p);
            doc.add(new Paragraph("Generated by Owner"));
            
            doc.close();
            writer.close();
            JOptionPane.showMessageDialog(null,"File created successfully");
            Runtime.getRuntime().exec("rundll32 url.dll, FileProtocolHandler "+filename+".pdf");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }//GEN-LAST:event_jButton2ActionPerformed
 Loader li = new Loader();
    ArrayList<HubStaff> hSlist = new ArrayList<>();
   ArrayList<LorryPilot> lPlist = new ArrayList<>();
   ArrayList<AirCargoPilot> aCPlist = new ArrayList<>();
   DefaultTableModel dm;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jobCombo;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
