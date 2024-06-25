/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENTMANAGEMENT;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CheckValid {

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

    public String checkInputString() {

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.isEmpty()) {
                System.out.println("String must not empty: ");
            }
            return input;
        }

    }

    public boolean checkInputYN() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equalsIgnoreCase("Y")) {
                return true;
            }
            if (input.equalsIgnoreCase("N")) {
                return false;
            }
        }
    }

    public boolean checkInputUD() {
        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            if (input.equalsIgnoreCase("U")) {
                return true;
            }
            if (input.equalsIgnoreCase("D")) {
                return false;
            }
        }
    }
  
}
