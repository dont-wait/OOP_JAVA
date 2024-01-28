
package data;


public class Rectangle {

    public String name; 
    public double width, length;
    //rộng, dài

    public Rectangle(String name, double width, double length) {
        this.name = name;
        //this.color = color;
        this.width = width;
        this.length = length;
    }

   

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public void showOwn(){
        
    System.out.printf("|%8s|%4.1f|%4.1f|\n",
                     name, width, length);
}
    
}
