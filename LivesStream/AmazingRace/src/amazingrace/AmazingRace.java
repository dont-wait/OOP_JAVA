/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

/**
 *
 * @author Windows
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //showRecode();
        showRecodeWithTakeAway();
    }
     public static void showRecodeWithTakeAway() {
        
        //đường đua đông vui, có nhiều racer và có 1 con gì đó ko nhìn rõ 
        //bay theo, 1 vật gì đó bay theo, tức là có tốc độ
        //mình ko biết , ko xác định đc nhóm của nó là gì, chưa bt class gì
        //vì mày muốn nhập hội, okie, chạy theo là đc rồi, chơi trò take away
        //mượn gió bẻ măng, mượn Pet để new Object
        
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            
            @Override
            public double run() {
                return new Random().nextDouble() * 30;
            }
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|   %4.1f|\n", 
                                      "XXX",name, yob, wei, run());
            }
        };  //VIP
        
        Hamster xx = new Hamster("NHẮT", 2021, 3);
        Pet racer[] = new Pet[] {new Dog("CHIHUHU", 2021, 0.5),
                                 new Dog("VÀNG ƠI", 1950, 10.0),
                                 new Cat("TOM", 1960, 15.0),
                                 new Cat("KITTY", 1990, 5.0),
                                 new Hamster("JERRY", 1960, 0.5),
                                 xx,
                                 ufo    //object tạo từ anonymous vẫn là Pet, vào mảng
                                };
        
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }
        
       
        System.out.println("The record ascending table");
        
   }        
    public static void showRecode() {
        Hamster xx = new Hamster("NHẮT", 2021, 3);
        Pet racer[] = new Pet[] {new Dog("CHIHUHU", 2021, 0.5),
                                 new Dog("VÀNG ƠI", 1950, 10.0),
                                 new Cat("TOM", 1960, 15.0),
                                 new Cat("KITTY", 1990, 5.0),
                                 new Hamster("JERRY", 1960, 0.5),
                                 xx
                                };
        //racer[0] = new Dog("",,);
        //phần tử mảng Pet thì phải gán 1 con Pet nào đó, Cat, Dog, HT
        //gán = new Dog(..); [i] = cần tọa độ vùng new Con nào đó()
        //new Dog() ...; bố trí vùng RAM trong HEAP, gọi phễu đổ vào
        //tọa dộ vùng new đưa cho ai đó
        //đa hình quay trở lại
        //vì mảng Pet, mọi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT
        //HOÀN TOÀN KO ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        //CHA QUẤT ROI CHẠY ĐI CHÚNG MÀY, THẾ LÀ 3 ĐỨA CON CHẠY
        //TỐC ĐỘ CỦA RIÊNG CHÚNG, ĐA HÌNH XUẤT HIỆN, OVERRIVE QUA MẶT CHA
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }
        
        //TẠI THỜI ĐIỂM VIẾT CODE THẾ NÀY KHÔNG SORT THÀNH TÍCH CHẠY ĐƯỢC
        System.out.println("The record ascending table");
        
   }            
    

}
