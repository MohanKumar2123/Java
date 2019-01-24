import java.io.IOException;
import java.util.Scanner;

public class largestNum{
public static void main( String[] args ){
Scanner Sc = new Scanner(System.in);
int ab = Sc.nextInt();
int bc = Sc.nextInt();
int ca = Sc.nextInt();

if(ab >= bc && ab >= ca){
System.out.println(ab);
}
else if(bc >= ab && bc >= ca){
System.out.println(bc);
}
else if(ca >= ab && ca >= bc){
System.out.println(ca);
}

}
}

