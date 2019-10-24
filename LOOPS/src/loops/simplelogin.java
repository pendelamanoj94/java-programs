
package loops;

import java.util.Scanner;

public class simplelogin {
    public static void main(String[]args){
        int i=1;
        do{
            System.out.println("Enter username:");
            Scanner s1=new Scanner(System.in);
            String Username= s1.next();
            
            System.out.println("Enter Password:");
            Scanner s2=new Scanner(System.in);
            String Password= s2.next();
            
            if(Username.contains("Jay") && Password.contains("Shetty")){
                System.out.println("You are Succesfully logged in.");
            }
            
                System.out.println("Please enter correct Username and Password! ");
     i++;       
        }while(i<=3);
    }
    
}
