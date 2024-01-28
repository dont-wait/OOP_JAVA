
package data;


public class taiKhoanNganHang {
    public String name;
    private int maSo;
    private int CMND;
    private int SDT;
    private int soDu;

    public taiKhoanNganHang(String name, int maSo, int CMND, int SDT, int soDu) {
        this.name = name;
        this.maSo = maSo;
        this.CMND = CMND;
        this.SDT = SDT;
        this.soDu = soDu;
    }
    

    public void printInfor() {
        System.out.printf("|%-10s||%4d||%4d||%4d||%4d VND|", name, maSo, CMND, SDT, soDu);
    }
    public int rutTien() {
        return soDu = soDu - 50;
    }
    public double getSoDu() {
        return soDu; 
    }

   
}
