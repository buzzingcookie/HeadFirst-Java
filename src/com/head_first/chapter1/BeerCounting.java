package com.head_first.chapter1;

public class BeerCounting {
    public void beeCounter() {

        int beerNum = 99;

        while (beerNum > 0) {
            System.out.println(beerNum + " bottles of beer on the wall, " + beerNum + " bottles of beer.");
            beerNum = beerNum - 1;

            if (beerNum == 1) {
                System.out.println("Take one down, pass it around, " + beerNum + " bottles of beer on the wall...");
                System.out.println(beerNum + " bottle of beer on the wall, " + beerNum + " bottle of beer.");
                System.out.println("Take the last down, pass it around, the last bottle of beer on the wall...");
                beerNum = beerNum - 1;
            } else
                System.out.println("Take one down, pass it around, " + beerNum + " bottles of beer on the wall...");
        }

        if (beerNum == 0) {
            System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            System.out.println("We've taken them down and passed them around; now we're drunk and we soon pass out!");
        }
    }
}
