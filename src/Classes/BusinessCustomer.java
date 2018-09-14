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
public class BusinessCustomer extends CustomerAccounts{
    public BusinessCustomer createBusinessCustomer(String id, String compny, String pass, String em, String number, String add)
    {
       createAccount(compny, pass, id, em, number, add);
       return this;
    }

    @Override
    public Accounts updateAccounts(String id, String fName, String mobile, String addr, String div, String em, int zip, String pass, String securityQ, String securityAns, String gm, LocalDate d,LocalDate c, String brn, String lic, LocalTime start, LocalTime end, int sal, String vNumber) {
         createAccount(id,  fName,  mobile,  addr,  div,  em,  zip,  pass,  securityQ, securityAns,  gm,  d);
         return this;
    }


 


}
