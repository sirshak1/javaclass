public class BreakExamplea
	{
		public static void BreakMessagea()
			{
				for(int i=1;i<=6;i++)
					{
						if(i==1) 
							{
								continue;
							}
							System.out.println("The value of i is "+i);
					}
			}
	public static void main (String[] args)
		{
			BreakMessagea();
		}
	
	}