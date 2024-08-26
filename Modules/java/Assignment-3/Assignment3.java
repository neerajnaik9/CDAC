/*Snippet 1:
public class InfiniteForLoop {
public static void main(String[] args) {
for (int i = 0; i < 10; i--) {
System.out.println(i);
}
}
}

correct code----
class InfiniteForLoop{
public static void main(String[] args) {
for (int i = 0; i < 10; i++) {
System.out.println(i);
}
}
}
//correction--The loop in your code runs infinitely because the loop control variable i is being decremented (i--) instead of incremented (i++).

Snippet 2:
public class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count = 0) {
System.out.println(count);
count--;
}
}
}


correct code----
class IncorrectWhileCondition {
public static void main(String[] args) {
int count = 5;
while (count!=0) {
System.out.println(count);
count--;
}
}
}

correction----cndition count=0 is incorrect as it assign value 0 to count .

Snippet 3:
public class DoWhileIncorrectCondition {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num > 0);
}
}


correct code----
class DoWhileIncorrectCondition {
public static void main(String[] args) {
int num = 0;
do {
System.out.println(num);
num++;
} while (num < 1);
}
}
Why does the loop only execute once? What is wrong with the loop condition in the `dowhile`
loop?
correction----while condition remains true so the loop will conti for infinite times.to correct it we made above changes

Snippet 4:
 class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i <= 10; i++) {
System.out.println(i);
}
// Expected: 10 iterations with numbers 1 to 10
// Actual: Prints numbers 1 to 10, but the task expected only 1 to 9
}
}

correct code----
class OffByOneErrorForLoop {
public static void main(String[] args) {
for (int i = 1; i < 10; i++) {
System.out.println(i);
}


Snippet 5:
public class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 10; i >= 0; i++) {
System.out.println(i);
}
}
}
// Error to investigate: Why does this loop notj print numbers in the expected order? What is the problem with the
initialization and update statements in the `for`  loop?
ans----i was initiated at10 which is eventually > than 0 hence loop will execute infinte times and update statement needs be lower than value.

correct code-------
class WrongInitializationForLoop {
public static void main(String[] args) {
for (int i = 1; i <=10; i++) {
System.out.println(i);
}
}
}


//Snippet 6:
 class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++)
System.out.println(i);
System.out.println("Done");
}
}
// Error to investigate: Why does "Done" print only once, outside the loop? How should the loop body be enclosed to
//include all statements within the loop?
answer---"Done" print only once bcoz there are no {} outsie for which bydefault considers only one statement aftr the condition.

correct code-----
class MisplacedForLoopBody {
public static void main(String[] args) {
for (int i = 0; i < 5; i++){
System.out.println(i);
System.out.println("Done");
}
}
}


//Snippet 7:
 class UninitializedWhileLoop {
public static void main(String[] args) {
int count;
while (count < 10) {
System.out.println(count);
count++;
}
}
}
// Error to investigate: Why does this code produce a compilation error? What needs to be done to initialize the loop
//variable properly?
ans---- variable name count has not assigned any value due to which the while loop could not initiate

correct code-------
class UninitializedWhileLoop {
public static void main(String[] args) {
int count=0;
while (count < 10) {
System.out.println(count);
count++;
}
}
}


Snippet 8:
public class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num--;
} while (num > 0);
}
}
// Error to investigate: Why does this loop print unexpected numbers? What adjustments are needed to print the
numbers from 1 to 5?

answer------num was initiated at 1 but then num was decrement 
which will lead to num print only once ...to print value from 1 to 5 num should be 
incremented and while condition should be changed to <= 5

correct code--------
 class OffByOneDoWhileLoop {
public static void main(String[] args) {
int num = 1;
do {
System.out.println(num);
num++;
} while (num <= 5);
}
}


//Snippet 9:
 class Snippet 9:
public class InfiniteForLoopUpdate {
public static void main(String[] args) {
for (int i = 0; i < 5; i += 2) {
System.out.println(i);
}
}
}
// Error to investigate: Why does the loop print unexpected results or run infinitely? How should the loop update
expression be corrected? 


 no correction required
 
 
 //Snippet 10:
 class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num = 10) {
System.out.println(num);
num--;
}
}
}
// Error to investigate: Why does the loop execute indefinitely? What is wrong with the loop condition?
ans--- as num=10 is a non zero value while consider it as true so num value never decreases and 
it went into infinite loop so we have to put == operator there.

correct code------
class IncorrectWhileLoopControl {
public static void main(String[] args) {
int num = 10;
while (num == 10) {
System.out.println(num);
num--;
}
}
}


//Snippet 11:
 class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i += 2; // Error: This may cause unexpected results in output
}
}
}
// Error to investigate: What will be the output of this loop? How should the loop variable be updated to achieve the
//desired result?

ouyput---0,2,4


Correct code-----
class IncorrectLoopUpdate {
public static void main(String[] args) {
int i = 0;
while (i < 5) {
System.out.println(i);
i += 1; // Error: This may cause unexpected results in output
}
}
}


//Snippet 12:
 class LoopVariableScope {
public static void main(String[] args) {
for (int i = 0; i < 5; i++) {
int x = i * 2;
System.out.println(x);
}
 // Error: 'x' is not accessible here
}
}
// Error to investigate: Why does the variable 'x' cause a compilation error? 
ANSWER---The variable x is declared inside the for loop. x is only accessible within the loop body.
Once it is out ,it will get distroyed.



------------------------------DRY RUN------------------------------------------------

Snippet 1

 class NestedLoopOutput {
public static void main(String[] args) {
for (int i = 1; i <= 3; i++) {
for (int j = 1; j <= 2; j++) {
System.out.print(i + " " + j + " ");
}
System.out.println();
}
}
}
// Guess the output of this nested loop.
OUTPUT---1 1 1 2
         2 1 2 2
		 3 1 3 2
		 
  I     J   PRINTS
  1     1    1  1
  1     2    1  2
  2     1    2  1
  2     2    2  2
  3     1    3  1
  3     2    3  2
  
  
 // Snippet 2:
 class DecrementingLoop {
public static void main(String[] args) {
int total = 0;
for (int i = 5; i > 0; i--) {
total += i;
if (i == 3) continue;
total -= 1;
}
System.out.println(total);
}
}
// Guess the output of this loop.
OUTPUT---- 11

i   sum   -1    Total
5   0+5   4       4
4   4+4   7       7
3   7+3  skip     10
2  10+2   11      11
1  11+1   11      11

Snippet 3:
 class WhileLoopBreak {
public static void main(String[] args) {
int count = 0;
while (count < 5) {
System.out.print(count + " ");
count++;
if (count == 3) break;
}
System.out.println(count);
}
}
// Guess the output of this while loop.
OUTPUT---- 0 1 2 3
count   print
0        0
1        1
2        2
3        3

Snippet 4:
 class DoWhileLoop {
public static void main(String[] args) {
int i = 1;
do {
System.out.print(i + " ");
i++;
} while (i < 5);
System.out.println(i);
}
}
// Guess the output of this do-while loop.
OUTPUT---- 0 1 2 3 4 5 
i    print 
1     1
2     2
3     3
4     4
5     5


Snippet 5:
 class ConditionalLoopOutput {
public static void main(String[] args) {
int num = 1;
for (int i = 1; i <= 4; i++) {
if (i % 2 == 0) {
num += i;
} else {
num -= i;
}
}
System.out.println(num);
}
}
// Guess the output of this loop.
OUTPUT----3

num   i    num
1     1    0
0     2    2
2     3    -1
-1    4    3



Snippet 6:
 class IncrementDecrement {
public static void main(String[] args) {
int x = 5;
int y = ++x - x-- + --x + x++;
System.out.println(y);
}
}
// Guess the output of this code snippet.
OUTPUT----8

++x - x-- + --x + x++;
6   - 6   +  4  + 4
   0      +     8
       8
	   
  

Snippet 7:
 class  {
public static void main(String[] args) {
int a = 10;NestedIncrement
int b = 5;
int result = ++a * b-- - --a + b++;
System.out.println(result);
}
}
// Guess the output of this code snippet.
OUTPUT----49

++a * b-- - --a + b++;
 11 * 5 - 10 + 4
 49
 
 
 Snippet 8:*/
 class LoopIncrement {
public static void main(String[] args) {
int count = 0;
for (int i = 0; i < 4; i++) {
count += i++ - ++i;
}
System.out.println(count);
}
}
// Guess the output of this code snippet.
OUTPUT---- -4


 
	  
   