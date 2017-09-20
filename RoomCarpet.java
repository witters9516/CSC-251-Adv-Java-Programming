/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2_p1_witterwalshfranks;

/**
 *
 * @author witters9516
 */
public class RoomCarpet 
{
    //Variables
    RoomDimension size;
    double carpetCost;
    
    //The public constructor RoomCarpet accepts a RoomDimension object and a 
    //double as arguments. 
    public RoomCarpet(RoomDimension obj, double cost)
    {
        size = obj;
        carpetCost = cost;
    }
    
    //The getTotalCost method returns the carpetCost value.
    private double getTotalCost()
    {
        return carpetCost * size.getArea();
    }
    
    //The toString method returns getTotalCost() as a string.
    public String toString()
    {
        return Double.toString(getTotalCost());
    }        
}
