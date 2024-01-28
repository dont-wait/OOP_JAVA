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
//Dog ngoan ngoãn ban ngày, tối chủ đi ngủ,nó trốn đi hoang
//đi đua thì nó phải chạy vượt tốc độ bth, runToDead() như mọi đua thủ
//Mình vẫn là Con Cháu dòng họ Lê, PHạm, học như SV,
//nhưng còn tham gia CLB Đua Thủ, Phượt, CLB, thì phải có hành động của clb đó
//IMPLEMENTS ALL ABSTRACT METHODS, NỘI QUY CLB, @OVERRIDE
public class Dog extends Pet implements DeathRacer{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double weigth) {
        super(name, yob, weigth);
    }

    @Override
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;    
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%7.2f|\n", "DOG"
                                                                 ,  name, yob, weigth, run());    
    }

    //PHẦN HOANG DÃ TRONG TA, BỘC LỘ KHI ĐI ĐUA
    //TỤI MÀY, SB, NGOAN NGOÃN Ở NHÀ GIÃN CÁCH
    //VÀO SG, CHẮC CHẮN THÊM PHẦN BỘC LỘ KHÁC: NHẬU NHẸT, CÁ ĐỘ, ĐÁNH BÀI,...
    //                                         CLB TA, PHƯỢT, TỪ THIỆN, CẦU LÔNG
    
    @Override
    public double runToDead() {
       return run() * 5; //chạy hơn 5 lần
    }

    @Override
    public void showHowToDead() {
         System.out.printf("|%-20s|%-10s|%4d|%4.1f|%7.2f|\n", "DOG-RACER"
                                                                 ,  name, yob, weigth, runToDead());    
    }
    
    
}
