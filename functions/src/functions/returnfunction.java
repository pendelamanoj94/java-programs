
package functions;

import java.util.Scanner;

public class returnfunction {
    public static int Addition(){
        System.out.println("Enter the values of A and B to Add");
        Scanner s1=new Scanner(System.in);
        int A=s1.nextInt();
        Scanner s2=new Scanner(System.in);
        int B=s2.nextInt();
        return A+B;
        
        
    }
    public static void main(String[]args){
       System.out.println("values of A+B is: "+ Addition()); 
       System.out.println("values of 2 is: "+ Addition()); 
    }
}
