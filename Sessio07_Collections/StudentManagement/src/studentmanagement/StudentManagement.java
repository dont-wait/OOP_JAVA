
package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Windows
 */
public class StudentManagement {

    
    public static void main(String[] args) {
        playWithArrayList();
    }
    
    public static void playWithArrayList() {
        //Student arr[] = new Student[500];
        //arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô
        //món đồ phải đi mua, new, thảy vào
        //tên mảng chính là má mì, quản lí nhiều đồ, tên túi lun
        
        //List arr = new ArrayList(); //đựng lộn xộn đủ loại con trỏ
        //đúng nghãi túi Doraemon, món gì cx đựng, đựng tham chiếu nha
        //nhét đc NhanVien, GiangVien, Animal, Dog,...
        
        //túi đồng nhất chỉ lưu con trỏ Student
        List<Student> arr = new ArrayList(); //túi đựng đồng nhất 1 loại GENERIC
        
        //List<Student> arr = new ArrayList<>();
        //List<Student> arr = new ArrayList<Student>();
        //arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        //nhét đồng nhất món đồ dễ chấm chung đc, đa hình đc
        
        //MỞ NGĂN TỦ; TÚI, NHÉT ĐỒ VÔ
        //arr[i] = new Student(..); //mảng
        
        //arr.add(new Student(...)); //lưu con trỏ hoy, new Student() thoải mái
        //bên ngoài, vùng HEAP
        
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123457", "BÌNH LÊ", 2003, 9.0);
        arr.add(s1); //giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        arr.add(s2); //sinh ra thêm con trỏ nx [1]
                       //add() vô tận, mảng[length - 1] hết mức
                       // new cứ nằm HEAP, SV cứ ở nhà, CN ở xưởng, BN cứ ở phòng bệnh
        //add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài
        //sinh ra con trỏ
        //2 chàng 1 nàng
        arr.add(s1);    //add trùng nè 1 tên người danh sách,
        //Set ko báo lỗi, chỉ lấy 1... đừng đi vào chi tiết vội vã!!!
        arr.add(new Student("SE99999", "CHÍN PHẠM", 2003, 9.0));
        //          new cứ lên HEAP mà nằm, Bẹnh nhân cứ vào phòng, ta nắm thẻ bài
        //1 con trỏ lại đc add vào
        
        //hỏi xem cái túi đang có bao nhiêu đồ?
        //arr.length hỏi túi mà, hỏi má mì mà, tên mảng mà 
        System.out.println("The bag has: " + arr.size());
        //4 sv in ra, nhưng thực ra chỉ có 3 sv, do có người đếm trùng
        
        //in mọi người ra
        //tủ có gì, chứa bên trong 1 đống con trỏ
        //mảng: [i].showProfile()
        //Tủ ArrayList[con-trỏ, con-trỏ2, con-trỏ3, copn-trỏ4,... nếu add() thêm
        //add() đẩy vào 1 con trỏ, tọa độ, thẻ bài
        //get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i
        //                              trả về địa chỉ vùng new đang trỏ
        //[i] lấy đc tham chiếu bạn thứ i
        //get(i) Lấy đc chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        //a, thẻ này trỏ bạn sv kia kìa
        
        //in bạn đầu tiên
        //arr[i].showProfile() phần tử đầu tiên của mảng
        Student x = arr.get(0); //Trả về tọa độ con trỏ thẻ bài bạn thứ 0
        //trả về tọa độ gán vào biến Student khác nằm cùng tọa độ okie
        System.out.println("The student list");
        x.showProfile();
        
        //bạn 1 get(1), có tạo độ chấm luôn cho rồi, thêm biến con trỏ trỏ
        //cùng làm gì?
        arr.get(1).showProfile();   //á đù trả về con trỏ, học rồi 7 viên ngọc rồng
    }
    
}
