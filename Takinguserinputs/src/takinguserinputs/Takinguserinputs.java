
package takinguserinputs;
import java.util.Scanner;
public class Takinguserinputs {
    
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        int num= s1.nextInt();
        System.out.println("Number : "+num);
        Scanner s2= new Scanner(System.in);
        String n= s2.nextLine();
        System.out.println("Name : "+n);
    }
    
}
