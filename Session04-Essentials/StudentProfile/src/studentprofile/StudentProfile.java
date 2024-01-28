
package studentprofile;

import java.util.Scanner;


public class StudentProfile {
   
    
    public static void main(String[] args) {
        InputProfile();
    }
    //nhập thông tin cơ bản của sv và in ra
    public static void InputProfile() {
        //ko OOP, chỉ cần hiểu về việc nhập info trước đã, ko chơi class Student
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        
       
        
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
//        yob = sc.nextInt(); //convert data từ bàn phím - Là chuỗi thành số
//        //để lại rác trong buffer, tệ nhất là enter, rác dấu cách + enter
//        //xóa bộ đệm trc khi nhập chuỗi
//        //ADP
//        sc.nextLine();  //sqrt(4)
        //QT //Lấy cái enter
        String tmpNum = sc.nextLine(); //nhập đê, nếu có số thì bố lấy, còn lại thì vứt
        yob = Integer.parseInt(tmpNum);
                        //m đưa t cái chuỗi đê - t ói m con số  2001 + cách or 2001 + enter 
                                                             //t láy tới 2001 th, thg đằng sau ếu phải số, ếu lấy               
        //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số
        
        //ram lúc này chỉ lấy số, phần cách sau nó bỏ trong buffer
        //lệnh sau. buffer ngon quá, có 'cách' rồi nè. LẤY LUÔN
        
        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase(); 
        
        
        
        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
}
//cầm đèn chạy trước oto, ko nhờ cx làm.

//dấu cách dùng để phân tách các phần của biến

//Java sẽ giết chết app ở ngay câu lệnh có thể lỗi