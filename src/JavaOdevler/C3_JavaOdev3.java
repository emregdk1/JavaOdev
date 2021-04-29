package JavaOdevler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C3_JavaOdev3 {

	public static void main(String[] args) {
		/*
         * Verilen array’deki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir program yaziniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
		
		int arr [] = {1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i<arr.length; i++) {
            set.add(arr[i]);
        }
        System.out.println(set);
		
		
 
	}
}
