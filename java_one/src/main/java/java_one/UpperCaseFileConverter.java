package java_one;
import java.io.*;

public class UpperCaseFileConverter {
    
    public static void main(String arg[]){

        try {

        // read file
        FileReader input = new FileReader("/Users/gabriellamartinez/Desktop/Java/java_one/java_one/src/main/java/java_one/Input.txt");

        BufferedReader reader = new BufferedReader(input);

        FileWriter writer = new FileWriter("/Users/gabriellamartinez/Desktop/Java/java_one/java_one/src/main/java/java_one/Output.txt");

        // ensures that after readLine, it doesn't throw it away
        String line; 

        while ((line = (reader.readLine())) != null) {
            System.out.println(line);

            writer.write(line.toUpperCase());
            writer.close();
        }
            
        } catch (IOException e) {
            System.out.println("Error: No Dice");
            e.printStackTrace();
        }

    }

}
