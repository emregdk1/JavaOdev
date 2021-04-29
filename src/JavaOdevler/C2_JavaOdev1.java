package JavaOdevler;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class C2_JavaOdev1 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		System.out.println("6 harfli bir kelime giriniz");
		String  str= scan.next();
		
		if (str.length()!=6) {
			System.out.println("lutfen 6 haneli bir kelime giriniz");
		}
		else {
			System.out.println(str.substring(6)+str.substring(5, 6)+str.substring(4, 5)
			+str.substring(3, 4)+str.substring(2,3)+str.substring(1, 2)+str.substring(0,1));
			
		}
		
			
		
		
		
		
		
	}	
}
