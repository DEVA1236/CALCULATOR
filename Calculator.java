package package2;

import java.util.Scanner;

public class Calculator {
public static void main (String [] args)
{
System.out.println("Enter the values");

Scanner sc = new Scanner(System.in);
double a = sc.nextDouble();
double b = sc.nextDouble();
System.out.println("Enter the operator :  + , - , * , / , % ");
char op = sc.next().charAt(0); 
sc.close();
double result = 0;


switch(op) {
case '+' : result = a+b;
break;
case '-' : result = a-b;
break;
case '*' : result = a*b;
break;
case '/' : result = a/b;
break;
case '%' : result = a%b;
break;
default :System.out.println("you entered the wrong operator");
}
System.out.println("Your answer is : "+ a + " "+ op +" " +b +" " + "=" + " "+result);
	}
}
