
package data;


public class Student {
    private static String id;//__ //nằm ở 1 vùng nhớ riêng, mà obj nào cx xài ké,Toilet chung
    public static String name;//__//vùng nhớ xài chung cho các Obj cùng Nhóm/Class
                                  //dữ liệu đổ vào hay chỉnh sửa ăn theo thg cuối cùng nó gán/đỗ      
     //CHỐT HẠ: KO DÙNG STATIC CHO NHỮNG THỨ/ĐĐ/HÀM CỦA RIÊNG TỪNG OBJ
    //tui có ms, bạn có ms, bạn kia có ms, nhưng đều là riêng của mỗi đứa
    //chung đặc điểm nhưng khác value, vậy phải có biến clone riêng - NON-STATIC
    
    public int yob;//__
    private double gpa; //grade point average //non-static
    //...

    public Student(String id, String iName, int yob, double gpa) {
        this.id = id;
        name = iName;
        this.yob = yob;
        this.gpa = gpa;
    }

    public String getId() {
        return id;
    }

//    public void setId(String id) {
//        this.id = id;
//    } //hiếm khi đổi mã số, giống như môn DB primary key

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

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return String.format("|%8s|%-25s|%4d|%4.1f|\n",
                    id, name, yob, gpa);
    }
    public void showProfile() {
        System.out.printf("|%8s|%-25s|%4d|%4.1f|\n",
                    id, name, yob, gpa);
    }   //NON STATIC CHƠI VỚI NON - DĨ NHIÊN CÙNG OBJ, VÀ STATIC LUN
    public int getAge() {
        return 2021 - yob;
    }
    public static void sayHi() {
        System.out.println("HI everyone, my name is "+ name);
        //System.out.println("By the way, my yob is " + yob);
        //static chỉ chơi với static vì cùng khu vực, ko chơi với non
            //có quá trời yob đc clone biết lấy ai bỏ ai
    }
}
