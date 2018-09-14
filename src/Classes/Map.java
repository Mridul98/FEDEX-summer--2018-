/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fedex.project.route;

import java.security.SecureRandom;

/**
 *
 * @author ASUS
 */
public class Map {
    private int distanceArray[][];
    public Map(){
        distanceArray = new int[7][7];
        for(int i = 0 ;i<distanceArray.length;i++){
            for(int j = 0;j<distanceArray.length;j++){
                distanceArray[i][j] = 0;
            }
        }
        for(int i = 0 ;i<distanceArray.length;i++){
            for(int j = 0 ;j<distanceArray.length;j++){
                if(i==j){
                    distanceArray[i][j] = -2;
                }
                else if(distanceArray[i][j]!=0 && distanceArray[i][j]!=-2){
                    continue;
                }
                else{
                    SecureRandom r = new SecureRandom();
                    int val = r.nextInt(400)+50;
                    distanceArray[i][j] =val;
                    distanceArray[j][i] = val;
                }
            }
        }
        
  }
    District dhaka = new District("Dhaka", 0);
        District chittagong = new District("Chittagong", 1);
        District rajshahi = new District("Rajshahi", 2);
        District khulna = new District("Khulna", 3);
        District barisal = new District("Barisal", 4);
        District  sylhet= new District("sylhet", 5);
        District rangpur = new District("rangpur", 6);
        
    public float calculateTotalcost(String s,String e, int weight, int size, String x){
       District start = dhaka;
       District end = dhaka;
       int multiplier = 0;
       if(x.equals("Emergency"))
       {
           multiplier = 2;
       }
       else if (x.equals("Standard"))
       {
           multiplier = 1;
       }
        if(s.equals("Dhaka"))
        {
           start = dhaka;
        }
        else if(s.equals("Chittagong"))
        {
           start = chittagong;
        }
        else if(s.equals("Rajshahi"))
        {
            start = rajshahi;
        }
        else if(s.equals("Khulna"))
        {
           start = khulna;
        }
        else if(s.equals("Barisal"))
        {
           start = barisal;
        }
        else if(s.equals("Sylhet"))
        {
            start = sylhet;
        }
        else if(s.equals("Rangpur"))
        {
         start = rangpur;
        }
        
        if(e.equals("Dhaka"))
        {
           end = dhaka;
        }
        else if(e.equals("Chittagong"))
        {
           end = chittagong;
        }
        else if(e.equals("Rajshahi"))
        {
            end = rajshahi;
        }
        else if(e.equals("Khulna"))
        {
           end = khulna;
        }
        else if(e.equals("Barisal"))
        {
           end = barisal;
        }
        else if(e.equals("Sylhet"))
        {
            end = sylhet;
        }
        else if(e.equals("Rangpur"))
        {
         end = rangpur;
        }
        int distance = distanceArray[start.getNumber()][end.getNumber()];
        float result  = (float) (((distance*2.50)+(weight*2.50)+(size*1.2))*multiplier);
        return result;
    }
}

