
package fu.main;

import fu.util.MyToys;
import java.util.Scanner;




public class Stage {
    //psvm tab
    public static void main(String[] args) {
        System.out.println("PI: " + MyToys.PI);
        //MyToys.PI = 4.0;
        System.out.println("PI again: " + MyToys.PI);
        //Math.
//        int n = MyToys.getInteger();
//        System.out.println("n: " + n);
        int choice;
        choice = MyToys.getInteger("Mời nhập lựa chọn của bạn (1..7): ");
        System.out.println("Lựa chọn của bạn là (your choice): " + choice);
    }
    
}
