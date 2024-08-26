/*//23. Write a program to print the following pattern:
11111
22222
33333
44444
55555


 class NumberPattern {
    public static void main(String[] args) {
        
for (int i = 1; i <= 5; i++) {
  for (int j = 1; j <= 5; j++) {
    System.out.print(i);
  }
   System.out.println(); 
 }
}
}


24. Write a program to print the following pattern:
1
22
333
4444
55555



 class NumberPattern {
    public static void main(String[] args) {
   for (int i = 1; i <= 5; i++) {
    for (int j = 1; j <= i; j++) {
     System.out.print(i);
  }
  System.out.println(); 
  }
 }
}


25. Write a program to print the following pattern:
1
12
123
1234
12345


 class NumberPattern {
  public static void main(String[] args) {
        

  for (int i = 1; i <= 5; i++) {
   for (int j = 1; j <= i; j++) {
   System.out.print(j);
  }
  System.out.println(); 
  }
  }
}




26. Write a program to print the following pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

 class NumberPattern {
  public static void main(String[] args) {
        
  int num=1;
  for (int i = 1; i <= 5; i++) {
 for (int j = 1; j <= i; j++) {
   System.out.print(num + " ");
    num++;
  }
  System.out.println(); 
 }
 }
}

