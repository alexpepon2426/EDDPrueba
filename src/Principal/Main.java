package Principal;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,fact = 0,oper = 0,exp;
		System.out.println("Dime un numero");
		n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			exp=n*n;
			fact=i+n;
			oper=exp/fact;			
		}
		System.out.println(oper);
			
		
		
		

	}

}
