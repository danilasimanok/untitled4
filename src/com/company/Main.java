package com.company;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Controller controller=new Controller("test/story.txt","test/adven.txt","test/trans.txt",30,3);
        for(Scene scene:controller.story.story)scene.show();
        for(Action action:controller.adventures.actions)action.show();
        controller.start(0);
        do {
            controller.play();
        }while (controller.endLi());
    }
}
