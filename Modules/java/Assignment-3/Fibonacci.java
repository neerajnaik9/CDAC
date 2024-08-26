//Write a program to print the Fibonacci sequence up to the number 21.

public class Fibonacci {
  public static void main(String[] args) {
  int a = 0, b = 1; 
   System.out.print(a + " " + b); 

 int nextNumber = a + b;
        
       
   while (nextNumber <= 21) {
    System.out.print(" " + nextNumber); 
      a = b;              
      b = nextNumber;     
      nextNumber = a + b; 
  }
 }
}
