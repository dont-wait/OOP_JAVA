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
//Nên kế thừa ai???
//Shape: khai báo cạnh edge, phễu (super), ếu thỏa hiệp, đảo thứ tự biến nếu muốn
//       get/set()
//BẤT BUỘC PHẢI IMPLEMENTS(viết code cho cha)


//Ngon: Kế thừa mẹ nó Rectangle
//                              ko cạnh, phễu thỏa hiệp tí, XONG, ếu cần làm gì
//                              CÙNG LẮM LÀ SỬA PAINT()
//                              Shape là Ông Nội, Rectangle là Cha, Square là Con
public class Square extends Rectangle{

    public Square(String owner, String color, String borderColor, double edge) {
        super(owner, color, borderColor, edge, edge);
    }
    //DONE, KO LÀM GÌ NX, HCN CÓ ĐỦ RỒI, OWNER, COLOR KÌA, 2 CẠNH EDGE BÊN CHA KÌA
    //MÀY MÚN IN KIỂU SQR THÌ MÀY OVERRIVE BA GẦN MÀY ĐI(hcn)
    
    
    @Override   //Cha, nhìn vào ngừi gần nhất
    public void paint() {
        System.out.printf("|SQUARE     |%-10s|%-10s|%-10s|%4.1f|%7.2f|\n",
                 owner, color, borderColor, a, getArea());
    }
    
}
