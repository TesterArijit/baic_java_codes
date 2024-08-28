package Test_java;
import java.util.Scanner;
// count the number of digits for a given number.
public class One {

public static void main(String[] args) {
int a=87458;
int count=0;

while(a>0)
{
	a=a/10;
	count++;
}
System.out.println(count);
	
}
}
