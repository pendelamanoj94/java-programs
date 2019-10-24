
package nayeem.classes;

import java.util.Scanner;

public class Marks {
    public static void main(String args[]){
        System.out.println("Enter Your Marks:");
        Scanner M=new Scanner(System.in);
        int Marks=M.nextInt();
        if(Marks>=70 && Marks<=100){
            System.out.println("You got First Class. \nyour marks are = "+Marks);
        }else if(Marks<=50 && Marks>=70){
            System.out.println("You got Second Class. \nyour marks are = "+Marks);
        }else if(Marks<=30 && Marks>=50){
            System.out.println("You got Third Class. \nyour marks are = "+Marks);
        }else if(Marks>100){
            System.out.println("You Manupilated in Examination Hence you are going to jail. \nyour marks are = "+Marks);
        }else{
            System.out.println("You got Failed. \nyour marks are = "+Marks);
        }
    }
}
