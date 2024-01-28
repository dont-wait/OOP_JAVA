package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Stage {

    public static void main(String[] args) {
        //ráp menu cảm giác 1 cái app
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuSE = new Shelf("PINK", "SE Major");
       
        do {
            printMenu();
            System.out.print("Input your choice (1..6): ");
            choice = Integer.parseInt(sc.nextLine());
            //if các choice thì làm gì tương tứng
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye, see u next time");
                    break;
                default:
                    System.out.println("Please choose 1..6 options");
            }

        } while (choice != 6);

    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following function");
        System.out.println("1. Add a new student profile");
        System.out.println("2. Print the student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student profile");
        System.out.println("6. Quit");
    }

    public static void testShelf() {

        //OOP thinking
        //NGON MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH
        Shelf tuSE = new Shelf("PINK", "SE Major");
        Shelf tuGD = new Shelf("RAINBOW", "GD Major");

//        tuSE.inputAStudent();
//        tuSE.inputAStudent();
//tuSE.printStudentList();   
//inputStudentList();
        tuSE.addAStudent();
        tuSE.addAStudent();

        tuGD.addAStudent();

        System.out.println("The student list for all");
        tuSE.printStudentList();
        tuGD.printStudentList();

    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;

        System.out.print("How many student do you want to input? ");
        count = Integer.parseInt(sc.nextLine());     //sc.nextInt(); //MyToys.getInteger(?????);

        Student arr[] = new Student[count]; //count = 5

        //for nhập 5 hồ sơ
        for (int i = 0; i < count; i++) {
            //System.out.printf("\nINPUT SV %d\n", i + 1);
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());

            arr[i] = new Student(id, name, gpa, yob);
            System.out.println("");
        }
        System.out.println("The student list ");
        for (Student x : arr) {
            x.showProfile();
        }
        //sort dăm ba đồ yêu, éo thèm làm, vì đã học
    }
}
