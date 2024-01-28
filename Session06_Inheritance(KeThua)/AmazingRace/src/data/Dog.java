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
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;
    //ko có dị biệt khác, mún thì làm giống mều

    public Dog(String name, int yob, double weight) {
        super(name, yob, weight);
    }

    @Override
    public double run() {
        //Random rd = new Random();
        return new Random().nextDouble() * MAX_SPEED;
                                //* this.MAX_SPEED;   //ko có static thì là đồ riêng 
                                //đồ chung hg được tư hữu
    }

    @Override
    public void showRecord() {
     System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4s|%4.1f|\n", 
                                    "DOG",name, yob, weight, " ",run());
    }
}
