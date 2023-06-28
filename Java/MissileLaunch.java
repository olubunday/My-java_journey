import java.util.Scanner;

public class MissileLaunch {
    public static boolean convertToBoolean(String input) {
        if (input.equalsIgnoreCase("yes")) {
            return true;
        } else if (input.equalsIgnoreCase("no")) {
            return false;
        } else {
            throw new IllegalArgumentException("Invalid input. Expected 'yes' or 'no'.");
        }
    }


    public static void main(String[] args){
    
        String onCourse;
        String onTarget;
        String onTrack;

        System.out.println("Launching missile in 1, 2, 3...");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Missile launched!!!");
        System.out.println("Is missile on course?");
        Scanner input = new Scanner(System.in);
        onCourse = input.nextLine();
        boolean onCourseBoolean = convertToBoolean(onCourse);
        
        if(onCourseBoolean){
            System.out.println("Missile on course!");
            System.out.println("Is target locked in?");
            onTarget = input.nextLine();
            boolean targetReached = convertToBoolean(onTarget);
            if(targetReached){
                System.out.println("Target locked in...");
                System.out.println("Blowing up target...");
                System.out.println("Target blown!!!");
            }
            else{
                System.out.println("Stay on course");
            }
        }
        else{
            System.out.println("Get back on track");
            System.out.println("Back on track?");
            onTrack = input.nextLine();
            boolean onTrackBoolean = convertToBoolean(onTrack);
            if(!onTrackBoolean){
                System.out.println("Blowing up missile...");
                System.out.println("Missile destroyed!");
            }
        }
        
    }
}
