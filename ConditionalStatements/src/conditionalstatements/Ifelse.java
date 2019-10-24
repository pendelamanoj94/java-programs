
package conditionalstatements;

import java.util.Scanner;


public class Ifelse {
    public static void main(String[]args)
{
    Scanner s= new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age=s.nextInt();
        System.out.println("Entered Age is : " + age);
 
        if(age>=18)
        {
            System.out.println(" You are 18 years old. ");
        }else
        {
            System.out.println("Your Age is less than 18");
        }
}
}
