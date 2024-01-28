
package dogmanagement;

import data.Dog;


public class DogManagement {

  
    public static void main(String[] args) {
        
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        
        chiHu.bark();
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        //tui muốn show toàn bộ info của tui theo cách mới, theo cách to String
        //obj có nhiều hành động
        System.out.println("Show all info by using toString() - a new behavior");
        //chiHu.toString(); //chỉ mới return, cần p có đồ hứng
        String chiHuDetail = chiHu.toString();
        System.out.println("CH Details: "+ chiHuDetail);
        System.out.println("ND Details: "+ ngaoDa.toString());
        
        //hàm toString() rất đặc biệt, @override
        //mục tiêu là show ra all of info đã đổ vào, hoặc chỉnh sửa
        //y chang như mở Setting trong phone xem phần info đt
        
        System.out.println("Play with toString() - GỌI THẦM TÊN EM");
        System.out.println(chiHu);  //chiHu là biến obj, lưu tọa độ vùng new //giống p = &a
                                     //lý thuyết in ra địa chỉ, thực tế J thì gọi toString() ngầm
        System.out.println(ngaoDa); //gọi thầm tên em toString()

        //NẾU KHUÔN KO CÓ HÀM TOSTRING() THÌ MẶC NHIÊN KHI NÓ ĐƯỢC TRIỆU GỌI(GỌI THẦM
        //HAY GỌI TRỰC TIẾP, JVM, SẼ TỰ ĐỘNG BĂM CÁI VÙNG RAM CỦA OBJ THÀNH CON SỐ HEXA
        //ĐẠI DIỆN CHO VALUE VÙNG RAM ĐÓ
        //HASH NUMBER, NÉN TOÀN BỘ DATA THÀNH 1 CON SỐ, MD5, SHA-256
        
        //Xem tuổi của 1 obj, tương tác, hỏi đáp, giao tiếp với obj qua dấu chấm
        System.out.println("Get age");
        System.out.println("NĐ age: " + ngaoDa.getAge());
        
        //int a = 100;                           
        //printf("a: %d\n", a); -> 100 vùng ram có primitive mấy, value mấy
        //printf("a address: %u\n", &a); //vùng ram mày ở đâu, tọa độ, địa chỉ của m
        //int* p = &a; //p lưu tọa độ a, gọi là con trỏ, vì tao đg nhắm vào tọa độ của nhà m
        //printf("p has value of %u\n", p); -> địa chỉ a, 6M
        //printf("a has value of %d\n", *p); -> 100
    
    } 
    
}
