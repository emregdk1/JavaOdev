package JavaOdevler;

import java.util.Arrays;
import java.util.Scanner;

public class C4_JavaOdev4 {

	public static void main(String[] args) {

		/*
		 * Get numbers from the user and output that number consecutive fibonacci number
		 * sequence e.g : User enters 10 
		 * output : 0 1 1 2 3 5 8 13 21 34
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen fibonacci dizisi icin bir sayi giriniz : ");
		int  sayi=scan.nextInt();
		int arr[] = new int [sayi];
		arr[0]=0;
		arr[1]=1;
		
		for (int i = 2; i < sayi; i++) {
			arr[i]=arr[i-1] + arr[i-2];
			
		}
		System.out.println(Arrays.toString(arr));

	}
}
