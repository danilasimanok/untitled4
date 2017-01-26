package com.company;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Мария on 25.01.2017.
 */
public class Fight {
    public LinkedList<String>descr=new LinkedList<String>();
    public String ennemyName;
    public int eHp;
    public int eDmg;
    public Fight(String s){
        File f=new File(s);
        try {
            Scanner sc=new Scanner(f);
            this.eHp=sc.nextInt();
            this.eDmg=sc.nextInt();
            //String ns=sc.nextLine();
            this.ennemyName=sc.nextLine();
            while (sc.hasNextLine())this.descr.add(sc.nextLine());
            sc.close();
        }
        catch (Exception e){
            System.out.println(":("+e);
        }
    }
    public void show(){
        System.out.println(this.ennemyName);
        System.out.println("hp="+this.eHp+" dmg="+this.eDmg);
        for(String s:this.descr) System.out.println(s);
    }

    public void fight(Player player,Trans trans) {
        int plDmg=5+trans.plusDmg(player);
        System.out.println(this.ennemyName);
        for(String s:this.descr) System.out.println(s);

    }
}
