import java.util.Scanner;

public class Login {
    public static void main(String[]args){
       
        Scanner input = new Scanner(System.in);
        String login;
        String password;

        System.out.println("Welcome!");
        System.out.println("Who's there?");
        login = input.nextLine();

        if(login.equalsIgnoreCase("Admin")){
            System.out.println("Enter your password");
            password = input.next();
                if(password.equalsIgnoreCase("Cancel")){
                    System.out.println("Cancelled!");
                }
                else if(password.equals("TheMaster")){
                    System.out.println("Welcome!");
                }
                else{
                    System.out.println("Wrong password");
                    System.out.println("Try again.");
                }
        }

        else if(login.equals("cancel")){
            System.out.println("Canceled!");
        }

        else {
            System.out.println("I don't know you");
        }
    }    
}