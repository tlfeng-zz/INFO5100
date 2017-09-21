/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;

/**
 *
 * @author ftl
 */
public class Fleet {
    private ArrayList<Airplanes> fleet;
    
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
    
    public void  deleteAirplanes(Airplanes ap) {
        fleet.remove(ap);
    }
}
