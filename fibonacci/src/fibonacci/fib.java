package fibonacci;
import java.util.Scanner;
public class fib {
	public static void main (String arg[]) {
	int x=0,y=1,c=0;
	Scanner input = new Scanner (System.in);
	System.out.println("Enter any integer number:");
	int num = input.nextInt();
	do {
		x=y;
		y=c;
		c=x+y;
		if (c>num) {
		break;
		}
		else {
			System.out.printf("%4d",c);		
		}
	}
	while(c<num);
	System.out.println("\n" + "Nothing more, thank you.");
	}
	
}
