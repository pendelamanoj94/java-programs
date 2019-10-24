
package conditionalstatements;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[]args){
       int largestnumber;
       System.out.println("Enter the value for s1: ");
       Scanner s1=new Scanner(System.in);
       int i=s1.nextInt();
       System.out.println("Enter the value for s2: ");
       Scanner s2=new Scanner(System.in);
       int j=s2.nextInt();
       System.out.println("Enter the value for s3: ");
       Scanner s3=new Scanner(System.in);
       int k=s3.nextInt();
       if(i>j){
           if(i>k){
               largestnumber=i;
           }
           else 
               largestnumber=k;
       }
       
           if(j>k){
               largestnumber=j;
           }
           else 
               largestnumber=k;
           System.out.println("largest number is:"+largestnumber);
       
        
    }
}
