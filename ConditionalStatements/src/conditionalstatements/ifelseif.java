/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalstatements;

import java.util.Scanner;


public class ifelseif {
    public static void main(String[]args)
{
    Scanner s= new Scanner(System.in);
        System.out.println("Enter the speed : ");
        int speed=s.nextInt();
        System.out.println("Entered Age is : " + speed);
 
        if(speed<20)
        {
            System.out.println(" You are going too slow ");
        }
        else if(speed<40 && speed>20 )
        {
            System.out.println("You are going on economy speed");
        }
        else if(speed<60 && speed>40)
        {
            System.out.println("You ar e going on 1HR PER.60KM");
        }
        else
            System.out.println("You are going to face Problem");
}
    
}
