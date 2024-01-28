/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Windows
 */
public class Rectangle extends Shape {

    protected double a, b;  //tí nx thg HV kế thừa

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);//Ba sẽ là cánh chim đưa Con bay thật xa
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override   //Qua mặt Cha
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n", "RECTANGLE", owner, color, borderColor, a, b, getArea());
    }
    
    
}
