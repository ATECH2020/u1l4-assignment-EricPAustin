import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int angle = scanner.nextInt();
        
        int newAngle = angle % 15;
        newAngle *= 12;
        System.out.println(newAngle);
        // closing the scanner object
        scanner.close();
    }
}