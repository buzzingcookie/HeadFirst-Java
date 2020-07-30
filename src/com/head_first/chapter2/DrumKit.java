package com.head_first.chapter2;

public class DrumKit {

    public boolean hiHat = true;
    public boolean snare = true;

    public void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    public void playHiHat() {
        System.out.println("ding ding da-ding");
    }
}

class DrumKitTestDrive {

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
