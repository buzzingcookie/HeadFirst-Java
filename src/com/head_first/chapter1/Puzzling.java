package com.head_first.chapter1;

public class Puzzling {
    public void puzzler() {

        int x = 0;

        while(x < 4) {

            System.out.print("a");

            if (x < 1) {
                System.out.print(" ");
            }

            System.out.print("n");

            if (x < 1) {
                System.out.print("oise");
            }

            if (x > 1) {
                System.out.print(" oyster");

                x = x + 2;
            }

            if (x == 1) {
                System.out.print("noys");
            }

            System.out.println("");

            x = x + 1;
        }
        //System.out.print(x);
    }
}
