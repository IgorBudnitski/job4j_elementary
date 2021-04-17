package ru.job4j.oop;

import java.util.Arrays;

public class Battery {
    private int load;

    public Battery(int charge) {
        this.load = charge;
    }

    public void exchange(Battery another) {
        this.load = this.load + another.load;
        if (this.load > 100) {
            another.load = this.load - 100;
            this.load = this.load - another.load;
        } else {
            another.load = 0;
        }
    }

    public static void main(String[] args) {
        Battery bat1 = new Battery(85);
        Battery bat2 = new Battery(25);

        System.out.println("bat1 = " + bat1.load);
        System.out.println("bat2 = " + bat2.load);

        bat1.exchange(bat2);

        System.out.println("bat1 = " + bat1.load);
        System.out.println("bat2 = " + bat2.load);

    }
}
