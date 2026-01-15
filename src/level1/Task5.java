package level1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        int i1 = 15;
        int i2 = 4;

        //Каждый ест по 1 пайку в день

        double i3 = (double) i1/i2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько у вас сухпайков? " +i1);
        System.out.println ("Сколько человек в экипаже? " +i2);
        System.out.println("Запасов хватит на "+ i3 +" дней");

    }
}
