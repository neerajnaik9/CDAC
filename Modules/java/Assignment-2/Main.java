/*
Snippet 1:
public class Main {
public void main(String[] args) {
System.out.println("Hello, World!");
}
}
error--1.before void main the word static was missing
correct code --

public class Main {
public static void main(String[] args) 
{
System.out.println("Hello, World!");
}
} 


Snippet 2:


public class Main {
static void main(String[] args) {
System.out.println("Hello, World!");
}
}

correct code 
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}

//error-- 1.main method not found in class main 

Snippet 3:

public class Main {
public static int main(String[] args) {
System.out.println("Hello, World!");
return 0;
}

correct code----
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");

}
}

//error- 1.main method must return a value of type void in class main
        // 2.unexpected return value return 0;


Snippet 4:
public class Main {
public static void main() {
System.out.println("Hello, World!");
}
}


correct code----
public class Main {
public static void main(String[] args){
System.out.println("Hello, World!");
}
}

//error-- 1.main method not found in class main 
         // 2. String args in Java is used to pass command-line arguments to a Java program


Snippet 5:
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}


correct code------ No Error
public class Main {
public static void main(String[] args) {
System.out.println("Main method with String[] args");
}
public static void main(int[] args) {
System.out.println("Overloaded main method with int[] args");
}
}

Can you have multiple main methods? What do you observe?
Yes, you can have multiple Main methods in a class
and you can overload the multiple main method and call each other easily
But only one main method with full syntax as described by the compiler a class should have.


Snippet 6:
public class Main {
public static void main(String[] args) {
int x = y + 10;
System.out.println(x);
}
}


public class Main {
public static void main(String[] args) {
int y=5;
int x = y + 10;
System.out.println(x);
}
} 

//error--1.cannot find symbol y
       // must declare variable y
	   
Why must variables be declared?	 
variables are the basic unit of storage and must be declared before they can be used in a program. 
Declaring a variable tells the compiler how to work with the variable and how much space to allocate for it. 


Snippet 7:
public class Main {
public static void main(String[] args) {
int x = "Hello";
System.out.println(x);
}
}


public class Main {
public static void main(String[] args) {
char x = "hello";
System.out.println(x);
}
}

//error---- 1.string cannot be converted into int.

Snippet 8:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!"
}
}


correct code----
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
}
}

//error---1.')' expected
          //2.end of the code '}' excected.
		  
Snippet 9:
public class Main {
public static void main(String[] args) {
int class = 10;
System.out.println(class);
}
}


correct code------
public class Main {
public static void main(String[] args) {
int glass = 10;
System.out.println(glass);
}
}

error---1.reserved key cannot be used as identifier
        2.replace class with other word
		
Why can't reserved keywords be used as identifiers?
Keywords are reserved words so cannot be used as identifier, but in case sensitive languages, 
in which keywords are generally in lower case, 
so you can use uppercase name of keyword as an identifier.

Snippet 10:
public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}


public class Main {
public void display() {
System.out.println("No parameters");
}
public void display(int num) {
System.out.println("With parameter: " + num);
}
public static void main(String[] args) {
display();
display(5);
}
}

error---1.non static method display()cannot be referred from a static context




Snippet 11:
public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[5]);
}
}


Correct Code-------
public class Main {
public static void main(String[] args) {
int[] arr = {1, 2, 3};
System.out.println(arr[1]);
}
}


What runtime exception do you encounter? Why does it occur?
This Java runtime exception happens when the wrong type of object is placed into an array.



Snippet 12:
public class Main {
public static void main(String[] args) {
while (true) {
System.out.println("Infinite Loop");
}
}
}


public class Main {
public static void main(String[] args) {
if (true) {
System.out.println("Infinite Loop");
}
}
} 

error---1.While loop becomes infinite replace it with if


Snippet 13:
public class Main {
public static void main(String[] args) {
String str = null;
System.out.println(str.length());
}
}


Correct code--------
public class Main {
public static void main(String[] args) {
String str = null;
System.out.println(str);
}
}

Snippet 14:
public class Main {
public static void main(String[] args) {
double num = "Hello";
System.out.println(num);
}
}


public class Main {
public static void main(String[] args) {
 String num = "Hello";
System.out.println(num);
}
}

Error---1.string cannot be converted to char
         replace double with String
		 
Why does Java enforce data type constraints?
These annotations are typically used to improve code readability and catch type-related errors at compile time. 


Snippet 15:
public class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
int result = num1 + num2;
System.out.println(result);
}
}

correct code----------
public class Main {
public static void main(String[] args) {
int num1 = 10;
double num2 = 5.5;
double result = num1 + num2;
System.out.println(result);
}
}
//Error---1.possible loosy conversion from double to int
          // replace int with java


Snippet 16:
public class Main {
public static void main(String[] args) {
int num = 10;
double result = num / 4;
System.out.println(result);
}
}


No Error
Output---2.0 (not expected)
In the line double result = num / 4;, num and 4 are both integers. 
When you divide two integers in Java, the result is also an integer, and any fractional part is discarded.
 Therefore, 10 / 4 results in 2 (not 2.5),
 and then this integer 2 is assigned to result as a double. Thus, result will be 2.0.
 
double result = (double) num / 4;
double result = num / 4.0;
to get the result 2.5


Snippet 17:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a ** b;
System.out.println(result);
}
}


public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a * b;
System.out.println(result);
}
}

//Error---
//1.encounter a compilation error because the ** operator is not valid in Java.

Why is the ** operator not valid in Java?
The ** operator is not valid in Java because the Java language specification does not include it as a recognized operator.


Snippet 18:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a + b * 2;
System.out.println(result);
}
}

public class Main {
public static void main(String[] args) {
int a = 10;
int b = 5;
int result = a + b * 2;
System.out.println(result);
}
}
How does operator precedence affect the result?
Operator precedence refers to the rules that define the sequence in which different operators in an expression are evaluated.
 Operators with higher precedence are evaluated before operators with lower precedence. 
If two operators have the same precedence, their associativity rules determine the order of evaluation.

Snippet 19:
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
int result = a / b;
System.out.println(result);
}
}


Correct Code-----
public class Main {
public static void main(String[] args) {
int a = 10;
int b = 0;
if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            int result = a / b;
            System.out.println(result);
        }

}
}
//error---
//(416)will result in a runtime exception due to division by zero.
 //In Java, dividing an integer by zero is illegal and will cause the program to terminate with an error. 
//Specifically, the exception thrown will be an ArithmeticException.

Snippet 20:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World")
}
}


Correct Code-------
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World");
}
}


How does the missing semicolon affect compilation?
In Java, a missing semicolon (;) affects compilation because semicolons are used to terminate statements. 
Without them, the Java compiler cannot determine where one statement ends and the next begins, leading to syntax errors.

Snippet 21:
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
}


Correct code-----
public class Main {
public static void main(String[] args) {
System.out.println("Hello, World!");
// Missing closing brace here
}
}

Error-
   1.Reached end of file while parsing.
   
   What does the compiler say about mismatched braces?
   When a compiler encounters mismatched braces (e.g., curly braces {})
   in your code, it usually generates a syntax error or a compilation error. 
   The exact message and behavior depend on the compiler and the programming language you're using, 
   but generally, it will indicate that there's an "unmatched" or "missing" brace,
   often specifying the line number where it detected the issue.
  

Snippet 22:
public class Main {
public static void main(String[] args) {
static void displayMessage() {  //Syntax error: static methods cannot be nested inside other methods
System.out.println("Message");
}
}
}


Correct code----

public class Main {
    public static void main(String[] args) {
        displayMessage(); 
    }

    static void displayMessage() {
        System.out.println("Message");
    }
}

//Error--1.illegal start of expression static void displayMessage()
Can a method be declared inside another method?
In Java, you cannot declare a method inside another method. Java does not support nested method declarations.
 All methods in Java must be defined at the class level, not within other methods.
 
 
 
 Snippet 23:
public class Confusion {
public static void main(String[] args) {
int value = 2;
switch(value) {
case 1:
System.out.println("Value is 1");
case 2:
System.out.println("Value is 2");
case 3:
System.out.println("Value is 3");
default:
System.out.println("Default case");
}
}
}


Correct Code-----
public class Main {
    public static void main(String[] args) {
        int value = 2;
        switch (value) {
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }
}

Error--
Why does the default case print after "Value is 2"? How can you prevent
the program from executing the default case?
The code provided is syntactically correct, 
but it has a common logical issue related to the switch statement: the lack of break statements between the case blocks.
This will cause "fall-through" behavior, where all the cases after the matching one are executed sequentially, regardless of their values.


Snippet 24:
public class MissingBreakCase {
public static void main(String[] args) {
int level = 1;
switch(level) {
case 1:
System.out.println("Level 1");
case 2:
System.out.println("Level 2");
case 3:
System.out.println("Level 3");
default:
System.out.println("Unknown level");
}
}
}

Correct Code----
public class MissingBreakCase {
    public static void main(String[] args) {
        int level = 1;
        switch (level) {
            case 1:
                System.out.println("Level 1");
                break;
            case 2:
                System.out.println("Level 2");
                break;
            case 3:
                System.out.println("Level 3");
                break;
            default:
                System.out.println("Unknown level");
                break;
        }
    }
}


When level is 1, why does it print "Level 1", "Level 2", "Level 3", and
"Unknown level"? What is the role of the break statement in this situation?
the switch statement checks the value of level and matches it with case 1.
It executes the code within case 1, printing Level 1.
Because there's no break after case 1, the execution continues into case 2, printing Level 2.
The same fall-through occurs for case 3 and default, resulting in all subsequent case blocks being executed.


Snippet 25:
public class Switch {
public static void main(String[] args) {
double score = 85.0;
switch(score) {
case 100:
System.out.println("Perfect score!");
break;
case 85:
System.out.println("Great job!");
break;
default:
System.out.println("Keep trying!");
}
}
}


Correct Code--
public class Switch {
    public static void main(String[] args) {
        double score = 85.0;

        if (score == 100.0) {
            System.out.println("Perfect score!");
        } else if (score == 85.0) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep trying!");
        }
    }
}


Why does this code not compile? What does the error tell you about the
types allowed in switch expressions? How can you modify the code to make it work?

The code you provided will not compile successfully because 
switch statements in Java do not support double (floating-point) types as their switch expression.
 In Java, a switch statement can only be used with the following data types:
byte, short, char, int
String
Enumerated types (enum)

Snippet 26:
public class Switch {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");

break;
case 5:
System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
}


Corect Code-----
public class Main {
public static void main(String[] args) {
int number = 5;
switch(number) {
case 5:
System.out.println("Number is 5");

System.out.println("This is another case 5");
break;
default:
System.out.println("This is the default case");
}
}
}


Why does the compiler complain about duplicate case labels? What
happens when you have two identical case labels in the same switch block?
the switch statement has two case blocks with the same value (case 5).
 This will cause a compilation error because each case in a switch statement must have a unique value.
 
 
 SECTION 2
 Write a program to classify student grades based on the following criteria:
? If the score is greater than or equal to 90, print "A"
? If the score is between 80 and 89, print "B"
? If the score is between 70 and 79, print "C"
? If the score is between 60 and 69, print "D"
? If the score is less than 60, print "F"

public class Main{
public static void main(String[] args){
if (i>=90){
 System.out.println("grade of the student 'A'");
 }else {
 if(i>=80 &  i <= 89){
 System.out.println("grade of the student 'B'");
}
else {
 System.out.println("grade of the student 'f'");
 }
 }
 }
 }
 
 Question 2: Days of the Week
 
Write a program that uses a nested switch statement to print out the day of the week based on an
integer input (1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it
is a weekday or weekend.

havnt understood yet..


Question 3: Calculator
Write a program that acts as a simple calculator. It should accept two numbers and an operator
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested ifelse
to check if division by zero is attempted and display an error message.

havnt understood yet..


Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use the following
criteria:
? If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
? If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
? If the total purchase is less than Rs.500, apply a 5% discount.

*/
import java.util.Scanner;

 class DiscountCalculator {
   public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
       
  System.out.print("Enter the total purchase amount : ");
  double totalPurchase = scanner.nextDouble();

  double discount;
  double finalAmount;
      
 if (totalPurchase >= 1000){
  discount = totalPurchase * 0.20; 
   } else if (totalPurchase >= 500 && totalPurchase <= 999) {
     discount = totalPurchase * 0.10; 
   } else {
    discount = totalPurchase * 0.05; 
 }
      
 finalAmount = totalPurchase - discount;
  
 System.out.println("Discount: Rs. " + discount);
 System.out.println("Final amount to be paid: Rs. " + finalAmount);

 scanner.close();
 }
}
