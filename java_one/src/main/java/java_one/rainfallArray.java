package java_one;

import java.util.Arrays;
import java.util.Scanner;

public class rainfallArray {

    double amount;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double array[] = new double[12];
        int i = 0;

        while(i < 12){

            System.out.println("Input amount of rainfall in inches: ");
            array[i] = scanner.nextDouble();
            i = (i + 1);

        }

        System.out.println(Arrays.toString(array));
        System.out.println(totalRainfall(array));

    }

    public static double totalRainfall(double array[]){

        double sum = 0;
        for(double num : array){ // enhanced for-loop -> for (int i = 0; i < arr.length; i++) 
            sum += num;
        }

        return sum;

    }

    public void avgMonthlyRainfall(){

    }

    public void mostRain(){

    }

    public void leastRain(){

    }

}
