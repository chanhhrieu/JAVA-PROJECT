/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1SP;

/**
 *
 * @author admin
 */
public class EastAsiaCountries extends Country {

    private String countryTerrain;

    public EastAsiaCountries() {

    }

    public EastAsiaCountries(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    public EastAsiaCountries(String countryTerrain, String countryCode, String countryName, float totalArea) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        System.out.println("ID: " + countryCode + "\n Name:  " + countryName + "\n Total Area: " + totalArea + "\n Terrain: " + countryTerrain);
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }
    public int compareTo(EastAsiaCountries i) {
        return this.getCountryName().compareTo(i.getCountryName());
    }
}
