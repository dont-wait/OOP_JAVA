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
public final class RightTriangle extends Triangele {
    
   
    
    public RightTriangle(double canhA, double canhB) {
        super(canhA, canhB, canhB);
    }
    double computeSTriangle(double a, double b) {
        return (a * b) / 2;
    }
    @Override
    double getS() {
        return computeSTriangle(canhA, canhB);
    }
    
    @Override
    public void printInfomation() {
        System.out.printf("|RIGHT TRIANGLE|%4.1f|%4.1f|  - |S: %4.1f|\n",
                canhA, canhB, computeSTriangle(canhA, canhB));
    }
}
