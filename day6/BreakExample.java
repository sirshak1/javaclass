public class BreakExample
	{
		public static void BreakMessage()
			{
				for(int i=1;i<=5;i++)
					{
						if(i==4) 
							{
								break;
							}
							System.out.println("The value of i is "+i);
					}
			}
	public static void main (String[] args)
		{
			BreakMessage();
		}
	
	}