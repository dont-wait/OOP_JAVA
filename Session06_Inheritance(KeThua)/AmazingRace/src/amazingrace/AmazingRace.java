
package amazingrace;

import data.Cat;
import data.Dog;
import data.Pet;

/**
 *
 * @author Windows
 */
public class AmazingRace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        register();
    }
    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        tom.showRecord();
        
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        kitty.showRecord();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2021, 50.0);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        beTo.showRecord();
        
        //run() đa hình rồi các con ơi
        //if ([i].run() > [j].run()) KHÓ VÌ MÓA, MỖI LẦN GỌI RUN() THẰNG I, J
        //LÀ KHÁC NHAU
        //BÀI KIA LÀ DIỆN TÍCH ĐIỂM TB CỐ ĐỊNH LÚC SORT, 2 FOR KO ĐỔI S, ĐIỂM
        //BÀI NÀY CỨ GỌI TOM. RUN() TÊN CỐ ĐỊNH, NĂM SINH CỐ ĐỊNH
        //RUN() ẾU CỐ ĐỊNH
    }
}
