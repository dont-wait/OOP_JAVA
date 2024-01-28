
package ex2;

import data.taiKhoanNganHang;


public class Ex2 {

    
    public static void main(String[] args) {
      taiKhoanNganHang taiKhoanTanSang = new taiKhoanNganHang("Nguyễn Tấn Sang", 777, 458, 124, 150);
      taiKhoanTanSang.printInfor();
      taiKhoanNganHang taiKhoanNgocTrinh = new taiKhoanNganHang("Nguyễn Ngọc Trinh", 888,453, 123, 500);
      taiKhoanNgocTrinh.printInfor();
      taiKhoanNganHang taiKhoanThanhTra = new taiKhoanNganHang("Đặng Thị Thanh Trà", 508, 770, 154, 700);
      taiKhoanThanhTra.printInfor();
      System.out.println("Cảm ơn Thanh Trà đã rút tiền");
      taiKhoanThanhTra.rutTien();
      taiKhoanThanhTra.getSoDu();
      taiKhoanThanhTra.printInfor();
      
    }
    
}
