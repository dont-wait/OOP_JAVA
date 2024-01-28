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
public class NoName extends Shape{

    public NoName(String owner, String color, String borderColor) {
        super(owner, color, borderColor);
    }

    @Override
    public double getArea() {
        //hình cắt bên WORD  là hình duy nhất, S ko thể có công thức được
        //là con số đo đc = thước + tích phân
        //đảm bảo S là con số, còn tính theo công thức hay đo đạc ko ảnh hưởng
        //nếu bạn chế tạo Khuôn, sẽ là công thúc nhân bản
        //hình mình đang cắt là unique
        return 50;  //giả bộ cho hình bên WORD
    }

    @Override
    public double getPerimeter() {
        return 40;
    }

    @Override
    public void paint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
    
    //NẾU TA LÀM RIÊNG 1 CÁI KHUÔN CHO 1 CÁI HÌNH CỤ THỂ KO HÌNH DẠNG
    //SAU NÀY TA NHÂN BẢN HÌNH NÀO CX 50 À VÔ LÍ, CẮT NGẪU NHIÊN DIỆN TÍCH NGẪU NHIÊN
    //CÔNG THỨC TÍNH KO CÓ LUÔN
    //NẾU CHỦ ĐỘNG LÀM CLASS CON THẾ NÀY, THÌ NÓ LẶP LẠI GIỐNG V TRÒN CN
    //CẦN CÓ CÔNG THỨC CHUNG CHO S, P, ĐỂ CÒN CLONE CÁC HÌNH

    //BÊN WORD HÌNH ĐỘC ĐÁO, DUY NHẤT, KO THỂ DÙNG KHUÔN RỜI NONAME ĐG LÀM ĐC
    //TA SẼ CHẾ NHANH THEO SHAPE, ĂN KÉ SHAPE MÀ NEW TRỰC TIẾP THOY 
    //TRẢ RA S, P HARD-CODE ĐÚNG NGHĨA 1 HÌNH DUY NHẤT
    //CHẾ KHUÔN CLASS DÀNH CHO NHÂN BẢN
    //hình mình(độc đáo) đg cắt là nguyên bản unique ko làm Khuôn đc