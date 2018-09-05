
public class Loops {

	public static void main(String[] args)
	{
		
		System.out.println("**************FOR LOOP**************");		
		//For loop		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}		
		/*
		 * For i=0 to 10
		 * 	Print i 
		 * Next
		 */		
		System.out.println("*************ENHANCED FOR LOOP***************");
		//Array declaration
		int arr[]={1,2,3,4,5};
		for(int elm:arr)
		{
			System.out.println(elm);
		}
		System.out.println("**************DO WHILE**************");
		//Do While loop	
		int j=5;		
		do
		{
			System.out.println(j);
			j=j-1;
		}while(j>0);
		/*
		 * Do
		 * 	Print j
		 * 	j=j-1 
		 * Loop While(j>0)
		 */		
		System.out.println("****************WHILE***************");		
		int k=5;		
		while(k>0)
		{
			System.out.println(k);
			k=k-1;
		}		
	}
}
