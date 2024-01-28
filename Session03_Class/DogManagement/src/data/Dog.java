
package data;

//Khuôn dùng để đúc ra các object, đối tượng cần lưu trữ in4, thứ
//làm ra để bán
//Khuôn phải kín, có phễu để chế/rót/hứng/đổ vào cái data, nguyên liệu
public class Dog {
    //chứa đặc điểm, chi tiết mà các khuôn, object tương lai sẽ có
    //Khuôn design ra sao, mai mốt object có thể như thế
    private String name; //______//cái khuôn chỉ nên để mình có, PHẠM VI TRUY CẬP
    private int yob;    //______    template đó, cần value đồ vào
    private double weight;//____    -> cần phễu
    //...
    //~CMND, thẻ căn cước, khác value đổ vào, Template
    
    //Có Khuôn thì phải có phểu/miệng loe để hứng vật liệu đi vào
    //phiễu dùng để nhận vật liệu đúc ra, tạo ra, contruct cái object
    public Dog(String iName, int iYob, double iweight) {
        name = iName ;
        yob =   iYob ;
        weight = iweight;
    }
    //Phễu còn đc gọi là construtor, hàm khởi tạo, hàm đúc, hào tạo ra object   
    //vì thông qua nó như cái phễu chảy vật liệu vào trong Khuôn
    //vật liệu khô ra object/bức tượng, cmnd của ai đó, hồ sơ được tạo
    //CONSTRUCTOR, PHỄU LÀ HÀM CỰC KÌ ĐẶC BIỆT, VÌ NÓ DÙNG ĐỂ TẠO RA OBJ
    //CỨ MỖI LẦN XÀI NÓ, TỨC LÀ PHẢI ĐƯA VL VÀO, TỨC LÀ CÓ 1 OBJ MỚI
    //PHỄU LÀ HÀM ĐB KO GIÁ TRỊ TRẢ VỀ, KO VOID LUN, TAO ÓI VỀ NGUYÊN
    //BỨC TƯỢNG ĐG ĐÚC
    //tên 100% tên giống class

    //viết các hàm xử lí data ví du như giao tiếp hỏi năm sinh
    //mày hỏi tao trả lời, vì ba má đã fill yob = 2001
    //object: thì gọi là hành động, behaviour, xử lí tính toán trên
    //biến đc đổ value từ lúc đúc ra
    
    //hàm gọi n lần tương đương các hành động mà obj nào đó lặp đi lặp lại
    //hđ của obj gọi n lần trên obj đó
    public void brak() {
        System.out.println("Gâu Gâu Gâuu... my name is " + name);                 
        System.out.println("Gâu Gâu Gâuu... my yob is " + yob);
        System.out.println("Gâu Gâu Gâuu... my weight is " + weight);
        //...
        System.out.printf("|%-10s|%4d|%4.1f|\n",
                name, yob, weight);
    }
    
    //mình đi xăm mình, nhuộm tóc
    //thay đổi in4 ba má đã từng cho lúc ba má new/đúc ra mình
    public void setNewWeight(double newWeight) {
        weight = newWeight;
    }
    
    //vì mặc định info sẽ là giấu, khi mình giao tiếp mình mới bật nó ra
    //chia sẻ info khi đc hỏi, đó chính là method hàm hành động get()
    public int getYob() {
        return yob;
    }
    
}   
//code bên ngoài giống Khuôn bị lủng
//ngoài đời: bạn (yob: 2001), tui (yob: 2001) 

//ENCAPSULATION: TÍNH ĐÓNG GÓI CỦA THÔNG TIN VÀ HÀNH ĐỘNG
//HÀM BIẾN ĐI KÈM VỚI NHAU ĐẠI DIỆN, MÔ TẢ CHO 1 OBJ, THỰC THỂ (SỐNG)