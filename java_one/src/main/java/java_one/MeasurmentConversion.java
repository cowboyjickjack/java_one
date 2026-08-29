package java_one;

import java.util.Scanner;

public class MeasurmentConversion {

    double meters;

    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a distance in meters: ");
        int input = scanner.nextInt();

        if (input > 0) {

            while (true) {
                menu();

                int selection = scanner.nextInt();

                switch (selection) {
                case 1:
                    System.out.println(showKilometers(input));
                    break;
                case 2:
                    System.out.println(showInches(input));
                    break;
                case 3:
                    System.out.println(showFeet(input));
                    break;
                case 4: 
                    System.out.println("Quitting Program...");
                    return;
                 }
             }

        } else {
            System.out.println("Invalid Input. Try Again!");   
        }
        scanner.close();
    }

    public static double showKilometers(double meters){
        double kilometers = (meters * 0.001);
        return (kilometers);
        }

    public static double showInches(double meters){
        double inches = (meters * 39.37);
        return (inches);
    }

    public static double showFeet(double meters){
        double feet = (meters * 3.281);
        return (feet);
    }

    public static void menu(){
        
        System.out.println("1. Convert to kilometers");
        System.out.println("2. Convert to inches");
        System.out.println("3. Convert to feet");
        System.out.println("4. Quit the program");
    }
    
}
