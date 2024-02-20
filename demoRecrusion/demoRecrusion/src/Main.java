import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        //int result = getFactorial(5);

        //System.out.println(getFactorial(5));
        //testRecrution();
        //System.out.println(Fibo(5));
        int[] arr = {5, 10, 15, 20, 25, 30};
        printElement(arr, 0);
//        System.out.println("n - 1 ~~~ 0");
//        printElement(arr, arr.length - 1);
        //System.out.println(Fibo2(10));
//        int [] Fibo = new int[11];
//        Fibo[1] = 1;
//        Fibo[2] = 1;
//        for (int i = 3; i < 11; i++) {
//            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
//        }
//        System.out.println(Fibo[10]);
    }
    //Đệ quy có nhớ
    static int[] F = new int[100];
    public static int Fibo2(int n) {

        if(F[n] != 0)
            return F[n];    //nếu tính rồi thì chỉ cần Return th
                            //phần tử trong mảng chưa gán mặc định = 0
                            //nếu ko bằng 0 thì chắc chắn nó đã đc tính
                            //tính rồi thì tính lại chi???
                            //lấy F[n] xài lun!!!
        System.out.println("Can Tinh: F["+ n + "]");
        if(n <= 2) {
            F[1] = 1;
            F[2] = 1;
            return 1;
        }
        F[n] = Fibo2(n - 1) + Fibo2(n - 2);
        return F[n];
    }
    public static void printElement(int[] arr, int index) {
        if(index < 0 || index >= arr.length)
            return;
         // arr.length
        printElement(arr, index + 1);
        System.out.println(arr[index]);

    }
    //tìm số Fibonaci thứ n
    public static int Fibo(int n) {
        //1. bài toán cơ sở
        System.out.println("Tinh: F["+ n + "]");
        if(n <= 2)
            return 1;
        //2. Cong thuc quy nap
        int Fn = Fibo(n - 1) + Fibo(n - 2);
        return Fn;
    }
    //tính n! return n
    public static int getFactorial(int n) {
        if(n == 0)
            return 1;
        int t = n * getFactorial(n - 1);
        //công thức quy nạp
        return t;
    }
    public static void testRecrution() {
        System.out.println("F");
        testRecrution();
    }
}
