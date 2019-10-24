
package conditionaloperator;

import java.util.Scanner;


public class ConditionalOperator {

    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        int age=s1.nextInt();
        String result=(age>=18)? "You can play the game" : "You cannot play the game";
        System.out.println(result);
    }
    
}
