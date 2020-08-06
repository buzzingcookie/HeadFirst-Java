package com.head_first.chapter2;

public class Echo {

    public int count = 0;

    public void hello() {
        System.out.println("helloooo... ");
    }

    public void echoes() {
        Echo e1 = new Echo();
        Echo e2 = new Echo();


        byte x = 0;

        while ( x < 4 ) {

            e1.hello();

            e1.count = e1.count + 1;

            if ( x > 0 ) {
                e2.count = e2.count + 1;
            }

            if ( x > 1 ) {
                e2.count = e2.count + e1.count;
            }

            x = (byte) (x + 1);
        }
        System.out.println(e2.count);
    }
}

