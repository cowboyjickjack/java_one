package java_one;
import java.util.Scanner;

public class AverageRainfall {
    
    public static void main(String arg[]){

        System.out.println("How many years would you like to calculate? ");

        Scanner scanner = new Scanner(System.in);
        int yearsInput = scanner.nextInt();
        int totalRainfall = 0;
        int months = 0;

        for (int i = 0; i < yearsInput; i++) {
            for (int j = 0; j < 12; j++){

                while (true) { // good to use bc we don't know how many inputs will be made by user
                    
                    System.out.println("Enter inches of rainfall this month: ");

                    int inches = scanner.nextInt();

                    try {

                        if (inches <= 0) {

                            System.out.println("Error: Input must be greater than 0.");
                            continue;
                            
                        }

                        // adding each input into the running total
                        totalRainfall += inches;

                        months++;

                        break;
                        
                    } catch (Exception e) {
                        System.out.println("Invalid Input. Try Again.");

                        scanner.nextInt();
                    }


                }
            }

            System.out.println("Total Rainfall: " + totalRainfall);
            System.out.println("Average Rainfall: " + (totalRainfall / months));
        }

        scanner.close();

    }

}
