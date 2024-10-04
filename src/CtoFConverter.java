import java.util.Scanner;
public class CtoFConverter {
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Input the temperature in Celsius(C)");
        double tempInC = in.nextDouble();
        double tempInF = 0.00;
        tempInF = (tempInC*(9/5)) + 32;
        System.out.println(tempInC + " is "+ tempInF +"in Fahrenheit");
    }
}
