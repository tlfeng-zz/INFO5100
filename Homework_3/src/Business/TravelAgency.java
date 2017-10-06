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
public class TravelAgency {
    private ArrayList<Airliner> airlinerList;
    private MasterTravelSchedule mFS;
    private ArrayList<CustomerDirectory> cD;

    public ArrayList<Airliner> getAirliner() {
        return airlinerList;
    }

    public void setAirliner(ArrayList<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }

    public MasterTravelSchedule getMFS() {
        return mFS;
    }

    public void setMFS(MasterTravelSchedule mFS) {
        this.mFS = mFS;
    }

    public ArrayList<CustomerDirectory> getCD() {
        return cD;
    }

    public void setCD(ArrayList<CustomerDirectory> cD) {
        this.cD = cD;
    }
    
    
}
