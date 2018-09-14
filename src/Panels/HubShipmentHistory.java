/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.Loader;
import Classes.Shipment;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smart view
 */
public class HubShipmentHistory extends javax.swing.JInternalFrame {

    /**
     * Creates new form HubShipmentHistory
     */
    public HubShipmentHistory() {
        initComponents();
        dm = (DefaultTableModel) Table.getModel();
        li.Shipment();

        sHlist = li.return_shipment();

                
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Hub shipment");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jButton1.setBackground(new java.awt.Color(51, 204, 0));
        jButton1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        jButton1.setText("Load Shipment Table");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Table.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Shipment Type", "Shipment Owner", "Shipment trackID", "Shipment Pickup", "Shipment Destination"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setViewportView(Table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 594;
        gridBagConstraints.ipady = 154;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 9, 0, 0);
        getContentPane().add(jPanel1, gridBagConstraints);

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton2.setText("Generate TXT");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 699;
        gridBagConstraints.ipady = 42;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 69, 0);
        getContentPane().add(jButton2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int row = dm.getRowCount();
          for(int i = 0; i<row; i++)
          {
          dm.removeRow(dm.getRowCount()-1);
          }
          for(Shipment obj: sHlist)
          {
              dm.addRow(new Object[] {obj.get_shipmentType(), obj.get_ownerID(), obj.get_trackID(),obj.get_pickup(), obj.get_destination()});
          }
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       JFileChooser chooser = new JFileChooser();
        if(chooser.showSaveDialog(this)==JFileChooser.APPROVE_OPTION){
         try{  
            File file = chooser.getSelectedFile();
           FileWriter fw=new FileWriter(file.getAbsolutePath()+".txt");  
           for(int i = 0; i<dm.getRowCount();i++)
           {
               for(int j = 0 ; j<dm.getColumnCount(); j++)
               {
                   if(j==0)
                   {
                       fw.write("\nShipment Type: ");
                   }
                   else if(j==1)
                   {
                       fw.write("\nShipment Owner: ");
                   }
                   else if(j==2)
                   {
                       fw.write("\nShipment Tracking ID: ");
                   }
                   else if(j==3)
                   {
                       fw.write("\nShipment Pickup: ");
                   }
                   else if(j==4)
                   {
                       fw.write("\nShipment Destination: ");
                   }
                   fw.write((String) dm.getValueAt(i, j));
               }
           } 
            fw.close();  
            }catch(Exception e){System.out.println(e);}  
            System.out.println("success");  
        }
    }//GEN-LAST:event_jButton2ActionPerformed
   Loader li = new Loader();
   ArrayList<Shipment> sHlist = new ArrayList<>();
   DefaultTableModel dm;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane table;
    // End of variables declaration//GEN-END:variables
}
