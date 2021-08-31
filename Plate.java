package com.Geekbrains;

public class Plate {
   int food;
   int increaseFood;
   private boolean fullPlate;

    public Plate(int food, int increaseFood) {
        this.food = food;
        this.increaseFood = increaseFood;
    }

    public void decreaseFood (int n){
        food -= n;
    }

    public void plateInfo() {
        System.out.println("plate: " + food);
    }

    public void addFoodInPlate(int increaseFood){
        food += increaseFood;
        System.out.println("Добавилив миску " + increaseFood + " еды");
    }


}
