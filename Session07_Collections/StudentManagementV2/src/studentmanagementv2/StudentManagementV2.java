/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementv2;

import data.Cabinet;
import data.Student;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class StudentManagementV2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Cabinet se = new Cabinet();
//        Cabinet ia = new Cabinet();
//        
//        System.out.println("INPUT SE STUDENT(S)");
//        se.addAStudent();   //#1
//        
//        System.out.println("INPUT IA STUDENT(S)");
//        ia.addAStudent();   //#1
//        ia.addAStudent();   //#2
//        
//       
//        System.out.println("SE MAJOR");
//        se.printStudentList();
//        System.out.println("IA MAJOR");
//        ia.printStudentList();
        int choice;
        Cabinet tuSE = new Cabinet();
        Scanner sc = new Scanner(System.in);
        do {
            printMenu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuSE.addAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.sortStudentList();
                    System.out.println("Sorting completed!!!");
                    break;
                case 4:
                    Student xxx = tuSE.searchAStudent("MANH BEO");
                    if (xxx == null) {
                        System.out.println("NOT FOUND!!!");
                    } else {
                        xxx.showProfile();
                    }
                    break;
                case 5:
                    if (tuSE.SinhVienTrung() != -1) {
                        System.out.println("Sinh viên trùng tại vị trí: " + tuSE.SinhVienTrung());
                    } else {
                        System.out.println("KHÔNG CÓ SINH VIÊN BỊ TRÙNG");
                    }
                    break;
                case 6:
                    int viTriSinhVienMuonXoa;
                    System.out.print("Mời bạn nhập sinh viên muốn xóa #");
                    viTriSinhVienMuonXoa = Integer.parseInt(sc.nextLine());
                    tuSE.deleteAStudent(viTriSinhVienMuonXoa - 1);
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Please choose 1..7");
            }
        } while (choice != 7);

        printMenu();
    }

    public static void printMenu() {
        int choice;
        System.out.println("===========================");
        System.out.println("Welcome you to FPT Academic");
        System.out.println("1. Add a student");
        System.out.println("2. Print The student list");
        System.out.println("3. Sort the list student by GPA");
        System.out.println("4. Search a student by id");
        System.out.println("5. Tim sinh vien trung");
        System.out.println("6. Delete a student");
        System.out.println("7. Exit");
        System.out.print("Please choose 1..7: ");

    }
}
