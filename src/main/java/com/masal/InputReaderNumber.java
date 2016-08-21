package com.masal;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;


import java.util.Scanner;

/**
 * Created by Yeganeh on 8/21/16.
 */
public class InputReaderNumber extends ActionSupport {
    public static String inputNumber() {
        String a;
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextLine();
        while (StringUtils.isNumeric(a) != true) {
            System.out.println("Number is wrong, please enter number");
            a = scanner.nextLine();
        }
        return a;
    }
}
