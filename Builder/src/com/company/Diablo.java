package com.company;

public class Diablo implements Pizza {
    @Override
    public void setDough(String dough) {
        System.out.println("Ингредиенты:\n" + dough);
    }

    @Override
    public void setSauce(String sauce) {
        System.out.println(sauce);
    }

    @Override
    public void setFilling(String filling) {
        System.out.println(filling);
    }
}
