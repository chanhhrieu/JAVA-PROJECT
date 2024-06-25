/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENTMANAGEMENT;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class ManageStudent {

    private final List<Student> sl = new ArrayList<>();
    CheckValid cv = new CheckValid();
    ArrayList<reports> rs = new ArrayList<>();
    ArrayList<subReport> srs = new ArrayList<>();
//    List<String> sb = new ArrayList<String>();

    public Student getStudentByID(String id) {
        for (Student i : sl) {
            if (i.getId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return null;
    }

    public void addStudent() {

        sl.add(new Student("s7", "dqde", "ddq", "qwd"));
        sl.add(new Student("s5", "duc", "dqwd", "da"));
        sl.add(new Student("s1", "long", "fall", "Java"));
        sl.add(new Student("s1", "long", "summer", "Java"));
        sl.add(new Student("s1", "long", "fall", "Java"));
        sl.add(new Student("s2", "van", "fall", "Java"));
        sl.add(new Student("s2", "van", "spring", "Java"));
        sl.add(new Student("s3", "toan", "fall", "C/C++"));
        sl.add(new Student("s4", "nam", "fall", "Java"));
        sl.add(new Student("s5", "ha", "fall", ".NET"));
        sl.add(new Student("s5", "ha", "summer", "Java"));

    }

    public void createStudent() {
        addStudent();
        while (true) {
            System.out.println("Enter id: ");
            String id = cv.checkInputString();
//            Student student = getStudentByID(id);
            System.out.println("Enter name: ");
            String name = cv.checkInputString();
            System.out.println("Enter semester: ");
            String semester = cv.checkInputString();
            System.out.println("Enter course: ");
            String course = cv.checkInputString();
            sl.add(new Student(id, name, semester, course));
            if (sl.size() > 10) {
                System.out.println(" Do you want to continue (Y/N)? Choose Y to continue, N to return main screen.");
                boolean input = cv.checkInputYN();
                if (!input) {
                    break;
                }
            }
        }
    }

    public void findAndSort() {
        System.out.println("Enter student name: ");
        String name = cv.checkInputString();
        for (Student i : sl) {
            if (i.getStudentName().equalsIgnoreCase(name)) {
                i.display();
            }
        }
        System.out.println("Sort student: ");
        if (sl.size() > 1) {
            for (int i = 1; i < sl.size(); i++) {
                for (int j = 0; j < sl.size() - i - 1; j++) {
                    if (sl.get(j).compareTo(sl.get(j + 1)) > 0) {
                        Student temp = sl.get(j);
                        sl.set(j, sl.get(j + 1));
                        sl.set(j + 1, temp);
                    }
                }

            }
        }
        for (Student i : sl) {
            i.display();
        }
    }

    public void updateOrDelte() {
        System.out.println("Enter D or U: ");
        boolean input = cv.checkInputUD();
        if (!input) {
            System.out.println("Enter ID Student want to delete: ");
            String idd = cv.checkInputString();
            Student student = getStudentByID(idd);
            sl.remove(student);

        }
        if (input) {
            System.out.println("Entet ID Student want to update: ");
            String id = cv.checkInputString();
            for (Student i : sl) {
                if (i.getId().equalsIgnoreCase(id)) {
                    System.out.println("Enter name: ");
                    String updateName = cv.checkInputString();
                    System.out.println("Enter semester: ");
                    String updateSemester = cv.checkInputString();
                    System.out.println("Enter course: ");
                    String updateCourse = cv.checkInputString();
                    i.setCourseName(updateCourse);
                    i.setSemester(updateSemester);
                    i.setStudentName(updateName);
                }
            }
        }

    }

    public void reportStudent() {
        int count = 1;
       

        for (Student i : sl) {
            srs.add(new subReport(i.getStudentName(), i.getCourseName(), count));
        }

//       
        for (int g = 0; g < srs.size() - 1; g++) {
            if ((srs.get(g).compareTo(srs.get(g + 1))) == 0) {
                if ((srs.get(g).compareTod(srs.get(g + 1))) == 0) {
                    count++;
//                        rs.remove(rs.get(g++));
                }

            } else if ((srs.get(g).compareTo(srs.get(g + 1))) != 0) {
                rs.add(new reports(srs.get(g).getStudent(), srs.get(g).getCourse(), count));
                count = 1;
            }
        }
//        
        for (reports k : rs) {
            k.display();
        }
    }

//    public boolean checkDuplicate(String course, String nam, int total) {
//        for (reports i : rs) {
//            if ((course.equalsIgnoreCase(i.getCourseName())) && (nam.equalsIgnoreCase(i.getStudentName())) && total == i.getTotalCourse()) {
//                return false;
//            }
//        }
//        return true;
//    }
}
