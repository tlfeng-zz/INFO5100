/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.*;
import java.util.ArrayList;

/**
 *
 * @author Tianli Feng
 */
public class Main {
    
    public static void main(String[] args) {       
        Initialize initialize = new Initialize();
        Revenue revenue = new Revenue();
        
        System.out.println("The revenue of each flight: ");
        for(FlightSchedule fS : initialize.mFS.getmFS()) {
            for (Flight flight : fS.getFlightSchedule()) {
                System.out.println(flight.getFlightNum()+": $"+revenue.revenuePerFlight(flight));                    
                System.out.print("Passengers: ");
                for(Seat seat : flight.getSeat()) {
                    System.out.print(seat.getPerson().getFirstName()+" "+seat.getPerson().getLastName()+", ");
                }
                System.out.println("\n"); 
            }
        }
        
        System.out.println("The revenue of each Airliner: ");
        for (Airliner airliner : initialize.airlinerList) {
                System.out.println(airliner.getAirlinerName()+": $"+revenue.revenuePerAirliner(airliner));
        }
        
        System.out.println("\nThe total revenue: $"+revenue.revenueTotal(initialize.mFS));
    }
}
