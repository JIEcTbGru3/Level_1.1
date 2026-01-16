package level_2;

public class Task3 {
    public static void main(String[] args) {
        int temp = 110;
        int time = 13;
        int isClean = 1;

        if (isClean == 0) {
            System.out.println("Зелье испорчено");
        }
        if (isClean == 1) {
            System.out.println("Чистый");
            if (temp > 100 & time < 15) {
                System.out.println("Зелье готово");
            } else {
                if (temp < 100 | time > 15) {
                    System.out.println("Бабах!");
                }
            }
        }
    }
}
