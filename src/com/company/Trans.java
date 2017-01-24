package com.company;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Мария on 22.01.2017.
 */
public class Trans {
    public String[] thing;
    public String translate(int x){
        String s="Нет предметов с таким номером";
        if(x<this.thing.length)s=this.thing[x];
        return s;
    }
    public int translate(String s){
        int result=-1;
        for(int i=0;i<this.thing.length;i++)if(this.thing[i].equals(s))result=i;
        return result;
    }
    public Trans(int x, String s){
        this.thing=new String[x];
        File f=new File(s);
        try {
            Scanner sc=new Scanner(f);
            for(int i=0;i<x;i++)this.thing[i]=new String(sc.nextLine());
            sc.close();
        }
        catch (Exception e){

        }
    }
}
