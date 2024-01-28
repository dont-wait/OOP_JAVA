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
    //private String ribbon;

    public Cat(String name, int yob, double wei) {
        super(name, yob, wei);
    }

    @Override
    public double run() {
        //Random rd = new Random();   //nắm tọa độ vùng new
                                    //nằm trong vùng new có hàm .nextDouble()
        return new Random().nextDouble() * MAX_SPEED;
        //      object hok thèm đặt tên, xài vùng new 1 lần bỏ luôn
        //      CT   MTDT, Garbage collector System.gc dọn rác
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%7.2f|\n", "CAT"
                 ,  name, yob, wei, run());
    }
   
}
