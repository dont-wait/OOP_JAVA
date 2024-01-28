
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
        
        
        Child c1 = new Child("NHÀ PHỐ","1000ETH");
        c1.showProfile();   //xài ké Cha, khi chưa @
                            //nếu có @ thì gọi con lun nha
                            
        //KHAI CHA NEW CON
        //CHẤM XỔ RA GÌ???
        //CHỈ XỔ RA CHA, VÌ CÁI NÀY TƯƠNG ĐƯƠNG CÂU: MÀY BIẾT TAO LÀ AI KHÔNG?
        //MÌNH GÁY, VÌ MÌNH CÓ BA ĐỠ CHO,
        //DÙNG DANH NGHĨA NGƯỜI LỚN ĐỂ ĐI HÙ, THÌ PHẢI CƯ XỬ NGƯỜI
        //KO THẦY ĐÁY CỦA NEW CON
        Parent c2 = new Child("CĂN HỘ", "DOGECOIN");
        c2.showProfile();
        
        
    
    
    } 
}
