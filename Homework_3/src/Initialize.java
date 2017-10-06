
import Business.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tianli Feng
 */
public class Initialize {
    public ArrayList<Airliner> airlinerList;
    public FlightSchedule fS1, fS2;
    public Fleet fleet1, fleet2;
    public SeatCatalog seatList;
    public CustomerDirectory cD;
    public MasterFlightSchedule mFS;
    
    public Initialize() {
        ReadAirlinerList();
        ReadAirliner1Data();
        ReadAirliner2Data();
        ReadPersonData();
    }
    
    public void ReadAirlinerList() {
        // Read the list of airliners
        String csvFile = "airliner.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        airlinerList = new ArrayList<>();
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] airlinerElement = line.split(cvsSplitBy);
                
                Airliner airliner = new Airliner();
                airlinerList.add(airliner);
                String airlinerName = airlinerElement[0];
                airliner.setAirlinerName(airlinerName);
            }
            
            //for (Airplane a : airplaneList.getAirplaneList()) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    public void ReadAirliner1Data() {
        // Read airliner1 data file
        String csvFile = "airliner1.txt";
        BufferedReader br = null;
        String line = "";
        String airlinerName = "";
        String cvsSplitBy = ",";
        mFS = new MasterFlightSchedule(); 
        fS1 = new FlightSchedule();
        fleet1 = new Fleet();
        fS1 = mFS.addFlightSchedule();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            airlinerName = br.readLine();
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] flightElement = line.split(cvsSplitBy); 

                Flight flight = fS1.addFlight();
                flight.setFlightNum(flightElement[0]);
                flight.setDepartTime(flightElement[1]);
                flight.setDepartAirport(flightElement[2]);
                flight.setArrivalAirport(flightElement[3]);

                Airplane airplane = fleet1.addAirplane();
                airplane.setSerialNum(flightElement[4]);
                airplane.setModelNum(flightElement[5]);
                airplane.setMenufacture(flightElement[6]);
                airplane.setSeatCapacity(Integer.parseInt(flightElement[7]));
                
                // Assign airplane to the flight
                flight.setAirplane(airplane);
                // Create seat catalog to the flight
                seatList = new SeatCatalog();
                seatList.setFlight(flight);
                flight.setSeat(seatList.getSeatCatalog());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // Assign flight to airliner
        for (Airliner airliner: airlinerList) {
            if (airliner.getAirlinerName().equals(airlinerName)) {
                airliner.setFSCatalog(fS1);
                airliner.setFleetCatalog(fleet1);
            }
        }
    }
    
    public void ReadAirliner2Data() {
        // Read airliner2 data file 
        String csvFile = "airliner2.txt";
        BufferedReader br = null;
        String line = "";
        String airlinerName = "";
        String cvsSplitBy = ",";

        fS2 = new FlightSchedule();
        fleet2 = new Fleet();
        fS2 = mFS.addFlightSchedule();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            airlinerName = br.readLine();
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] flightElement = line.split(cvsSplitBy); 
                
                Flight flight = fS2.addFlight();
                flight.setFlightNum(flightElement[0]);
                flight.setDepartTime(flightElement[1]);
                flight.setDepartAirport(flightElement[2]);
                flight.setArrivalAirport(flightElement[3]);

                Airplane airplane = fleet2.addAirplane();
                airplane.setSerialNum(flightElement[4]);
                airplane.setModelNum(flightElement[5]);
                airplane.setMenufacture(flightElement[6]);
                airplane.setSeatCapacity(Integer.parseInt(flightElement[7]));
                
                // Assign airplane to the flight
                flight.setAirplane(airplane);
                // Create seat catalog to the flight
                SeatCatalog seatList = new SeatCatalog();
                seatList.setFlight(flight);
                flight.setSeat(seatList.getSeatCatalog());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        // Assign flight to airliner
        for (Airliner airliner: airlinerList) {
            if (airliner.getAirlinerName().equals(airlinerName)) {
                airliner.setFSCatalog(fS2);
                airliner.setFleetCatalog(fleet2);
            }
        }
    }
    
    public void ReadPersonData() {
        // Read Personvdata file
        String csvFile = "person.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        cD = new CustomerDirectory();
                
        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] PersonElement = line.split(cvsSplitBy); 

                Person person = cD.addPerson();
                person.setFirstName(PersonElement[0]);
                person.setLastName(PersonElement[1]);
                person.setGender(PersonElement[2]);
                person.setSsn(PersonElement[3]);
                
                Seat seat = new Seat();
                // set between flight and seat
                for (FlightSchedule fS : mFS.getmFS()) {
                    for (Flight flight : fS.getFlightSchedule()) {
                        if (flight.getFlightNum().equals(PersonElement[4])) {
                             seat.setFlight(flight);
                             flight.getSeat().add(seat);
                        }
                    }
                }
                
                seat.setColGroup(Integer.parseInt(PersonElement[5]));
                seat.setColPosition(PersonElement[6]);
                seat.setRow(Integer.parseInt(PersonElement[7]));
                seat.setPrice(Integer.parseInt(PersonElement[8]));
                
                // Assign person with seat
                person.setSeat(seat);
                seat.setPerson(person);

                
                
    }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }         
    
}
