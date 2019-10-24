
package conditionalstatements;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[]args){
        System.out.println("Enter an alphabet to check it is consonant or vowel: ");
        Scanner s1=new Scanner(System.in);
        char alpha=s1.next().charAt(0);
        switch(alpha)
        {
            case 'a':
                System.out.println("This is vowel");
                break;
            case 'e':
                System.out.println("This is vowel");
                break;
            case 'i':
                System.out.println("This is vowel");
                break;
            case 'o':
                System.out.println("This is vowel");
                break;
            case 'u':
                System.out.println("This is vowel");
                break;
            default:
                System.out.println("This is a consonant");
        }
            
        
    }
    
}
