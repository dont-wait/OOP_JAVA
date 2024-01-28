package studentmanagement;

//~mượn đồ để dùng, tìm nơi cất
import data.Student;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        // saveStudents();
        //saveAStudent();
        inputAStudent();
    }

    //nhập từ bàn phím
    //cần Scanner Obj bàn phím, OOP cái dì cx obj, class
    //Máy cam, Scanner tiệm photo, WC, Bàn Phím Cơ, Touchpad -> nhóm Quét-Dữ-Liệu đưa
    //vào máy tính, Class Scanner xuất hiện. Xài phải new để nó hành xử
    //từ bàn phím đi vào ram, do đó phải có biến hứng value
    public static void inputAStudent() {
        String id, name; //mày đã đứng trong hàm rồi, (biến local) thì ếu dì m private
        //chỉ private thì chế tác khuôn
        int yob;
        double gpa;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id: ");
        id = sc.nextLine();

        System.out.println("Input name: "); //chuỗi trước số ko bị lạc trôi lệnh
        name = sc.nextLine();

        System.out.println("Input yob: ");
        yob = sc.nextInt();

        System.out.println("Input gpa: ");
        gpa = sc.nextDouble();

        Student x = new Student(id, name, yob, gpa);
        x.showProfile();
        //x.setId(id); //nguy hiểm
    }

    //hard-code
    public static void saveStudents() {

        Student an = new Student("SE0759", "AN NGUYỄN", 1999, 8.9); //OBJECT VARIABLE

        an.showProfile();
        
        Student binh = new Student("SE075344", "BÌNH LÊ", 2004, 5.9);
        binh.showProfile();

        //chấm xổ gì, Access Modifier/Access Specifier
        System.out.println("An name (direcly)" + an.name); //y chang cầu thủ dán tên sau lưng
        System.out.println("Bình name (direcly)" + binh.name);
        System.out.println("An name (direcly)" + an.getName());

        //vì sờ được trực tiếp name/biến/instance variable/sự hiện thân/(điền vào khoảng trắng), ta có thể get(), set()
        //an.name = "KHÔNG HỌC BÀI";
        Student.name = "CÀY RANK HƠN CÀY CODE";
        System.out.println("An name again (direcly)" + an.name);

        System.out.println("Student name (direcly): " + Student.name);

        an.showProfile();

        System.out.println("Using static");
        an.sayHi(); //ko tư hửu theo kiểu của riêng mình cho static
        binh.sayHi();//2 cái là 1, dùng chung TOilet
        Student.sayHi();//Tên Class chấm static vì là đồ chung multiple objects
        //sayHi() mà sayHi() đg là static

        //2 loại dấu chấm
        //chấm trực tiếp qua tên Class tức là chạm sờ STATIC
        //chấm qua con đường new tức là bạn đg hàm ý chơi với non-static
        //                                     đồ của riêng từng obj         
//        int a = 10;
//        a = 100;
//        System.out.println("a: " + a); //value ăn theo thg cuối cùng
        //biến static thì vẫn giữ nguyên value của thg trước đó(chung biến name) 
        //clone name thành 1 chỗ chứ ko chia từng biến name(chứa value thg khác) như bth
        //thg name AN chạy qua vùng nhớ static, vùng xài chung value cho mọi ngừi lun WC, cùng đi VS 1 chỗ:)))                            
        //STATIC ĂN THEO THẰNG CUỐI CÙNG
        //an.name; // a //MẸ KEEP M CHỈ GỌI TÊN BIẾN KO THÔI, BỐ ẾU BÍC PHẢI LÀM GÌ VỚI MÀY!!!
        //an.getYob();//TRONG HÀM ĐÃ XỬ LÍ CÁI DÌ ĐÓ, NÊN CHỈ CẦN GỌI LÀ MÁY HIỂU PHẢI LÀM GÌ VỚI TÊN GỌI HÀM ẤY
        //giống bên C int a = 10;
        // a; lập trình là viết câu lệnh cho máy tính hiểu phải làm gì
        //m chỉ gọi khơi khơi a, bố ếu bíc phải làm gì với a
        //an.name gọi tên An Nguyễn, ếu bíc lm dì, nhin đg đi trên đường, kiu An Nguyễn!!!
        //hả hả, An nguyễn là mịa dì, An nguyễn ơi lấy đồ, tương đương name lm dì đó
        // -> BIẾN PHẢI GẮN VỚI HÀNH ĐỘNG, GẮN VỚI PHƯƠNG THỨC
    }

}
