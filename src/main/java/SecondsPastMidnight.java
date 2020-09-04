import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        System.out.println("Enter how many seconds past since midnight:");
        int seconds = scanner.nextInt();
        int hours, minutes;

        //Your code goes here
        hours = 3600;
        minutes = seconds / 60;
        if (hours < 24) {
        System.out.println(hours + " " + minutes);
        } else {
          System.out.println("It is now past midnight of the next day.");
        }
        // closing the scanner object
        scanner.close();
    }
}