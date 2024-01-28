package trianglev2;

import data.RightTriangle;
import data.Triangle;

/**
 *
 * @author Windows
 */
public class TriangleV2 {

    public static void main(String[] args) {
        arraySharp();

    }

    public static void arraySharp() {
        Triangle sharp[] = new Triangle[6];
        sharp[0] = new Triangle(5, 10, 15);

        sharp[1] = new Triangle(5, 10, 14);

        sharp[2] = new Triangle(3, 4, 6);

        sharp[3] = new RightTriangle(4, 5);

        sharp[4] = new RightTriangle(5, 6);

        sharp[5] = new RightTriangle(7, 8);
        
        System.out.println("The List before sorting");
        for (int i = 0; i < 6; i++) 
            sharp[i].printInfor();
        
                
        System.out.println("The List after sorting");
        for (int i = 0; i < 6 - 1; i++) 
            for (int j = i + 1; j < 6; j++) 
                if (sharp[i].getS() > sharp[j].getS()) {
                    Triangle t = sharp[i];
                    sharp[i] = sharp[j];
                    sharp[j] = t;
                }
        for (int i = 0; i < 6; i++) {
            sharp[i].printInfor();
        }
    
        

    }

    public static void cutSharp() {

        RightTriangle r1 = new RightTriangle(10.0, 15.5);
        r1.printInfor();

        Triangle t1 = new Triangle(5.0, 6.0, 7.0);
        t1.printInfor();

        Triangle t2 = new Triangle(8.0, 9.0, 10);
        t2.printInfor();

        Triangle t3 = new Triangle(11.0, 12.0, 13.0);
        t3.printInfor();

        Triangle r2 = new RightTriangle(5.5, 10.5);
        r2.printInfor();

        RightTriangle r3 = new RightTriangle(4.0, 5.0);
        r3.printInfor();
    }
}
