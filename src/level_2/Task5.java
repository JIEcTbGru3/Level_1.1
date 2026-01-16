package level_2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int secret = 1234;
        int password;
        do {
            System.out.println("Введите пароль: ");
            password = sc.nextInt();
        } while(password != secret);
        System.out.println("Дверь открыта!");
    }
}





