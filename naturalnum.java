import java.io.IOException;
import java.util.Scanner;

public class naturalnum{
public static void main(String[] args){
Scanner Sc = new Scanner(System.in);

int N= Sc.nextInt(); 
int a=0;

for(int i=0;i<=N; i++){
a=a+i;
}
System.out.println(a);

}
}