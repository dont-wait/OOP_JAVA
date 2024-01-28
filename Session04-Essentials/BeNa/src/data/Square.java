
package data;


public class Square {
    String name, color;
    Double canh;

    public Square(String name, String color, Double canh) {
        this.name = name;
        this.color = color;
        this.canh = canh;
    }
    public void showOwn() {
        System.out.printf("|%8s||%8s|%.2fx%.2f|", name, color, canh, canh);
    }
}
