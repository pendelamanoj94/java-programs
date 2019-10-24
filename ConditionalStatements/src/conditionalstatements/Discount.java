
package conditionalstatements;

import java.io.PrintStream;
import java.util.Scanner;

public class Discount {

    
    public static void main(String[]args){
    System.out.println("enter the price: ");
    Scanner s1=new Scanner(System.in);
    int price=s1.nextInt();
    System.out.println("Enter the quantity: ");
    Scanner s2=new Scanner(System.in);
    int quantity=s2.nextInt();
    float i=price*quantity;
    float j=i-i*10/100;
    float k=i-i*15/100;
    
    
    if (quantity<100)
    {
        
    System.out.println("Discount below 100 quantity is zero: " + i);
        
    }
    else if(quantity>=100 && quantity<=120){
         
     System.out.println("Discount above 100 below 120 quantity is 10% : " + j);   
    }
    else if(quantity>120)
            {
       
        System.out.println("Discount above 100 below 120 quantity is 15% : " + k);
        
    }
     
}
   
   

    
}
