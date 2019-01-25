import java.io.IOException;
import java.util.Scanner;

public class Leapyear{
public static void main(String[] args){

Scanner Sc = new Scanner(System.in);
int a = Sc.nextInt();

if(a%4 == 0){
	System.out.println("yes");
}
else{
	System.out.println("no");
}


}
}