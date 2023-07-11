
package basicPrograms;
import java.util.Scanner;
public class CalcOverloading {
	public static double mul(double x,double y)
	{
		return x*y;
	}
	public int mul(int x,int y)
	{
		return x*y;
	}
	public static float mul(float x,int y)
	{
		return x*y;
	}
	public int mul(char x,char y)
	{
		return x*y;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter values to add ");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextInt();
		int b=sc.nextInt();
		CalcOverloading cal =new CalcOverloading();
		
			System.out.println("1st method "+mul(a, b));
		System.out.println("2nd method "+cal.mul(a, b));
		System.out.println("3rd method "+mul(a, b));
		System.out.println("4th method "+cal.mul('A', 'B'));
		
		
		
	}

}
