import java.util.Scanner;
public class FibonaccisSeries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		int a=0, b=1 ,c, i=3, n;
		
		System.out.print("Enter any Number: ");
		n=sc.nextInt();
		System.out.print(a + " " + b);
		do
		{
			c=a+b;
			System.out.print(" " + c);
			a=b;
			b=c;
			i++;
		}while( i<=n);
		
		

}
}