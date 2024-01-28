/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Scanner;

/**
 *
 * @author Windows
 */
public class Shelf {

    private Scanner sc = new Scanner(System.in);
    private int count = 0;
    private Triangele Shapes[] = new Triangele[10];

    public void addRightTriangle() {
        double canhA;
        double canhB;
        //double canhC;

        System.out.printf("Input #%d Right Triangle: \n", count + 1);

        System.out.print("Input canh A: ");
        canhA = Double.parseDouble(sc.nextLine());

        System.out.print("Input canh B: ");
        canhB = Double.parseDouble(sc.nextLine());

        //System.out.print("Input canh C: ");
        //canhC = Double.parseDouble(sc.nextLine());
        Shapes[count] = new RightTriangle(canhA, canhB);
        count++;
    }

    public void addTriangle() {
        double canhA;
        double canhB;
        double canhC;

        System.out.printf("Input #%d Triangle: \n", count + 1);

        System.out.print("Input canh A: ");
        canhA = Double.parseDouble(sc.nextLine());

        System.out.print("Input canh B: ");
        canhB = Double.parseDouble(sc.nextLine());

        System.out.print("Input canh C: ");
        canhC = Double.parseDouble(sc.nextLine());

        Shapes[count] = new Triangele(canhA, canhB, canhC);
        count++;
    }

    public void printTriangleList() {
        for (int i = 0; i < count; i++) {
            Shapes[i].printInfomation();
        }
    }
    public void sort() {
        System.out.println("Mang sau khi sap xep theo S");
        for (int i = 0; i < count -1; i++) 
            for (int j = i + 1; j < count; j++) 
                if (Shapes[i].getS() > Shapes[j].getS()) {
                   Triangele t = Shapes[i];
                   Shapes[i] = Shapes[j];
                   t = Shapes[j];
                }
                        
        for (int i = 0; i < count; i++) {
            Shapes[i].printInfomation();
        }
    }
  
}
