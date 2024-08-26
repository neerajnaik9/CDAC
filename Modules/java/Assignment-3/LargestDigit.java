
// Write a program to find and print the largest digit in the number 4825.


public class LargestDigit {

    public static void main(String[] args) {
    int num = 4825;
    int largestDigit = 0;

        
   while (num > 0) {
   int digit = num % 10; 
   if (digit > largestDigit) {
   largestDigit = digit; 
   }
    num = num / 10;     
  }
   System.out.println("The largest digit in 4825 is: " + largestDigit);
   }
}
