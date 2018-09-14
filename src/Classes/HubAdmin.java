/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class HubAdmin extends StaffAccounts {
    
    public HubAdmin createHubAdmin(String id, String fname, String mobile, String addr, String div, String em, int zip, String pass,String securityQ, String securityA, String gm, LocalDate d, String brn, LocalTime start, LocalTime end, int sal)
    {
        createAccount(id,  fname,  mobile,  addr,  div,  em,  zip,  pass,  securityQ, securityA,  gm,  d);
        branch = brn;
        stShift = start;
        endShift = end;
        salary = sal;
        return this;        
    }


    @Override
    public Accounts updateAccounts(String id, String fName, String mobile, String addr, String div, String em, int zip, String pass, String securityQ, String securityA, String gm, LocalDate d,LocalDate c, String brn, String lic, LocalTime start, LocalTime end, int sal, String vNumber) {
       createAccount(id,  fName,  mobile,  addr,  div,  em,  zip,  pass,  securityQ, securityA,  gm,  d);
       branch = brn;
        stShift = start;
        endShift = end;
        salary = sal;
        return this;
    }



  
}
