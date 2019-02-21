import java.util.Scanner;
public class Calculator4 {
	public static void main(String[] args)
	{
	Scanner in = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int a = in.nextInt();
 System.out.print("Enter a number: ");
 int b = in.nextInt();
 int c = a + b;
 int d = a - b;
 int e = a*b;
 int f = a/b;
 System.out.println("Sum:" + " " + c);
 System.out.println("Substraction:" + " " + d);
 System.out.println("Multiplication:" + " " + e);
 System.out.println("Division:" + " " + f);
}
}


