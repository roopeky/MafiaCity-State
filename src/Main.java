import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LevelState levelState = new LevelState();
        System.out.println("Steal 3 times to upgrade your character!");

        while (true) {
            System.out.println("Press 1 to steal");
            int input = scanner.nextInt();
            if (input == 1) {
                levelState.steal();
            }
        }
    }
}