
package data;

/**
 *
 * @author Windows
 */
//mua con Pet đi, ko cụ thể, hỏi thêm Con gì, Pet là abs
public abstract class Pet {
    protected String name;
    protected int yob;
    protected double weigth;

    public Pet(String name, int yob, double weigth) {
        this.name = name;
        this.yob = yob;
        this.weigth = weigth;
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

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
    public abstract double run();
    public abstract void showRecord();
    
}
