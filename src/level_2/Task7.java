package level_2;

public class Task7 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                continue;
            } else {
                System.out.println("Берем мешок № " + i);
                System.out.println(" Фу, гадость!");
            }
        }
    }
}

