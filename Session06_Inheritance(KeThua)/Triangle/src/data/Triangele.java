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
public class Triangele {
   
    protected double canhA;
    protected double canhB;
    private double canhC;

    public Triangele(double canhA, double canhB, double canhC) {
        this.canhA = canhA;
        this.canhB = canhB;
        this.canhC = canhC;
    }

    public double getCanhA() {
        return canhA;
    }

    public void setCanhA(double canhA) {
        this.canhA = canhA;
    }

    public double getCanhB() {
        return canhB;
    }

    public void setCanhB(double canhB) {
        this.canhB = canhB;
    }

    public double getCanhC() {
        return canhC;
    }

    public void setCanhC(double canhC) {
        this.canhC = canhC;
    }
    double computeP(double a, double b, double c) {
        
        return (a + b + c) / 2;
    }
    double computeSTriangle(double a, double b, double c) {
        
        double p = computeP(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    double getS() {
        return computeSTriangle(canhA, canhB, canhC);
    }
    public void printInfomation() {
        System.out.printf("|TRIANGLE      |%4.1f|%4.1f|%4.1f|S: %4.1f|\n",
                canhA, canhB, canhC, computeSTriangle(canhA, canhB, canhC));
    }
    
}
