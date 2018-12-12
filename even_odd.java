import java.io.IOException;
import java.util.Scanner;

public class even_odd 
{

	public static void main(String[] args)throws IOException
	 {
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();

               	if(a%2 == 1 )
		  {
		  System.out.println("Odd number");
		  }
		else
	          {
		  System.out.println("Even Number");	
		  }
	}	
}
