import java.io.IOException;
import java.util.Scanner;

public class CountInt{
public static void main(String[] args){
	
Scanner Sc = new Scanner(System.in);

int R = Sc.nextInt(); 
int c = 0;

if (R != 0)
{
	c = String.valueOf(R).length();

	System.out.println(c);
}

else {
	
	System.out.println("0");
}


}
}