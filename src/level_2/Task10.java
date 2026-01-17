package level_2;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Варить зелье");
            System.out.println("2. Гладить кота");
            System.out.println("3. Выход");
            System.out.print("Ваш выбор: ");
            String st = sc.nextLine();
            switch (st) {
                case "1":
                    System.out.println("Вы варите зелье");
                    break;
                case "2":
                    System.out.println("Вы гладите кота");
                    break;
                case "3":
                    System.out.println();
                    return;
                default:
                    System.out.println("Вы ввели неверное число");
                    break;
            }
        }
    }
}
