package bena;

import data.Circle;
import java.util.Scanner;
import data.Rectangle;
import data.Square;

public class BeNa {

    public static void main(String[] args) {

        //inputCircle();
        //inputRectangle();
        inputSquare();
    }

    public static void inputRectangle() {
        String name; //tặng cho ai
        double width, length;

        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine();
        while (true) {
            try {
                System.out.print("Input width: ");
                width = Float.parseFloat(sc.nextLine());

                break;
            } catch (Exception e) {
                System.out.println("Do u know input a float number for width?");
            }

        }
        while (true) {
            try {
                System.out.print("Input length: ");
                length = Float.parseFloat(sc.nextLine());

                break;
            } catch (Exception e) {
                System.out.println("Do u know input a float number for length?");
            }

        }

       Rectangle x = new Rectangle(name, width, length);
        x.showOwn();

    }

    public static void inputSquare() {
        String name, color;
        Double canh;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input color: ");
        color = sc.nextLine();
       
        while (true) {
            try {
                System.out.print("Input canh: ");
                canh = Double.parseDouble(sc.nextLine());
                break;
                        
            } catch (Exception e) {
                System.out.println("Do ku know Float number for canh");
            }
        }

        Square x = new Square(name, color, canh);
        x.showOwn();
    }

    public static void inputCircle() {
        String name, color;
        double r;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input color: ");
        color = sc.nextLine();
        while (true) {
            try {
                System.out.print("Input r: ");
                r = Float.parseFloat(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Do ku know float number for r");
            }
        }

        Circle x = new Circle(name, color, r);
        x.showOwn();
    }
}
