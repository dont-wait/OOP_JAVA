package craftsman;

import data.Disk;
import data.Retangle;
import data.RightTriangle;
import data.Square;
import data.Triangle;

/**
 *
 * @author Windows
 */
public class CraftsMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //cutShapes();
        //sortShapes();
        //playWithChildClass();
        playWithTriangles();
    }
    
    public static void playWithTriangles() {
        Triangle t1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        t1.paint();
        //KHAI CHA NEW CHA
        //RightTriangle rt1 = new Triangle("TÍA", "PINK", 3, 4, 5);
        //vớ vẫn nha
        //                    TGV một là HTG
        //chơi trò ngược đời, Cha là phiên bản của Con, TG là phiên bản V
        RightTriangle rt1 = new RightTriangle("MÁ", "PINL", 6, 8);
        rt1.paint();    //mình chưa có paint() lấy của Cha mà xài
                        //XÀI TỪ CHA, PHẢI NGHE LỜI CHA THEO QUY TẮC CỦA CHA
                        //RECTANGLE ĐC IN RA
        //KHAI CON NEW CHA
        
        //KHAI CHA NEW CON -> ĐÚNG NGHĨA DÙNG KẾ THỪA CÁCH ĐỌC IS/A
        Triangle rt2 = new RightTriangle("BÉ NA", "RAINBOW", 6, 8);
        //      TG      đc xem là, is a <-- hình TGV
        //khi chấm thì hàm của ai, quan trọng là khai báo gì
        //tao xem new RT() là, gọi tên tắt là TG
        //rt2. xổ ra toàn là TG
        rt2.paint();    //PAINt() CỦA CHA, NHƯNG KHI CHẠY LẠI LÀ CON
        //dù là danh nghĩa CHA, NHƯNG Con làm đc, để Con lo cho
        //Cha ngồi im, Con qua mặt, con đc ưu tiên khi Cha Con trùng hành động
        
        
    }
    
    public static void playWithChildClass() {
        Square s1 = new Square("TÍA", "PINK", 3.0);
        //trong ram sẽ là: new Square() vùng Square dc clone
        //                  new Rectangle() super() vùng S có o, c, w, l = nhau
        s1.paint(); //lấy của Cha xìa, xám nhẹ, ko đen đậm kiểu chính chủ
        //bị in ra REACT...in đúng nhưng ko hay, lí do là xài đồ của Ba
        //thì theo Ba
        //muốn thừa kế gia sản ko, tao sang tên cho, học ngon đi con
        
        //vi diệu tập 1
        Retangle r1 = new Retangle("MÁ", "PINK", 4, 5);
        r1.paint();
    
        //vi diệu tập 2
        Retangle s2 = new Square("BÉ NA", "RAINBOW", 4.0);
        //      CN          V
        s2.paint(); //HCN   //PAINT() CỦA CHỮ NHẬT, CHẠY THỬ COI
                            //SQR CON ĐÃ QUA MẶT CHA< CHA NGỒI IM ĐỂ CON LO
    }
    public static void sortShapes() {
        Retangle r1 = new Retangle("TÍA", "PINK", 1.0, 2.0);

        Retangle rectArr[] = new Retangle[9];
        

        rectArr[0] = r1; //2 chàng 1 nàng                            
        //chứng minh
//        rectArr[0].paint();
//        rectArr[0].setOwner("TÍA YÊU!!!");
//        
//        r1.paint(); //tía yêu
    
        rectArr[1] = new Retangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[1] = new Retangle("MÁ", "PINK", 2.0, 3.0);
        rectArr[2] = new Retangle("BÉ NA", "RAINBOW", 2.0, 1.0);
        
        rectArr[3] = new Square("GHỆ BÉ NA", "RAINBOW", 1.0);   //XÀI KẾ THỪA
        
    



        System.out.println("The rectangle list before sorting");
//        for (Retangle x : rectArr) {
//            x.paint();  //x = arr[i] x và [i] cùng trỏ vùng new Student()
//        } cấm for hết mảng nếu mảng chưa full, CHỈ FOR ĐẾN CHỖ GÁN THẬT
        //FOR ĐẾN COUNT
        for (int i = 0; i < 4; i++) {
            rectArr[i].paint();
        }
        System.out.println("The rectangle list after sorting");
        for (int i = 0; i < 3 - 1; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (rectArr[i].getArea() > rectArr[j].getArea()) {
                    Retangle t = rectArr[i];
                    rectArr[i] = rectArr[j];
                    rectArr[j] = t;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            rectArr[i].paint();
        }
    }

    public static void cutShapes() {
        Retangle r1 = new Retangle("TÍA", "PINK", 1.0, 2.0);
        r1.paint();

        Square s1 = new Square("MÁ", "BLUE", 4);
        s1.paint();

        Disk d1 = new Disk("BÉ NA", "RED", "<3", 2.0);
        d1.paint();
    }
}
