/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author MSI
 */
public class Shipment implements Serializable, isDeliverable {
    String shipmentType, shipmentID, ownerID, pickupDivision, pickupCity, destinationCity, currentLocation, destinationDivision,  deliveryType, trackingID;
    int zip, size, weight;
    LocalDate created, received;
    boolean deliveryStatus;
    float deliveryCost;
    String processedBy;
    
    public Shipment createShipment(String type, String shipID, String ownID, String pickupD, String destinationD, String pickupC, String city, String deliveryT, int wght, int sze, boolean deliveryS)
    {
        created = LocalDate.now();
        shipmentType = type;
        shipmentID = shipID;
        ownerID = ownID;
        pickupDivision = pickupD;
        destinationDivision = destinationD;
        destinationCity = city;
        currentLocation = pickupD;
        pickupCity = pickupC;
        trackingID = ownID+"-"+shipID;
        deliveryType = deliveryT;
        weight = wght;
        size = sze;
        deliveryStatus = true;   
        return this;
    }
    
    public LocalDate get_creationD()
    {
        return created;
    }
  
    public LocalDate get_received()
    {
        return received;
    }
    
    public String get_trackID()
    {
        return trackingID;
    }
    
    public String get_pickup()
    {
      return pickupDivision;  
    }
    
    public String get_destination()
    {
        return destinationDivision;
    }
    
    public float get_cost()
    {
        return deliveryCost;
    }
    
    public String get_ownerID()
    {
        return ownerID;
    }
    
    public String get_shipID()
    {
        return shipmentID;
    }
    
    public String get_cLocation()
    {
        return currentLocation;
    }
      
    public void set_currentLocation(String l)
    {
        currentLocation = l;
    }
    
    public void set_deliveryStatus(boolean t)
    {
        deliveryStatus = t;
    }
    

    public void SetCost(float cost)
    {
        deliveryCost = cost;
    }
    
    public String get_deliveryStatus()
    {
        if(deliveryStatus == true)
        {
            return "In Progress";
        }
        else
        {
            return "Delivery Complete";
        }
    }
    
    public String get_shipmentType()
    {
        return shipmentType;
    }

    public String get_deliveryType()
    {
        return deliveryType;
    }
    
    public void set_dateReceived(LocalDate x)//yyyy-mm-dd
    {
        received = x;
    }
    
    public void set_procesedby(String id)
    {
        processedBy = id;
    }
    
    public String return_processedBy()
    {
        return processedBy;
    }

    @Override
    public boolean isDeliverable(int x, int y) {
       if(x>=70 || y >=64)
       {
           return notDeliverable;
       }
       else
       {
           return deliverable;
       }
    }
   
}

