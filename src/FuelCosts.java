import java.util.Scanner;
public class FuelCosts {
    public void main(String [] args){
        Scanner in = new Scanner(System.in);
        boolean done = false;
        do {
            System.out.println("Enter the number of gallons of gas in tank");
            double numberOfGallons = in.nextDouble();
            System.out.println("Enter the fuel efficiency in miles per gallon");
            double fuelEfficiency = in.nextDouble();
            System.out.println("Enter the price per gallon");
            double priceOfGallon = in.nextDouble();
        }while(!done);
    }
}
