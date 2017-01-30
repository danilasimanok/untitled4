package com.company;

/**
 * Created by Мария on 26.01.2017.
 */
public class Controller {
    public Story story;
    public Adventures adventures;
    public Trans trans;
    public Player player;
    int next,pl;
    public Controller(String storyName,String adventuresName,String transName,int hp,int kol){
        this.player=new Player(hp,kol);
        this.story=new Story(storyName);
        this.adventures=new Adventures(adventuresName);
        this.trans=new Trans(transName);
    }
    public void start(int nomStartScene){
        int nAct=this.story.story[nomStartScene].listen(this.player,this.trans);
        this.next=this.adventures.actions[nAct].execute(this.player,this.story.story[nomStartScene]);
        System.out.println(this.next);
    }
    public void play(){
        this.pl=this.next;
        int nAct=this.story.story[this.pl].listen(this.player,this.trans);
        this.next=this.adventures.actions[nAct].execute(this.player,this.story.story[pl]);
        System.out.println(this.pl+" "+this.next);
    }
    public boolean endLi(){
        boolean f;
        f=this.player.hp>0;
        if(!f) System.out.println("lol");
        f=f&&(!(this.next==-1));
        return f;
    }
}
