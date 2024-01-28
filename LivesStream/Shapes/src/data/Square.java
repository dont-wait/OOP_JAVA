
package data;

/**
 *
 * @author Windows
 */
//V trọn vẹn giống HCN, ko dị biệt về đặc tính
public class Square extends Rectangle{

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }

    
 
    //ta mún in theo cách của V, cho nên cần viết lại hàm paint()
    //duy nhất paint() ko cần những hàm S(), P()
    
    @Override
    public void paint() {
        System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4.1f|    |%7.2f|\n", "SQUARE", owner, color, borderColor, a, getArea());
    }
}   
