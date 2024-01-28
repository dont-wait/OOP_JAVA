package main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        //checkObjectV3();
        //checkObjectV4();
        Student ahihi = checkObjectV8();    //ahihi lưu tọa độ của AN trong hàm thẩy ra ngoài
        ahihi.showProfile();
    }
    //Hàm trả về 1 object hả thầy, ko
    //đọc chuẩn: hàm trả về 1 tọa độ của 1 obj nào đó, vì trả đc tạo độ nghĩa là 
    //sờ đc object, có tọa độ chấm là tới object
    
    //            Student x;
    public static Student checkObjectV8() { //~~ Student x = sẽ là 1 vùng new
        Student x; 
        x = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        return x;   //Việt sub: x lưu tọa độ vùng clone AN, hướng 6M
                    // thẩy tọa độ đó cho tên hàm, tên hàm là 6M, hướng 6M
        
        //CÓA NEW LÀ CÓ CLONE
        
    }

    public static void checkObjectV7() {
        Student x; //khai báo biến, khai báo con trỏ, nhưng chưa trỏ ai
        //tao với mày nói về thằng x kia đi, ai dzợ, từ từ sẽ nói
        
        int a;
        a = 10;
        
        x = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        //à nó đây nè
        //x = new()
        
        
        
    }

    public static void checkObjectV6() {

        //câu chuyện của sinh ra rồi chết non
        //câu chuyện vô danh tên gọi
        //object ko thèm, ko có tên gọi, vẫn hành xử đc
        //clone, đổ, nhớ tọa độ               
        //Student s1 = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        //           đã tương đương 1 tọa độ rồi, thảy tọa đọ đó đi đâu hoy
        //              thẩy cho biến obj nào đó giữ giùm tọa độ
        //biến đó mà chấm nghĩa là tọa độ chấm, nghĩa là NEW CHẤM LUÔN
        // vì biến có tọa độ từ new. CHỐT HẠ: NEW NẮM TỌA ĐỘ
        //chấm là vào trong tọa độ xem có cái gì, trong obj có gì
        new Student("SE0759", "AN NGUYỄN", 1999, 8.9).showProfile();

        //ko thèm đặt tên cho obj để giao tiếp, để obj tự giao típ lun
        //Obj mà ko có biến con trỏ -> Obj vô danh, anonymous object was created ưithout a name, a reference variable
        //XUẤT HIỆN XONG, GÁY XONG, KHOK XONG, GARBAGE COLLECTOR PHÁT HIỆN KO CON TRỎ
        //GIẾT, CLEAR
        //MÚN RE-USE LẠI VÙNG NEW, TỐI THIỂU ÍT NHẤT 1 TÊN GỌI, 1 BIẾN OBJECT
        //ĐỂ CÒN CHẤT TIẾP
    }

    public static void checkObjectV5() {

        //câu chuyện 2 chàng 1 nàng
        Student s1 = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        Student x = s1;

        s1.showProfile();
        x.showProfile(); // backup tọa độ new AN ở trên, thêm 1 con trỏ trỏ cùng, trùng
        //chứng minh 2 chàng trỏ đúng 1 nàng
        //chàng 1 tát, chàng 2 thấy
        s1.setName("MÌNH CHƠI Ú TÌM HENG");
        //trong vùng clone new AN đã bị thay đổi name thành MÌNH CHƠI...
        System.out.println("After TÁT");
        //hok thèm hỏi s1, hỏi lun x
        x.showProfile();

        //nhiều tên cùng tham chiếu 1 object;
        //tí, tèo ->  (Mình...)
        //hoàng, gl, xàm, đa cấp, cp -> (Tui)
        //cùng 1 tên ám chỉ nhiều object khác
        //sếp = ST
        //sếp = gã trả lương
        //THAY ĐỔI VALUE CỦA BIẾN
        //MỘT OBJECT CÓ NHIỀU NGƯỜI NGƯỚC NHÌN, THAM CHIẾU
    }

    public static void checkObjectV4() {

        //biến     //value
        Student s1 = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        Student x = s1; // mày là biến lưu độ đọ vùng new, cho tao tôạ độ đi
        //nếu tao tự new như mày, hok lẽ, sai, ra vùng clone mới
        //int a = 10;
        //int b = a;    //cho tao value của mày, tao mún lấy value của mày
        //trước khi s1 trỏ tọa độ mới, backup tọa độ cũ là xog
        //giữ lại đc clone AN
        s1 = new Student("SE0788", "LỘC PHÁT", 1998, 8.8);
        s1.showProfile();   //LP
        x.showProfile();    //AN đã trỏ lại, backup tọa độ new vào 1 biến khác cùng kiểu

        int a = 10;
        a = 100;

    }

    public static void checkObjectV3() {

        //biến     //value
        Student s1 = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        s1 = new Student("SE0788", "LỘC PHÁT", 1998, 8.8);
        //s1 li di vùng clone AN, chuyển sang kết nối với LP
        //ống nhòm dòm sang chỗ mới, con trỏ lưu tọa độ mới, biến thay đổi
        //lưu value gần nhất
        //con diều AN mất dây, vẫn có kết nối
        //vì sợi dây đã nối với con diều mới LP

        //lấy giá trị cuối cùng
        //int a = 10; a = 100;
        //s1 là biến object
        //tui cần lắm luôn 1 tọa độ vùng new, vùng clone Student
        s1.showProfile();   //LP

        //mất tọa độ vùng clone AN
        //vùng ram ko có ai trỏ tới, thì định kì khi chạy app, JVM (phần chạy // windows
        //sẽ kiểm soát app) giết/clear vùng clone ko có contrỏ
        //CỜ hó chạy ngoài đường ko chủ, Exciter hốt
        //cty MTĐT, JVM có đoạn code, module giám sát HEAP, xem đứa nào mồ côi, ko có con trỏ
        //giết ngay là luôn (độ trễ if any) ~~ free(con trỏ bên C malloc)
        //anh giấm sát này gội tên là Garbage Collector, ngừi gom rác
        System.gc();    //gom rác vùng HEAP 

        //ngoài đời có gán lại biến con trỏ, tên tắt cho thứ phức tạp
        //sếp = CS ST (...);
        //chết cha sếp kìa, (ông, gã chấm lương cho mình, qđ mình tăng lương hay)
        //ti = mày, tao ở nhà ba má gọi
        //tí = Ngô Thanh vân & câu truyện Trạng Tí
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);

        Student s2 = new Student("SE0759", "AN NGUYỄN", 1999, 8.9);
        s1.setName("AI RỒI CŨNG KHÁC");

        s1.showProfile();
        s2.showProfile();
        //một new 1 clone, 2 sv khác nhau, 2 vùng ram khác nhau

    }

    public static void checkObjectV1() {
        Student an = new Student("SE0759", "AN NGUYỄN", 1999, 8.9); //OBJECT VARIABLE
        //reference var                 //obj, vùng ram bự trong HEAP
        //obj var                       //instance, thể hiện, hiện thân, bức tượng
        //"pointer" var
        an.showProfile();
        // an đang nắm/lưu tọa độ vùng ram obj trong HEAP
        //          new làm cực kì nhiều việc
        //              1. Clone Khuôn (OBj và static)
        //              2. gọi phễu đổ data vào vùng clone
        //              3. Chốt lại tọa độ vùng new vừa rồi, đem tọa độ đó đi gán biến con trỏ

        //an là biến, vậy nó có thể thay đổi value!!!!!
        //sếp với bạn trẻ đang trỏ đến CaSi Sơn Tùng
        //sếp với người đi làm, trỏ đến ông bà quyết định lương cho mình
        //sếp tham chiếu người này người kia
        Student x = an; //2 con trỏ trỏ cùng vùng new, 2 chàng trỏ 1 mảng

        int a = 10;
        int b = a;//b mang giá trị a đang mang

        an = new Student("SE0759", "Bình LÊ", 1998, 8.8);
        //LY DỊ AN

        System.out.println("an now is BÌNH");
        an.showProfile();
        System.out.println("AN after an từ chối chơi:"); //AN CŨ À NHEN
        x.showProfile();
        //AN NGUYỄN KO CÒN AI TRỎ, KO CÒN CÁCH NÀO LẤY LẠI ĐC VÙNG RAM NÀY
        //TỌA ĐỘ NEW CŨ TA KO GIỮ LẠI

        //biến obj là tay cầm con diều, new chính là con diều
        //khi tay cầm nối day con diều mới, con diều cũ ko còn chơi nx, đứt sợi dây, bay mất
        //1 vùng ram new obj mà ko còn ai trỏ tới, JVM có chương trình ngầm gọi là
        //CT MTĐT, GARBAGE COLLECTOR, ĐI GOM NHỮNG VÙNG NEW MỒ CÔI KO CON TRỎ, DỌN FREE RAM, FREE HEAP
        //trả lại ram ko xài cho new sau này
        //1 biến có quyền trỏ vùng new, giữ lại An đc ko, mà vẫn có BÌNH
        //lưu tọa độ thoi mà
        //VI DIỆU, VỀ SUY NGHĨ ĐIỀU GÌ DIỄN RA, HẮC NÃO 1 TÍ
        new Student("SE245345", "ĐẠI GIA", 2001, 9.9).showProfile();
    }
}
