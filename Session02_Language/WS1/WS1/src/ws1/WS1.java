
package ws1;

import java.util.Scanner;


public class WS1 {

    
    public static void main(String[] args) {
        solve();
        System.out.println("The 1000 Primes number: ");
        print1000FirstPrimes();
        
        System.out.println("");
        System.out.println("The list of prime:  ");
        printPrimeList();
        
        System.out.printf("\n");
        
        int n = getAPositiveInteger();
        boolean result = isPrime(n);
        if(result == true)
            System.out.println("Đây là số nguyên tố");
        else
            System.out.println("ko la so nguyên tố");
       
    }

    
    public static void solve() {
        //float a, b;
        float x = 0;
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.println("Input x, y: ");
        int a = banPhimCuaTui.nextInt();
                  
        int b =banPhimCuaTui.nextInt();
        //System.out.println("Hai số liên tiếp là:  " + a + " và " + b);
        if (a == 0)
            System.out.println("PT VÔ NGHIỆM");
        else if(a == 0 && b == 0)
            System.out.println("PT VÔ SỐ NGHIỆM");
        else
            x = -b/a;
        System.out.println("Nghiệm x của pt y = ax + b = 0 là " + x);    
    
    }
    //mún in được 1000 số nguyên tố đầu tin
    //ta phải kiểm tra liên tục i
    //nếu là số nguyên tố thì in ra
    //in cho tới khi nào đủ 1000 
    //kiểm tra 1 ơi m là nguyên tố hả, ếu -> cook
    //2 ơi m là nguyên tố hả, đúng -> count + 1
    //tới khi nào count == 1000 thì stop kiểm trA
    public static void print1000FirstPrimes(){
        int count = 0;
        int i = 2;
        while(count < 1000){
          if(isPrime(i) == true) {
              System.out.printf("%d ", i);
              count ++;
          }
          i++;
        }
        
    }
    
    public static void printPrimeList() {
        for (int i = 1; i <= 1000; i++) {
            if(isPrime(i) == true) {
                System.out.printf("%d ", i);
            }
        }
        
        
    }
    //kiểm tra số coi có là số nguyên tố hay ko
    public static boolean isPrime(int n){
       if (n < 2)
           return false;
       for (int i = 2;i <= Math.sqrt(n); i++) 
            if(n % i == 0)
                return false;
            
       
       return true;
    }
    //nhập kí tự
    public static int getAPositiveInteger() {
        int n;
        Scanner banPhimCuaTui = new Scanner(System.in);
       
        System.out.print("Input a number: ");
        n = banPhimCuaTui.nextInt();
                
        return n; //getAPositiveInteger() = n
    }
}
