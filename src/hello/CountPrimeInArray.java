package hello;

import java.util.Scanner;

public class CountPrimeInArray {

	public static void main(String[] args) {
		int arr[]=readArray();
		arr=primeArr(arr);
	}

	static int[] primeArr(int[] arr) {
		int n=arr.length;
		int count=0;
		System.out.println("prime Number Are");
		for(int i=0; i<n; i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
				count++;
			}
		}System.out.println("Total number of prime numbers are : "+count);
		return arr;
		
	}

	static boolean isPrime(int arr) {
		for(int i=0; i<=arr/2; i++) {
			if(arr%i==0) {
				return false;
			}
		}
		return true;
	}

	private static int[] readArray() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of element in array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the element of array");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		return arr;
	}

}
