
package data;


public class Dog {
    
    public String name;     //______
    private int yob;        //______   
    private double weight;  //______

    public Dog(String name, int yob, double weight) {
        this.name = name;
        this.yob = yob;
        this.weight = weight;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //ta chủ động đưa nhiều info
    public void bark() {
        System.out.printf("|GOGO|%-10s|%4d|%4.1f|", name, yob, weight);
        System.out.println("");
    }

    //một obj bất kì có nhiều info mô tả, vidu: xem dtdd trên tgdd,đập hộp có sách
    //ghi thông số luôn.. Nhìn 1 cuốn sách trên mạng, cầm tay: tác giả, ngày xb, mã số...
    //gặp chú CSGT, show ra các info mình có: CCCD, Driver lic, Cà vẹt
    //việc show info của 1 obj là tự nhiên, FB profile
    //đó là 1 hành động nên có của mỗi obj, mô tả, đặc tả về obj
    //hành động đó có thể do ta chủ động đưa ra, hoặc tự generate theo template có sẵn
    //template có sẵn Java giúp mình, mình ko cần code

    @Override //khác Overload đó nhen, dính đến kế thừa
    //cả 2 thằng đều có liên quan đến 1 khái niệm là POLYMORPHISM- 50 sắc thái, đa nhân cách
    public String toString() {
        //return "Dog{" + "name=" + name + ", yob=" + yob + ", weight=" + weight + '}';
        //độ lại đc quyền, vì chỉ cần trả chuỗi chứa info của mình
        //y chang mình làm card visit
//        String tmpMsg = String.format("|GOGO|%-10s|%4d|%4.1f|", 
//                            name, yob, weight); //trả chuỗi thô ko xuống hàng
//        return tmpMsg;
       return String.format("|GOGO|%-10s|%4d|%4.1f|", 
                                name, yob, weight);
//        
    }
    
    //hàm gắn việc xử lí info của chính obj. Ai giàu info, gã đó nên xử lí
    public int getAge() {
        return 2021 - yob;
    }
    //viết code kiểu này gọi là hard-code, fix value, năm sau ohải sửa code thì tuổi mới đúng
    //chuẩn: lấy giờ hệ thống Window = yob;
    
   
}   
