package basicarray;

public class BasicArray {

    public static void main(String[] args) {

        //playWithPrimitiveArrayV3();
        //playWithStudentArray();
        //playWithObjectAray();
        sortObjectArayv2();
        //sortPrimitiveArray();
    }

    public static void sortObjectArayv2() {
        
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 4.0, 2005);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 8.0, 2005);
        
        System.out.println("Before sorting by gpa");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();    
        }
        
        //TUYỆT ĐỐI KO DÙNG TOÁN TỬ > < = CHO CÁC BIẾN OBJECT, VÌ ĐI SO SÁNH
        //TỌA ĐỘ, ĐỊA CHỈ LÀ VÔ NGHĨA
        //CHẤM BÊN TRONG ĐỊA CHỈ, CHÁM BÊN TRONG TỌA ĐỘ, VÀO TRONG OBJECT
        //VÀO TRONG VALUE PHỨC TẠP, LẤY VALUE KHÁC RA MÀ XEM, MÀ SO SÁNH
        //sv1 so sánh sv2 vớ vẩn, s1. điểm so sánh sv. điểm còn có lí
        //tao ngồi ghế 0 mà điẻm lại lớn hơn mày ngồi ghế 1
        //swap thoy, swap điểm ăn đòn, swap trỏ
        
        //SẮP XẾP MẢNG OBJECT - mảng của các biến object mà trỏ vào object
        //chẳng qua là đổi vị trí trỏ, thay đổi value/tọa độ vùng object
        //mà đang đc lưu trong các biến con trỏ
        //đổi cách trỏ của từng biến mảng. Chơi biến trung gian
        //GIẢ BỘ SẮP TĂNG DẦN CỦA ĐIỂM TRUNG BÌNH
        //nếu thứ tự trỏ vùng new đã đúng thứ tự điểm, để im
        //nếu điểm của arr[0] đang trỏ > điểm của arr[1] đang trỏ thì mới đổi 
        
        //khi nào thì đổi, nhắm mắt đổi là sai
        //nếu [con trỏ đứng trước] > [con trỏ đứng sau]
        //nếu arr[0] > arr[1]
        
        
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student t;
            t = arr[0]; //hoán đổi chỗ trỏ //2 chàng cùng trỏ 1 nàng
            arr[0] = arr[1];
            arr[1] = t;
        }

        //NEW BÌNH ĐG ĐƯỢC 2 CON TRỎ CÙNG TRỎ, CHỨNG MINH
        System.out.println("After sorting by gpa");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();    //tọa độ AN mồ côi :> ko ai trỏ
        }

    }

    public static void sortPrimitiveArray() {
        int a = 5;
        int b = 4;

        //int a trước, b sau, giảm dần value 9 5
        //tui mún tăng dần về value          5 9
        System.out.println("a: " + a + " | b: " + b);
        //backup a 9 trước khi a chơi với nhỏ 5

        //chỉ đổi, sắp xếp khi bị lộn xộn thứ tự, khi a > b lộn xộn tăng dần
        //NẾU ĐỨNG TRƯỚC MÀ LỚN HƠN VỀ VALUE, RÕ RÀNG PHẢI ĐỔI VALUE
        //if (a > b) thì mới swap
        if (a > b) {
            int tmp = a;    //tớ temporary, temp, tmp, t 9 heng
            a = b; //tao cần value nhỏ, vì tao ngồi đầu tiên, nên mang nhỏ, mày nhỏ
            //cho tao đi
            b = tmp;    //vẫn còn 9 backup
        }

        System.out.println("After sorting a: " + a + " | b: " + b);
    }

    public static void sortObjectAray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 9.0, 2005);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 5.0, 2005);
        //[0] đừng trỏ điểm to, sẽ bị in trước, in trước thì ko giảm dần
        //[0] nên trỏ điểm nhỏ thì hay hơn
        Student t;
        t = arr[0]; //cho tớ tmp trỏ điểm 9 với heng
        arr[0] = arr[1];  //đâì bảng xin trỏ 5 thay vì trỏ 9          //int a = 5; int b = a; //cho tao b xin value của mày a
        arr[1] = t; //chỗ ngồi kế đầu bảng xin trỏ lại 9 ngày xưa của anh [0]

        //NEW BÌNH ĐG ĐƯỢC 2 CON TRỎ CÙNG TRỎ, CHỨNG MINH
        System.out.println("After sorting by gpa");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();    //tọa độ AN mồ côi :> ko ai trỏ
        }
        //phần tử đầu của mảng thay vì trỏ vùng new 9, nay nó trỏ new 5
        //SẮP XẾP MẢNG OBJECT, VÙNG NEW GIỮ NGUYÊN,
        //ĐỔI CÁCH TRỎ [I] TRONG MẢNG
        //[thằng đầu mảng] trỏ vùng new nhỏ 5.0
        //[thằng cuối mảng] trỏ vùng new to 9.0
    }

    public static void playWithObjectAray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "AN NGUYỄN", 9.0, 2005);
        arr[1] = new Student("SE123457", "BÌNH LÊ", 5.0, 2005);

        System.out.println("The student list");
        for (Student x : arr) {
            //x = arr[0]; x = arr[1]; //    2 chàng x và arr[0] cùng trỏ new AN
            //            x    arr[1]              Binh                 
            x.showProfile();
        }
        //sắp mảng tăng dần theo điểm tb
        //lí thuyết, bạn [0] sẽ có điểm 5
        //               [1]            9
    }

    //1. Tên mảng. length và () má mì, vùng new mảng
    //2. Phần tử mảng[0 - index] . đc hay ko thì còn tùy
    //           mảng-pri[0] ko chấm dc
    //           mảng-obj[0] . chấm xổ ra từa lưa, nó là biến object
    //          Student x x. bình thường
    //          mảng-obj[0]. bìnhg thường (tên biến có [])
    //---------
    //3. STATIC Student. -> xài chung cả họ sv nha
    //---------
    //byte thứ 0,lưu đúng 1 byte, hạ cánh nơi anh, chứa đúng số 0, ở dưới đáy ram - NULL
    //cắt kết nối với vùng new, bị CTĐT dọn luôn, dọn định kì
    public static void playWithStudentArray() {
        //lưu hồ sơ 10 bạn SV
        //10 biến/tên tắt + 10 value phức tạp ~ 10 nhát new () tức là value
        //lưu 10 số tự nhiên
        //10 biến/tên tắt + 10 value đơn
        //int arr[] = new int [10];   //arr[0] ~ int x;
        //= value đơn từ từ
        Student s1, s2, s3, s4, s5;
        //s1 = ngoặc tròn
        //      x[0]   x[1]     x[2]    x[3]                                    
        Student list[] = new Student[3];  //đừng nhầm lẫn về ngoặc new, 2 loại ngoặc
        //() gọi phễu, 1 đối tượng
        //[] tao cần ? đối tượng
        //[] dành cho nhiều biến, nhiều tên gọi tắt
        //x[0].showProfile();

        //x.length //biến má mì, quản lí sinh viên
        list[0] = new Student("SE123456", "AN NGUYỄN", 5.6, 2005);
        list[1] = new Student("SE123457", "BÌNH LÊ", 5.9, 2005);
        list[2] = new Student("SE123458", "CƯỜNG VÕ", 10.0, 2005);
        //list[0].getName();
        //mấy con trỏ còn lại mang giá trị gì??? biến Student chưa gán
        //giá trị gì
        //list[3] ...list [9] nó trỏ ra gì 0 là DEFAULT
        //                                    TRỎ VÀO TỌA ĐỘ 0 CỦA RAM, ĐỊA CHỈ 0 CỦA RAM
        //                                    BYTE ĐẦU TIÊN CỦA RAM OFFOFFOFFOFF
        //tức là byte đầu tiên (thứ 0) tọa độ thứ 0 của ram chứa toàn số 0
        //byte NULL BYTE KO CÓ GÌ CẢ, TOÀN 0
        //IN MẢNG CÁI COI
        System.out.println("The list of student");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
            //tao chỉ là 1 biến Student x thoy mà        
        }
        s1 = null;  //tao trỏ đáy ram heng, null heng, làm biến new
        //có value rồi, số 0, tọa độ 0 ở đáy ram, đi vào 00000000
        s1.showProfile();  //có mẹ gì mà show, NullPointerException

        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG PHẢI LÀ: BIẾN COUNT ĐỂ CHO BIẾT
        //MẢNG ĐÃ GẮN VALUE ĐẾN ĐÂU, FOR ĐẾN ĐÓ, KO FOR ĐẾN. LENGTH
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT
    }

    public static void playWithStudentObject() {
        Student x;
        x = new Student("SE123456", "AN NGUYỄN", 5.5, 2005);

        x.showProfile();

    }

    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20}; //new ngầm, ko nói rõ việc new thực ra có 
        int arr3[] = new int[]{5, 10, 15, 20};
        int arr2[] = new int[5];

        int arr[];
        arr = new int[5];
        //có nhiều biến trùng tên rồi, sau đó xài từng biến theo nhu cầu!!!
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 15;

        //arr là gì, mày là 1 biến đb, m là biến object luôn, vì trỏ 1 vùng new bự
        //có quyền chấm, chấm cái gì???, tệ nhất là .toString();
        //arr là biến phức tạp vì nó có nhiều info bên trong, info này là
        //phần tử của mảng
        //arr[0] ~~~ arr.get(thằng thứ 0) -> đc 5   / arr[0] đc 5
        //arr.length - biến lưu đặc điểm của 1 mảng, có bao nhiêu phần tử
        //  -> static hay non?  non, vì nếu static mọi mảng cùng kích thước
        //arr.length; //hằng số đb, ăn theo từng mảng, mỗi mảng sẽ khác nhau size
        System.out.println("Array has: " + arr);
        //gọi thầm tên em, gọi biến object -> tự gọi hàm toString() in ra từng value, hoặc in ra địa chỉ
        //các biến thành mã hexa
        //final            
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr . xổ ra gì? public  / là biến object trỏ vào vùng new. chấm xổ ra các method
        //arr[0] . xổ ra gì? xổ cm dì, Tao là biến primitive, có value rồi thì sai thôi, cần j chấm nx      
        //tên biến phức tập
        //nhưng tao vẫn đơn giá trị (tên tao có ngoặc vuông do trùng tên)
        //      tao là tên cho value đơn giản        
        System.out.println("");
        for (int x : arr) {
            System.out.print(x + " ");
            //get, set ko có mà thay bằng chơi trực tiếp []
            //thay đổi value bên trong biến/phần tử
            //khai báo mảng chỉ là khai báo biến
        }
        //Student x = new Student("The Hoan", "HAHA", 2005, 5.6);

    }

    public static void playWithPrimitiveArrayV2() {
        //float* arr = calloc(7, sizeof(float));
        //biến ct		new
        //		ref		new Object()
        //calloc
        double arr[] = new double[10]; //default gán hết = 0 
        //new() là phễu để đúc object!!!!!!!!
        //em mún có 365 biến double, nó là biến lẻ nè nè
        //                  arr[0], arr[1], arr[i].......
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;
        System.out.println("The array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        //arr[0]. éo sổ gì vì nó biến primitive
        //arr.
        //DÙ LÀ MẢNG PRIMITIVE HAY MẢNG MẸ GÌ CHƯA BIẾT
        //TÊN MẢNG LÀ BIẾN MÁ MÌ, TÚ ÔNG TÚ BÀ, BIẾN OBJECT, BIẾN CON TRỎ, REFERENCE
        //TAO SẼ TRỎ VÙNG RAM CHÀ BÁ LỬA NEW ĐÓ, KO ĐÚC TRUYỀN THỐNG 
        //                                              MÀ LÀ ĐÚC NHIỀU BIẾN
        //MÁ MÌ SẼ QUẢN LÍ BAO NHIÊU CHÁU DƯỚI QUYỀN, DĐ CỦA MÁ MÌ
        //MÁ MÌ CHẤM RA ĐC SỐ LÍNH
        //arr.
        System.out.println("\nThe array has values of (for each)");
        for (double x : arr) {
            System.out.println(x + " ");
        }
    }

    public static void playWithPrimitiveArray() {
        //double vol[365];    //Java cấm khai báo kích thước mảng, số phần tử trong ngoặc vuông
        //double v[365] = {0, 5, 10, 15, 20, 25};
        float v[] = {0, 0, 5, 10, 15, 20, 25}; //mảng có 7 phần tử có sẵn luôn value
        //7 biến double v[0] = 0, v[1] = 0, v[2] = 5
        //7 biến float này nằm trên HEAP đấy, có new ngầm đấy, có malloc() đấy
        System.out.println("The array has value of (printed by individual)");

        v[0] = 6869;
        System.out.println(v[0] + ";" + v[1] + ";" + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.print(v[i] + " ");
        }
        //ta có thể xem mảng như là 1 tập hợp các value trong dấu {} giống Toán
        //ta có thể xài khác niệm với mọi, với mỗi để duyệt qua toàn bộ mảng
        System.out.println("\nThe array v has values of (using for each)");
        for (float x : v) {
            //x = v[0], x = v[1], x = v[2], x = v[i] với mọi x là 1 biến lẻ, = từng
            //thằng lẻ trong mảng sỉ
            //sout(v[i])~~~~~~~~~~~~~~~~~~ sout(x)
            System.out.println(x + " ");
        }

        //với mọi là kỹ thuật quét qua mảng
        // dùng đèn pin quét từ đầu đến cuối
        //kỹ thuật dùng là 1 con số tự nhiên
        //duyệt qua tất cả phần tử của tập hợp
    }
}
