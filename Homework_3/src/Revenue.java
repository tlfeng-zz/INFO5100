
import Business.Airliner;
import Business.Flight;
import Business.FlightSchedule;
import Business.MasterTravelSchedule;
import Business.Seat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tianli Feng
 */
public class Revenue {
    public int revenuePerFlight(Flight flight) {
        int revenue = 0;
        for (Seat seat : flight.getSeat()) {
            revenue+=seat.getPrice();
        }
        return revenue;
    }
    
    public int revenuePerAirliner(Airliner airliner) {
        int revenue = 0;
        for (Flight flight : airliner.getFSCatalog().getFlightSchedule()) {
            revenue += revenuePerFlight(flight);
        }
        return revenue;
    }
    
    public int revenueTotal(MasterTravelSchedule mFS) {
        int revenue = 0;
        for (FlightSchedule fS : mFS.getmTS()) {
            for (Flight flight : fS.getFlightSchedule()) {
                revenue += revenuePerFlight(flight);
        }
        }
        return revenue;
    }
}
