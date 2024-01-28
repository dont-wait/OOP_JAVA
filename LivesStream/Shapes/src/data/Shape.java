
package data;

/**
 *
 * @author Windows
 */
//là khái niệm chung cho mọi loại hình nào đó: V, Tr, HCN, HV,...
public abstract class Shape {
    protected String owner;
    protected String color;
    protected String borderColor;

    //cạnh a b c radius bk, rất vô duyên
    //phần dị biệt của con nên để ở local
    
    
    
    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }
    
    //Hình nói chung sẽ có S, P. Vấn đề là tính như thế nào? tùy hình mà tính
    //ko thể nói cụ thể đc lúc này
    //S P là 1 khái niệm đề cập đặc tính và hành vi của 1 cái hình học nói chung
    //nó là chung chung, ko cụ thể
    //Cụ thể để mỗi hình Tr, V, CN, HBH sẽ lo
    //nói về ý tưởng,gọi là abstract
    
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract void paint();    
}
