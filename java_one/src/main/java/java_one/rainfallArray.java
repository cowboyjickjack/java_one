package java_one;

import java.util.Arrays;
import java.util.Scanner;

public class RainfallArray {

    double amount;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        double[] array = new double[12];
        int i = 0;

        while(i < 12){

            System.out.println("Input amount of rainfall in inches: ");
            array[i] = scanner.nextDouble();
            i = (i + 1);

        }

        System.out.println(Arrays.toString(array));
        System.out.println("Total Rainfall: " + totalRainfall(array) + " inches");
        System.out.println("The month with the most rain was month: " + mostRain(array));
        System.out.println("The month with the least rainfall: " + leastRain(array));
        System.out.println("Average monthly rainfall: " + avgMonthlyRainfall(array));

        scanner.close();
    }

    public static double totalRainfall(double array[]){

        double sum = 0;
        for(double num : array){ // enhanced for-loop -> for (int i = 0; i < arr.length; i++) 
            sum += num;
        }

        return sum;

    }

    public static double avgMonthlyRainfall(double array[]){
        
        return totalRainfall(array) / array.length;
        
    }

    public static double mostRain(double array[]){

        double max = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    public static double leastRain(double array[]){

        double min = array[0];
        for(int i = 1; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}
