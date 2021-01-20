
package discountcheck;

import java.util.Scanner;

/**
 *
 * @author tgome
 * 
 */
public class DiscountCheck {

    /**
     * @param args The discount rate is 10% for the quantity purchased between 100 and 120 units,
     * and 15% for the quantity purchased
     * If the quantity purchased is less than 100%, there is no discount rate.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Enter the price of a single unit");
        int price = input.nextInt(); //get the price from the user
        
        System.out.println("Enter the quantity of itens you want to purchase: ");
        int quantity =input.nextInt();//get the quantity from the user
        
        float discountAmount =0f; //Variables to store discountAmount, revenue and discountRate
        float revenue = 0f;          
        float discountRate = 0f;
        
        if(quantity < 100){
            
            revenue = quantity * price; //dont apply any discount, will process the full price
            
        }
        else if(quantity >=100 && quantity <120){ //Apply 10% of discount base on the quantity between 100 and 120
            discountRate = (float)10/100; //sets the discount rate (10%)
            revenue = quantity * price; //the full price
            discountAmount = revenue * discountRate; //gets the discount amount from the revenue
            revenue -= discountAmount; //apply the discount amount to the final revenue
        }
        else if(quantity >120){//Apply 20% of discount based on the quantity when above 120 products.
            discountRate = (float)15/100;
            revenue = quantity * price;
            discountAmount = revenue * discountRate;
            revenue -= discountAmount;
        }else{
            System.out.println("Please enter the correct quantity."); //If the input quantity is not right.
        }
        
        System.out.println("Revenue: " +revenue+ "$");//display the final revenue
        System.out.println("Discount: " +discountAmount+"$ ("+discountRate+"%"); //displays the discount 
     
    }
    
}
