import java.util.Scanner;

class Workout {
    String type;
    int duration;
    void showWorkout(){
        System.out.println("Workout: " + type
                + "\nDuration: " + duration);
    }
}

class RunningWorkout extends Workout {
    double distance;

    void showDetails(){
        showWorkout();
        System.out.println("Distance: " + distance);
        double calories = distance * 60;
        System.out.println("Calories Burned: " + calories);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        RunningWorkout d = new RunningWorkout();

        System.out.println("Enter workout type: ");
        d.type = input.nextLine();
        System.out.println("Enter duration (minutes): ");
        d.duration = input.nextInt();
        System.out.println("Enter distance (km): ");
        d.distance = input.nextDouble();

        d.showDetails();
    }
}