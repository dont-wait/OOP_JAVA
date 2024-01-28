/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Admin
 */
public class book {
    public String nameBook;
    private String author;
    private int namXuatBan;

    public book(String nameBook, String author, int namXuatBan) {
        this.nameBook = nameBook;
        this.author = author;
        this.namXuatBan = namXuatBan;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    @Override
    public String toString() {
        return "book{" + "nameBook=" + nameBook + ", author=" + author + ", namXuatBan=" + namXuatBan + '}';
    }
    public void showProfile() {
        System.out.printf("|%-25s|%-20s|%4d|\n", nameBook, author, namXuatBan);
    }
}
