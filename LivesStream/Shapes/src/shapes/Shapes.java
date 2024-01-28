
package shapes;

import data.*;  //.* tức là import hết tất cả các Khuôn trong ngăn tủ đó

/**
 *
 * @author Windows
 */
public class Shapes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //sortShapes();
        //playWithAnonymousClass();
        sortShapesWithAnonymous();
    }
     public static void sortShapesWithAnonymous() {
         
         //Anonymous ở đây nhen!!!
         Shape onTheGo = new Shape("THIS-TUI", "RANDOM", "RANDOM") {
             @Override
             public double getArea() {
                //cắt hình ngẫu nhiên, ko đc gọi là hình dì, S phải tự do
                return 50;
             }
             
             @Override
             public double getPerimeter() {
                 return 40;
             }
             
             @Override
             public void paint() {
                 System.out.printf("|%-10s|%-10s|%-10s|%-10s|%4s|%4s|%7.2f|\n", "TAKE-AWAY",owner, color, borderColor, " ", " ", getArea());
        }
         };
    
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MANGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MANGENTA", "PINK", 6, 5);
        
        Square s1 = new Square("MÁ", "PINK", "MANGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MANGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MANGENTA", 9);
    
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1);


//                                         [i]
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2, onTheGo};                            
//        Shape arr1[] = new Shape[] {new Rectangle("TÍA", "PINK", "MANGENTA", 5, 6),
//                                    new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2)};
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            //x = arr[0] x = arr[1]
            x.paint();//tính đa hình
        }    
        
        //sắp xếp tăng dần theo diện tích
        System.out.println("The list shapes after sorting ascending by area");
        for (int i = 0; i < 8 - 1; i++) 
            for (int j = i + 1; j < 8; j++) 
                if(arr[i].getArea() > arr[j].getArea()) {
                    Shape t = arr[i];   
                    arr[i] = arr[j];   
                    arr[j] = t;       
                                      
                }
       
            
        for (Shape x : arr) {
            x.paint();
        }
            
            
    }
    //kỹ thuật tạo object/vùng new mà ko cần Khuôn cụ thể
    //dành cho những object vô định hình, ko có công thức để tính toán và
    //nhân bản, ko có Khuôn cố định, cắt hình ngẫu nhiên, nhưng vẫn là hình
    //NHƯNG VẪN CHẮC CHẮN LÀ HÌNH: CÓ ĐƯỜNG NÉT, CÓ MÀU, CÓ CẠNH
    //ÉO CÓ CÔNG THỨC TÍNH CHUNG, NHÂN BẢN LẠI ĐC NHANH CHÓNG
    //HCN CẮC NHANH CHÓNG, HÌNH ELIPSE CX NHANH, HBH CX NHANH VÌ NHÂN BẢN ĐC
    //HÌNH CẮT GẤP KHÚC, MỖI HÌNH DUY NHẤT, KO NHANH ĐC, KO CÓ KHUÔN
    //OBJECT VÃNG LAI, KO THƯỜNG QUEN SỬ DỤNG/LÀM/GẶP
    //DÙ LÀ HÌNH KIỂU GÌ, CÔNG THỨC CHUNG: NEW CHA/SUPER CHA + @OVERRIDE
    public static void playWithAnonymousClass() {
        //Shape vangLai = new NoName(...);    //bên trong phải full code cho Cha
        //Shape x = new HCN(...);             //                //
        //CẮT NGẪU NHIÊN LÀM SAO BIẾT BAO NHIÊU CẠNH ĐƯA VÀO
        //CHỈ ĐƯA ĐC MÀU, TẶNG AI, TÔ MÀU VÀ TỰ ĐO DIỆN TÍCH LÀ ỔN, ẾU CÓ CÔNG THỨC
        //NẾU MUỐN RÕ RÀNG THÌ CẮT V, TR, CN, TG, HBH, MŨI TÊN,...
        Shape vangLai = new Shape("CHÍNH MÌNH", "GREEN", "BLUE") {
            @Override
            public double getArea() {
                return 50; //vì hình cụ thể, ko theo hình dạng nào, ta tự đo
            }
            
            @Override
            public double getPerimeter() {
                return 40;
            }
            
            @Override
            public void paint() {
                //khai báo là Con Shape vẫn kế thừa như bth
                System.out.printf("|NGẪU NHIÊN|%-10s|%-10s|%-10s|%4.1f|\n", owner, color, borderColor, getArea());
            }
        };                      //.paint();  //VIP
        //mày là 1 hình, thoải mái vào mảng Shape sort nếu muốn
        //m vẫn là Shape, kiểu Shape, có đủ code cho hàm Cha
        //kỹ thuật mượn gió bẻ măng, mượn Cha tạo Con, mượn Shape new Con
        //NEW ABSTRACT CLASS SẼ BUNG RỘNG MÀN HÌNH GÕ CODE OVERRIDE
        //THỎA CÔNG THỨC CON = NEW CHA + @OVERRIDE
        //CHỈ XÀI CÁCH NÀY NẾU CHỈ CẦN LÀM 1 OBJECT ON THE GO, MÀ LÀM BIẾNG
        //LÀM KHUÔN CON RIÊNG LẺ, THEO CÔNG THỨC NHÂN BẢN
        vangLai.paint();
          
    }
    public static void sortShapes() {
        //sort cần mảng, mảng chỉ chơi cùng kiểu
        Rectangle r1 = new Rectangle("TÍA", "PINK", "MANGENTA", 5, 6);
        Shape r2 = new Rectangle("TÍA", "MANGENTA", "PINK", 6, 5);
        
        Square s1 = new Square("MÁ", "PINK", "MANGENTA", 7);
        Rectangle s2 = new Square("MÁ", "PINK", "MANGENTA", 8);
        Shape s3 = new Square("MÁ", "PINK", "MANGENTA", 9);
    
        Disk d1 = new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2);
        Disk d2 = new Disk("GHỆ BÉ NA", "RAINBOW", "RAINBOW", 1);

