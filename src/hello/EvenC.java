package hello;

import java.util.Scanner;

public class EvenC {

	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the number");
		int n=scan.nextInt();
		int i=2;
		while(i<n)
		{
			
				System.out.println(i);
				
				i=i+2;
				
			
			}
		}

}
