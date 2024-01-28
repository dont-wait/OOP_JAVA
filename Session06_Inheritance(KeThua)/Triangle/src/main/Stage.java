package main;

import data.Shelf;
import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Stage {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        Shelf tuThuoc = new Shelf();
        do {
            printMenu();
            System.out.print("Input your choice: ");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    tuThuoc.addTriangle();
                    break;
                case 2:
                    tuThuoc.addRightTriangle();
                    break;
                case 3:
                    tuThuoc.printTriangleList();
                    break;
                case 4:
                    tuThuoc.sort();
                    break;
                case 5:
                    System.out.println("Bye Byee see you later");
                    break;
                default:
                    System.out.println("VUI LONG NHAP TU 1..4");
            }

        } while (choice != 5);

    }

    public static void printMenu() {
        System.out.println("\nWELCOME YOU TO QUẢN LÍ TAM GIÁC");
        System.out.println("1. Add one Triangle");
        System.out.println("2. Add one Right triangle");
        System.out.println("3. Print Triangle List");
        System.out.println("4. Sort");
        System.out.println("5. Exit");

    }

}
