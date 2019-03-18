public class LoopTest
	{
		public static void printfordata()
			{
				for(int i=0;i<5;i++)
					{
						System.out.println(i);
					}
			
			}
		public static void dodata()
			{
				boolean isTrue=true;
				int num =1;
				do
				{
					System.out.println(num);
					num++;
					if(num==1000)
					{
						break;
					}
				
				}while(isTrue);
			}
		public static void main(String[] args)
			{
			LoopTest.printfordata();
			LoopTest.dodata();
			}
	}	