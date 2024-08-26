//write  program to reverse the digits of the number 1234. The output should be 4321.

public class ReverseOf1234{
  public static void main(String[] args) {
   int number = 1234; 
   int reversedNumber = 0;
        
        
  while (number != 0) {
   int digit = number % 10; 
   reversedNumber = reversedNumber * 10 + digit; 
    number /= 10; 
  }
 		System.out.println("The reversed number is: " + reversedNumber);
  }
}


