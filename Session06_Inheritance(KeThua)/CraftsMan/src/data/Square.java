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
public class Square {
    private String owner;
    private String color;
    private double edge;    //2 cạnh cho HV là vãi

    public Square(String owner, String color, double edge) {
        this.owner = owner;
        this.color = color;
        this.edge = edge;
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

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    @Override
    public String toString() {
        return "Square{" + "owner=" + owner + ", color=" + color + ", edge=" + edge + '}';
    }
    public double getArea() {
       // return edge * edge;  //tao éo in, để reuse nơi khác
       return Math.pow(edge, 2);    //edge^2
    }
     public void paint() {
        System.out.printf("|SQUARE   |%-15s|%-10s|%4.1f|  - |%7.2f|\n",
                owner, color, edge, getArea());
    }
    
}
