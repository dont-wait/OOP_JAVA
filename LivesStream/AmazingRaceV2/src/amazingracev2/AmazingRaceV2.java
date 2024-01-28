
package amazingracev2;

import data.*;
/**
 *
 * @author Windows
 */
public class AmazingRaceV2 {

    
    public static void main(String[] args) {
        runToDead();
    }
    public static void runToDead() {
        
        //CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÔ
        //MỸ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VÀO!!!
        
        
        
        Dog d1 = new Dog("NGÁO ĐÁ", 2021, 50.0);
        //chấm full hàm của Con, đủ code, hàm Cha, CLB
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        //chấm full hàm Cha, KHai Cha,  chạy ko sợ vì đa hình Con qua mặt
        //tổ lái Con trỏ đc, new Dog mà sợ gì
        //tao là "danh nghĩa Cha" thì chỉ xổ Cha hoy, hc ròi
        //mày biết bố tao là ai ko???, hù theo kiểu Bố
        
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        //ngộ nhỡ dấu chấm  thì sao???
        //chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        //tao là Đua Thủ chỉ quan tâm đua hoy
        //chạy éo sợ vì Con qua mặt, có đủ hàm @Override đã làm rồi, đa hình tiếp
        //ép con trỏ đc luôn, new Dog mà sợ gì
        
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");
        
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2};
        //toàn bộ là DeadRacer, đa hình trên runToDead(0 showHowTo()
        //Con tự lo, Con Motor chạy theo Con Motor, Con Dog chạy theo Con Dog
        System.out.println("The racing record");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
}
