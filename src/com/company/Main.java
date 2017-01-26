package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String s1=new Scanner(System.in).nextLine();
        String s2=new Scanner(System.in).nextLine();
        String s3=new Scanner(System.in).nextLine();
        Controller controller=new Controller(s1,s2,s3,30,2);
        controller.start(0);
        do {
            controller.play();
        }while (controller.endLi());
    }
}
