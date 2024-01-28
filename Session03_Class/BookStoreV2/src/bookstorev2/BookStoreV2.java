
package bookstorev2;

import data.Book;
import java.util.Scanner;


public class BookStoreV2 {

    public static void inputNewBook() {
        String nameBook;
        String nameAuthor;
        int yor;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input name book: ");
        nameBook = sc.nextLine();
        
        System.out.println("Input name author: ");
        nameAuthor = sc.nextLine();
       
        System.out.println("Input year of read: ");
        yor = sc.nextInt();
        Book x = new Book(nameBook, nameAuthor, yor);
        x.showBook();
        
        
    }
    public static void main(String[] args) {
        Book phuongNam = new Book("Đất rừng phương nam", "Trấn Thành", 2023);
        System.out.println(phuongNam);
        System.out.println("PN:" + phuongNam.toString());
        inputNewBook();
        
    }
    
}
