
package data;

/**
 *
 * @author Windows
 */
public class RightTriangle extends Triangle{

    public RightTriangle(double canhA, double canhB) {
        super(canhA, canhB, canhB);
    }
    
    
    
    public double computeSTriangle(double a, double b) {
        
        return (a * b) / 2;    
    }
    @Override
    public double getS() {
        return computeSTriangle(canhA, canhB);
    }

    @Override
    public void printInfor() {
        System.out.printf("|RIGHT TRIANGLE|%4.1f|%4.1f|%4.1f|\n", canhA, canhB, computeSTriangle(canhA, canhB));
    }
}
