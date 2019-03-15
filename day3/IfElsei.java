import java.util.*;

public class IfElsei
	{
		public static void main(String[] args)
		{
			Scanner scanner = new Scanner(System.in);
			int marks ;
			System.out.println("Please enter the number:");
			marks=scanner.nextInt();
			if (marks>100) 
				{
					System.out.println("Please enter valid marks");
				}
			else if (marks>=80)
				{
					System.out.println("Distinction");
				}
			else if(marks>=60&& marks<80)
				{
					System.out.println("Firstdiv");
				}
			else if(marks>=45&& marks<60)
				{
					System.out.println("Secondiv");
				}
			else 
				{
					System.out.println("Fail");
				}
		}
	}
	