package level_2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        switch (s) {
            case "Огонь":
                System.out.println("Fireball damage: 100");
                break;
            case "Вода":
                System.out.println("Healing: 50");
                break;
            case "Воздух":
                System.out.println("Invisibility ON");
                break;
            default:
                System.out.println("Заклинание не сработало, вы превратились в жабу");
        }
    }
}
