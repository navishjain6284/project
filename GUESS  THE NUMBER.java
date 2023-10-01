// Guess The Number...

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            int num = random.nextInt(100) + 1;
            int chances = 7;

            System.out.println("guess the random number between 1 to 100,in 7 chances");

            for (int TRY = 1; TRY <= chances; TRY++) {
                System.out.print("try. " + TRY + "\n");
                int guess = scanner.nextInt();

                if (guess == num) {
                    System.out.println("....you won the game..congrats...the random no is.." + num);
                    break;
                } else if (guess < num) {
                    System.out.println("Try again! The number is larger.");
                } else {
                    System.out.println("Try again! The number is smaller.");
                }

                if (TRY == chances) {
                    System.out.println("Sorry, you're out of chances. The correct number was: " + num);
                }
            }

            scanner.close();
        }
    }
}
