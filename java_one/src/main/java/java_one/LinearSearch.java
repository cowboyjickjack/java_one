package java_one;

public class LinearSearch {
    
    // linear search = search through collection one element at a time
    //          run time complexity: O(n)
    //          
    //          Disadvantages:
    //          Slow for large data sets
    //          
    //          Advantages:
    //          Fast for searches of small to medium data sets
    //          Does NOT need to be sorted
    //          Useful for data structures that do not have random access (Linked List)

    public static void main(String[] arg){

        int[] array = {1, 2, 8, 4, 6};

        int index = linearSearch(array, 4);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Elemeent not found");
        }

    }

    public static int linearSearch(int[] array, int value){

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            } 
        }

        return -1;
    }

}
