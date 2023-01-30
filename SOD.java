import java.util.*;

public class SOD{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("enter the number to find the sum of its digits");

int a = sc.nextInt();
int b = a;
int sum = 0;

while(b != 0){

sum = sum + (b % 10);
b = b / 10;

}

System.out.println("the sum of digits of the number is " + sum);

}
}

