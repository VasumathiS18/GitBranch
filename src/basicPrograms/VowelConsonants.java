package basicPrograms;

import java.util.Scanner;

public class VowelConsonants {

	public static void main(String[] args)
	{
		System.out.println("To check the alphabet is vowel or consonants");
		System.out.println("Enter an alphabet");
		Scanner sc=new Scanner(System.in);
		char ch=sc.next().charAt(0);
		switch(ch)
		{
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Entered alphabet "+ch+" is vowel");
			break;
		default:
			System.out.println("Entered alphabet "+ch+" is consonant");
			
		}
	}
}
