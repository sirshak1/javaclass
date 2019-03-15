import java.util.*;
public class Calcu
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		Operation o = new Operation();
		int a,b;
		System.out.println("Enter the numbers a and b: ");
		a = scanner.nextInt();
		b = scanner.nextInt();
		System.out.println("The numbers are "+a+" "+b);
		int m,d,s,aa;
		aa=o.add(a,b);
		d= o.div(a,b);
		m =o.mul(a,b);
		s =o.sub(a,b);
		System.out.println("The results are: "+"\n\n"+aa+" "+"Add_result"+"\n\n"+d+" "+"Div_result"+"\n\n"
		+m+" "+"Multiply_result"+"\n\n"+s+" "+"Subtraction_result"+"\n\n");
	}
}	