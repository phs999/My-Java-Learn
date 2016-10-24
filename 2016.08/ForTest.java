class ForTest 
{
	public static void main(String[] args) 
	{
		/*´òÓ¡£º
		 *****
		 *****
		 *****
		 *****
		 *****
		 */
		for(int x=1;x<=5;x++)
		{
			for(int y=1;y<=5;y++)
			{
				    System.out.print("*");
			}
			    System.out.println();
		}
		    System.out.println("----------------");
		/*´òÓ¡:
		 *****
		 ****
		 ***
		 **
		 *
		 */
		 for(int x=1;x<=5;x++)             
		 {                                 
		 	for(int y=5;y>=x;y--)         
	 	{                             
		 		    System.out.print("*");
		 	}                             
		 	    System.out.println();     
		 } 
		     System.out.println("-------------");
		 /*´òÓ¡£º
		 *
		 **
		 ***
		 ****
		 *****
		 */
         for(int x=1;x<=5;x++)             
		 {                                 
		 	for(int y=1;y<=x;y++)         
		 	{                             
		 		    System.out.print("*");
		 	}                             
 		 	    System.out.println();     
		}
		    System.out.println("-----------");
         /*´òÓ¡£º
		 54321
		 5432
		 543
		 54
		 5
		 */
		 for(int x=1;x<=5;x++)             
		 {                                 
		 	for(int y=5;y>=x;y--)         
		 	{                             
		 		    System.out.print(y);
		 	}                             
		 	    System.out.println();     
		 } 
		     System.out.println("------------");

		/*
		1
		22
		333
		4444
		55555
		*/
		for(int x=1;x<=5;x++)             
		{                                 
			for(int y=1;y<=x;y++)         
			{                             
				    System.out.print(x);
			}                             
			    System.out.println();     
		}                               
		    System.out.println("------------");
			/*´òÓ¡£º
			¾Å¾Å³Ë·¨±í
			*/
			for(int x=1;x<=9;x++)             
			{                                 
				for(int y=1;y<=x;y++)         
				{                             
					    System.out.print(y+"*"+x+"="+y*x+"\t");
				}                             
				    System.out.println();     
			}                                 




 }                                 
 }
