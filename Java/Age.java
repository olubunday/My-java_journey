import java.util.Scanner;

public class Age {
    public static void main(String[]args){
        int age;
        System.out.println("How old are you?");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();
        if(age < 18){
            System.out.println("You are underage");
        }
        else if(age > 18 && age < 50){
            System.out.println("You are good to go");
        }
        else{
            System.out.println("You are old");
        }
    }
}
