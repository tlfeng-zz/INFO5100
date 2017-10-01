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
public class TravelAgency {
    private ArrayList<Airliner> airliner;
    private MasterFlightSchedule mFS;
    private ArrayList<CustomerDirectory> cD;

    public ArrayList<Airliner> getAirliner() {
        return airliner;
    }

    public void setAirliner(ArrayList<Airliner> airliner) {
        this.airliner = airliner;
    }

    public MasterFlightSchedule getMFS() {
        return mFS;
    }

    public void setMFS(MasterFlightSchedule mFS) {
        this.mFS = mFS;
    }

    public ArrayList<CustomerDirectory> getCD() {
        return cD;
    }

    public void setCD(ArrayList<CustomerDirectory> cD) {
        this.cD = cD;
    }
    
    
}
