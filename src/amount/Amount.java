package amount;

// compound interest
public class Amount {
    
    public static void main(String[] args) {
        
        double amount; // Determination of amount
        double principal = 10000.00; // Determination of investment
        double rate = 0.05; // Dtermination of rate
        
        // Title
        System.out.printf("%s%25s %n","Year", "Amount on deposit");
        
        // Method "for", Instrution of loop
        for (int year = 1; year <= 20; ++year) {
            
            // compound interest formula
            amount = principal * Math.pow(1.0 + rate, year);
        
        // display the amount
        System.out.printf("%4d%,25.2f%n", year, amount);
        }
    }
}