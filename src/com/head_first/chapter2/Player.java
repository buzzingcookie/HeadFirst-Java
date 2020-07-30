package com.head_first.chapter2;

public class Player {

    int number;
    String name;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println(this.name +"'s guess is " + number);
    }
}
