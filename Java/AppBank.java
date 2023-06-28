import java.util.Scanner;

public class AppBank {
    public static void main(String[]args){
        // Class properties
        int response;
        String firstName;
        String lastName;
        double acctBal = 0.00;
        double deposit;
        double withdrawal;
        Boolean accStatus = true;
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
        //Landing Page
            System.out.println("Hello. Welcome!");
            System.out.println("How can i help you today?");
            System.out.println("Press '1' to Open an Account");
            System.out.println("Press '2' for Deposit");
            System.out.println("Press '3' for Withdrawal");
            System.out.println("Press '4' for Account Balance");
            System.out.println("Press '5' for Exit");
        
            response = input.nextInt();

            // If response is "1" - Open Account
            if (response == 1){
                System.out.println("Enter your first name:");
                firstName = input.next();

                System.out.println("Enter your last name:");
                lastName = input.next();
                System.out.printf("Congratulations %s %s\n", firstName, lastName);
            }

            // If response is "2" - Deposit
            else if(response == 2){
                System.out.println("How much is your deposit?");
                deposit = input.nextDouble();
                acctBal = acctBal + deposit;
                System.out.println("Transaction Successful!");
                System.out.printf("Your Account Balance is now %f\n", acctBal);
            }

            // If response is "3" - Withdrawal
            else if(response == 3){
                System.out.println("Enter withdrawal amount?");
                withdrawal = input.nextDouble();
                if (withdrawal > acctBal){
                    System.out.println("Insufficient Balance!\n");
                }
                else{
                    System.out.println("Transaction Successful!");
                    acctBal = acctBal - withdrawal;
                    System.out.printf("Your Account Balance is now %f\n", acctBal);
                }
            }
            // If response is "4" - Account Balance
            else if (response == 4){
                if(accStatus == true){
                    System.out.printf("Your Account Balance is now %f\n", acctBal);
                }
                else{
                    System.out.println("You have no account with us!\n");
                }
            }
            
            // To exit the program
            else if(response == 5){
                System.out.println("Exiting the program...");
                exit = true;
            }
            else{
                System.out.println("Invalid response. Try again!\n");
            }
        }
    }
}
