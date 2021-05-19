import java.util.*;
public class StockMain {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("First stock's symbol: ");
        String symbol1 = console.next();
        Stock stock1 = new Stock(symbol1);
        double profit1 = makePurchases(stock1, console);
        
        System.out.print("Second stock's symbol: ");
        String symbol2 = console.next();
        Stock stock2 = new Stock(symbol2);
        double profit2 = makePurchases(stock2, console);
        
        if (profit1 > profit2) {
            System.out.println(symbol1 + " was more " + "profitable than " + symbol2 + ".");
            
        } else if (profit2 > profit1) {
            System.out.println(symbol2 + " was more " + "profitable than " + symbol1 + ".");
        } else { // profit1 == profit2   
            System.out.println(symbol1 + " and " + symbol2 + " are equally profitable.");
        }
    }
    
    public static double makePurchases(Stock currentStock, Scanner console) {
        System.out.print("How many purchases did you make? ");
        int numPurchases = console.nextInt();
        
        for(int i = 1; i <= numPurchases; i++) {
            System.out.print(i + ": How many shares, at what price per share? ");
            int numShares = console.nextInt();
            double pricePerShare = console.nextDouble();
            currentStock.purchase(numShares, pricePerShare);
        }
        System.out.print("What is today's price per share? ");
        double currentPrice = console.nextDouble();
        double profit = currentStock.getProfit(currentPrice);
        System.out.println("Net profit/loss: $" + profit);
        System.out.println();
        return profit;
    }
}