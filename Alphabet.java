import java.io.IOException;
import java.util.Scanner;

public class Alphabet
 {
public static void main(String[] args)throws IOException
{
Scanner Sc = new Scanner(System.in);
char ch = Sc.next().charAt(0);

if((ch >= 'a' && ch <= 'z')|| ( ch >='A' && ch <= 'Z' )){
	System.out.println("Alphabet");
}
else{
	System.out.println("No");
}

}
}
