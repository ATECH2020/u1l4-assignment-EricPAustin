import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Total of desks needed
        int desksNeeded = 0;

        //Reads ints from user
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        /*
         *  your code goes here
         */
        if((number1 % 2) == 0){
          desksNeeded += (number1 /2);
        }
        else {
          desksNeeded += (1 + (number1 / 2));
          }
        if((number2 % 2) == 0) {
          desksNeeded += (number2 /2);
        } 
        else {
          desksNeeded += (1 + (number2 / 2));
        }
        if((number3 % 2) == 0) {
          desksNeeded += (number3 /2);
        }
        else {
          desksNeeded += (1 + (number3 / 2));
        }

      System.out.println(desksNeeded);

        // closing the scanner object
        scanner.close();
    }
}