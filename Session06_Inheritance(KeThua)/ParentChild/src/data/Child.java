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
//V1. Con cũng tạo dựng đc 2 nhóm tài sản, Cha cx đã làm

//V2. Con tạo dựng thêm những thứ mà Cha chưa từng, biến dị

//1. Tìm thấy IS A, extends

//2. Đặc điểm của Con
//  2.1 Con giống y chang Cha, ko cần làm gì cả

//  2.2 Con biến dị, khác Cha một vài thứ

//3. Phễu, giữ bản sắc Con, Cha Con deal, thương thuyếtđàm phán

public class Child extends Parent{

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + " asset2: " + assetTwo);
    }
}
