
import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 7) + 1; // Generates a random number between 1 and 7
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Day of the Week Guessing Game!");
        System.out.println("Guess the day of the week corresponding to the given number (1-7):");

        int userGuess = scanner.nextInt();

        String guessedDay;

        switch (userGuess) {
            case 1:
                guessedDay = "Monday";
                break;
            case 2:
                guessedDay = "Tuesday";
                break;
            case 3:
                guessedDay = "Wednesday";
                break;
            case 4:
                guessedDay = "Thursday";
                break;
            case 5:
                guessedDay = "Friday";
                break;
            case 6:
                guessedDay = "Saturday";
                break;
            case 7:
                guessedDay = "Sunday";
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
                scanner.close();
                return;
        }

        String randomDay;

        switch (randomNumber) {
            case 1:
                randomDay = "Monday";
                break;
            case 2:
                randomDay = "Tuesday";
                break;
            case 3:
                randomDay = "Wednesday";
                break;
            case 4:
                randomDay = "Thursday";
                break;
            case 5:
                randomDay = "Friday";
                break;
            case 6:
                randomDay = "Saturday";
                break;
            case 7:
                randomDay = "Sunday";
                break;
            default:
                randomDay = "";
        }

        if (userGuess == randomNumber) {
            System.out.println("Congratulations! You guessed the correct day of the week: " + guessedDay);
        } else {
            System.out.println("Oops! Wrong guess. The correct day of the week was: " + randomDay);
        }

        scanner.close();
    }
}

    
}
