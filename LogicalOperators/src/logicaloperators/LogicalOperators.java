
package logicaloperators;


public class LogicalOperators {

    
    public static void main(String[] args) {
        boolean a=true;
        boolean b;
        b = false;
        System.out.println("LOGICAL OPERATORS");
        System.out.println(a&&b);
        System.out.println(a||b);
        System.out.println(!(a&&b));
        System.out.println("\n"+ "\n");
        
        if(a&&b){
            System.out.println(true);
        }else
            System.out.println(false);
        if(a||b){
            System.out.println(true);
        }else
            System.out.println(false);
        if(!(a&&b)){
            System.out.println(true);
        }else
            System.out.println(false);
                
        
    }
    
}
