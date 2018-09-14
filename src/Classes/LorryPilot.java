/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MSI
 */
public class LorryPilot extends StaffAccounts {
    
    public LorryPilot createLorryPilot(String id, String fname, String mobile, String addr, String div, String em, int zip, String gm, LocalDate d, String brn, String lic, String vNumber, int sal)
    {
        createAccount(id,  fname,  mobile,  addr,  div,  em,  zip, gm,  d);
        branch = brn;
        licence = lic;
        vehicleNumber = vNumber;
        salary = sal;
        return this;        
    }


    @Override
     public Accounts updateAccounts(String id, String fName, String mobile, String addr, String div, String em, int zip, String pass, String securityQ, String securityAns, String gm, LocalDate d,LocalDate c, String brn, String lic, LocalTime start, LocalTime end, int sal, String vNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



  
}
