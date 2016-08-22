package com.masal;

/**
 * Created by Yeganeh on 8/21/16.
 */
public class Main {
    public static void main(String[] args) {
        String a;
        Operation operation = new Operation();
        System.out.println("***Enter Number***");
        a = InputReaderNumber.inputNumber();
        System.out.println(operation.op(a));

    }
}

