
package data;


public class Book {
    private String nameBook;
    private String nameAutor;
    private int yor;

    public Book(String nameBook, String nameAutor, int yor) {
        this.nameBook = nameBook;
        this.nameAutor = nameAutor;
        this.yor = yor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getNameAutor() {
        return nameAutor;
    }

    public void setNameAutor(String nameAutor) {
        this.nameAutor = nameAutor;
    }

    public int getYor() {
        return yor;
    }

    public void setYor(int yor) {
        this.yor = yor;
    }
    public String toString() {
        return String.format("|%8s|%-25s|%4d|\n",
                    nameBook, nameAutor, yor);
    }
    public void showBook() {
        System.out.printf("|%8s|%-25s|%4d|\n",
                    nameBook, nameAutor, yor);
    }
}
