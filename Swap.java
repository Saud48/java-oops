import java.util.*;

public class Swap{

public static void main(String args[]){

Scanner sc = new Scanner(System.in);

System.out.println("enter the two number");

int a = sc.nextInt();
int b = sc.nextInt();

System.out.println("the number before swapping are"+" a = "+a+" & "+" b = "+b);

a = a + b;
b = a - b;
a = a - b;
  
System.out.println("the number after swapping are"+" a = "+a+" & "+" b = "+b);  
}}

