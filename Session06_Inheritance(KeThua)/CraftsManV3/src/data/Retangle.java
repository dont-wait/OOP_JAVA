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
public class Retangle {
    protected String owner;  //_______
    protected String color;  //_______
    protected double width;  //__5____
    private double length; //__20___
    
  
    public Retangle(String owner, String color, double weigh, double length) {
        this.owner = owner;
        this.color = color;
        this.width = weigh;
        this.length = length;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWidth() {
        return width;
    }

    public void setWeigh(double weigh) {
        this.width = weigh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{" + "owner=" + owner + ", color=" + color + ", weigh=" + width + ", length=" + length + '}';
    }
    public double getArea() {
        return width * length;  //tao éo in, để reuse nơi khác
    }
    
    //90.0 * 90.9 = 8100.00 độ rộng chiều dài nhập
    
    public void paint() {
        System.out.printf("|RECTANGLE|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, width, length, getArea());
    }
   
    
}

    //SOLID Dependency Injection
    //trong 1 clas bất kì vẫn có thể có overload
    //
    //override chỉ xảy ra với Con	Con muốn qua mặt Cha
