/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Loader {
    
    private ArrayList<BusinessCustomer> business = new ArrayList<>();
    private ArrayList<PersonalCustomer> personal = new ArrayList<>();
    private ArrayList<HubAdmin> hub = new ArrayList<>();
    private ArrayList<HubStaff> hubSt = new ArrayList<>();
    private ArrayList<LorryPilot> lorryp = new ArrayList<>();
    private ArrayList<AirCargoPilot> aircargop = new ArrayList<>();
    private ArrayList<Shipment> sHlist  = new ArrayList<>(); 
    private ArrayList<Owner> oWlist = new ArrayList<>();
    private ArrayList<String> loginH = new ArrayList<>();
    private ArrayList<String> allEmails = new ArrayList<>();
    
    public void loadAllEmails()
   {
       allEmails.clear();
       for(HubAdmin hubA : hub)
       {
           allEmails.add(hubA.get_email());
       }
       
       for(HubStaff hubS : hubSt)
       {
           allEmails.add(hubS.get_email());
       }
       
       for(BusinessCustomer bs : business)
       {
           allEmails.add(bs.get_email());
       }
       
       for(PersonalCustomer ps : personal)
       {
           allEmails.add(ps.get_email());
       }
       
       for(LorryPilot lp : lorryp)
       {
           allEmails.add(lp.get_email());
       }
       
       for(AirCargoPilot ar : aircargop)
       {
           allEmails.add(ar.get_email());
       }
   }
    
    
    
    public void loginH() throws FileNotFoundException
    {
        String id, date, time;        
        loginH.clear();
        DataInputStream in = new DataInputStream(new 
              BufferedInputStream(new FileInputStream("LoginFile"))); 
      
        try {
            while (true) {
                id = in.readUTF();
                date = in.readUTF();
                time = in.readUTF();
                loginH.add(id+"~"+date+"~"+time);
            }
        } 
        catch(Exception e) {}
        finally{
            try{
                in.close();
            }
            catch(IOException e){}
        }
    }
    
    

    
    
    public void HubAdmins() {
    try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("HubAdmin.bin")));  
        hub.clear();
        HubAdmin hubA;
        while(( hubA = (HubAdmin) in.readObject()) != null ) {
            hub.add(hubA);
        }
        in.close();
      }
        catch(Exception e){
        }

   }
    public void Owner() {
    try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(new File("Owner.bin")));  
        oWlist.clear();
        Owner oW;
        while(( oW = (Owner) in.readObject()) != null ) {
            oWlist.add(oW);
        }
        in.close();
      }
        catch(Exception e){
        }

   }
   
    public void HubStaff(){   
    try {
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("HubStaff.bin"));  
         HubStaff hubS;  
         hubSt.clear();
         while( (hubS=(HubStaff)in.readObject()) != null ) {
            hubSt.add(hubS);
        }
         in.close();
      }
        catch(IOException | ClassNotFoundException e){
        
        }
    }
    
   public void BusinessCustomer() {

       try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("BusinessCustomer.bin"));  
        BusinessCustomer ba;
        business.clear();
        while( (ba=(BusinessCustomer)in.readObject()) != null ) {
         business.add(ba);
        }
        in.close();
      }
        catch(IOException | ClassNotFoundException e){}
   }
   
   public void PersonalCustomer(){
     
       try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("PersonalCustomer.bin"));  
        PersonalCustomer pa;
        personal.clear();
        while( (pa=(PersonalCustomer)in.readObject()) != null ) {
            personal.add(pa);
        }
        in.close();
      }
        catch(IOException | ClassNotFoundException e){}

   }
   
   public void LorryPilot(){
  
       try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("LorryPilot.bin"));  
        LorryPilot lp;
        lorryp.clear();
        while( (lp=(LorryPilot)in.readObject()) != null ) {
            lorryp.add(lp);
        }
        in.close();
      }
        catch(IOException | ClassNotFoundException e){}

   }
   
   public void airCargoPilot(){
    
       try {
           ObjectInputStream in = new ObjectInputStream(new FileInputStream("AirCargoPilot.bin"));  
        AirCargoPilot acp;
        aircargop.clear();
        while( (acp=(AirCargoPilot)in.readObject()) != null ) {
            aircargop.add(acp);
        }
        in.close();
      }
        catch(IOException | ClassNotFoundException e){}
 
   }
   
   public void Shipment(){   
    try {
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("Shipment.bin"));  
         Shipment sH;  
         sHlist.clear();
         while( (sH=(Shipment)in.readObject()) != null ) {
            sHlist.add(sH);
        }
         in.close();
      }
        catch(IOException | ClassNotFoundException e){
        
        }
    }
   
 
   
   public ArrayList return_business()
   {
       return business;
   }
   public ArrayList return_personal()
   {
       return personal;
   }
   public ArrayList return_hubAdmin()
   {
       return hub;
   }
   public ArrayList return_hubStaff()
   {
       return hubSt;
   }
   public ArrayList return_lorry()
   {
       return lorryp;
   }
   public ArrayList return_pilot()
   {
       return aircargop;
   }
   
   public ArrayList return_shipment()
   {
       return sHlist;
   }
   
   public ArrayList return_Owner()
   {
       return oWlist;
   }
   
   
   public ArrayList return_loginH()
   {
       return loginH;
   }
   
   public ArrayList return_AllEmails()
   {
       return allEmails;
   }
}
