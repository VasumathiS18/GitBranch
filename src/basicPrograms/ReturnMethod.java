package basicPrograms;

public class ReturnMethod {

	public static boolean cal(int a)
	{
		if(a%5==0)
			return true;
		else 
			return false;
		
	}
	
	
	public static void main(String[] args) {
ReturnMethod rm=new ReturnMethod();

boolean ans=rm.cal(28);
System.out.println("Checking the no divisible by 5 is "+ans);

	}

}
