package craftsman;

import data.Disk;
import data.Retangle;
import data.Square;

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
        sortShapes();
    }

    public static void sortShapes() {
        Retangle r1 = new Retangle("TÍA", "PINK", 1.0, 2.0);

        Retangle rectArr[] = new Retangle[9];
        //9 biến Rect, rectArr[0]..[8]
        //~~ lớp có 30 ghế ngồi , nhưng chưa có bạn nào 
        //rectArr[i] = cần lắm lun 1 toạ độ vùng new/clone Student(..);
        //éo quan tâm new cũ mới, chỉ quan tâm toạ dộ new Rectangle

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
        
        //HV LÀM SAO Ở CHUNG MẢNG CHỮ NHẬT ĐC, VÀ NGƯỢC LẠI, VÀ TRÒN NX
        //CHÚNG TA KO CÙNG HỆ, CÙNG LOẠI, LÀM SAO CHUNG MẢNG
        //MẢNG KHAI BÁO NHIỀU BIẾN CÙNG KIỂU, V, TR, CN KHÁC KIỂU KO CHUNG MẢNG
        //KO CHUNG MẢNG, KO FOR TỰ ĐỘNG, KO SORT CHUNG
        //SORT RIÊNG 3 MẢNG NÓI LÀM GÌ?
        
        //CẦN 1 MẢNG GÌ GÌ ĐÓ CHỨA VUÔNG, CN, TRÒN,... - FOR CÁI DÌ ĐÓ, ĐẢO CÁI GÌ ĐÓ
        //SORT ĐC CẢ ĐÁM -> MẢNG GÌ ĐÓ LÀ CÁI GÌ???
        //muốn sắp xếp các obj thì phải vào hcung mảng
        //vào chung mảng mới for chung đc
//        ??arr[] = new ??? [9];
//        arr[0] = new Retangle(..)
//        arr[1] = new Square(..)
        
//        for thoải mới, đảo con trỏ thoải mái
        
//          TA MUỐN CHẾ TẠO 1 MÓN MỚI, THỨ MỚI, TA BẮT ĐẦU TỪ ĐÂU
//                                                          - từ đầu
//                                                          - từ cái có sẵn
//món đồ tức là object, mún chế tạo nhiều đồ ta cần Khuôn ( nhân bản obj)
//-> làm sao làm đc cái Khuôn : chế từ đâu, hay "độ" lại từ cái Khuôn khác
//                                                          kế thừa lại
//                                                          INHERIT/INHERITANCE
//  *CHẾ TỪ ĐẦU: NHỮNG THỨ ĐỘC LẬP NHAU: V, TR, CN, TG
//               XẾP CẠNH NHAU HƠI CHỎI NHAU, KO CHUNG MẢNG
//  *ĐỘ LẠI KHUÔN CÓ SẴN CHO NHANH -> SERIES CÁC OBJECT CÓ VẺ TƯƠNG ĐỒNG NHAU, BÀY CẠNH NHAU KO CHỎI, KO LOẠI TRỪ NHAU, TƯƠNG HỢP NHAU NHIỀU HƠN
//      Dòng S Samsung, Notes Samsung (bút) A5 A6
//      Apple: dòng S, C ...
//  ĐA DẠNG SP/OBJECT, NHƯNG LẠI NHANH TRONG VIỆC CHẾ TẠO!!!




        System.out.println("The rectangle list before sorting");
//        for (Retangle x : rectArr) {
//            x.paint();  //x = arr[i] x và [i] cùng trỏ vùng new Student()
//        } cấm for hết mảng nếu mảng chưa full, CHỈ FOR ĐẾN CHỖ GÁN THẬT
        //FOR ĐẾN COUNT
        for (int i = 0; i < 3; i++) {
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
