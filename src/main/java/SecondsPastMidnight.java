import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int secs = scanner.nextInt();
        int hours = 0;
        int mins = 0;
        //Your code goes here
        hours = secs / 3600;
        mins = secs / 60;
        System.out.println(hours + " " + mins);
        // closing the scanner object
        scanner.close();
    }
}