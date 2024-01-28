
package fu.util;

//đây là Class, Khuôn, chỗ chứa có đặc điểm/hành động/chứa các món đò chơi dùng chung

import java.util.Scanner;

//cho mọi nơi - vì nó ko nhớ cái gì cho riêng tư của nó

//LIBRARY/FRAMWORK - chứa các hàm/biến(data) dùng chung cho nhiều công việc khác nhau
//của các dự án khác nhau
public class MyToys {
    
    //đặc điểm/hành vi là static, cho người ta sờ thì thêm public
    //ko nhớ cái gì của riêng mình
    //Một class bt thì vẫn có thể vừa static vừa non-static, tùy nhu cầu, cách thức
    //Math: hầu hết static
    //String: vừa non-static, vừa có static
    //System: hầu hết static
    public static final double PI = 3.1415;
    public static final int MAX_ELEMENT = 500;
    
    
    //final ~ const bên C, biến ko cho thay đổi value, trừ lần đầu tiên khai báo
    //HẰNG SỐ
    
    //đẩy Scanner ra ngoài xài chung cho các hàm static của chúng ta, tại sao ko??
    private static Scanner sc = new Scanner(System.in);
    //private cho nhu cầu dùng nội bộ bên trong
    //FAP, LMS
        
    //ko có static thì thành non-static
    //DI: Dependency injection
    
    //Double.parseDouble()
    //                                    tb nhập, errorMsg, lower, upper
      public static int getInteger(String inputMsg) {
        int n; // hứng từ bàn phím gõ gì
        
      
        do {
            try {
                System.out.println(inputMsg); //in ra câu bạn vừa nhập trên hàm
                //n = sc.nextInt() //để lại rác
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên 1..6
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know to input an integer");
            }
            
            
        }while(true);
    }
    //trong qyá trình làm app, việc nhập số là gặp lại nhiều lần
    //nhập 2 của 1 HCN, 3 cạnh 1 TG, nhập sự lựa chọn menu 1..5, điểm tb, điểm thi các môn
    //mỗi cú nhập, biến nhập, kèm theo: trôi lệnh, cà chớn - try-catch - do-while
    //tách việc nhập số nguyên thành 1 hàm, gói chửi bới, trôi lệnh, nhập lại vào 1 chỗ
    //ta hứng kết quả trả về từ hàm, lấy để dùng, MyToys nhớ con số này làm gì
    //Math.sqrt(4) -> mình dùng, Math ko cần nhớ, ko cần non-static
    //new mà trả về kq cho ngừi ta dùng, ko cần nhớ, dùng nhiều ram làm gì, STATIC thượng sách

    public static int getInteger() {
        int n; // hứng từ bàn phím gõ gì
        Scanner sc = new Scanner(System.in);
      
        do {
            try {
                System.out.println("Input an integer: ");
                //n = sc.nextInt()
                n = Integer.parseInt(sc.nextLine());
                //if chửi ngoài biên 1..6
                return n;
            } catch (Exception e) {
                System.out.println("Do ku know to input an integer");
            }
            
            
        }while(true);
    }
}
