
package loops;

import java.util.Scanner;

public class forloop {
public static void main(String [] args){
    System.out.println("Enter the Value for Diamond astrick: ");
    Scanner s1=new Scanner(System.in);
    int rows=s1.nextInt();
    int space=rows-1;
    int i,j;
    for(i=1;i<=rows;i++){
        for(j=1;j<=space;j++){
            System.out.print(" ");
        }space--;
        for(j=1;j<=2*i-1;j++)
        {
            System.out.print("*");
        }
         System.out.println(" ");
    }
    
    space=1;
    for(i=1;i<=rows-1;i++){
        for(j=1;j<=space;j++){
            System.out.print(" ");
        }space++;
        for(j=1;j<=2*(rows-i)-1;j++)
        {
            System.out.print("*");
        }
         System.out.println(" ");
    }
    
    
}    
}
