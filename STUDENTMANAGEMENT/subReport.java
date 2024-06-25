/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package STUDENTMANAGEMENT;

/**
 *
 * @author admin
 */
public class subReport {

    String student;
//    ArrayList<String> course;
    String course;
    int totalCourse;

    public subReport(String student, String course, int totalCourse) {
        this.student = student;
        this.course = course;
        this.totalCourse = totalCourse;
    }

    public subReport() {
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    // return all of the courses
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getTotalCourse() {
        return totalCourse;
    }

    public void setTotalCourse(int totalCourse) {
        this.totalCourse = totalCourse;
    }

    public void display() {
        System.out.printf("%-15s|%-10s|%-5d\n", this.getStudent(), this.getCourse(), this.totalCourse);

    }

    public int compareTod(subReport i) {
        return this.getCourse().compareTo(i.getCourse());
    }
//

    public int compareTo(subReport i) {
        return this.getStudent().compareTo(i.getStudent());
    }
}
