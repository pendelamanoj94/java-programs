
package loops;

import java.util.Scanner;


public class evennumber {
    public static void main(String[]args){
        System.out.println("Give an Number upto which 'even numbers' have to be printed");
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        int a=1;
        while(a<=i)
        {
            if(a%2==0){
            System.out.println("Even Number is: " + a);
            }
            a++;
        }
        
        
    }
    
}
