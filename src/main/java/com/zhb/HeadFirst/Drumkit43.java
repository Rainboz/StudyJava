package com.zhb.HeadFirst;

public class Drumkit43 {
    boolean topHat = true;
    boolean snare = true;

    static class DrumkTestDrive {
        public static void main(String[] args) {
            Drumkit43 d = new Drumkit43();
            d.snare = false;
            if (d.snare == true) {
                d.playSnare();
            }
            d.playSnare();
            d.playTopHat();
        }
    }

    void playSnare() {
        System.out.println("bang bang ba-bang");
    }

    void playTopHat() {
        System.out.println("ding ding da-ding");
    }
}
