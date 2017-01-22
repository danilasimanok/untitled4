package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s=new Scanner(System.in).nextLine();
        System.out.println(Trans.translate(s));
        System.out.println(Trans.translate(new Scanner(System.in).nextInt()));
    }
}
