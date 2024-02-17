package data;

import java.util.*;

/**
 *
 * @author Windows
 */
public class Cabinet {

    //Tủ sẽ có nhiều ngăn chứa nhiều món đồ. Ta xài mảng, ArrayList, Collections nói chung
    //để lưu trữ nhiều đồ
    //từ từ các bạn sv đến nhập học, nộp hồ sơ, và ta cất vào tủ arr
    private List<Student> arr = new ArrayList();
    private Scanner sc = new Scanner(System.in);

    //làm biếng làm phễu luôn, mọi thứ sẽ là default, Túi từ từ đc add() vô
    //mình ko chơi trò mua Tủ có sẵn luôn 1 cái Túi, trong túi có 1 đóng đồ, có sẵn hồ sơ
    //nếu mún làm, thì new sẵn túi bên ngoài, có sv sẵn đưa vào tủ, okie
    //default/empty contructor. Ko làm gì cả
    public Cabinet() {

    }

    public void updateAStudent(Student x, double newGPA) {
        x.setGpa(newGPA);
    }

    public void updateAStudent(double newGPA, String id) {
        Student xxx = searchAStudentV2(id);
        if (xxx == null) {
            System.out.println("NOT FOUND! Nothing to update");
        }
        //xxx.setGpa(newGPA);
        updateAStudent(xxx, newGPA);
    }

    public void updateAStudent() {
        String keyword;
        double newGPA; //chửi nhiều sv. GIÁ TIỀN KIỂU INT!!! 

        System.out.print("Input the student id you want to update info: ");
        keyword = sc.nextLine().trim().toUpperCase();
        Student xxx = searchAStudentV2(keyword);    //RE-USE

        if (xxx == null) {
            System.out.println("NOT FOUND!!! NOTHING TO UPDATE");
        } else {
            System.out.print("Input a new gpa: ");
            newGPA = Double.parseDouble(sc.nextLine());
            updateAStudent(xxx, newGPA);
        }

    }

    //ta làm hàm tìm kiếm sv: đóng 2 mục đích:
    //1. phục vụ tính nagnư tìm 1 sv theo id
    //2. phục vụ thêm cho cái việc kiểm tra ìd có trùng hay không khi tạo mới
    //  1 hồ sơ sv
    //hàm search() có đến 2 cách trả về: trả về vị trí tìm thấy trong Túi/int position
    //                                                                  trả về 1 object/tọa độ obj/tham chiếu
    public Student searchAStudentV2(String id) {
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
            //nếu thấy sv, trả ngay cái thẻ thú i tham chiếu vùng new có chứa id tìm thấy
        }
        //đi hết cả trên ko thấy thì sure k tồn tại
        return null;
    }

    //hàm bao hàm search ở trên
    public void searchAStudent() {
        String keyword;
        System.out.print("Input the id of a student that you want to search: ");
        keyword = sc.nextLine().trim().toUpperCase();   //chấp mày tìm thường hay tìm viết hoa //bố cân hết
        Student xxx = searchAStudentV2(keyword);    //RE-USE
        if (xxx == null) {
            System.out.println("NOT FOUND!!!");
        } else {
            System.out.println("FOUND. Here she/he is");
            xxx.showProfile();
        }
    }

    public void deleteAStudent(int viTriMuonXoa) {
        arr.remove(viTriMuonXoa);

        System.out.println("The list after remoting sinh vien thu " + viTriMuonXoa);
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    }

    public int SinhVienTrung() {
        if (arr.isEmpty()) {
            return -1;
        }
//        for (int i = 0; i < arr.size() - 1; i++) 
//            for (int j = i + 1; j < arr.size(); j++) 
//                if(arr.get(i).getName().equals(arr.get(j).getName()))
//                    return j + 1;
        //DÙNG LẠI HÀM SEARCH
        //COI ID HỒ SƠ SV MỚI LIỆU RẰNG CÓ CHƯA
        //CẤM TRÙNG ID - BÊN DB GỌI LÀ PRIMARY KEY KHÓA CHÍNH CẤM TRÙNG
        //ĐĂNG KÍ MEMBER, CHỬI TRÙNG, CÒN TRÙNG LÀ CÒN CHỬI ẾU CHO ĐI TIẾP
        return -1;
    }

    public Student searchAStudent(String name) {
        if (arr.isEmpty()) {
            return null;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getName().equalsIgnoreCase(name)) {
                return arr.get(i);
            }
        }
        return null;

    }

    public void sortStudentList() {

        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student x = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, x);
                }
            }
        }

    }

    //hành động của cái Tủ là: thêm hs, tìm hs, sắp xếp hs, xóa hs, update hs
    public void addAStudent() {

        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student profile #" + (arr.size() + 1));

        while (true) {
            System.out.print("Input id: ");
            id = sc.nextLine().trim().toUpperCase();// cắt trắng dư đổi qua Hoa
            //String là obj, vùng new, học sau
            Student xxx = searchAStudentV2(id); //id vừa gõ kiểm tra liền
            if (xxx == null) //id éo tồn tại trong Giỏ, thoát, đi tiếp
            {
                break;
            } else //exist (v)
            {
                System.out.println("Duplicated id. Try with another one!!!");
            }
        }

        System.out.print("Input name: ");
        name = sc.nextLine().trim().toUpperCase();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());
        //MyToys
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("the new student has been added successfully");

    }

    public void printStudentList() {
        if (arr.isEmpty()) {
            System.out.println("The student list is empty. Nothing to print");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student (s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }
}


    //CRUD - CREATE - RETRIEVE/READ - UPDATE - DELETE