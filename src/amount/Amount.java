package amount;

import java.text.NumberFormat;
import java.math.*;
import java.util.*;

// compound interest
public class Amount {
    
    public static void main(String[] args) {
       
       // main amount initial  
       BigDecimal principal = BigDecimal.valueOf(1000); // Determination of investment
       BigDecimal rate = BigDecimal.valueOf(0.05); // Dtermination of rate
       
        // Title
       System.out.printf("%s%25s%n", "Year", "Amount on deposit");
        
        // Method "for", Instrution of loop
       for (int year = 1; year <= 20; ++year) {
            
            // compound interest formula with BigDecimal
            BigDecimal amount = 
              principal.multiply(rate.add(BigDecimal.ONE).pow(year));
        
        // display the amount
        System.out.printf("  %02d%25s%n", year, 
             NumberFormat.getCurrencyInstance(Locale.US).format(amount));
        }
    }
} // End of class Amount
