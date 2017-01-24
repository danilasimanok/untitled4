package com.company;

import java.util.Scanner;

/**
 * Created by Мария on 22.01.2017.
 */
public class Player {
    public int hp;
    public boolean[] inv;
    public Player(int hp,int kol){
        this.hp=hp;
        this.inv=new boolean[kol];
    }
    public int decide(){
        return new Scanner(System.in).nextInt();
    }
}
