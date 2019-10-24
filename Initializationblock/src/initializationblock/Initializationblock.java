
package initializationblock;

class Test{
       static int a;
       static
        {
             a=5; //Initialization block
             System.out.println("Parent of Initilization");
        }
        Test()
                {
              System.out.println("Parent of Constructor");
                }
    
    }
class Test1 extends Test{
       
         {
              //Initialization block
             System.out.println("Child of Initilization");
        }
        Test1()
                {
                    super();
                    System.out.println("Child of Constructor");
                }
    
    }

public class Initializationblock {

    
   
    public static void main(String[] args) {
        
        Test1 n= new Test1();
    }
    
}
