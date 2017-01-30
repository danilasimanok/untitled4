package com.company;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Мария on 24.01.2017.
 */
public class Story {
    public Scene[] story;
    public Story(String s){
        try {
            File f=new File(s);
            Scanner sc=new Scanner(f);
            //sc.useLocale(Locale.);
            sc.nextLine();
            int n = sc.nextInt();
            this.story=new Scene[n];
            sc.nextLine();
            for(int i=0;i<this.story.length;i++)
                this.story[i]=new Scene(sc.nextLine());
            sc.close();
        }
        catch (Exception e){
            System.out.println(s);
            e.printStackTrace();
        }
    }
    public void show(){
        for (Scene scene:this.story)scene.show();
    }
}
