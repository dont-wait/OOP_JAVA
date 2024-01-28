
package data;


public class book {
        //template
      private String name; //_______
      private String author;//______
      private int Yor; // year of release
      //Khuôn
    public book(String name, String author, int Yor) {
        this.name = name;
        this.author = author;
        this.Yor = Yor;
    }
    public void printInformation() {
        System.out.printf("|%-10s|%-5s|%4d|", name, author, Yor);
        
    }

    
    
    
}

