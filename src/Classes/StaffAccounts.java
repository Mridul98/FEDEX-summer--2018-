/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.time.LocalTime;

/**
 *
 * @author MSI
 */
public abstract class StaffAccounts extends Accounts{
    String branch;
    String licence; 
    LocalTime stShift, endShift;
    String vehicleNumber;
    int salary;
    public String getBranch()
    {
        return branch;
    }
    
    public String getLicence()
    {
        return licence;
    }
    
    public LocalTime getStartShift()
    {
        return stShift;
    }
    
    public LocalTime getEndShift()
    {
        return endShift;
    }
    
    public int getSalary()
    {
        return salary;
    }
    
    public String getVehicleNumber()
    {
        return vehicleNumber;
    }
    
    public void updateSalary(int z)
    {
        salary = z;
    }
}
