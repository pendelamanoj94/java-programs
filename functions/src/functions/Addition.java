
package functions;

import java.util.Scanner;


public class Addition {
    public static void Addition(){
        System.out.println("Enter the values of A and B to Add");
        Scanner s1=new Scanner(System.in);
        int A=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int B=s2.nextInt();
        int C=A+B;
        System.out.println("The output of A+B is : " + C);
        
    }
    public static void main(String[]args){
        Addition();
    }
    
}
