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
public class AirCargoPilot extends StaffAccounts{
    public AirCargoPilot createAirCargoPilot(String id, String fName, String mobile, String addr, String div, String em, int zip, String gm, LocalDate d, String lic, String vNumber, int sal)
    {
        createAccount(id,  fName,  mobile,  addr,  div,  em,  zip,  gm,  d);
        vehicleNumber = vNumber;
        licence = lic;
        salary = sal;
        return this;        
    }

    @Override
    public Accounts updateAccounts(String id, String fName, String mobile, String addr, String div, String em, int zip, String pass, String securityQ, String securityAns, String gm, LocalDate d,LocalDate c, String brn, String lic, LocalTime start, LocalTime end, int sal, String vNumber) {
       createAirCargoPilot(id, fName,  mobile,  addr,  div, em,  zip, gm,  d, lic, vNumber, sal);
       jDate = c;
       return this;
    }


   
}
