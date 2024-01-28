
package data;

/**
 *
 * @author Windows
 */

//                  sự mở rộng, tiếp nối, phiên bản tiếp
//                  độ lại từ, chỉnh sửa thêm từ...Rectangle
//tui ko mún làm Khuôn từ đầu, tui dựa hơi, tui kế thừa, dùng lại
//từ ai đó

//1. extends Class mình sẽ kế thừa
//  Rectangle gọi là: Cha, parent, super, base
//  Square gọi là   : Con, child , deridved (dẫn xuất, chế ra từ)  

//2. đặc tính/đặc điểm: HV là 1 IS A (KIND OF, VERSION OR) dạng HCN
//                              thừa hưởng mọi thứ từ HCN
//                              do đó ko cần làm lại những gì cha đã làm
//                              XÀI LUÔN, KO COPY&PASTE
//TUI LÀ PHIÊN BẢN ĐB CỦA ANH, BIẾN THỂ TỪ ANH, TUI PHẢI CÓ CÁI TỪ ANH TRƯỚC ĐÃ
//thừa hưởng thì ko cần làm lại, giống Cha ko cần làm lại

//3. làm phễu cho Con như truyền thống
//   phải để Con giữ bản sắc, nghĩa là tôn trọng phễu Con
//  Con vẫn là Con, Con còn là phiên bản Ba
//  V           V   V                   HCN
//  nếu nhìn HCN thì cst phải 4 tham số o, c, w, l
//            V  thì cst chỉ cần o, c, e


public class Square extends Retangle{

    //phễu dùng để đúc 1 object, nhận vật liệu đi vào
    //đúc new Square() cắt 1 HV, thì chính là cắt 1 HCN
    //    new Square() chính là mình đang new 1 HCN, new Rectangle()
    //có 1 HV ra đời, chắc chắn cx là có 1 HCN ra đời
    //đỗ data từ phễu Con lên phễu Cha, đúc Cha, để có đc o, c, w, l như ngày
    //xưa Con có
    public Square(String owner, String color, double edge) {
        super(owner, color, edge, edge);
    }   //~~~ new Rectangle(o, c, w, l);
    
//    private String owner;
//    private String color;
//    private double edge; edge nhìn theo góc nhìn HCN, 2 cạnh w l = nhau
    
    
    @Override   //Con có hàm trùng tên 100% với Cha, Con qua mặt Cha
    //Cha ngồi im để Con lo cho, phủ quyết bỏ qua lờ đi của Cha
    //dính đến khái niệm tính đa hình đa xạ đa ánh xạ 50 sắc thái đa nhân cách
    //transformoer, POLYMORPHISM
    //KẾ THỪA KO PHẢI LÀ COPY/PASTE MÀ LÀ DÙNG LẠI LUÔN
    //DUNG LẠI CỦA CHA, KO CẦN COPY GÌ CẢ, KO NHÂN BẢN CODE KIỂU BẤT ĐẦU BỘ
    //KẾ THỪA LÀ KHÁI NIỆM ĐỒNG BỘ
    
    public void paint() {
        System.out.printf("|SQUARE   |%-15s|%-10s|%4.1f|  - |%7.2f|\n",
                owner, color, width, getArea());
    }
}
