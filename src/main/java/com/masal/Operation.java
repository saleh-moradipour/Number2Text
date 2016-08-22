package com.masal;

/**
 * Created by Yeganeh on 8/21/16.
 */
public class Operation {
    String fff;

    public String op(String a) {
        String str;
        if (Integer.parseInt(a) <= 20) {
            str = zBist(Byte.parseByte(a));
        } else {
            str = bBist((byte) Character.getNumericValue(a.charAt(0)));
            str = str + " و " + zBist((byte) Character.getNumericValue(a.charAt(1)));
        }
        return str;
    }

    public String zBist(byte a) {
        switch (a) {
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
                fff = "شش";
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
        switch (a) {
            case 2:
                fff = "بیست";
                break;
            case 3:
                fff = "سی";
                break;
            case 4:
                fff = "چهل";
                break;
            case 5:
                fff = "پنجاه";
                break;
            case 6:
                fff = "شصت";
                break;
            case 7:
                fff = "هفتاد";
                break;
            case 8:
                fff = "هشتاد";
                break;
            case 9:
                fff = "نود";
                break;
        }
        return fff;
    }
}
