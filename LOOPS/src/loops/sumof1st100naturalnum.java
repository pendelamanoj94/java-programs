
package loops;

import java.util.Scanner;

public class sumof1st100naturalnum {
public static void main(String[]args) {
    System.out.println("Enter the sum of N natural numbers: ");
    Scanner s1=new Scanner(System.in);
    int m=s1.nextInt();
    int i;
    int sum=0;
    for(i=1;i<m;i++){
        
    sum=sum+i;    
    
    }
    System.out.println(sum);
  } 
}
