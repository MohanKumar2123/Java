import java.io.IOException;
import java.util.Scanner;

public class vowels
 {
public static void main(String[] args)throws IOException
{
	boolean Vowel=false;;
Scanner Sc = new Scanner(System.in);
char ch = Sc.next().charAt(0);

 switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
	    case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U': Vowel = true;
             
	    break;                
        }		
		if(Vowel == true){
		System.out.println("vowel");	
		}
		else {			
			if((ch >= 'a' && ch <= 'z')|| ( ch >='A' && ch <= 'Z' )){
				System.out.println("consonant");
			}
			else {
				System.out.println("invalid");
			}
			
		}

	}	
}





