/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author MSI
 */
public abstract class Accounts implements Serializable{
    
    boolean accountStatus;
    int zipCode;
    String uniqueID, fullName, contactNumber, address, division, email, password, securityAnswer, securityQuestion, gender, companyName;
    LocalDate dob, jDate;
    
    public abstract Accounts updateAccounts(String id, String fName, String mobile, String addr, String div, String em, int zip, String pass,String securityQ, String securityAns, String gm, LocalDate d,LocalDate c, String brn, String lic, LocalTime start, LocalTime end, int sal, String vNumber);
    
    void createAccount(String id, String fName, String mobile, String addr, String div, String em, int zip, String pass,String securityQ, String securityAns, String gm, LocalDate d)
    {
        jDate = LocalDate.now();
        uniqueID = id;
        fullName = fName;
        contactNumber = mobile;
        address = addr;
        division = div;
        email = em;
        zipCode = zip;
        password = pass;
        securityQuestion = securityQ;
        securityAnswer = securityAns;
        gender = gm;
        dob = d;
    }
    
    void createAccount(String cmpny, String pass, String id, String em, String number, String add)
    {
        jDate = LocalDate.now();
        uniqueID = id;
        companyName = cmpny;
        password = pass;
        email = em;
        contactNumber = number;
        address = add;
        
    }
    
    void createAccount(String id, String fName, String  mobile, String addr, String  div, String em, int zip, String gm, LocalDate d)
    {
        jDate = LocalDate.now();
        uniqueID = id;
        fullName = fName;
        contactNumber = mobile;
        address = addr;
        division = div;
        email = em;
        zipCode = zip;
        gender = gm;
        dob = d;
    }
    
    public String getID()
    {
        return uniqueID;
    }
    
    public String getName()
    {
        return fullName;
    }
    
    public String get_mobile()
    {
        return contactNumber;
    }
    
    public String get_address()
    {
        return address;
    }
    
    
    public int get_zip()
    {
        return zipCode;
    }
    
    public String get_email()
    {
        return email;
    }
    
    public String get_division()
    {
        return division;
    }
    
    public String get_password()
    {
        return password;
    }
    
    public String get_gender(){
        return gender;
    }
    
    public String get_companyName()
    {
        return companyName;
    }
    
    public String get_securityQ()
    {
        return securityQuestion;
    }
    
    public String get_securityAns()
    {
        return securityAnswer;
    }
    
    public LocalDate get_birthDate()
    {
        return dob;
    }
    
    public LocalDate get_Jdate()
    {
        return jDate;
    }
}
