/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

/**
 *
 * @author Windows
 */
public class Retangle {
    private String owner;  //_______
    private String color;  //_______
    private double width;  //__5____
    private double length; //__20___
    //private double area;   //__100__    //thuộc tính, đặc điểm, dẫn xuất
                                        //được tính từ thằng khác, w*l
                                        //ko nên đưa qua phễu, nguy cơ mâu thuẫn    
                                        //do dt 1 đằng, 2 cạnh 1 nẻo
    //né ko chơi dẫn xuất. ngoan cố new đúng 5 20 100
    //setWidth(10) -> chết nếu ko cập nhất lại diện tích
    //sl * dg = tt
    //dẫn xuất có thể tính đc từ thằng data khác, vậy nó đc biến thành
    //hành vi của object thì hợp lí hơn
    //tui/bạn đều có năm sinh -> cắc cớ đi hỏi tuổi, getAge() là hàm hay hơn
    //                          , age dẫn xuất, cá mỗi năm age++ mới đúng thời điểm
    //HÀM THUỘC VỀ THẰNG NÀO CÓ NHIỀU DATA, TÍNH S SẼ LÀM HÀM TÍNH DT HCN
    public Retangle(String owner, String color, double weigh, double length) {
        this.owner = owner;
        this.color = color;
        this.width = weigh;
        this.length = length;
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

    public double getWidth() {
        return width;
    }

    public void setWeigh(double weigh) {
        this.width = weigh;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Retangle{" + "owner=" + owner + ", color=" + color + ", weigh=" + width + ", length=" + length + '}';
    }
    public double getArea() {
        return width * length;  //tao éo in, để reuse nơi khác
    }
    
    //90.0 * 90.9 = 8100.00 độ rộng chiều dài nhập
    
    public void paint() {
        System.out.printf("|RECTANGLE|%-15s|%-10s|%4.1f|%4.1f|%7.2f|\n",
                owner, color, width, length, getArea());
    }
}
