/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Business.*;
import java.util.ArrayList;

/**
 *
 * @author ftl
 */
public class Main {
    
    public static void main(String[] args) {       
        Initialize initialize = new Initialize();

        //initialize.ReadResult();

        Revenue revenue = new Revenue();
        System.out.println(revenue.revenuePerFlight(initialize.fS1.getFlightSchedule().get(0)));

    }
}
