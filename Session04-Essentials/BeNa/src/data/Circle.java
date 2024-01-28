
package data;


public class Circle {
    String name, color;
    double r;
    final double PI = 3.14;

    public Circle(String name, String color, double r) {
        this.name = name;
        this.color = color;
        this.r = r;
    }
    public void showOwn() {
        System.out.printf("|%8s||%8s||%.4f|", name, color, r);
    }
}
