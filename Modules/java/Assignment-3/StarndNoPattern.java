/*19. Write a program to print the following pattern:
1
1*2
1*2*3
1*2*3*4
1*2*3*4*5


 class StarndNoPattern {
    public static void main(String[] args) {
    int n = 5;
        
   for (int i = 1; i <= n; i++) {
   for (int j = 1; j <= i; j++) {
    System.out.print(j);
       if (j < i) {
          System.out.print("*");
 }
  }
  System.out.println();
  }
 }
}


20. Write a program to print the following pattern:
5
5*4
5*4*3
5*4*3*2
5*4*3*2*1




 class ReverseNumberPattern {
 public static void main(String[] args) {
  
        
  for (int i = 1; i <= 5; i++) {
  for (int j = 5; j >= 5 - i + 1; j--) {
   System.out.print(j);
     if (j > 5 - i + 1) {
      System.out.print("*");
  }
 }
  System.out.println(); 
 }
}
}


21. Write a program to print the following pattern:
1
1*3
1*3*5
1*3*5*7
1*3*5*7*9

*/

 class OddNumberPattern {
    public static void main(String[] args) {
       
  for (int i = 1; i <= 5; i++) {
    int num = 1;
   for (int j = 1; j <= i; j++) {
    System.out.print(num);
     if (j < i) {
     System.out.print("*");
   }
 num += 2;
  }
  System.out.println(); 
  }
 }
}

