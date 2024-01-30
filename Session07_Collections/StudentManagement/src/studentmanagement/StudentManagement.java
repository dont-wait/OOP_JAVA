
package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Windows
 */
public class StudentManagement {

    
//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
////        Student xxx  = getAStudent("se123456");
////        if(xxx != null)
////            xxx.showProfile();
////        else
////            System.out.println("NOT FOUND!!!");
//        //sortStudentList();
//        //List<Student> result =  initData();
//        initData();
//        System.out.println("The student List:");
////        for (Student x : result) {
////            x.showProfile();
////        }
//        for (Student x : initData()) {
//            x.showProfile();
//        }
//    }
    
    public static void main(String[] args) {
        List<Student> arr = initData(); //arr trỏ vào vùng new Túi bự chứa ds
        //initData() đứng riêng cx đc bởi vì khi gọi, trong hàm initData() đã tự tạo List ds sv rồi!!!
        //gọi hàm search với 4 bạn sv đã có trong arr, mà thực ra là do hàm initData() nó tạo
        Student xxx = searchAStudent(arr, "sE888888");
        if(xxx == null)
            System.out.println("NOT FOUND!!!");
        else {
            //LỠ TÌM THẤY THÌ UPDATE LẠI ĐIỂM SỐ
            xxx.showProfile();  //XXX đang trỏ vùng new bạn 8.8
            xxx.setGpa(6868);
        }
        
         //RA HẢN NGOÀI IF KIỂM TRA ĐIỂM CÓ 6868 HAY CHƯA
         System.out.println("Check student list after updating info of SE8 student");
         for (Student x : arr) {
            x.showProfile();
        }
    }
       
        
    
    //------------------------------------------------------------------
    //TỬ TẾ HÀM SEARCH VÀ SORT, UPDATE LUÔN
    //------------------------------------------------------------------
    
