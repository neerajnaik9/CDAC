// Write a program to compute the factorial of the number 10.


 class Factorial {
 public static void main(String[] args) {
 int number = 10; 
 long factorial = 1; 
        
        
   for (int i = 1; i <= number; i++) {
  factorial =factorial * i;
  }
        
  System.out.println("The factorial of " + number + " is: " + factorial);
 }
}


OUTPUT----The factorial of 10 is: 3628800
