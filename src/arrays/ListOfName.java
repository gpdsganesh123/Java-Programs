package arrays;


public class ListOfName {

	public static void main(String[] args) {
		
		String myname ="SSSAAAHAASDGAD";
		int count=0;
		for(int i=0;i<myname.length();i++) {
			if(myname.charAt(i)=='S') {
				count++;

			}
			if(myname.charAt(i)=='A') {
				count++;

			}
			if(myname.charAt(i)=='H') {
				count++;

			}

		}
		System.out.println(count);

	} 
	}
