package JavaOdevler;

import java.util.Scanner;

public class Alistirma2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 haneli bir kelime giriniz : ");
		
		String str=scan.next();
		
		if(str.length()!=3) {
			System.out.println("3 haneli kelime giriniz");
		}
		else {
			System.out.println(str.substring(3)
					+str.substring(2, 3)+str.substring(1, 2)+str.substring(0, 1));
					
		}
		
		
	}
}
