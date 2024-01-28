
package data;

/**
 *
 * @author Windows
 */
//Cha là nhân tử chung của đám con
//việc riêng dị biệt để đám Con lo
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double wei;

    public Pet(String name, int yob, double wei) {
        this.name = name;
        this.yob = yob;
        this.wei = wei;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    public double getWei() {
        return wei;
    }

    public void setWei(double wei) {
        this.wei = wei;
    }
    
    //hành động chạy và việc gáy thành tích sure là abstract
    public abstract double run();           //chạy khác nhau
    public abstract void showRecord();    //gáy thành tích
    //public abstract double record(); //sau khi in thành tích thì lưu ngay vào record
}
