package com.company;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Мария on 24.01.2017.
 */
public class Action {
    LinkedList<String>newText=new LinkedList<>();
    String actionMessage;
    int dinv,dhp,nextScene;
    public Action(String s){
        File f=new File(s);
        try{
            Scanner sc=new Scanner(f);
            this.dinv=sc.nextInt();
            this.dhp=sc.nextInt();
            this.nextScene=sc.nextInt();
            this.actionMessage=sc.nextLine();
            while (sc.hasNextLine())this.newText.add(sc.nextLine());
            sc.close();
        }
        catch (Exception e){
            System.out.println("Туши свет, бросай гранату");
        }
    }
    public void show(){
        System.out.println(this.dinv+" "+this.dhp+" "+this.nextScene);
        System.out.println(this.actionMessage);
        for(String s:this.newText) System.out.println(s);
    }
    public int execute(Player player,Scene scene){
        System.out.println(this.actionMessage);
        player.hp+=this.dhp;
        if(this.dinv>=0)player.inv[this.dinv]=!player.inv[this.dinv];
        if(!this.newText.isEmpty())scene.text=this.newText;
        return this.nextScene;
    }
}
