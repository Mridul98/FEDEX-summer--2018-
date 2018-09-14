/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex.project.route;

/**
 *
 * @author ASUS
 */
public class District {
    private int districtNumber;
    private String districtName;
    public District(String name,int districtNumber){
        this.districtName = name;
        this.districtNumber = districtNumber;
    }
    public int getNumber(){
        return districtNumber;
    }
    public String getDistrictName(){
        return districtName;
    }
}
