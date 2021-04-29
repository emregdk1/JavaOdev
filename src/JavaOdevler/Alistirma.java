package JavaOdevler;

import java.util.Scanner;

public class Alistirma {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir kelime giriniz : ");
		String str=scan.nextLine();
		
		String ters="";
		
		for(int i = 0 ; i < str.length() ; i++) {
			ters+=str.charAt(str.length()-i-1);
		}
		System.out.println("Girdiginiz kelimenin tersten yazilisi : " + ters);
	}
	
	

	System.out.println(BAŞARILI)
	    

}
