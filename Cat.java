package com.Geekbrains;

import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Cat {
    private String name;
    private int appetite;
    private boolean catIsSated;
    Scanner sc = new Scanner(System.in);


    public Cat(String name, int appetite, boolean catIsSated) {
        this.name = name;
        this.appetite = appetite;
        this.catIsSated = catIsSated;
    }


    public void info() {
        System.out.println("У кота " + name + " аппетит " + appetite + ", кот сыт: " + catIsSated);
    }

    public boolean eat(Plate p) {
        if (p.food >= appetite) {
            System.out.println(name + " теперь поел и сыт");
            p.decreaseFood(appetite);
            catIsSated = true;
        }else{
            System.out.println(name + " голодный так как еда закончилась. Сколько добавить еды в тарелку?");
            p.addFoodInPlate(sc.nextInt());
            if(p.food>= appetite){
                System.out.println(name + " поел и сыт");
                p.decreaseFood(appetite);
                catIsSated = true;
            }else {
                System.out.println(name + " голодный");
            }
        }

        return catIsSated;

    }
}
