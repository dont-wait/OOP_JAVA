
package data;

/**
 *
 * @author Windows
 */
//KHUÔN TỔ, SINH RA N KHUÔN KHÁC CHO NHANH
//GIÚP V, TR, CN, HBH, TG, EVAL,.. Ở CHUNG NHÀ, MẢNG MỚI SORT ĐƯỢC
//CÙNG PB XẾP GẦN NHAU
public abstract class Shape {
    
    protected String owner;
    protected String color;
    protected String borderColor;
    //các cạnh thì sao
    //protected double a, b, c, radius; //,,,, còn nx
    //ko đc đưa các cạnh vào đây vì:
    //chúng sẽ kế thừa hết các cạnh, do đó HV sẽ có cạnh, nhiều nx là khác, bk
    //tròn, ngoài bk, thừa kế luôn cả cạnh
    //bk, cạnh là của RIÊNG TỪNG ĐỨA CON, DỊ BIỆT THÌ PHẢI Ở RIÊNG TỪNG ĐỨA CON
    
    //CHA LÀ NHÂN TỬ CHUNG CHO CÁC CON, NGOÀI ĐỜI Y CHANG
    //ĐÁM CON CÓ DI TRUYỀN TỪ BA MÁ: OWNER, COLOR, ĐƯỜNG BO
    //NHƯNG GIỮ LẠI KHÁC BIỆT: TR: BK, V: CẠNH, TG: CHIỀU CAO/ĐÁY...
    //a e trong nhà thì thừa kế từ ba má nhiều thứ, tài sản riêng mỗi con tạo dựng
    //người đó giữ
    
    
    //diện tích/chu vi là derived field đc tính từ thằng khác thì không nên để ở đây
    //ko nên xem là đặc điểm

    public Shape(String owner, String color, String borderColor) {
        this.owner = owner;
        this.color = color;
        this.borderColor = borderColor;
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

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    @Override
    public String toString() {
        return "Shape{" + "owner=" + owner + ", color=" + color + ", borderColor=" + borderColor + '}';
    }
    
    //1 Khuôn vẫn chế tạo theo nguyên tắc chung
    
    //XÓA KHÔNG CHO, VÌ CẦN KHÁI NIỆM NÀY ĐỂ DIỄN TẢ RÕ Ý NGHĨA HH
    //ĐỂ KO ĐC VIẾT CODE, VÌ KO CÓ CỤ THỂ KÍCH THUCỚ
    //VẪN TỒN TẠI NHƯNG KO NẮM CHẠM ĐC, VẪN TỒN TẠI VỚI Ý NGHĨA MÔ TẢ HOY, NÓI
    //VỀ NÓ HOY, NHƯNG CHƯA CỤ THỂ ĐC, NÓI NHƯNG CHƯA LÀM, KHÁI NIỆM HOY MÀ
    //HÀM TRỪU TƯỢNG, VẤN ĐỀ TRỪU TƯỢNG, THỨ VÔ HÌNH MÀ VẪN HỮU HÌNH
    //ĐỂ VÀO CHO ĐỦ BỘ HOÀN THIỆN      1 THỨ GÌ ĐÓ, LÃNH ĐẠO TINH THẦN, KO QUYỀN LỰC
    //CỤ THỂ
    //MA, QUỶ: VÔ HÌNH, MÌNH VẪN SỢ, KHÁI NIỆM MÀ HOI, ABSTRACT
    public abstract double getArea();   //chỉ nói mà hok có code
    public abstract double getPerimeter();
    
    //việc vẽ và in ra thông tin cũng là chung chung
    public abstract void paint(); //ý tưởng hoy
    
    //tao chỉ nói rằng HH có thứ này, còn mỗi đứa V, T, CN,... tự lo đi
    
    //CHA LÀ NHÂN TỬ CHUNG CỦA CÁC CON
    //ABSTRACT: KHÁI NIỆM, NÓI THOY, CHƯA CẦN CỤ THỂ
    //ABSTRACT CLASS: LÀ SỰ PHÂN LOẠI TRONG CUỘC SỐNG
    //                ĐỂ DỄ DÀNG NÓI VỀ CÁC OBJECT, XẢY RA NHIỀU TRONG C/S
    
    
    
//    public double getArea() {
//        //tính thế mẹ nào, éo có kích thước, vì dị biệt ở từng Con
//                                               //ko có kích thước sao mà tính
//                                               //ko xóa hàm này đc, vì HH phải có S
//        //return 50; //ko ddc defaut, vô nghĩa
//        //cạnh đâu để sửa lại S, công thức đâu ra mà tính
//    }
    
    
    //HH cần có S như là khái niệm, nói rằng thứ nào chiếm bề mặt S, có số đo S
    //đại diện cho 1 nhóm/series các đồ vật cụ thể khác đều có S, P
    //để đây như là ý nghĩa tinh thần, đảm bảo đủ để mô tả cái dì đó
//    public double getPerimeter() {
//        
//    }
    //diện tích và chu vi ko đc xem là đặc tính, mà phải xem là hành vi
    //2 hàm tính S và P để ở đâu??? Con hay Cha, hay cả 2???
    //CẢ 2: VỪA DI TRUYỀN, VỪA LÀ DỊ BIỆT(@OVERRIDE)
    //ĐÃ NÓI VỀ HÌNH HỌC, LÀ PHẢI NÓI S, P, CX LÀ ĐĐ HÌNH HC
    
    //HÌNH CỤ THỂ V, TR, TG, HBH CHẮC CHẮN LÀ TÍNH DC, CX LÀ ĐĐ CỦA TỪNG HÌNH
    //mỗi Con sẽ dị biệt trong tính toàn, nhưng nói chung sẽ có S, P, thừa kế
    //Cha 
}

    //ABSTRACT KHÁI NIỆM, Ý TƯỞNG VỀ 1 THỨ GÌ ĐÓ
    //VỚI HÌNH HỌC THÌ getS() getP() là 2 khái niệm luôn phải có, S, P là khái niệm
    //cần có khi mô tả về hình học (hàm thuộc về object phù hợp)
    
    //Tivi phải nói về dò kênh, kết nối

    //Đthoại: phải nói về bắt sóng, nhận cuộc gọi, gửi sms...

    //những mô tả này có thể là cụ thể, nhưng cx có thể cx là ý tưởng, nói thoy
    //chung chung thôi
    //chung chung gọi l à ABSTRAcT
    //cụ thể      gọi la f CONCRETE

    //gọi Cha không code ko sợ bị lỗi vì Con đã cân(Full code)