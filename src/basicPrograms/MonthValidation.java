package basicPrograms;

import java.util.Scanner;

public class MonthValidation {
//pull back
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("this program is to validate a month ");
System.out.println("Enter a month number  ");
Scanner sc=new Scanner(System.in);
int month=sc.nextInt();
if((month > 0)&&(month<=12))
{
	System.out.println("Entered month "+ month +" is vallid");
}
else
{
	System.out.println("Entered month "+ month +" is not valid");
}
	}

}
