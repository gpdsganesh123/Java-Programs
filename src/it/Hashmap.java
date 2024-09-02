package it;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		
		String myName="PURNADURGASURYAGANESH";
		
		char GG[]=myName.toCharArray();
		HashMap<Character,Integer> H=new HashMap<Character,Integer>();
		for(char AA:GG) {
			if(H.containsKey(AA)) {
				H.put(AA, H.get(AA)+1);
			}
			else {
				H.put(AA,1);
			}
			
			
		}

		System.out.println(H+"     ");
		
	}
	
	
	
}
