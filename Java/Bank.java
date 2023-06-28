import java.util.Scanner;

public class Bank {
    public static void main(String[]args){
        // Class properties
        int response;
        String firstName;
        String lastName;
        double acctBal = 0.00;
        double deposit;
        double withdrawal;
        Boolean accStatus = false;
        Boolean exit;

        Scanner input = new Scanner(System.in);

        System.out.println("Hello. Welcome!");
        System.out.println("How can I help you today?");
        System.out.println("Press '1' to Open an Account");
        System.out.println("Press '2' for Deposit");
        System.out.println("Press '3' for Withdrawal");
        System.out.println("Press '4' for Account Balance");
        System.out.println("Press '5' for Exit");
       
        response = input.nextInt();
        
        if (response == 1 || response == 2 || response == 3 || response == 4){
            if (response == 1){
                System.out.println("Enter your first name: ");
                firstName = input.next();
    
                System.out.println("Enter your last name: ");
                lastName = input.next();
                System.out.printf("Congratulations %s %s", firstName, lastName);
            }

            else if(response == 2){
                System.out.println("How much is your deposit?");
                deposit = input.nextDouble();
                acctBal = acctBal + deposit;
                System.out.println("Transaction Successful!");
                System.out.printf("Your Account Balance is now %f", acctBal);
            }

            else if(response == 3){
                System.out.println("Enter withdrawal amount?");
                withdrawal = input.nextDouble();
                if (withdrawal > acctBal){
                    System.out.println("Insufficient Balance!");
                }
                else{
                    System.out.println("Transaction Successful!");
                    acctBal = acctBal - withdrawal;
                    System.out.printf("Your Account Balance is now %f", acctBal);
                }
            }
            
            else if (response == 4){
                if(accStatus == true){
                    System.out.printf("Your Account Balance is now %f", acctBal);
                }
                else{
                    System.out.println("You have no account with us!");
                }
            }

            else {
                System.out.println("Invalid response. Try again");
            }
            
            System.out.println("Hello. Welcome!");
            System.out.println("How can I help you today?");
            System.out.println("Press '1' to Open an Account");
            System.out.println("Press '2' for Deposit");
            System.out.println("Press '3' for Withdrawal");
            System.out.println("Press '4' for Account Balance");
       
            response = input.nextInt();
        }
        else{
            exit = true;
        }

    }
    
}