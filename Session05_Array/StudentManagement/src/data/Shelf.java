package data;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Shelf {
    //đặc điểm của 1 cái tủ bất kì là gì: màu sơn___; giá tiền____; nhà sx____;

    //số ngăn/không gian chứa đồ:_____các món đồ nhét vào, món đồ là object
    //chứa nhiều đồ, nhiều object rõ ràng đến thời điẻm này là ta cần mảng object
    //tủ sẽ chứa 1 list/mảng/danh sách các đối tượng
    //OOP: tìm các object, chúng phối hợp,trộn với nhau
    private String color;
    private String label; //tủ chén, tủ hồ sơ SE, IA, GD, JP

    //chứa cái gì
    //đặc điểm chính cần focus
    //dung lượng, không gian chứa của cái tủ là bao nhiêu
    //nhiều cách khác nhau
    //1. đóng sẵn kích thước
    //2. theo yêu cầu (đưa ra yêu cầu, đưa và phễu)
    private Student[] ds = new Student[300];    //sẵn kích thước
    //logic mảng: cần có kích thước
    //value từng phần tử, từng món đó tutu tính
    //khi chơi với mảng, phải biêt for đến đâu, coi chừng null
    //add vào từ từ từ trái sang phải
    //ta cần 1 biến count nói về số lượng đang có trong mảng
    //sure non static
    private int count = 0;  //mới mua tủ về hồ sơ = 0
    //nhét thêm 1 hồ sơ thì count++
    //chơi mảng chỉ for đến count

    private Scanner sc = new Scanner(System.in);

    //  NON-STATIC CHO NHỮNG ĐẶC TÍNH Ở TRÊN
    //  contructor làm những việc gì: đổ info vào
    //  bài này đổ màu sắc, tủ dùng cho việc gì (label)
    //  đặt hàng dung lượng chứa, hoặc fix dung lượng
    //  CÂU HỎI: sao em ko đưa hồ sơ thật của sv nào?
    //  mua tủ về phải trống, nhét hồ thật vào từ từ hợp lí hơn
    //  nhét ngay ngay 1 lần hêt hồ sơ vào tủ là không thực tế
    //  bỏ hồ sơ vào tủ thực sự đc lặp đi lặp lại nhiều lần vào cái tủ
    //  hàm thêm hồ sơ nằm ở cái tủ là hợp lí: ai có nhiều info, kẻ đó xử lí
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    //hành động add mới hồ sơ sv lặp lại cho mỗi cái tủ, 1 cái kệ, app đk member
    public void addAStudent() {
        //chơi for vỡ mặt, phải là từ từ, vì nó sẽ đc liên tục bổ sung
        //quy trình cty, cách bạn làm với cái tủ
        String id, name;
        int yob;
        double gpa;
        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        
        System.out.print("Input id: ");
        id = sc.nextLine(); //TODO: tên rỗng //CHECK TRÙNG ID
                            //CÒN TRÙNG CÒN NHẬP LẠI, Y CHANG ĐĂNG KÍ MEMBER

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        
        
        ds[count] = new Student(id, name, gpa, yob);
        count++;    //VIP đã add xog 1 hồ sơ, thì phải sẵn sàng vị trí kế tiếp
        //bao nhiêu lần mở tủ add() hồ sơ, bấy nhiêu lần cout tăng lên..

    }

    //y chang xem danh sách số kênh đã add vào cái tivi
    public void printStudentList() {
        System.out.println("There is/are " + count + " student(s) in alist");
//        for (Student x : ds) {
//            x.showProfile();
//        }
        //coi chừng vỡ mặt null pointer
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
        }
    }
    public void searchAStudent() {
        //đưa id vào từ bàn phím, tìm sv theo id
        //for từ đầu đến count của mảng, lôi từng sv ra ss
        //so sánh với id gõ vào, == nhau thì done, bấy nhiêu lần count tăng lên
        String id;
        System.out.print("Input student id you want to search: ");
        id = sc.nextLine();
        for (int i = 0; i < count; i++) {
            if(ds[i].getId().equalsIgnoreCase(id) == true) {
                System.out.println("Student found!!! here she/he is");
                ds[i].showProfile();
                return; //thoát hàm luôn, vì mã số sv là duy nhất, thấy rồi
                //ko còn ai để for thêm làm gì
                
            }
        }
        
        System.out.println("Student not found");
    }

    //tui có không gian chứa info, tui sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
        //this.count = 0; //mới mua tủ thì count = 0
        //có thể đưa qua con đường phễu, nhưng ko hay, vì đây là biến local
        //vì đây là thứ người dùng đi mua tủ ko cần biến
        //họ chỉ cần dung lượng tủ khi mua
    }

    public void inputAStudent() {

        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");                    //sv thứ 1/300  
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());
        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        ds[count] = new Student(id, name, gpa, yob);
        count++;
    }
//    public void printStudentList() {
//        System.out.println("The student list");
//        for (int i = 0; i < count; i++) {
//            ds[i].showProfile();    //FOR HẾT LÀ TOANG!!!
//        }
//    
//    }
}
