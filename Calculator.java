import java.util.Scanner;
import javax.swing.JOptionPane;

public class Calculator {
		int num1;
		int num2;
		String operation;

		Scanner input= new Scanner(System.in);

		System.out.println("please enter the first number");
			num1 = input.nextInt();

		System.out.println("please enter the first number");
			num1 = input.nextInt();

		Scanner op = new Scanner(System.in);
		System.out.println("please enter operation");
			operation = op.next();
	if(operation == '+')
	{
	public double add(double a, double b) {
		System.out.println("your answer is" + (num1 + num2));
		return (double)a+b;
	}
}
	if(operation == '-')
	{
	public double subtraction(double a, double b) {
		System.out.println("your answer is" + (num1 - num2));
		return (double)a-b;
	}
}
	if(operation == '/')
	{
	public double multiplication(double a, double b) {
		System.out.println("your answer is" + (num1 * num2));
		return (double)a*b;
	}
}
	if(operation == '*')
	{
	public static double division(double a, double b) { // a = 5, b = 10, 0.5
		System.out.println("your answer is" + (num1 / num2));
		return (double)a/b;
	}
}
	if(operation == '^')
	{
	public double square(double a) {
		System.out.println("your answer is" + (num1 * num1));
		return a*a;
	}
	else 
	System.out.println("Illegal Operation");
}	
	public static void main(String[] args) {
		System.out.print(division(2,0));
	}
}