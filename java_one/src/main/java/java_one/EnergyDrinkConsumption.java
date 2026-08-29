package java_one;

public class EnergyDrinkConsumption {
    
    public static void main(String arg[]){
        
        int totalCustomers = 12467;

        System.out.println("Customers that buy one or more per week: " + (Math.round(totalCustomers * .14)));
        System.out.println("CUstomers that prefer citrus flavor: " + (Math.round(totalCustomers * .64)));

    }

}
