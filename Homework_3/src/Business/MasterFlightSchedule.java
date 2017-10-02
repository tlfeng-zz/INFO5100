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
public class MasterFlightSchedule {
    private ArrayList<FlightSchedule> mFS;
    private int totalRevenue;

    public MasterFlightSchedule() {
        mFS = new ArrayList<FlightSchedule>();
    }
    
    public ArrayList<FlightSchedule> getmFS() {
        return mFS;
    }

    public void setmFS(ArrayList<FlightSchedule> mFS) {
        this.mFS = mFS;
    }


    public int getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(int totalRevenue) {
        this.totalRevenue = totalRevenue;
    }
    
    public FlightSchedule addFlightSchedule() {
        FlightSchedule fS = new FlightSchedule();
        mFS.add(fS);
        return fS;
    }
    
    public void deleteFlightSchedule(FlightSchedule fS) {
        mFS.remove(fS);
    }
}
