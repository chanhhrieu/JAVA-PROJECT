/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1SP;

import java.util.*;
import java.util.Scanner;
import java.lang.Comparable;
//import java.util.Collection;

/**
 *
 * @author admin
 */
public class ManageEastAsiaCountries {

    public int checkInputLimit(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                int input = Integer.parseInt(sc.nextLine());
                if (input < min || input > max) {
                    throw new Exception();
                }
                return input;
            } catch (Exception e) {
                System.out.print("Please input an integer number from  ");
            }
        }
    }

    public void inputCountry() {
//        List<EastAsiaCountries> cl = new 
        System.out.println("Enter code of country: ");
        String countryCode = checkInputString();
        System.out.println("Enter name of country: ");
        String countryName = checkInputString();
        System.out.println("Enter total Area: ");
        float totalArea = checkInputFloat();
        System.out.println("Enter terrain of country: ");
        String countryTerrain = checkInputString();
        // add country
//        addCountryInformation(countryName, countryCode, totalArea, countryTerrain);
        cl.add(new EastAsiaCountries(countryTerrain, countryCode, countryName, totalArea));
    }

    public String checkInputString() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.print("Must not empty! Enter again: ");
            }
            return input;
        }
    }

    public void display() {
        for (EastAsiaCountries i : cl) {
            i.display();
        }

    }

    public float checkInputFloat() {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);
                float input = Float.parseFloat(sc.nextLine());
                if (input < 0) {
                    throw new NumberFormatException();
                }
                return input;

            } catch (NumberFormatException e) {
                System.err.println("Total Area must greater than 0!");
                System.out.print("Enter: ");
            }
        }
    }

    private final ArrayList<EastAsiaCountries> cl = new ArrayList<>();

    public void addCountry() {
        cl.add(new EastAsiaCountries("Nice", "sd", "dsa", 0));
        cl.add(new EastAsiaCountries("da", "dd", "dqw", 0));
    }

    public void searchInformation() {
//        System.out.println("Enter the name you want to search for: ");
        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name you want to search for: ");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                throw new NullPointerException("Please enter!");
            }

            for (EastAsiaCountries i : cl) {
                if (i.getCountryName().contains(input.toLowerCase())) {
                    cl.add(i);
                }
            }

        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void sortInformation() {

        if (cl.size() > 1) {
            for (int i = 1; i < cl.size(); i++) {
                for (int j = 0; j < cl.size() - i - 1; j++) {
                    if (cl.get(j).compareTo(cl.get(j + 1)) > 0) {
                        EastAsiaCountries temp = cl.get(j);
                        cl.set(j, cl.get(j + 1));
                        cl.set(j + 1, temp);
                    }
                }
            }
            for (EastAsiaCountries i : cl) {
                i.display();
            }
        }

    }

}
