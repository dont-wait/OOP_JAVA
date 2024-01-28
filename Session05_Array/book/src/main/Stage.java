
package main;
import java.util.Scanner;
import data.Shelf;

/**
 *
 * @author Admin
 */
public class Stage {
     
    
    public static void main(String[] args) {
        printMenu();
        Shelf tuHT = new Shelf("Hồng", "Tu sach hentai");//tủ chứa hentai
        Shelf tuAction = new Shelf("Tím", "Tu sach action");
        
        Scanner inputChoise = new Scanner(System.in);
       
        int choice;
        do {
            System.out.print("Mọi bạn chọn 1..4: ");
            choice = Integer.parseInt(inputChoise.nextLine());
            switch(choice) {
            case 1:
                tuHT.inputABook();
                break;
            case 2:
                tuHT.printBooksList();
                break;
            case 3:
                tuHT.sortingBookOfYor();
                break;
            case 4:
                System.out.println("Good byee, see you next time");
                break;    
            }
        }while(choice != 4);
        
    }
    public static void printMenu() {
        //int choice;
        System.out.println("Chào mừng bạn đến với hiệu sách Sang NT");
        System.out.println("1. Thêm 1 quyển sách");
        System.out.println("2. In danh sách các sách vừa thêm");
        System.out.println("3. Sắp xếp các quyển sách đã thêm theo giá tiền");
        System.out.println("4. Thoát");
        
//        
    }
}
