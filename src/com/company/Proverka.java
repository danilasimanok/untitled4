package com.company;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Мария on 24.01.2017.
 */
public class Proverka {
    int tAction,fAction,provHp,provInv;
    boolean vInv,bolsheHp;
    public Proverka(String s){
        File f=new File(s);
        try {
            Scanner sc=new Scanner(f);
            this.vInv=sc.nextBoolean();
            this.provInv=sc.nextInt();
            this.bolsheHp=sc.nextBoolean();
            this.provHp=sc.nextInt();
            this.tAction=sc.nextInt();
            this.fAction=sc.nextInt();
            sc.close();
        }
        catch (Exception e){

        }
    }
    public void show(){
        System.out.println(this.tAction+" "+this.fAction+" "+this.provHp+" "+this.provInv+" "+this.vInv+" "+this.bolsheHp);
    }
    public int proverka(Player player){
        boolean f;
        if(this.bolsheHp)f=player.hp>=this.provHp;
        else f=player.hp<=this.provHp;
        if(this.vInv)f=f&&player.inv[this.provInv];
        else f=f&&(!player.inv[this.provInv]);
        if(f)return this.tAction;
        else return this.fAction;
    }

    public void doAction(Player player) {

    }
}
