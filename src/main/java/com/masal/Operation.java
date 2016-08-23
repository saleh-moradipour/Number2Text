package com.masal;

/**
 * Created by Yeganeh on 8/21/16.
 */
public class Operation {
    String fff;

    public String op(String a) {
        String str = null;
        if (Integer.parseInt(a) <= 20) {
            str = zBist(Byte.parseByte(a));
        } else if (Integer.parseInt(a) > 20 && Integer.parseInt(a) < 100) {
            str = bBist((byte) Character.getNumericValue(a.charAt(0)));
            str = str + " و " + zBist((byte) Character.getNumericValue(a.charAt(1)));
        } else if (Integer.parseInt(a) >= 100 && Integer.parseInt(a) < 1000) {
            str = sadgan((byte) Character.getNumericValue(a.charAt(0)));
            str = str + " و " + bBist((byte) Character.getNumericValue(a.charAt(1)));
            str = str + " و " + zBist((byte) Character.getNumericValue(a.charAt(2)));
        } else if (Integer.parseInt(a) >= 1000 && Integer.parseInt(a) < 10000) {
            str = zBist((byte) Character.getNumericValue(a.charAt(0)));
            str = str + "و" + "هزار" + sadgan((byte) Character.getNumericValue(a.charAt(1)));
            str = str + " و " + bBist((byte) Character.getNumericValue(a.charAt(2)));
            str = str + " و " + zBist((byte) Character.getNumericValue(a.charAt(3)));
        } else if (Integer.parseInt(a) >= 10000 && Integer.parseInt(a) < 100000) {
            str = zBist((byte) (Integer.parseInt(a.substring(0, 2))));
            str = str + " هزار " + " و " + sadgan((byte) Character.getNumericValue(a.charAt(2)));
            str = str + " و " + bBist((byte) Character.getNumericValue(a.charAt(3)));
            str = str + " و " + zBist((byte) Character.getNumericValue(a.charAt(4)));
        }
        return str;
    }

    public String zBist(byte a) {
        switch (a) {
            case 0:
                fff = "";
                break;
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
            case 0:
                fff = "";
                break;
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

    public String sadgan(byte a) {
        switch (a) {
            case 0:
                fff = "";
                break;
            case 1:
                fff = "صد";
                break;
            case 2:
                fff = "دویست";
                break;
            case 3:
                fff = "سیصد";
                break;
            case 4:
                fff = "چهارصد";
                break;
            case 5:
                fff = "پانصد";
                break;
            case 6:
                fff = "ششصد";
                break;
            case 7:
                fff = "هفتصد";
                break;
            case 8:
                fff = "هشتصد";
                break;
            case 9:
                fff = "نهصد";
                break;

        }
        return fff;
    }


}
