package com.company;

/**
 * Created by Мария on 22.01.2017.
 */
public class Action {
    String actionMessage,newText,falseMessage,falsenewText;
    int dhp,dinv,nextEvent,provhp,provinv,falseEvent,falsedhp,falsedinv;
    boolean znprovhp,vinv;
    //znprovhp - если истина, то смотрится hp>=provhp, иначе hp<=provhp
    //vinv - если истина, то смотрится, есть ли вещь, иначе смотрится нет ли вещи
    public Action(String actionMessage,String newText,String falseMessage,String falsenewText,int dhp,int dinv,int nextEvent,int provhp,int provinv,int falseEvent,int falsedhp,int falsedinv,boolean znprovhp,boolean vinv){
        this.actionMessage=actionMessage;
        this.falseMessage=falseMessage;
        this.falsenewText=falsenewText;
        this.dhp=dhp;
        this.dinv=dinv;
        this.newText=newText;
        this.nextEvent=nextEvent;
        this.provhp=provhp;
        this.provinv=provinv;
        this.falseEvent=falseEvent;
        this.falsedhp=falsedhp;
        this.falsedinv=falsedinv;
        this.znprovhp=znprovhp;
        this.vinv=vinv;
    }
    public int execute(Player player,MyEvent event){
        System.out.println(this.actionMessage);
        player.hp+=this.dhp;
        if(this.dinv>=0)player.inv[dinv]=!player.inv[this.dinv];
        if(this.newText!="")event.text=this.newText;
        return this.nextEvent;
    }
    public boolean hpprov(int hp){
        boolean gotv;
        if(this.znprovhp)gotv=(hp>=this.provhp);
        else gotv=(hp<=this.provhp);
        return gotv;
    }
    public boolean invprov(boolean[] inv){
        boolean gotov;
        if(this.vinv)gotov=inv[this.provinv];
        else gotov=!inv[this.provinv];
        return  gotov;
    }
}