//        Shape arr[] = new Shape[7];
//        //arr[0] = new 1 Hình cụ thể nào đó, new Rectangle(...), new Disk(...);
//        //cần lắm luôn [i] lưu tọa độ vùng new()
//        //[i] tham chiếu vùng new, trỏ vùng new, lưu địa chỉ vùng new
//        //vùng new() nằm đâu trong HEAP kệ nó
//        arr[0] = r1; // 2 chàng 1 nàng
//        //arr[0].paint();
//        arr[1] = arr[0]; // 3 chàng 1 nàng
//        arr[2] = d2; //tao cần tọa độ vùng new Hình nào đó()
        //Shape arr[] = new Shape[] {Các tọa độ vùng new() đưa vô};
//                                         [i]
        Shape arr[] = new Shape[] {r1, r2, s1, s2, s3, d1, d2};                            
//        Shape arr1[] = new Shape[] {new Rectangle("TÍA", "PINK", "MANGENTA", 5, 6),
//                                    new Disk("BÉ NA", "RAINBOW", "RAINBOW", 2)};
        System.out.println("The list of shapes");
        for (Shape x : arr) {
            //x = arr[0] x = arr[1]
            x.paint();//tính đa hình
            //GỌI HÀM PAINT() CỦA CHA, NHƯNG 3 ĐỨA CON TỰ ĐỘNG QUA MẶT
        }   //CHÚT LO LẮNG: PAINT() CỦA CHA ẾU CÓ CODE, ABSTRACT
            //ĐỪNG LO, VÌ LÁT HỒI MẤY CON TỰ LO, DO MÌNH NEW KHÔNG HÀ
            //NEW CON CON ĐÃ VIẾT CODE RỒI, CHA NGỒI IM CON LO CHO
            //CON SẼ GIẢI QUYẾT CHUYỆN HOÀN HẢO CHO CHA
            //TỪ HÀM CHA GỌI, CON HƯỞNG ỨNG, N CON HƯỞNG ỨNG
            //TỪ 1 ÁNH XẠ RA NHIỀU CÁCH THỨC,TÍNH ĐA XẠ, ĐA HÌNH, ĐA NHÂN CÁCH POLYMOPHISM
        
        //sắp xếp tăng dần theo diện tích
        System.out.println("The list shapes after sorting ascending by area");
        for (int i = 0; i < 7 - 1; i++) 
            for (int j = i + 1; j < 7; j++) 
                if(arr[i].getArea() > arr[j].getArea()) {
                    Shape t = arr[i];   //đa hình nè: getArea là của Cha
                    arr[i] = arr[j];    //diện tích của Cha đg là Abstract, đừng lo để Con cho
                    arr[j] = t;         //vì arr[i] luôn trỏ 1 hình cụ thể
                                        //          getArea() là cụ thể Con
                }
        //đang trỏ arr[i] nếu không ổn thì đổi trỏ sang j
            
        for (Shape x : arr) {
            x.paint();
        }
            
            
    }
    
    
}
