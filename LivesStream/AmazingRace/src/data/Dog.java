
package data;

import java.util.Random;

/**
 *
 * @author Windows
 */
public class Dog extends Pet{
    public static final double MAX_SPEED = 40;

    public Dog(String name, int yob, double wei) {
        super(name, yob, wei);
    }
    
    @Override
    public double run() {
        Random mayNgauNhien = new Random();
        return mayNgauNhien.nextDouble() * MAX_SPEED;
    }

    @Override
    public void showRecord() {
        System.out.printf("|%-10s|%-10s|%4d|%4.1f|%7.2f|\n", "DOG"
                                                                 ,  name, yob, wei, run());
    }

    
}
