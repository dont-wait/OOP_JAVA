
package data;



public class Triangle {
    protected double canhA;
    protected double canhB;
    private double canhC;
    
    public Triangle(double canhA, double canhB, double canhC) {
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
    public double getS() {
        return computeSTriangle(canhA, canhB, canhC);
    }
    /**
     *
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double computeP(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    public double computeSTriangle(double a, double b, double c) {
        double p = computeP(a, b, c);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public void printInfor() {
        System.out.printf("|TRIANGLE      |%4.1f|%4.1f|%4.1f|%4.1f|\n", canhA, canhB, canhC, computeSTriangle(canhA, canhB, canhC));
    }
    
   
}
