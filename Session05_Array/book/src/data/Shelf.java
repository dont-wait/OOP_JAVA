package data;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Shelf {

    private String color;
    private String label;   //tủ này đựng hồ sơ gì 
    private book[] ds = new book[300];
    private int count = 0; //biến đếm hồ sơ
    private  Scanner sc = new Scanner(System.in);


    public Shelf(String color, String label) {
        this.color = color;
        this.label = label;
    }

    public void inputABook() {
        String nameBook;
        String author;
        int namXuatBan;
        System.out.println("Input a book # " + (count + 1) + "/" + ds.length);
        System.out.print("The name of book is: ");
        nameBook = sc.nextLine();
        System.out.print("The name author is: ");
        author = sc.nextLine();
        System.out.print("Year of write is: ");
        namXuatBan = Integer.parseInt(sc.nextLine());
        ds[count] = new book(nameBook, author, namXuatBan);
        count++;
    }
    public void printBooksList() {
        System.out.println("The list of book");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
        }
    }
    public void sortingBookOfYor() {
        
        for (int i = 0; i < count - 1; i++) 
            for (int j = i + 1; j < count; j++)
                if(ds[i].getNamXuatBan() < ds[j].getNamXuatBan()) { 
                    book t = ds[i];
                    ds[i] = ds[j];
                    ds[j] =  t; 
                }
        System.out.println("The list of book after sorting");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();
        }
    }
    public int getInteger(String Msg) {
        int n;
        n = Integer.parseInt(sc.nextLine());
        return n;
    }
    
}
