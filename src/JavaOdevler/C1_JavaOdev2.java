package JavaOdevler;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

import org.w3c.dom.html.HTMLFormElement;

public class C1_JavaOdev2 {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz : ");
		String str=scan.nextLine();
		
		String ters="";
		
		for (int i = 0; i < str.length(); i++) {
			
			ters+=str.charAt(str.length()-i-1);
			
		}
		System.out.println("Girdiginiz cumlenin tersten yazilisi : " + ters);
		
	

		
	}	
}
