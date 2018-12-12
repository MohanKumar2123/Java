import java.io.IOException;
import java.util.Scanner;

public class Positive1 {

	public static void main(String[] args)throws IOException {
				
		Scanner Sc = new Scanner(System.in);
		int a = Sc.nextInt();
		if(a > 0){
		System.out.println("Number is Positive");
		}
		else if(a<0){
		System.out.println("Number is Negative");	
		}
		else{
			System.out.print("Number is Zero");
		}
	}
}
