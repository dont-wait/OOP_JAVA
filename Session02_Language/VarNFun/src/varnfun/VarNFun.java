
package varnfun;

import java.util.Scanner;
//~ #include <stdio.h>


public class VarNFun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //playWithBooleans();
        //playWithCharacters();
        //playWithDoubles();
        //playWithVariable();
        //playWithIntegers();
        int n = getAPositiveInteger();
        System.out.println("Your number: "+ n);
         
        printIntegerList(n);    //truyền tham trị, pass by value
                                //value từ n của hàm main() sẽ được đưa qua phểu
                                //máy xay, n main() đập ngang sang n của hàm
                               
                                //OOP pass by reference - truyền tham chiếu
                                //                         con trỏ, địa chỉ
                                                       
        //System.out.println("n");//J: báo lỗi ko chạy 
        //printIntegerList(n);    //C: chạy rác 0
        //sqrt(4) = 2
        //printIntegerList(500);//hard code đầu vào, cố định value/literal
                                //hok mềm mại linh hoạt
                                //linh hoạt: bạn mún in số mấy
                              
                                
     }   
    public static int getAPositiveInteger() {
        int n;
        //nhập từ bàn phím, xài kỹ thuật OOP,chấm và bung lụa, name.charAt()
        Scanner banPhimCuaTui = new Scanner(System.in);
        
        System.out.print("Input a positive integer: ");
        n = banPhimCuaTui.nextInt();
                
        return n; //getAPositiveInteger() = n
    }
    //tui mún in n số tự nhiên tính từ 1
    //Hiện tượng 1 class bất kì chứa nhiều hàm trùng tên nhưng khác phần tham số
    //đầu vào, mà phải khác tên data type chứ ko phải khác trên tên biến
    //DC GỌI LÀ OVERLOAD/OVERLOADING - quá tải hàm
    //vs. OVERRIDE
    //giống như: 5 anh em trên 1 chiếc xe wave(class)
    //POLYMORPHISM -> ĐA HÌNH
    public static void printIntegerList(int n) {
        //chỉ có thằng ngáo mới scanf(n) here!!! n đã có value khi xài
        //body of funct. nghiền, trộn xử lí với đầu vào giả định sẽ đưa qua tên gọi
        //giải quyết trên công thức
        System.out.println("The list of " + n + " integers");
        for (int i = 0; i <= n; i++) 
        {       
            System.out.printf("%d ", i);
          
            //System.out.printf(i + " ");
        }   
        System.out.println("\n");
    }
    //in ra các số tự nhiên từ 1 tới 100
    public static void printIntegerlist() {
        System.out.println("The list of 100 integers");
        System.out.println("1 2 3 4 5 6 7 8...");
        for (int i = 1; i <= 100; i++) {
            if(i % 2 == 0)    
                System.out.print(i + " ");
        }
    }
    
    public static void playWithBooleans() {
        //C: đúng 1, > 0, sai 0, int
        //Java: đúng: true, sai: false -> boolean
        boolean marriedStatus = true;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui");
        else
            System.out.println("Vườn hồng có lối nhưng chưa ai vào");
    }
    public static void playWithCharacters() {
        //2byte nhen cho kiểu char nhen, lưu bảng mã Unicode
        char m = '$';
        System.out.println("unit: " + m);
        //tên em thì sao? C: mảng kí tự, ko primitive(đơn) nx ròi, phức tạp ròi
        //                          char name[] = "ahihi";
        String name = "Sang Ngọc Trinh";    //loại data tyle mới hoàn toàn
                                            //phức tạp, do gom n thứ khác
                                            //object data tyle, học sớm hoi
        System.out.println("My name is: " + name);
        System.out.println("1St letter of my name is: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
        //C: string.h -> strlwr()... 
        
    }
    //Java ưu tiên double hơn float
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);//cấm tuyệt đối %.lf
        
        float VAT = 0.1F; //mặc định số thực trog Java lưu Double 10^38
                          //mà float thì nhỏ hơn
                          //nên kh thể chèn số lớn(Vat đg là thực) vào số nhỏ(float ) dc
                          //i như long
        System.out.println("VAT: " + VAT);
        
    }
    public static void playWithIntegers() {
        int n = 39; //mọi con số xuất hiện trong code đc gọi là
                    //literal value
                    //số nguyên xuất hiện trog code mặc định là int
        System.out.println("n: " + n);
        
        long m = 3_000_000_000L;//_phân tách literal trong code cho dễ đọc 
                                //do mặc định là 4 byte, nên mún in long thì thêm L ở cuối
        System.out.println("m: " + m);
        
        int status = 0xFA;  //hệ 16
        System.out.println("status: " + status);
        
        int phone = 010;   //0 hệ 8 Octal
        System.out.println("phone: " + phone);
    }
    //static thì chỉ chơi với static
    public static void playWithVariable() {
        //biến là 1 vùng ram được đặt tên chiếm 1 số byte nhất định
        //tùy loại dữ liệu thông tin mà nó sẽ chứa bên trong - data type - hình thức data
        //số, chữ, ảnh,...
        //biến là cách đặt tên cho 1 đại lượng, 1 giá trị -đơn, phức
        int age = 20;
        int a = 10, b;
        b = 100;
        //tốn 12 byte trong RAM
        System.out.println("age: " + age);  //~printf("age: %d", age);
        int yob = 2002; //year of birth
        age = 2021 - yob;
        
        System.out.println("age again: " + age);
        
        System.out.println("age by using transitive tech: " + (2021 - yob));
        
        System.out.printf("are printed by using %% as in C: %d\n", (2021 - yob));
    
    
    
    }   

    private static void printIntegerlist(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
