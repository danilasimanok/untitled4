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
    public Trans(String s){
        File f=new File(s);
        try {
            Scanner sc=new Scanner(f);
            this.thing=new String[sc.nextInt()];
            String ns=sc.nextLine();
            for(int i=0;i<this.thing.length;i++)this.thing[i]=new String(sc.nextLine());
            sc.close();
        }
        catch (Exception e){

        }
    }
}
