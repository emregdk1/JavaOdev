package JavaOdevler;

import java.util.Scanner;

public class C6_JavaOdevler6 {

	public static void main(String[] args) {

		/*
		 * Kullanýcýdan firstName ve lastName'i girmesini isteyin, ardýndan baþ
		 * harflerini büyük harf yapýn ve geri kalaný tamamen kucuk harf olarak konsolda
		 * yazdirin. 
		 * ferhat => Ferhat 
		 * 
		 * kirac => Kirac
		 * 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen firstname giriniz ");
		String firstName=scan.nextLine().toLowerCase();
		System.out.println("Lutfen lastname giriniz : ");
		String lastName=scan.nextLine().toLowerCase();
		
		
		
		System.out.println(firstName.toUpperCase().charAt(0)+ firstName.substring(1, firstName.length()));
		System.out.println(lastName.toUpperCase().charAt(0)+ lastName.substring(1, lastName.length()));
		
		

	}

}
