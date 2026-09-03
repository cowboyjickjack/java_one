package java_one;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {

    public static void main(String[] args){

        int array[] = {1, 2, 3, 4};

        ContainsDuplicate checker = new ContainsDuplicate();

        boolean result = checker.hasDuplicate(array);

        System.out.println(result);
    }
    
    public boolean hasDuplicate(int[] array) {

        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < array.length; i++){

        if (map.containsKey(array[i])) {
            return true;
        } 

        }
        return false;

    }

}
