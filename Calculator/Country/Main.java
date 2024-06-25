/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package J1SP;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Main {

    public static int menu() {
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.println("Enter your choice: ");
        int choice = mn.checkInputLimit(1, 5);
        return choice;
    }

    public static void main(String[] args) {
        ManageEastAsiaCountries mn = new ManageEastAsiaCountries();
        while (true) {
            int choice = menu();
            switch (choice) {
                case 1:
                    mn.inputCountry();
                    break;
                case 2:
                    mn.display();
                    break;
                case 3:
                    mn.searchInformation();
                    break;
                case 4:
                    mn.sortInformation();
                    break;
                case 5:
                    return;
            }
        }
    }
}
