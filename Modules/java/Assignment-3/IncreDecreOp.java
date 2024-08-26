//. Write a Java program to demonstrate the use of both pre-increment and post-decrementoperators in a single expression

public class IncreDecreOp{

  public static void main(String[] args) {
int i = 2;
        
   int result = ++i + i--;

  System.out.println("Result of the expression (++i + i--) is: " + result);
   System.out.println("Final value of i is: " + i);
 }
}
