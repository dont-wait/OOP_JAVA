
package data;

/**
 *
 * @author Windows
 */
//V1. Con cũng tạo dựng đc 2 nhóm tài sản, Cha cx đã làm

//V2. Con tạo dựng thêm những thứ mà Cha chưa từng, biến dị

//1. Tìm thấy IS A, extends

//2. Đặc điểm của Con
//  2.1 Con giống y chang Cha, ko cần làm gì cả

//  2.2 Con biến dị, khác Cha một vài thứ
//    - Con tạo dựng 3 tài sản, 2 giống Cha, 1 riêng con
//      cứ khai báo đặc điểm bt, Khuôn có dđ, và hvi
//                                     phần nào làm biếng, lấy của Cha

//3. Phễu, giữ bản sắc Con, Cha Con deal, thương thuyếtđàm phán

public class Child extends Parent{
    //HCN: o, c, w, l
    //  <|------- HV: o, c, e, smile
    private String assetThree;  //ngầm hiểu còn có assetOne, assetTwo
                                //phễu phải đổ cả 3, nếu kế thừa 2 gửi lên Cha

    public Child(String assetOne, String assetTwo, String assetThree) {
        super(assetOne, assetTwo);
        this.assetThree = assetThree;   //muse be 1st statement
        //super(assetOne, assetTwo); //ko cho nằm đây
        //câu lệnh SUPER() MUST BE 1ST STATEMENT
        //vì ko có Ba lấy gì cho Con, Ba là cánh chim, nền để đỡ cho con bay xa
        //vùng new Cha phải có, rồi mới nới rộng thêm
    }

    public String getAssetThree() {
        return assetThree;
    }

    public void setAssetThree(String assetThree) {
        this.assetThree = assetThree;
    }
    @Override
    public void showProfile() {
        System.out.println("CHILD > asset1: " + assetOne + " asset2: " + assetTwo + " asset3: " + assetThree);
    }
    
    //Con làm riêng việc của Con. Ở nà với Ba, Ba biết mình làm gì
    //Vào SG học, mình đi chơi sao Ba biết
    //Hàm lan đột biến
    public void sayHi() {
        System.out.println("Hey, i am a rich kid");
        System.out.println("By the way, my 3rd asset is" + assetThree);
    }
}
