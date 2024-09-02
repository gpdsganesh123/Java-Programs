package it;

public class Reverse {

	public static void main(String[] args) {


		int ganesh=1234;
		int rev =0;
		while(ganesh!=0) {
			int value=ganesh%10;
			rev=rev*10+value;
			System.out.println(rev);
			ganesh=ganesh/10;
			
		}
		
		
	}
	
	}