    public static List<Student> initData() {
        //hàm trả về 1 cái Túi có sẵn bên trong 1 nhóm SV
        //trả về tọa độ 1 cái Túi, vẫn new Túi mà, trong Túi chứa thẻ bài sv
        //là chuyện khác nx
        List<Student> arr = new ArrayList();    //đi mua 1 cái túi Doraemon
        Student chin = new Student("SE999999", "CHÍN LÊ", 2009, 9.9);
   
        arr.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.4));
        arr.add(chin);
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÍ", 2008, 8.8));
        return arr; //initData() = arr;   arr ơi m đang trỏ new Bự nào 
                    //cho tên hàm tao trỏ với                        
    }
    
    //ta search/tìm kiếm 1 hồ sơ sv dựa theo mã số.
    public static Student searchAStudent(List<Student> arr, String id) {
        //arr là cái Túi new đâu đó, tên biến là Con trỏ
        //trong túi này có 1 nhóm sv sẵn rồi, add sẵn rồi
        if(arr.isEmpty()) //Túi kko có thẻ bài, tức là size() = 0
            return null;    //có sv nào đc tìm thấy đâu, trả về tọa độ đáy RAM
        //CPU chạy xuống đâys, Túi có thẻ bài rồi, ds có ngừi điền tên rồi
        //for hỏi từng thẻ 1, ê ku (i) id mày là gì? coi có bằng id cần tìm hok
        
        for (int i = 0; i < arr.size(); i++) {
            Student tmp = arr.get(i);
            if(tmp.getId().equalsIgnoreCase(id))
                return tmp; //return thẻ bài thứ i có trỏ vùng id tìm thấy
                            //thẻ bài, con trỏ có lưu tọa độ, t return tọa độ
                            
        }
        //đi hết for mà ko return đc, sure CX ÉO THẤY LUÔN, NULL ĐÁY RAM
        return null;    //HÀM YÊU CẦU TRẢ TỌA ĐỘ VÙNG NEW, ÉO THẤY THÌ VÙNG NULL
    }
    
    //                          có thể đưa Giỏ từ ngoài vào Okie
    public static void sortStudentList() {
        List<Student> arr = new ArrayList();    //đi mua 1 cái túi Doraemon
        Student chin = new Student("SE999999", "CHÍN LÊ", 2009, 9.9);
   
        arr.add(new Student("SE444444", "BỐN PHẠM", 2004, 4.4));
        arr.add(chin);
        //arr.add(binh);// danh sách thống kê bị trùng, 2 thẻ bài, 2 con trỏ
                        // 
        arr.add(new Student("SE555555", "NĂM VÕ", 2005, 5.5));
        arr.add(new Student("SE888888", "TÁM LÍ", 2008, 8.8));
        
        System.out.println("The student List");
        for (Student x : arr) {
            x.showProfile();
        }
        for (int i = 0; i < arr.size() - 1; i++) 
            for (int j = i + 1; j < arr.size(); j++) 
                if(arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                    //set() là thay đổi info của con trỏ, trỏ chỗ khác
                    //lấy thẻ bài ra khắc lại thông tin trỏ
                }
        System.out.println("The student list after sorting ascending by GPA");
//        for (Student x : arr) {
//            x.showProfile();
//        }
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
    
    }      


    //THỬ NGHIỆM HÀM TRẢ VỀ 1 OBJECT, THỰC CHẤT LÀ TRẢ VỀ TỌA ĐỘ  VÙNG
    //NEW - XEM LẠI BÀI OBJECT INSIDE-OUT TRÊN YT
    //đưa vào mã số sv mún tìm
    //ta sẽ tìm trong giỏ/túi thẻ bài, coi có ai trùng mã số
    //thì trả về thẻ bài, hồ sơ bạn sv đó, hay trả về tọa độ hồ sơ đó
    public static Student getAStudent(String id) {
        List<Student> arr = new ArrayList();    //đi mua 1 cái túi Doraemon
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
   
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);
        
        Student tmpStudent = arr.get(0);//lấy đc tọa độ thẻ bài o
        
        //hỏi xem bạn í id là gì
        String tmpId = tmpStudent.getId();  //arr.get(0).getId()
        
        //if(tmpId == id) return tmpStudent;  //arr.get(0)
                                            //trả về tọa độ thẻ bài 0
                                            //trả về thẻ bài 0
        if (tmpId.equalsIgnoreCase(id))
            return tmpStudent;  //arr.get(0)
        //HOÀN TOÀN KO CÓ SV MỚI XH, CHỈ THAM CHIẾU TỌA ĐỘ VÙNG NEW
        //RETURN GET(0) THẺ BÀI 0, THẺ BÀI 0 TRỎ VÙNG NEW AN NGUYỄN
        return null; //KO TÌM THẤY
    }
    
    //Set: Là 1 loại giỏ, túi, mà ko cho phép đựng trùng món
    //tức là ko có món nào xuất hiện quá 1 lần
    //ko cho phép trỏ trùng 1 vùng NEW
    //ĐẾM SỐ NGƯỜI XEM PHIM, LỄ HỘI, TIỆC, ĐẾM MỖI NGƯỜI 1 LẦN
    //LIST: CỨ CÓ VÀO LÀ ĐẾM, VỀ RỒI, QUAY LẠI VẪN ĐẾM - ĐẾM SỐ LƯỢT NGƯỜI GHÉ
    
    public static void playWithSet() {
        Set<Student> arr = new HashSet();   //MUA 1 TÚI DOREMON
                                            //MỞ KHÓA ĐỂ XỬ DỤNG
        Student an = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
    
        arr.add(an);
        arr.add(an);
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        arr.add(new Student("SE999999", "BÌNH LÊ", 2003, 4.9));
        //CÓ NEW CÓ VÙNG RAM MỚI, OBJECT MỚI, TRÙNG INFO BÊN TRONG NEW
        //SET LÀ KO CHẤP NHẬP CON TRỎ TRÙNG VÙNG NEW
        //MỖI THẺ BÀI ĐC ADD VÀO GIỎ, KO TRỎ LẠI 1 VÙNG NEW NÀO ĐÓ
        
        //ko có hàm get() vì giở này đua đồ vào, thẻ bài vào
        //thẻ bài đưa vô ko giữ nguyên thứ tự như đưa vô
        //lấy thì FOR EACH, QUÉT HẾT GIỎ
        
        //thì có 2 tình huống xảy ra: HashSet: để "lộn xộn" thẻ bài
        //                                     để thẻ bài "Có thứ tụ" theo cách riêng
        
        //KHÁC HOÀN TOÀN THỨ TỰ KIỂU ARRAYLIST
        //ARRAY LIST LÀ VÀO TRƯỚC, ADD TRƯỚC NGỒI TRƯỚC, VÀO SAU NGỒI SAU
        
        //GIỎ CHỨA MÂY THẺ BÀI? ADD 3 LẦN ĐẤY. ARRAYLIST ADD BAO NHIÊU 
        //                                                  CHỨA BẤY NHIÊU
        System.out.println("The student list:");
        for (Student x : arr) {//duyệt qua từng con trỏ
                               //từng thẻ bài gáng vào con trỏ x, 2 chàng 1 nàng
            x.showProfile();
        }
        System.out.println("The list has " + arr.size());
    }
    //ta tự sort danh sách sinh viên làm bằng tay
    //còn 1 cơ chế ta ko cần dùng vòng for tự viết
    //hàm static: Collection.sort() //dùng interface mới đc - giảng sau
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList();    //đi mua 1 cái túi Doraemon
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
   
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);  //mày đưa tao tọa độ vùng new
        arr.add(binh); //add trùng, VÔ TƯ
        //có 2 tọa độ trong túi, 2 thẻ bài trong túi
        //get() từng thẻ bài thì đc tọa độ vùng new
        //[i] đc tọa độ vùng new, y chang mảng, mỗi phần tử mảng là 1 tọa độ
        System.out.println("The student list");
        //mảng đang giảm dần về điểm, túi đang giảm dần về điểm
        //thẻ bài 1 trỏ vùng điểm cao, thẻ bài 2 trỏ vùng điểm thấp
        for (Student x : arr) { //trong arr là 1 đóng con trỏ
            x.showProfile();
        }   //NHỚ CÂU: CÓ TỌA ĐỘ CHẤM LUÔN
        System.out.println("The student list (using for i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();   //lấy tọa độ đg trỏ thằng i
        }
        
        //MẢNG CHƠI [I] SỜ NGÀY CON TRỎ THỨ I
        //TÚI phải mở ra, để lấy, gọi hàm. hàm()
        
        //đổi đc 2 thằng thì đổi đc cả giỏ, 2 VÒNG FOR
        Student tmp = arr.get(0);   //tmp trỏ vùng AN NGUYỄN
        arr.set(0, arr.get(1));    //con trỏ thứ 0  trong giỏ, thẻ bài thứ 0
                                        //phải trỏ thằng BÌnh 4.9
        arr.set(1, tmp);
        //con trỏ 1 thay cách trỏ, trỏ vào vùng temp đang trỏ
        //                          tmp đang trỏ AN NGUYỄN 9.
        //vùng new Student() vẫn nằm im, chỉ có thẻ bài trong giỏ
        //trỏ lại vùng new
        System.out.println("The student list after sorting ascending by GPA");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();   //lấy tọa độ đg trỏ thằng i
        }
        arr.remove(1);
        System.out.println("The student list After removing a student");
        for (Student x : arr) {
            x.showProfile();
        }
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
        Student xx = arr.get(0); //Trả về tọa độ con trỏ thẻ bài bạn thứ 0
        //trả về tọa độ gán vào biến Student khác nằm cùng tọa độ okie
        System.out.println("The student list");
        xx.showProfile();
        
        //bạn 1 get(1), có tạo độ chấm luôn cho rồi, thêm biến con trỏ trỏ
        //cùng làm gì?
        arr.get(1).showProfile();   //á đù trả về con trỏ, học rồi 7 viên ngọc rồng
  
        System.out.println("In xịn sò");
        for (Student x : arr) 
            x.showProfile();    //éo sợ NULL POINTER ADD() đến đâu them con trỏ tới đó
            //x = arr.get(i) = arr[i]
        
            
        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) 
            arr.get(i).showProfile();
        
        //có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên
        //1 ngừi khỏi danh sách,
        //vùng new Student() bị mất hay không tùy vaoì mấy con trỏ trỏ nó, học rồi
        //size() gaimr liền, mảng éo có, fix cứng số con trỏ
        //set() đảo con trỏ, trỏ sang vùng khác (get() hànm set() xưa nay của
        //các object)
    }
}
