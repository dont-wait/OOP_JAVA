
package data;

import java.util.Random;

/**
 *
 * @author Windows
 */
//Chơi thêm kế thừa, Motor IS A KIND OF VEHINCLE (abs class)

//MOTOR MUA VỀ CHẠY ĐI HỌC, CHUYỆN BTH
//NHƯNG TRÊN ĐƯỜNG THẰNG VỚ VẨN NÀO ĐÓ NẸT-BÔ, MÌNH KÉO TAY GA MẠNH HƠN
//BỐC ĐẦU, VỌT XE, TỐC ĐỘ PHẢI DỮ HƠN BTH, LÚC NÀY NGOÀI VIỆC LÀ MOTOR
//THÔNG THƯỜNG, TA CÒN LÀ ĐUA-THỦ NX, PHẢI LÀ ĐUA THỦ MỚI CÓ TỐC ĐỘ CAO
//GIA NHẬP HỘI ĐUA THOYM CHỈ ĐUA THOY
//TỚ CÒN LÀ 1 ĐUA-THỦ, KO DÙNG TỪ KHÓA EXTEND, XÀI TỪ LÀ 1 MEMBER CỦA
//                                                  IMPLEMENTS
//                                             TỚ THAM GIA CLB, TRIỂN KHAI VIỆC ĐUA
//THAM GIA CLB NÀO THÌ PHẢI CÓ HÀNH ĐỘNG CỦA CLB ĐÓ
//IMPLEMENTS ALL ABSTRACT METHODS BÊN CLB, CHỌN ĐI ĐUA MÀ KH CHỊU ĐUA
//@OVERRIDE
//CLASS CHÍNH CỦA CHÚNG TA CỨ CÓ ĐẶC ĐIỂM HVI NHƯ BTH
//CHÚNG TA THAM GIA CLB NÀO THÌ CÓ THÊM HÀNH ĐỘNG CỦA CLB ĐÓ, @OVERRIDE HĐ ĐÓ
//TRONG TA CÓ NHIỀU HÀNH ĐỘNG ỨNG VỚI TỪNG CLB TA THAM GIA, HỢP LÍ Ở NGOÀI ĐỜI
//ĐI VỚI BỤT MẶC ÁO CÀ SA, ĐI VỚI MA MẶC ÁO GIẤY
//VỀ LOGIC, TA CÓ THỂ THAM GIA N CLB, NHƯNG TA CHỈ CÓ 1 DÒNG HỌ
//TRONG JAVA, 1 CON TỐI ĐA 1 CHA, ĐON KẾ THỪA
//            1 CON THAM GIA N CLB, VẬY SẼ CÓ N HÀNH ĐỘNG CỦA N CLB

//C++,, 1 CON NHIỀU CHA LUÔN, ĐA KẾ THỪA

public class Motor implements DeathRacer{
    public static final double MAX_SPEED = 180;
    
    private String mode;    //Exciter 2021
    private String volume;  //Số phân khối 125.0cm3
    private String vin;     //biển số, số khung, Vehicle Indentifier Number

    public Motor(String mode, String volume, String vin) {
        this.mode = mode;
        this.volume = volume;
        this.vin = vin;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    
    //hành vi xe máy là chạy, có tốc độ được ghi nhận
    public double run() {
        return new Random().nextDouble() * MAX_SPEED;
    }                   //chạy ngẫu nhiên và ko quá 180km
    
    //quay video và gáy tốc độ
    public void showRecord() {
        System.out.printf("|%-10s|%-15s|%-8s|%11s|%5.1f|\n", 
                 "MOTOR", mode, volume, vin, run());
                                //150.cm3   //58F8-567.89   //180.0
    }

    @Override
    public double runToDead() {
        //CHẠY tốc độ cao hoy, đôn nồng, xoáy nồng, ép dên, đôn dền
        return run() * 3; //run() giả sử tối đa đc 150 x 3 đua đến chết còn gì?
    }

    @Override
    public void showHowToDead() {
        System.out.printf("|%-20s|%-15s|%-8s|%11s|%5.1f|\n", 
                 "MOTOR-RACER", mode, volume, vin, runToDead());
    }
}
