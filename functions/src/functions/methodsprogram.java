
package functions;

import java.util.Scanner;

public class methodsprogram {
    public static int length=10;
    
    public static boolean password_Valid(String password){
        if(password.length()<length)
        return false;
        int digit_length=0,letter_length=0;
        for(int i=0;i<=password.length();i++){
            char ch=password.charAt(i);
        }    
    }
    
    public static boolean char_isLetter(char ch){
        ch=Character.toUpperCase(ch);
        return (ch>='A' && ch<='Z');
    }
    
    public static boolean char_isNumber(char ch){
        return(ch>='0' && ch<='9');
    }
    
    public static void main(String[]args){
    System.out.println( "Rules of passwordln" 
            + "1.Password must contains atleast 10 characters"
            + "2.Password must contains characters and digits"
            + "3.Password must contains atleast 2 digits"
            + "Enter a Password: ");
    Scanner pass=new Scanner(System.in);
    String password=pass.nextLine();
    
}    
}
