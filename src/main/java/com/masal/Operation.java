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
        switch (Integer.parseInt(String.valueOf(a))) {
            case 1:
                System.out.println("یک");
                break;
            case 2:
                System.out.println("دو");
                break;
            case 3:
                System.out.println("سه");
                break;
            case 4:
                System.out.println("چهار");
                break;
            case 5:
                System.out.println("پنج");
                break;
            case 6:
                System.out.println("شیش");
                break;
            case 7:
                System.out.println("هفت");
                break;
            case 8:
                System.out.println("هشت");
                break;
            case 9:
                System.out.println("نه");
                break;
            case 10:
                System.out.println("ده");
                break;
            case 11:
                System.out.println("یازده");
                break;
            case 12:
                System.out.println("دوازده");
                break;
            case 13:
                System.out.println("سینزده");
                break;
            case 14:
                System.out.println("چهارده");
                break;
            case 15:
                System.out.println("پانزده");
                break;
            case 16:
                System.out.println("شانزده");
                break;
            case 17:
                System.out.println("هفده");
                break;
            case 18:
                System.out.println("هجده");
                break;
            case 19:
                System.out.println("نوزده");
                break;
            case 20:
                System.out.println("بیست");
                break;
        }
        return String.valueOf(a);
    }

    public String bBist(byte a) {

        return null;
    }
}
