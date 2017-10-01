/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author Tianli Feng
 */
public class Fleet {
    private String fleetName;
    private String fleetUpdateDate;
    private ArrayList<Airplane> fleet;
    
    public Fleet() {
        fleet = new ArrayList<Airplane>();
    }

    
     public ArrayList<Airplane> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Airplane> fleet) {
        this.fleet = fleet;
    }

    public String getFleetUpdateDate() {
        return fleetUpdateDate;
    }

    public void setFleetUpdateDate(String fleetUpdateDate) {
        this.fleetUpdateDate = fleetUpdateDate;
    }
    
    public Airplane addAirplane() {
        Airplane ap = new Airplane();
        fleet.add(ap);
        return ap;
    }
    
    public void deleteAirplane(Airplane ap) {
        fleet.remove(ap);
    }
}
