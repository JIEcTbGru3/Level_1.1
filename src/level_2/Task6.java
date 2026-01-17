package level_2;

public class Task6 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Проверяем сундук № "+i);
            if (i == 5) {
                System.out.println("Камень найден!");
                break;
            }
        }
    }
}
