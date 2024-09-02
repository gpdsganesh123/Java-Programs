package newIt;

import java.util.Iterator;

public class Count {
public static void main(String[] args) {
			
	String Str="surya ";
	
//	char c=Str.charAt(0);
//	int a=(int)c;
	
//////////////====Revese String====///////////////////////////////////////////////////////////
	
//	StringBuffer ss=new StringBuffer(Str);
//	ss.reverse().toString();
//	System.out.println(ss+ "    ");

//////////another way
	
//	try {
//	for(int i=4; i>=0; i--) {
//		char emp=Str.charAt(i);
//		System.out.println(emp);
	
//		}
//	}
//	
//	catch(Exception e) {
//		System.out.println(e);
//	}
	//////////////====FeBnooss=====//////////////////////////////
	
	int fst=0;
	int scnd=1;
	int tolno=10;
	
   for(int i=1; i<=tolno; i++) {
		System.out.println(fst+"  ");
	int trd=fst+scnd;
	fst=scnd;
	scnd=trd;
	
	}
	
	
}
}
