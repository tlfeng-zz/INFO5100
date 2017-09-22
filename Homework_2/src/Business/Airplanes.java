/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Tianli Feng
 */
public class Airplanes {
    private String serialNum;
    private String modelNum;
    private String menufacture;
    private int menufYear;
    private int seatCapacity;
    private String expireMonth;
    private int expireYear;
    private String availMonth;
    private int availYear;
    private String airport;

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public String getModelNum() {
        return modelNum;
    }

    public void setModelNum(String modelNum) {
        this.modelNum = modelNum;
    }

    public String getMenufacture() {
        return menufacture;
    }

    public void setMenufacture(String menufacture) {
        this.menufacture = menufacture;
    }

    public int getMenufYear() {
        return menufYear;
    }

    public void setMenufYear(int menufYear) {
        this.menufYear = menufYear;
    }

    public int getSeatCapacity() {
        return seatCapacity;
    }

    public void setSeatCapacity(int seatCapacity) {
        this.seatCapacity = seatCapacity;
    }

    public String getExpireMonth() {
        return expireMonth;
    }

    public void setExpireMonth(String expireMonth) {
        this.expireMonth = expireMonth;
    }

    public int getExpireYear() {
        return expireYear;
    }

    public void setExpireYear(int expireYear) {
        this.expireYear = expireYear;
    }

    public String getAvailMonth() {
        return availMonth;
    }

    public void setAvailMonth(String availMonth) {
        this.availMonth = availMonth;
    }

    public int getAvailYear() {
        return availYear;
    }

    public void setAvailYear(int availYear) {
        this.availYear = availYear;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }
    
    @Override
    public String toString() {
        return this.menufacture;
    }
}
