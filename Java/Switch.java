import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        int day = (int) (1 + (Math.random() * 7)); // To generate a random number between 1 and 7
        
        // To receive a user input
        System.out.println("Guess what day it is: ");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        /*
            Switch statement in which each case stands for each day of the week.
            That is, 1 for Monday, 2 for Tuesday and so on.
            The default catches any user entry that is not between 1 and 7.
         */
        switch(guess){
            case 1:
                if(guess == day){
                    System.out.println("Correct! Day is Sunday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            case 2:
                if(guess == day){
                    System.out.println("Correct! Day is Monday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            case 3:
                if(guess == day){
                    System.out.println("Correct! Day is Tuesday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            case 4:
                if(guess == day){
                    System.out.println("Correct! Day is Wednesday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            case 5:
                if(guess == day){
                    System.out.println("Correct! Day is Thursday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            case 6:
                if(guess == day){
                    System.out.println("Correct! Day is Friday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            case 7:
                if(guess == day){
                    System.out.println("Correct! Day is Sunday.");
                }
                else{
                    System.out.printf("Oops! Incorrect guess. Day is %d.", day);
                }
                break;
            default:
                System.out.println("Invalid Entry. Please enter a number between 1 and 7");
        }
    }
}