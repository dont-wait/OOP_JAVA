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
public class Disk extends Shape{
    
    public static final double PI = 3.14;
    
    private String smile;   //dị biệt cho Con
    private double radius;
    //owner, color, border lấy từ Cha, Cha giữ dùm, những điểm chung cho ae

    public Disk(String owner, String color, String borderColor, String smile, double radius) {
        super(owner, color, borderColor);
        this.smile = smile;
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
       return Disk.PI * (radius * radius);
    }
    
    @Override
    public double getPerimeter() {
        return 2 * Disk.PI * radius;
    }
    
    @Override
    public void paint() {
        System.out.printf("|DISK      |%-10s|%-10s|%-10s|%3s|%4.1f|%7.2f|\n",
                owner,  color, borderColor, smile, radius, getArea());
    }
}
