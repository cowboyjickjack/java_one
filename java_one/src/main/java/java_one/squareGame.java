package java_one;

import java.util.Arrays;
import java.util.Scanner;

/* 
first input: num of test cases
second input (4): size of stick

add them up; do they equal a square?
ex: 
7       = N
1 2 3 4 = N
1 1 1 1 = Y
2 2 2 2 = Y
1 2 1 2 = N
1 1 5 5 = N
5 5 5 5 = Y
4 10 5 9 = N */

public class squareGame {

    public static void main(String[] args){

        String[] results = new String[4];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 numbers to see if they can make a square: ");

        for (int testCases = 0; testCases < 4; testCases++) { // test cases = i

            String line = scanner.nextLine();
            String[] inputs = line.trim().split("\\s+");

            if (inputs.length != 4) {
                results[testCases] = "NO";
                continue;
            }

            int[] arr = new int[4];

            for (int i = 0; i < 4; i++) {
                arr[i] = Integer.parseInt(inputs[i]);
            }

            // actual check for same size
            if (arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3]) {
                results[testCases] = "YES";
            } else {
                results[testCases] = "NO";
            }

        }

         // since it's stored in an array, we have to loop through to display
        for (int j = 0; j < results.length; j++) {
            System.out.println(results[j]);    
        }

        scanner.close();

    }

}
