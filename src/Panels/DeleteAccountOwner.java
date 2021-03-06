/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Classes.AirCargoPilot;
import Classes.HubAdmin;
import Classes.HubStaff;
import Classes.Loader;
import Classes.LorryPilot;
import Classes.Owner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingWorker;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author smart view
 */
public class DeleteAccountOwner extends javax.swing.JInternalFrame {

    /**
     * Creates new form DeleteAccountOwner
     */
    public DeleteAccountOwner(int i) {
        initComponents();
        selector = i;
        if(selector == 1)
        {
            selectorCombo.setVisible(false);
        }
        dm = (DefaultTableModel) accountsTable.getModel();
        
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
        selectorCombo = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        accountsTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Delete Account");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        selectorCombo.setBackground(new java.awt.Color(0, 204, 153));
        selectorCombo.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        selectorCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Account type", "Hub Staff", "Air Cargo Pilot", "Lorry Pilot", " " }));
        selectorCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorComboActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 204, 51));
        jButton1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton1.setText("Load Table ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(selectorCombo, 0, 354, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(selectorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 706;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(jPanel1, gridBagConstraints);

        accountsTable.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        accountsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Account type", "Name", "ID", "Joining date", "Assigned Hub", "Select"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(accountsTable);

        jButton2.setBackground(new java.awt.Color(204, 0, 0));
        jButton2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jButton2.setText("Delete Selected Account");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 94, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 29;
        gridBagConstraints.ipady = 94;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 0, 0, 0);
        getContentPane().add(jPanel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     public void start_hubAdminUpdate()
     {
        SwingWorker<Boolean,Void> worker = new SwingWorker<Boolean,Void>(){
            @Override
            public Boolean doInBackground() throws Exception{
                String fileName="HubAdmin.bin";
               File file = new File (fileName);
                ObjectOutputStream out = null;
                    try{
                        out = new ObjectOutputStream (new FileOutputStream (fileName, false));
                        for(HubAdmin obj: hAlist)
                        {
                        out.writeObject(obj);    
                        }
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
                return true;
            }

        };
        worker.execute(); 
     }
     
     public void start_hubStaffUpdate()
     {
        SwingWorker<Boolean,Object[]> worker = new SwingWorker<Boolean,Object[]>(){
            @Override
            public Boolean doInBackground() throws Exception{
                String fileName="HubStaff.bin";
               File file = new File (fileName);
                ObjectOutputStream out = null;
                    try{
                        out = new ObjectOutputStream (new FileOutputStream (fileName, false));
                        for(HubStaff obj: hSlist)
                        {
                        out.writeObject(obj);    
                        }
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
                return true;
            }

            @Override
            public void process(List<Object[]> obj){
               // result.setText(result.getText()+"No of Student of "+obj.get(0)[0].toString()+" Dept: "+Integer.parseInt(obj.get(0)[1].toString())+"\n");
            }
            
            @Override
            public void done() {
                boolean done=false;
                try {
                    done = get();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                if(done){
                    //statusLabel.setText("Text Files are created successfully");
                }else{
                    //statusLabel.setText("Text Files creation Failed");
                }
            }
        };
        worker.execute(); 
     }
     
     public void start_lorryPilotUpdate()
     {
        SwingWorker<Boolean,Object[]> worker = new SwingWorker<Boolean,Object[]>(){
            @Override
            public Boolean doInBackground() throws Exception{
                String fileName="LorryPilot.bin";
               File file = new File (fileName);
                ObjectOutputStream out = null;
                    try{
                        out = new ObjectOutputStream (new FileOutputStream (fileName, false));
                        for(LorryPilot obj: lPlist)
                        {
                        out.writeObject(obj);    
                        }
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
                return true;
            }

            @Override
            public void process(List<Object[]> obj){
               // result.setText(result.getText()+"No of Student of "+obj.get(0)[0].toString()+" Dept: "+Integer.parseInt(obj.get(0)[1].toString())+"\n");
            }
            
            @Override
            public void done() {
                boolean done=false;
                try {
                    done = get();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                if(done){
                    //statusLabel.setText("Text Files are created successfully");
                }else{
                    //statusLabel.setText("Text Files creation Failed");
                }
            }
        };
        worker.execute(); 
     }
     
     public void start_airCargoPilotUpdate()
     {
        SwingWorker<Boolean,Object[]> worker = new SwingWorker<Boolean,Object[]>(){
            @Override
            public Boolean doInBackground() throws Exception{
                String fileName="AirCargoPilot.bin";
               File file = new File (fileName);
                ObjectOutputStream out = null;
                    try{
                        out = new ObjectOutputStream (new FileOutputStream (fileName, false));
                        for(AirCargoPilot obj: aCPlist)
                        {
                        out.writeObject(obj);    
                        }
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
                return true;
            }

            @Override
            public void process(List<Object[]> obj){
               // result.setText(result.getText()+"No of Student of "+obj.get(0)[0].toString()+" Dept: "+Integer.parseInt(obj.get(0)[1].toString())+"\n");
            }
            
            @Override
            public void done() {
                boolean done=false;
                try {
                    done = get();
                } catch(Exception ex) {
                    ex.printStackTrace();
                }
                if(done){
                    //statusLabel.setText("Text Files are created successfully");
                }else{
                    //statusLabel.setText("Text Files creation Failed");
                }
            }
        };
        worker.execute(); 
     }
    private void selectorComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectorComboActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int row = dm.getRowCount();
          for(int i = 0; i<row; i++)
          {
          dm.removeRow(dm.getRowCount()-1);
          }
        if(selector == 1)
        {
            li.HubAdmins();
            hAlist = li.return_hubAdmin();
            for(HubAdmin obj:hAlist)
            {
                dm.addRow(new Object[]{"Hub Admin", obj.getName(), obj.getID(), obj.get_Jdate().toString(), obj.getBranch(), false});
            }
        }
        else
        {
        if(selectorCombo.getSelectedIndex() == 1)
        {
            li.HubStaff();
            hSlist = li.return_hubStaff();
            for(HubStaff obj:hSlist)
            {
                dm.addRow(new Object[]{"Hub Staff", obj.getName(), obj.getID(), obj.get_Jdate().toString(), obj.getBranch(), false});
            }
            
        }
        else if(selectorCombo.getSelectedIndex() == 2)
        {
            li.LorryPilot();
            lPlist = li.return_lorry();
            for(LorryPilot obj: lPlist)
            {
                dm.addRow(new Object[]{"Lorry Pilot", obj.getName(), obj.getID(), obj.get_Jdate().toString(), obj.getBranch(), false});
            }
            
        }
        else if(selectorCombo.getSelectedIndex() == 3)
        {
            li.airCargoPilot();
            aCPlist = li.return_pilot();
            for(AirCargoPilot obj: aCPlist)
            {
                dm.addRow(new Object[]{"Air Cargo Pilot", obj.getName(), obj.getID(), obj.get_Jdate().toString(), obj.getBranch(), false});
            }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       boolean delete = false;
       
       delIDs.clear();
       
       
        for(int i=0; i<dm.getRowCount(); i++)
       {
           delete = (boolean) dm.getValueAt(i, 5);
            if(delete==true)
            {
               delIDs.add((String)dm.getValueAt(i, 2));
            }
       }
        
        
        if(!delIDs.isEmpty())
        {
        if(selector == 1)
        {
        Iterator<HubAdmin> hAitr = hAlist.iterator(); 
        while(hAitr.hasNext())
        {
            HubAdmin delhA = hAitr.next();
            for(String s : delIDs)
            {
               if(delhA.getID().equals(s))
            {
                hAitr.remove();
            } 
            }
        }
        start_hubAdminUpdate();
        }
        else{
        if(selectorCombo.getSelectedIndex() == 1)
        {
        Iterator<HubStaff> hSitr = hSlist.iterator(); 
        while(hSitr.hasNext())
        {
            HubStaff delhS = hSitr.next();
            for(String s : delIDs)
            {
               if(delhS.getID().equals(s))
            {
                hSitr.remove();
            } 
            }
        } 
        start_hubStaffUpdate();
        }
        else if(selectorCombo.getSelectedIndex() ==2)
        {
        Iterator<LorryPilot> lPitr = lPlist.iterator(); 
        while(lPitr.hasNext())
        {
            LorryPilot dellP = lPitr.next();
            for(String s : delIDs)
            {
               if(dellP.getID().equals(s))
            {
                lPitr.remove();
            } 
            }
        } 
        start_lorryPilotUpdate();
        }
        else if (selectorCombo.getSelectedIndex() == 3)
        {
        Iterator<AirCargoPilot> aCPitr = aCPlist.iterator(); 
        while(aCPitr.hasNext())
        {
            AirCargoPilot delaCP = aCPitr.next();
            for(String s : delIDs)
            {
               if(delaCP.getID().equals(s))
            {
                aCPitr.remove();
            } 
            }
        }  
        start_airCargoPilotUpdate();
        }
                
        }
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed
     Loader li = new Loader();
     ArrayList<HubAdmin> hAlist = new ArrayList<>();
      ArrayList<HubStaff> hSlist = new ArrayList<>();
     ArrayList<LorryPilot> lPlist = new ArrayList<>();
     ArrayList<AirCargoPilot> aCPlist = new ArrayList<>();
     ArrayList<String> delIDs = new ArrayList<>();
     DefaultTableModel dm;
     int selector;
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accountsTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> selectorCombo;
    // End of variables declaration//GEN-END:variables
}
