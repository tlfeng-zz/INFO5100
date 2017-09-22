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
    private ArrayList<Airplanes> fleet;
    
    public Fleet() {
        fleet = new ArrayList<Airplanes>();
    }
    
     public ArrayList<Airplanes> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<Airplanes> fleet) {
        this.fleet = fleet;
    }

    public Airplanes addAirplanes() {
        Airplanes ap = new Airplanes();
        fleet.add(ap);
        return ap;
    }
    
    public void deleteAirplanes(Airplanes ap) {
        fleet.remove(ap);
    }
}
