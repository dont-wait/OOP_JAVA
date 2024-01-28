/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craftmanv4;

import data.Disk;
import data.Rectangle;
import data.Shape;
import data.Square;
import data.Triangle;

/**
 *
 * @author Windows
 */
public class CraftManV4 {

    
    public static void main(String[] args) {
       // playWithShapes();
       sortShapes();
    }
    public static void sortShapes() {
        Rectangle r1 = new Rectangle("TIA1", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TIA", "MAGENTA", "PINK", 6, 5);
        
        Square s1 = new Square("MÁ", "PINK", "MAGENTA",6);
        Rectangle s2 = new Square("MÁ", "PINK", "MAGENTA",7);
        Shape s3 = new Square("MÁ", "PINK", "MAGENTA",9);
        //Hà Kiều Anh nhận là công chúa!!!                                                   
        
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);               
        Shape d2 = new Disk("BÉ NA", "RAINBOW", "BORDEAUX", "<3", 6);
    
        Triangle t1 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 3, 4, 5);
        Shape t2 = new Triangle("GHỆ BÉ NA", "RAINBOW", "BORDEAUX", 6, 8, 10);
        
        //ta có thể khai báo 9 hình này đêù là SHAPE, CỰC ĐẸP KHI NHÌN ĐC HÌNH
        //ĐỒNG NHẤT
        //IN KẾT QUẢ TRƯỚC KHI SORT DIỆN TÍCH
        r1.paint(); //HÀM CỦA  CON CHẠY THẤY NÀO     CON   CON
        r2.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CHA   CON  OVERRIDE
        s1.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CON   CON
        s2.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CHA   CON
        s3.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      ÔNG   CHÁU  CHÁU QUA MẶT
        d1.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CON   CON
        d2.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CHA   CON  QUA MẶT
        t1.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CON   CON
        t2.paint(); //HÀM CỦA ??? CHẠY THẤY NÀO      CHA   CON

        //PAINT() Ở ĐÂY CỰC HAY:
        //CHỈ CÓ 1 HÀM TÊN LÀ PAINT() NHƯNG ĐA DẠNG CÁCH VIẾT CODE
        //LÚC CHẠY ĐA DẠNG LUÔN, LÚC CHẠY TRÒN, CHỮ NHẬT, V, TR
        //cùng hàm Cha, Ông Nội tùyy cách khai báo, nhưng đám con cháu bt
        //Override đúng lúc
        //từ 1 hàm paint() ánh xạ/chiếu ra N cách viết code/implement khác nhau
        //thực thi (chạy) theo N cách khác nhau
        //từ 1 biến hóa ra nhiều, từ 1 có đa hình dạng, đa ánh xạ cách làm
        //từ 1 biến hình transformer, đa nhân cách 50 sắc thái, từ 1 ra nhiều
        //KỸ THUẬT VIẾT CODE TỪ 1 HÀM MÀ CÓ N CÁCH THỂ HIỆN CHẠY KHÁC NHAU
        //KỸ THUẬT NÀY GỌI LÀ TÍNH ĐA XẠ, ĐA HÌNH POLYMORPHISM
        
        //HAY HƠN NX NÀY, CHÚNG MÀY VÀO MẢNG GIÙM TAO ĐỂ TAO FOR, TAO SORT
        //MẢNG SHAPE AGAIN
//        Shape box[] = new Shape[9]; //9 biến Shape
//        //box[0] box[1]ư .. là các biến Shape cần trỏ vùng new con mẹ gì đó
//        //                              new Rectangle() new Disk() new Square()
//        //box[0] = new Re
//        box[0] = r1;    //2 chàng 1 nàng
//        box[1] = r2;
//        box[2] = d1;
//        Shape box[] = new Shape[] {new Disk(), new Rectangle, new Triangle()};
        Shape box[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, t1, t2};
        System.out.println("The list of shapes");
        for (Shape x : box) {
            //x cùng trỏ vùng new mà box[i] đang trỏ, new Rec(), new Disk()
            x.paint();
            //ĐA HÌNH SIÊU ĐẸP, 1 HÀM PAINT() CHA N CÁCH CHẠY
            //1 RA NHIỀU CÁCH THỰC THI, ĐA HÌNH ĐA XẠ POLYMOPHISM
            //CHA CHỈ NÓI PAINT(), ANH EM NHÀO VÔ
        }   
            //SORT ĐC KO???
        for(int i = 0; i < 9 - 1; i++)
            for(int j = i + 1; j < 9; j++)
                if(box[i].getArea() > box[j].getArea()) {
                    Shape x = box[i];
                    box[i] = box[j];
                    box[j] = x;
                }
        System.out.println("The list of shapes after sorting:");
        for (Shape x : box) {
            x.paint();
        }
               //có sợ ko lấy đc S hay ko??? éo sợ
               //ĐA HÌNH, GỌI HÀM CHA, NHƯNG CON CHẠY
               //MÓA, HÀM S() P() ĐA HÌNH, CHA GỌI CON QUA MẶT
        
        //sắp xếp hoy...
    }
    public static void playWithShapes() {
        Rectangle r1 = new Rectangle("TIA1", "PINK", "MAGENTA", 5, 6);
        Shape r2 = new Rectangle("TIA", "MAGENTA", "PINK", 6, 5);
        ((Rectangle)r2).getA(); //phần dị biệt của con
        
        Disk d1 = new Disk("MÁ", "PINK", "MAGENTA", "<3", 6);               
        Shape d2 = new Disk("MÁ", "PINK", "MAGENTA", ":x", 6);
        
        r1.paint(); //Con, RECTANGLE
        r2.paint(); //Cha, Khi chạy qua mặt Cha, Rectangle; Cha làm ếu có ode
        d1.paint(); //Con, DISK
        d2.paint(); //Cha, qua mặt Cha, ko care Cha nói chung, ưu tiên con
                    //code Cha ko cso ko ảnh hưởng
                    
                    //NEW CHA THÌ SAO THƯA THẦY, BÀN VỤ NÀY SAU, KHÓ!!!!!
                    //DO CODE KO HOÀN HẢO, KO ĐẦY ĐỦ
        //.PAINT() CHÍNH LÀ POLYMORPHISM, ĐA XẠ ĐA HÌNH ĐÃ XUẤT HIỆN
    }
    
}
