package com.masal;

/**
 * Created by Yeganeh on 8/21/16.
 */
public class Operation {
    public int op(String a) {
        if (Integer.parseInt(a) <= 20) {
            String str = zBist(Byte.parseByte(a));
            return Integer.parseInt(str);
        }
        return 0;
    }


    public String zBist(byte a) {
        String fff = null;
        switch (Integer.parseInt(String.valueOf(a))) {
            case 1:
                fff = "یک";
                break;
            case 2:
                fff = "دو";
                break;
            case 3:
                fff = "سه";
                break;
            case 4:
                fff = "چهار";
                break;
            case 5:
                fff = "پنج";
                break;
            case 6:
                fff = "شیش";
                break;
            case 7:
                fff = "هفت";
                break;
            case 8:
                fff = "هشت";
                break;
            case 9:
                fff = "نه";
                break;
            case 10:
                fff = "ده";
                break;
            case 11:
                fff = "یازده";
                break;
            case 12:
                fff = "دوازده";
                break;
            case 13:
                fff = "سینزده";
                break;
            case 14:
                fff = "چهارده";
                break;
            case 15:
                fff = "پانزده";
                break;
            case 16:
                fff = "شانزده";
                break;
            case 17:
                fff = "هفده";
                break;
            case 18:
                fff = "هجده";
                break;
            case 19:
                fff = "نوزده";
                break;
            case 20:
                fff = "بیست";
                break;
        }
        return fff;
    }

    public String bBist(byte a) {

        return null;
    }
}
