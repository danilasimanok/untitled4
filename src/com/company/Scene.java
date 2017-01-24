package com.company;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Мария on 22.01.2017.
 */
public class Scene {
    public LinkedList<String> text=new LinkedList<>();
    public Proverka[] choices;
    public Scene(String s){
        File f=new File(s);
        try{
            Scanner sc=new Scanner(f);
            this.choices=new Proverka[sc.nextInt()];
            for(int i=0;i<this.choices.length;i++)
                this.choices[i]=new Proverka(sc.nextLine());
            while (sc.hasNextLine())this.text.add(sc.nextLine());
            sc.close();
        }
        catch (Exception e){
            System.out.println("YEE");
        }
    }
    public int slushat(Player player){
        int res;
        do {
            res=player.decide();
        }while (res-1>choices.length||res-1<0);
        return res;
    }
    public void peredat(Player player){
        this.choices[this.slushat(player)].doAction(player);
    }
}
