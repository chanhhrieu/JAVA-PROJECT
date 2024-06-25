/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENTMANAGEMENT;

/**
 *
 * @author admin
 */
public class main {

    public static void main(String[] args) {
        CheckValid cv = new CheckValid();
        ManageStudent ms = new ManageStudent();
        while (true) {
            System.out.println("1. Create");
            System.out.println("2. Find and Sort");
            System.out.println("3. Update/Delete");
            System.out.println("4. Report");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            int choice = cv.checkInputLimit(1, 5);
            switch (choice) {
                case 1:
                    ms.createStudent();
                    break;
                case 2:
                    ms.findAndSort();
                    break;
                case 3:
                    ms.updateOrDelte();
                    break;
                case 4:
                    ms.reportStudent();
                    break;
                case 5:
                    return;

            }

        }

    }
}
