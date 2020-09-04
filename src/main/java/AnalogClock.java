import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        System.out.println("Enter the angle of the hours hand:");
        int angle = scanner.nextInt();
        
        int newAngle = angle % 15;
        newAngle *= 12;
        System.out.println("Minutes angle: " + newAngle);
        // closing the scanner object
        scanner.close();
    }
}