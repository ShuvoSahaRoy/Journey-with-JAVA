
package javaapplication1;
import java.util.*;
public class InvoiceTest {
    public static void main(String[] args) { 
        invoice ob = new invoice();

 Scanner input = new Scanner (System.in);
        
        String item;
        String description;
        int quantity;
        double price;
        
        System.out.print ("Enter Number: ");
        item = input.nextLine();
        ob.setPartNumber(item);
        
        System.out.print ("Enter Description of Item Purchased: ");
        description = input.nextLine();
        ob.setPartDescription(description);
        
        System.out.print ("Enter The Quantity of Item Purchased: ");
        quantity = input.nextInt();
if (quantity > 0)
        ob.setQuantityOfItemPurchased(quantity);
        
        System.out.println("Enter The Price Per Item: ");
        price = input.nextDouble();
 if (price > 0)
        ob.setPricePerItem (price);
        
        System.out.printf ("The Total Amount for all items purchased = $%.2f\n",
                ob.getInvoiceAmount());

    }
    
}
