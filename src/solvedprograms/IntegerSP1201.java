package solvedprograms;

import java.util.Scanner;

public class IntegerSP1201 {
	
	public static void checkPalindrome(int input) {
		int rev=0, last, temp=input;
		
		while(input>0) {
			last=input%10;
			rev=rev*10+last;
			input=input/10;
		}
		
		if(temp==rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
	
	public static void checkArmstrongNumber(int input) {
		int anum=0, last, temp=input;
		
		while(input>0) {
			last=input%10;
			anum=anum+last*last*last;
			input=input/10;
		}
		
		if(temp==anum) {
			System.out.println("Armstrong");
		}else {
			System.out.println("Not an Armstrong");
		}
	}
	
	public static void generateFibonacci(int input) {
		int first=0,second=1,series;
		
		for(int i=0;i<input;i++) {
			System.out.println(first);
			series=first+second;
			second=first;
			first=series;
		}
	}
	
	public static boolean checkPrime(int input) {
		if(input<2) {
			return false;
		}
		
		if(input==2) {
			return true;
		}
		
		if(input%2==0) {
			return false;
		}
		
		for(int i=3;i<input;i=i+2) {
			if(input%i==0) {
				return false;
			}
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input");
		int input=sc.nextInt();
		
		//checkPalindrome(input);
		//checkArmstrongNumber(input);
		//generateFibonacci(input);
		
		boolean isPrime=checkPrime(input);
		if(isPrime==true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not a Prime");
		}
		
		sc.close();
	}

}
