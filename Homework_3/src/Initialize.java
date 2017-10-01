
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
 * @author ftl
 */
public class Initialize {
    public ArrayList<Airliner> airlinerList;
    public FlightSchedule fS1, fS2;
    public Fleet fleet1, fleet2;
    public CustomerDirectory cD;
    public ArrayList<Seat> seatList;
    public MasterFlightSchedule mFS;
    
    public Initialize() {
        ReadAirlinerList();
        ReadAirliner1Data();
        ReadAirliner2Data();
        ReadPersonData();
        AssignSeattoFlight();
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
        String cvsSplitBy = ",";
        mFS = new MasterFlightSchedule(); 
        fS1 = new FlightSchedule();
        fleet1 = new Fleet();
        fS1 = mFS.addFlightSchedule();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
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
    
    public void ReadAirliner2Data() {
        // Read airliner2 data file 
        String csvFile = "airliner2.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";

        fS2 = new FlightSchedule();
        fleet2 = new Fleet();
        fS2 = mFS.addFlightSchedule();
        
        try {
            br = new BufferedReader(new FileReader(csvFile));
            line = br.readLine();
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
    
    public void ReadPersonData() {
        // Read Personvdata file
        String csvFile = "person.txt";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        cD = new CustomerDirectory();
        seatList = new ArrayList<>();
                
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
                seatList.add(seat);
                seat.setColGroup(Integer.parseInt(PersonElement[4]));
                seat.setColPosition(PersonElement[5]);
                seat.setRow(Integer.parseInt(PersonElement[6]));
                seat.setPrice(Integer.parseInt(PersonElement[7]));
                
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
    
    public void AssignSeattoFlight() {
        ArrayList<Seat> seatList1 = new ArrayList<>();
        ArrayList<Seat> seatList2 = new ArrayList<>();
        ArrayList<Seat> seatList3 = new ArrayList<>();
        ArrayList<Seat> seatList4 = new ArrayList<>();
        fS1.getFlightSchedule().get(0).setSeat(seatList1);
        fS1.getFlightSchedule().get(1).setSeat(seatList2);
        fS2.getFlightSchedule().get(0).setSeat(seatList3);
        fS2.getFlightSchedule().get(1).setSeat(seatList4);
        
        seatList1.add(seatList.get(0));
        seatList1.add(seatList.get(1));
        seatList2.add(seatList.get(2));
        seatList3.add(seatList.get(3));
    }
    
    public void ReadResult() {
        for (Flight flight0 : fS1.getFlightSchedule()) {
            System.out.println(flight0.getFlightNum());
        }
                
            for (Airplane airplane0 : fleet1.getFleet()) {
            System.out.println(airplane0.getModelNum());
        }
    }
    
}
