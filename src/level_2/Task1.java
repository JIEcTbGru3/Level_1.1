package level_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long hp = sc.nextLong();
        long defense = sc.nextLong();
        if (hp < defense) {
            System.out.println("Орк побежден");
        } else {
            System.out.println("Беги, глупец!");
        }
    }
}


