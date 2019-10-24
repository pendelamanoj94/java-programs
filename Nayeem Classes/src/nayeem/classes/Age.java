
package nayeem.classes;

import java.util.Scanner;

public class Age {
    public static void main(String args[]){
        System.out.println("Enter Your Age:");
        Scanner A=new Scanner(System.in);
        int Age=A.nextInt();
        if(Age>=18){
            System.out.println("You are eligible to vote: You are '"+Age+"' years old.");
        }else{
            System.out.println("You are Not eligible to vote: Your are '"+Age+"' years old.");
        }
    }
}
