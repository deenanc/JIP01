package solvedprograms;

import java.util.Scanner;

public class ArraySP1201 {
	
	public static void arraySum(int input[]) {
		int sum=0;
		
		for(int i=0;i<input.length;i++) {
			sum=sum+input[i];
		}
		
		System.out.println(sum);
	}
	
	public static void largestElement(int input[]) {
		int max=0;
		
		for(int i=0;i<input.length;i++) {
			if(max<input[i]) {
				max=input[i];
			}
		}
		
		System.out.println("Largest element is "+max);
	}
	
	public static void smallestElement(int input[]) {
		int min=input[0];
		
		for(int i=0;i<input.length;i++) {
			if(min>input[i]) {
				min=input[i];
			}
		}
		
		System.out.println("Smallest element is "+min);
	}
	
	public static void ascendingOrder(int input[]) {
		int temp;
		
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]>input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}
	
	public static void descendingOrder(int input[]) {
		int temp;
		
		for(int i=0;i<input.length;i++) {
			for(int j=i+1;j<input.length;j++) {
				if(input[i]<input[j]) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		
		for(int i=0;i<input.length;i++) {
			System.out.println(input[i]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		System.out.println("Enter the slements");
		int[] input=new int[size];
		for(int i=0;i<size;i++) {
			input[i]=sc.nextInt();
		}
		
		arraySum(input);
		largestElement(input);
		smallestElement(input);
		ascendingOrder(input);
		descendingOrder(input);
		
		sc.close();

	}

}
