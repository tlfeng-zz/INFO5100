/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author ftl
 */
public class License {
    private String licenseNum;
    private String classType;
    private String expirationDate;
    private int weight;
    private int heightFoot;
    private int heightInch;

    public String getLicenseNum() {
        return licenseNum;
    }

    public void setLicenseNum(String licenseNum) {
        this.licenseNum = licenseNum;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeightFoot() {
        return heightFoot;
    }

    public void setHeightFoot(int heightFoot) {
        this.heightFoot = heightFoot;
    }

    public int getHeightInch() {
        return heightInch;
    }

    public void setHeightInch(int heightInch) {
        this.heightInch = heightInch;
    }
}
