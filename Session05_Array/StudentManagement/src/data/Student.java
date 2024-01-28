
package data;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Student {

    private String id; //instance variable
    public String name;
    private double gpa;
    private int yob;

    public Student(String id, String name, double gpa, int yob) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        this.yob = yob;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gpa=" + gpa + ", yob=" + yob + '}';
    }

    public void showProfile() {
        System.out.printf("|%-8s|%-25s|%4.1f|%4d|\n", id, name, gpa, yob);
    }
    private static Scanner sc = new Scanner(System.in);

    public static int getInteger(String inputMsg) {
       while(true) {
            try {
            int n; //hứng từ bàn phím gõ gì
            System.out.println(inputMsg);
            n = Integer.getInteger(sc.nextLine());
            return n;
        } catch (Exception e) {
            System.out.println("DO KU KNOW INTEGER NUMBER");
        }
   
       }
       
            
    }
}
