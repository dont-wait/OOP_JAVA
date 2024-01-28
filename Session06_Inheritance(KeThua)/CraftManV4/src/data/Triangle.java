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
//lát hồi sẽ gặp lại: TGV kế thừa ai???
//                                      Shape okie, nhưng TG okie hơn
public class Triangle extends Shape{
    //dị biệt hoàn toàn so với Shape
    private double a, b, c;

    public Triangle(String owner, String color, String borderColor, double a, double b, double c) {
        super(owner, color, borderColor);
        this.a = a;
        this.b = b;
        this.c = c;
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

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public void paint() {
        System.out.printf("|TRIANGLE   |%-10S|%-10S|%-10S|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                owner, color, borderColor, a, b, c, getArea());
    }
    
}
