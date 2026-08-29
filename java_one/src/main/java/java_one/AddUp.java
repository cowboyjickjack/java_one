package java_one;

public class AddUp {
    
    public static int addUp(int n){

        int sum = n * (n + 1) / 2;

        return sum;

        // int sum = 0;

        // for(int i = 0; i <= n; i++){

        //     sum += i;
        //     System.out.println(sum);
            
        // }
        // return sum;

    }



public static void main(String[] arg){

    System.out.println(addUp(4));

}

}