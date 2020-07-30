package com.head_first;

import com.head_first.chapter2.DrumKit;

public class Main {

    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.snare = false;

        if (d.snare == true) {
            d.playSnare();
        }

        d.playSnare();
        d.playHiHat();
    }
}
