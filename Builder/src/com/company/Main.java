package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Margarita mrg = new Margarita();
	Diablo dbl = new Diablo();

	System.out.println("Выберите пиццу (1 или 2)\n" + "1) Маргарита\n" + "2) Диабло");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 1){
            mrg.setDough("бездрожжевое тесто");
            mrg.setSauce("томатный соус");
            mrg.setFilling("сыр Моцарелла, базилик, помидоры");
        }
        if (num == 2){
            dbl.setDough("дрожжевое тесто");
            dbl.setSauce("томатный соус");
            dbl.setSauce("сыр Моцарелла, шампиньоны, чили, паприка");
        }
        if (num != 1 && num != 2){
            System.out.println("Недопустимое значение");
        }

    }
}
