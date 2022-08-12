import java.util.Scanner;

//java program to find factorial of a number
// author muskan singal
public class FactorialNo {

	public static void main(String[] args) {
		int n,fact=1;
		System.out.print(" Enter any Number ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			fact=fact*i;
		}
		System.out.print("Factorial "+ fact);
	}

}
