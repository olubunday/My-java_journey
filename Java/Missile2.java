import java.util.Scanner;

public class Missile2 {

    // A class that converts a "yes" and "no" into a boolean variable.
    // This class enable the "convertToBoolean" method to be used in the code below.
    public static boolean convertToBoolean(String input) {
        if (input.equalsIgnoreCase("yes")) {
            return true;
        } else if (input.equalsIgnoreCase("no")) {
            return false;
        } else {
            throw new IllegalArgumentException("Invalid input. Expected 'yes' or 'no'.");
        }
    }

    // Main program starts from here
    public static void main(String[] args){
    
        String onCourse;
        String onTarget;
        String onTrack;
        boolean exit = false;

        // Message displayed when missile is launched
        System.out.println("Launching missile in 1, 2, 3...");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("Missile launched!!!");
        System.out.println("Is missile on course?");
        Scanner input = new Scanner(System.in);
        onCourse = input.nextLine();
        boolean onCourseBoolean = convertToBoolean(onCourse);
        
        // A while loop that does some some sets on target depending on whether it is yes or no.
        while(!exit){
            if(onCourseBoolean){
                System.out.println("Missile on course!");
                System.out.println("Is target locked in?");
                onTarget = input.nextLine();
                boolean targetReached = convertToBoolean(onTarget);
                if(targetReached){
                    System.out.println("Target locked in...");
                    System.out.println("Blowing up target...");
                    System.out.println("Target blown!!!");
                    exit = true;
                }
                else{
                    System.out.println("Stay on course");
                }
            }

            else{
                System.out.println("Get back on track");
                

                // A nested while loop to handle when the missile is not on track
                while(true){
                    System.out.println("Back on track?");
                    onTrack = input.nextLine();
                    boolean onTrackBoolean = convertToBoolean(onTrack);
                    if (onTrackBoolean){
                        System.out.println("Missile now on track");
                        System.out.println("Is missile now on target");
                        onTarget = input.nextLine();
                        boolean targetReached = convertToBoolean(onTarget);


                        if(targetReached){
                            System.out.println("Target locked in...");
                            System.out.println("Blowing up target!!!");
                            exit = true;
                            break;
                        }
                    }
                    else{
                        System.out.println("Blowing up missile..");
                        System.out.println("Missile destroyed!!!!");
                        exit = true;
                        break;
                    }

                }
                
            }
        }
    
    }     
}      