import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Keeps total hours, minutes, seconds, and time
        int totalHours, totalMinutes, totalSeconds, time;
        
        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
        totalHours = hours2 - hours1;
        totalMinutes = minutes2 - minutes1;
        totalSeconds = seconds2 - seconds1;
        time = ((totalHours * 60) * 60);
        time += totalMinutes * 60;
        time += totalSeconds;

        System.out.println(time);

        // closing the scanner object
        scanner.close();
    }
}