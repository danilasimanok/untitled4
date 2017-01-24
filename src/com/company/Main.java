package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Adventures adventures=new Adventures("g://files//item.txt");
        adventures.actions[0].show();
        System.out.println(adventures.actions.length);
        adventures.actions[2].show();

    }
}
