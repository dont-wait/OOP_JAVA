
package data;

//1. Tìm thấy IS A, extends

//2. Đặc điểm của Con, đồng nhất (Cha lo hết) hoặc dị biệt, Con có riêng

//3. Phễu, giữ bản sắc Con, Cha Con deal, thương thuyết đàm phán

//4. Vì Cha là abstract, tức là chỉ nói hoy, chưa làm, chung chung hoy
//  nên nếu Con ko chịu làm, tức là Con cx chứa hàm Abstract, thì Con
//  trong tình huống này phải là abstract luôn
//1 CLASS CHỨA HÀM ABSTRACT KO CODE, THÌ CLASS ĐÓ PHẢI LÀ ABSTRACT, DÙ TRONG NÓ CÓ VÀI HÀM CÓ CODE

//  Con thừa kế abstract class, mày có 2 lựa chọn, ko hơn
//  - Hoặc mày abstract, nếu mày ko chịu viết code cho Cha, thừa kế Abstract
//  - Hoặc mày phải viết code cho hàm abstract của Cha, vì mày đủ in4 để làm
//    mày là cụ thể rồi, vì mọi thứ trong mày là rõ ràng
//    CON VIẾT CODE CHO HÀM CHA, CHA NÓI CON LÀM, IMPLEMENT ABSTRACT METHODS
//    implement the body of Parent abstract methods
//  Cha đã nói ý tưởng, Con hiện thực thôi
//                          làm biếng, mày giống Cha abstract, đời Cháu tính...
//  Nếu ko chịu làm tiếp, mãi mãi là nói ko làm... -> Hệ quả gì
//  VÔ SINH, KO THỂ NEW ĐC 1 OBJECT TỪ CHA, CON LUÔN, VÌ CẢ 2 KO ĐỦ CODE
//  KO SINH ĐC OBJECT DO KHUÔN KHÔNG HOÀN HẢO!!!!!!!!!!!!!!!!!!!!!!!!!!!


public class Rectangle extends Shape{
    
    protected double a, b;    //kết hơp với phần làm biến/extend từ Cha
                            //sẽ tái hợp đầy đủ như chưa cso kế thừa

    public Rectangle(String owner, String color, String borderColor, double a, double b) {
        super(owner, color, borderColor);   //Cha phải có trước, làm cánh chim
        this.a = a;                         //Con bay xa, extends, dễ bố trí RAM
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public String getBorderColor() {
        return borderColor;
    }

    @Override
    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }

    
    @Override
    public void paint() {
        System.out.printf("|RECTANGLE |%-10s|%-10s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, borderColor, a, b, getArea());
    }
    
    
}
