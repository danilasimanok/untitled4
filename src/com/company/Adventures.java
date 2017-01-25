package com.company;

import java.io.File;
import java.util.Scanner;

/**
 * Created by Мария on 24.01.2017.
 */
public class Adventures {
    public Action[] actions;
    public Adventures(String fileName){
        File f=new File(fileName);
        try {
            Scanner sc=new Scanner(f);
            this.actions=new Action[sc.nextInt()];
            String s=sc.nextLine();
            for (int i=0;i<this.actions.length;i++)
                this.actions[i]=new Action(sc.nextLine());
            sc.close();
        }
        catch (Exception e){
            System.out.println("error");
        }
    }
}
