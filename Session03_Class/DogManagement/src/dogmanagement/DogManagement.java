
package dogmanagement;

import data.Dog;


public class DogManagement {

  
    public static void main(String[] args) {
        //lấy khuôn Dog ra để bắt đầu đổ in4
        //y chang làm thẻ cc: lấy thông tin, in lên thẻ, đồ mực
        //sau khi chờ khô, ta đc obj thuộc nhóm vừa đúc
        //đặt tên gọi tắt cho obj, để dễ dàng nói chuyện, tham chiếu đến
        //int yob = 2001;
        Dog chiHu = new Dog("CHI HU HU", 2021, 0.5);
        //caiSi chiPu{name: NTC; yob: 1993; hits: Anh ơi}
                        //JSON JavasSript
        //  biến/tên tắt       object
        //có object thì object sẽ biết làm gì đó, cờ hó biết sủa
        chiHu.brak();
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        //caSi sonTung =
        ngaoDa.brak();
        
        //chiHU sủa trở lại
        System.out.println("Chi Hu Hu barks again");
        chiHu.brak();
        
        //bark(); ??? đứa nào sủa vậy???, ko bt
        //HÀNH ĐỘNG PHẢI GẮN VỚI OBJ, THÔNG QUA CHẤM
        System.out.println("After overweight");
        chiHu.setNewWeight(5);
        chiHu.brak();
        Dog Bin = new Dog("TuanKit", 2007, 70);
        Bin.brak();
        
        int chYob = chiHu.getYob();
        System.out.println("CH Yob: " + chYob);
        
        System.out.println("ND Yob: " + ngaoDa.getYob());
    }
    
    //new xin vung ram mới đủ chứa info của 1 bạn Dog sẽ được Đúc/Đổ Data
    //có 2 vùng name dành cho 2 object
    //ngaoDa ko đè name của ChiHu
}
    //new: hành động clone 1 vùng không gian trống, tháo tượng khỏi khuôn
    //chừa chỗ
    //new: xin vùng ram mới, y chang như khuôn, để đồ data vào vùng mới 
    //                          lấy phôi CCCD trống, cbi điền tên
    //new ~ malloc calloc
    //      memory allocation   clear a
