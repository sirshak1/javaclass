/*Integer value from the user*/
import java.util.*;
public class UserInput
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Enter the number");
		a = scanner.nextInt();
		System.out.println("Your enter integer is "+a);
	}
}
