
package strings;


public class Strings {

    
    public static void main(String[] args) {
        String str1 = "My Name is - ";
        String str2 = " Jay Shetty.";
        String str3 = str1+str2;
        System.out.println(str3);
        System.out.println("My D.O.B is : " + 1994 );
        System.out.println("This prints length of a string: " +  str3.length());
        System.out.println("This prints character present in 11th string: " + str3.charAt(11));
        System.out.println("This converts all in this string to upper case: " + str3.toUpperCase());
        System.out.println("This Compares both str2 and str1 and prints (true or false): "+str2.contains(str1));
         System.out.println("It Checks that character N is present: " +  str3.indexOf("N"));
    }
    
}
