import java.util.Scanner;

public class Commission {
    public static void main (String args[]){

        /**********  fixed amount *************
        double amount = 1000,commissionPercentage=15;
        double commission = (commissionPercentage/100)*amount;
        System.out.println("commission amount = " +commission);
        */

        // amount given to scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        double amount= sc.nextDouble();
        System.out.println("Enter the commission percentage: ");
        double commissionPercentage= sc.nextDouble();
        double commission=(commissionPercentage/100)*amount;
        System.out.println("commission amount " +commission);
    }
}
