package level_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

                System.out.print("Введите урон: ");
                int baseDamage = scanner.nextInt();
                System.out.print("Введите бафф: ");
                int buff = scanner.nextInt();
                int summa = calculateDamage(baseDamage, buff);
                System.out.println("Итоговый урон: " + summa);
            }
            public static int calculateDamage(int baseDamage, int buff) {
                return baseDamage + buff;
            }
        }