import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double lumbCost = 8;
        double winCost = 11;
        double tax, total;
        int numBoards, numWindows;
        
       System.out.println("Enter the sales tax rate: ");
       tax = input.nextDouble();
       System.out.println("How many boards do you need? ");
       numBoards = input.nextInt();
       System.out.println(" How many windows do you need? ");
       numWindows = input.nextInt();

       Construction test = new Construction(lumbCost, winCost, tax); 
       
       total = test.lumberCost(numBoards) + test.windowCost(numWindows);
       System.out.println("Total: " + total);
      
       System.out.println("Grand Total: " + test.grandTotal(total));
    }
}
