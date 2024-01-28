package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
        //InputProfile();
        InputProfileXin();
    }

    public static void InputProfileXin() {

        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

       //bên C đúng là 1
        while (true) { //cuộc chiến vô cực      
            try {
                //lệnh cà chớn nằm here
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());   //static xài là chấm luôn
                                                            //math. chẳng hạn
                break;
            } catch (Exception e) {
                System.out.println("Do ku know to input a positive number?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }
    //nhập thông tin cơ bản của sv và in ra

    public static void InputProfile() {

        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);

        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        //mặc định JVM sẽ giết app nếu có cà chớn xảy ra để đảm bảo an toàn cho app, xử lí data
        //đưa cho ta 1 cơ chế tự xử khi có cà chớn xảy ra, chuyển quyền giết cho mình
        //báo JVM đừng giết, tao tự xử, nhốt các câu lệnh cà chớn lại, SANDBOX
        try {
            //lệnh cà chớn nằm here
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());
            //m đưa t cái chuỗi đê - t ói m con số  2001 + cách or 2001 + enter                                              //t láy tới 2001 th, thg đằng sau ếu phải số, ếu lấy               
            //nextLine() hốt sạch buffer, loại bỏ enter, còn chuỗi số -> số
            //alt shift f
        } catch (Exception e) {
            //CPU sẽ chạy đến chỗ nyà, khi có cà chớn xảy ra
            //JVM ko giết app như truyền thống
            //chỗ này là chỗ xử lí hậu quả cà chớn
            //ko có cà chớn thì ko vào đây
            //e chính là lá thư/msg màu đỏ JVM gửi cho mình báo rằng có lỗi cà chớn nè
            //lm dì thì làm
            //Exception e = new Exception(nội dung lỗi màu đỏ đây nè...);
            //về lí: e.xem lỗi, xử lí tự mình
            //về toán hóa, mình chỉ tập trung phần xử lí lỗi, biết thừa ếu gõ đúng số mình cần

            //xử lí sao??? nhiều cách: default value(Ko hay)
            //                             //hay: bắt nhập lại, member: login/ user name
            yob = 69;

        }

        System.out.print("Input address: ");
        address = sc.nextLine().toUpperCase();

        System.out.println("Here is your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
    }

}
