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

public class Triangle {
    protected String owner;
    protected String color;
    protected double a, b, c;
    
    
    //nếu đưa 3 cạnh cà chớn thì sao???
    //tổng 2 cạnh bk phải lớn hơn cạnh kia, bắt buộc
    //có 3 cách xử lí: chặn nhập từ Scanner, trước khi đổ
    //                  default, mày cà chớn mày default
    //ném vào mặt mày cái ngoại lệ, chủ động bảo JVM giết app đê
    //kỹ thuật cấm new
    //in yob = sc.nextInt();
    public Triangle(String owner, String color, double a, double b, double c) {
        this.owner = owner;
        this.color = color;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    
    //toàn bộ các hàm + phễu ở trên quá quen
    //1 nhóm dev quyết định làm 1 thư viện class riêng giống Scanner, Math
    //và nó giúp ta loại bỏ hết đoạn code ở trên khi tạo class
    //chỉ gõ vài dòng là tui mún có cst, get() set()
    //khi F6, thư viện này sẽ tự động generate ra đoạn code nhàm chán ở trên
    //thư viện LOMBOK
    public double getPerimeter() {
        return a + b + c;
    }
           
    public double getArea() {
        //công thức Heron: sqrt(p * (p - a) * ); p = (a + b + c) /2
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public void paint() {
        System.out.printf("|TRIANGLE  |%-15s|%-10s|%4.1f|%4.1f|%4.1f|%7.2f|\n",
                owner, color, a, b, c, getArea());
    }
}
