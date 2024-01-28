
package bookstore;

import data.book;


public class BookStore {

    
    public static void main(String[] args) {
    
        book NNA = new book("Làm bạn với bầu trời", "Nguyễn Ngọc Ánh", 2020);
        NNA.printInformation();
        System.out.println("");
        book Anohana = new book("Đóa hoa ngày ấy", "Mitsu Izumi", 2022);
        Anohana.printInformation();
    }
    
}
