
package parentchild;

import data.Child;
import data.Parent;

/**
 *
 * @author Windows
 */
public class ParentChild {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playWithParentChild();
    }
    public static void playWithParentChild() {
        Parent p = new Parent("BIỆT THỰ", "1000BTC");
        p.showProfile();
        
        //KHAI CHA NEW CHA. CHẤM XỔ RA TẤT CẢ CỦA KHAI CHA
        //KHAI KHUÔN NEW KHUÔN, XỔ RA TẤT CẢ KHUÔN, KO CARE CHA CON
        //KHAI GÌ CHẤM XỔ NẤY
    
        //KHAI CON NEW CON
        //CHẤM XỔ RA : TẤT CẢ NHỮNG GÌ CỦA CON
        //              CON: vùng nhớ Cha, xổ của Cha do kế thừa
        //                   vùng extends, chứa @ và đổ(hàm) riêng con
        
        
        Child c1 = new Child("NHÀ PHỐ","1000ETH", "GOLF");
        c1.showProfile();   //xài ké Cha, khi chưa @
                            //nếu có @ thì gọi con lun nha
        c1.sayHi(); //gáy luôn hàm riêng Con
        
        //KHAI CHA NEW CON
        //CHẤM XỔ RA GÌ???
        //CHỈ XỔ RA CHA, VÌ CÁI NÀY TƯƠNG ĐƯƠNG CÂU: MÀY BIẾT TAO LÀ AI KHÔNG?
        //MÌNH GÁY, VÌ MÌNH CÓ BA ĐỠ CHO,
        //DÙNG DANH NGHĨA NGƯỜI LỚN ĐỂ ĐI HÙ, THÌ PHẢI CƯ XỬ NGƯỜI
        //KO THẤY ĐÁY CỦA NEW CON
        
        Parent c2 = new Child("CĂN HỘ", "DOGECOIN", " DU THUYỀN");
        c2.showProfile();
        
        //c2.sayHi();//KO CHẠM ĐC HÀM BÌNH DÂN, VÌ MÌNH ĐANG LÀ QUÝ TỘC
        //mình là quý tộc, cư xử như quý tộc, dù mình vẫn có hoang dã riêng
        //KHAI CHA NEW CON CHỈ XỔ CHA ONLY, KO XỔ RIÊNG CON
        //NHƯNG TRONG RAM VẪN CLONE ĐỦ, CON TRỎ KHÔNG VỚI TỚI
        //DÙNG KĨ THUẬT DRIFT CON TRỎ
        
        //kéo giãn cái con trỏ Cha -> xuống đến đáy new Child()
        //cần con trỏ tạm để lấy đc cái đáy new Child()
        Child x = (Child)c2;    //cần trỏ vùng new Child()
        //c2 vẫn là Parent, tương đương nhả sợi dây thun
        //ÉP CHÓ THÀNH MÈO, KĨ THUẬT ÉP KIỂU
        x.sayHi();  //2 CHÀNG 1 NÀNG
        
        //CÁCH LẦY LỘI HƠN, XUẤT PHÁT TỪ CÁCH 1 HOK THÈM SÀI CO TRỎ TẠM
        //(Child)c2  //DO DẤU CHẤM QUÁ MẠNH, CHẤM SÁT AI THÌ CƯ XỬ THEO TYPE ĐÓ
        //ÉP XONG RỒI MỚI CHẤM, THAY ĐỔI ĐỘ ƯU TIÊN       
        ((Child)c2).sayHi();    //7 bài thí nghiệm con trỏ new Dog().bark()
        //new Child("CĂN HỘ", "DOGECOIN", " DU THUYỀN").sayHi();
        
    } 
}
