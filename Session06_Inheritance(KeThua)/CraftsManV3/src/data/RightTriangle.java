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
//1. đọc đc câu IS A 1 chiều, TGV là 1 TG, extends

//2. Khai báo đặc tính cho Con, nếu Con giống Cha về các đặc điểm, để cha
//lo ko cần làm lại, ko cần khai báo đặc điểm

//3. phễu cho Con, tôn trọng bản sắc của Con
//   TGV: o, c, 2 cạnh a b vuông
//   TG : o, c, a b c, mâu thuẫn Cha Con


public class RightTriangle extends Triangle{

    public RightTriangle(String owner, String color, double a, double b) {
        super(owner, color, a, b, Math.sqrt( a * a + b * b));
        //                                      TGV là 1 TG 3 cạnh, trong đó 2 cạnh V a, b
    }   //new TGV chính là new TG                                       //cạnh huyền tính = căn của
        //cắt 1 TGV cũng chính là cắt 1 TG
    @Override
    public void paint() {
        System.out.printf("|R.TRIANGLE|%-15s|%-10s|%4.1f|%4.1f|  - |%7.2f|\n",
                owner, color, a, b, getArea());
    }
}
