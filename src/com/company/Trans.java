package com.company;

/**
 * Created by Мария on 22.01.2017.
 */
public class Trans {
    static String[] thing=new String[]{"Нулевая ячека инвнтаря. Нужна для работы проверки. Должна быть false","Палка","Бумага"};
    public static String translate(int x){
        String s="Нет предметов с таким номером";
        if(x<Trans.thing.length)s=Trans.thing[x];
        return s;
    }
}
