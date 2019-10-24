
package functions;

import java.util.Scanner;

public class parameters {
    public static int Greatestnumber(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            return num1;
        }
        else if(num2>num3 && num2>num1){
            return num2;
        }else{
                return num3;
                }
        
    
}
    public static void main(String[]args){
        System.out.println("Enter Number 1: ");
        Scanner s1=new Scanner(System.in);
        int num1=s1.nextInt();
        
        System.out.println("Enter Number 2: ");
        Scanner s2=new Scanner(System.in);
        int num2=s2.nextInt();
        
        System.out.println("Enter Number 31: ");
        Scanner s3=new Scanner(System.in);
        int num3=s3.nextInt();
        System.out.println("The Greatest Number is:" +Greatestnumber(num1,num2,num3));
    }
    
}
