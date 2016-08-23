package com.masal;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


import java.util.Scanner;

/**
 * Created by Yeganeh on 8/21/16.
 */
public class InputReaderNumber {
    public static String inputNumber() {
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        while (StringUtils.isNumeric(a) != true || a.length() >= 8) {
            System.out.println("Number is wrong or biggest or equal 8 character.\nPlease enter a number.");
            a = scanner.nextLine();
        }
        return a;
    }
}
