
package data;

/**
 *
 * @author Windows
 */
//CLB CỦA NHỮNG GẢ THÍCH ĐUA ĐẾN CHẾT, GOM NHỮNG CLASS, OBJECT CÓ CHUNG
//HÀNH ĐỘNG ĐUA, KO CARE CHUYỆN GÌ KHÁC
//CLB LÀ NƠI TẬP HỢP NHỮNG NGƯỜI CHUNG TIẾNG NÓI, HÀNH ĐỘNG, GIAO TIẾP/INTERFACE
//CX LÀ HÌNH THỨC GOM KHUÔN, GOM OBJECT PHÂN LOẠI VỀ CÁI GÌ ĐÓ, NHÓM GÌ ĐÓ
//LỎNG LẺO HƠN KẾ THỪA, KO CARE ĐẶC ĐIỂM, DI TRUYỀN DD, CHUNG HÀNH ĐỘNG VÀO
//CHƠI CHUNG
//MOTOR, DOG, ... IS A MEMBER OF, IS A DEATHRACER
//ANH EM MÌNH LÀ STUDENT, SINH RA LÀ SINH VIÊN
//ANH EM MÌNH CÒN LÀ CẦN THỦ, CỜ THỦ, SÁT THỦ,...GAME THỦ
//ANH EM MÌNH NHÌN THEO DÒNG HỌ: CHÁU Ở NHÀ NGOAN LẮM
//1 OBJECT, KHUÔN HỘI NHẬP THEO 2 CÁCH: DÒNG HỌ BÀ CON, HỘI NHÓM XÃ HỘI
//HỘI BÀ CON: DI TRUYỀN VÀ KẾ THỪA 
//HỘI XÃ HỘI: CÙNG NHAU CHIẾN, LÀM GÌ ĐI!!!

//CLB chỉ quan tâm hành động, trong đây chỉ chứa hành động
//CLB để ae tự mình hành động theo cách của mình
//vào CLB TA mình speakEnglish theo giọng của mình!!!
//đua thì đua theo cách của mình: lạng lách, tháo thắng, tung mình trên yên xe
//cà chân chống tóc lửa,...
//Interface CLB để mọi người tự chơi theo cách của mình - chs - hdong là abs
//CHỈ NÓI NỘI QUY CLB THOY HENG, MN THEO ĐÓ MÀ LÀM, TỰ MỖI NGƯỜI

//CHỐT HẠ: INTERFACE CHỨA HÀM ABSTRACT
//ko cần ghi ra từ khóa "abstract" ở cả tên CLB và tên HÀM
//VÌ CLB HÀM Ý/NGẦM HIỂU CHỈ CÓ NỘI QUY ĐỂ MỌI NGƯỜI THEO, NỘI DUNG LÀ CHUNG CHUNG
//ĐỂ MỌI NGƯỜI THEO - IMPLÊMNT - NGẦM HIỂU INTERFACE LÀ ABSTRACT
//ABSTRACT LÀ NÊU Ý TƯỞNG

//JDK SAU CHO PHÉP INTERFACE CÓ HÀM CÓ CODE NHƯNG...!!!
public interface DeathRacer {
    
    //phàm ai đã chọn nghề tham gia đua thủ, thì phải đua!!!
    public double runToDead();  //ko cần từ abs
    public void showHowToDead();    //gáy bằng tổ quốc ghi công!!!
    
}
