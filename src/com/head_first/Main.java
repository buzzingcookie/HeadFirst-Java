package com.head_first;
import com.head_first.chapter2.DrumKit;
import com.head_first.chapter2.Echo;
import com.head_first.chapter2.Player;

public class Main {

    public static void main(String[] args) {

        Player a = new Player();
        Player b = new Player();

        b = a;

        a.name = "Kristof";

        System.out.println(b.name);
    }
}
