/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.util.Random;

/**
 *
 * @author Windows
 */
public class Cat extends Pet{
    public static final double MAX_SPEED = 50;
    //tốc độ tối đa của tất cả thí sinh
    private String ribbon;  //ruy băng

    public Cat(String name, int yob, double weight, String ribbon) {
        super(name, yob, weight);   //mều chính là 1 thú cưng
        this.ribbon = ribbon;       //đưa Con bay thật xa
    }

    public String getRibbon() {
        return ribbon;
    }

    public void setRibbon(String ribbon) {
        this.ribbon = ribbon;
    }
    
    
    @Override
    public double run() {   //implement
        //Trong cuộc sống có những "thứ-object" sinh ra cho mình mấy trò 
        //ngẫu nhiên, như vậy chúng thuộc Nhóm/Khuôn Ngẫu Nhiên, class ngẫu nhiên
        //JDK có sẵn cái Khuôn này rồi, tên là Random
        //                                              ~~~~Scanner~~~~ Math
        Random mayNgauNhien = new Random();             //trả cho mình con số ngẫu nhiên (0...1) * 50 ~~~= 50
        double speed = mayNgauNhien.nextDouble() * MAX_SPEED;   
        return speed;   //trả về tốc độ gần 50, hên xui random
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4s|%4.1f|\n", 
                                    "CAT", name, yob, weight, ribbon, run());
    }
    
}
