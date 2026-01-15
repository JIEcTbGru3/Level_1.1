package level1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Сколько у вас сухпайков?");
        int i1 = sc.nextInt();

        System.out.println ("Сколько человек в экипаже?");
        int i2 = sc.nextInt();

        //Каждый ест по 1 пайку в день

        int i3 = i1/i2;
        System.out.println("Запасов хватит на "+ i3 +" дней");




    }
}
