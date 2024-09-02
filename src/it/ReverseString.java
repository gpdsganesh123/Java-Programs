package it;

public class ReverseString {
public static void main(String[] args) {
//	int a=100;
//	int b=200;
//	System.out.println("swapping of two no is.."+a+" "+b+"");
// int x=a;
//	a=b;
//	b=x;
//	System.out.println("swapping of two no is.."+a+" "+b);	
//	
	//----------------------------------------------------------------
	
	
	// -----------------R E V E R S E S T R I N G----------------------
//	String name="GANISETTI";
//	char g[]=name.toCharArray();
//	
//	
//	String rev="";
//	int count=name.length();
//	for(int i=count-1;i>=0;i-- ) {
//		rev=rev+name.charAt(i);
//	}
//	System.out.println("my surname is "+rev);
//
//-------------------------------------------------------------------------
	
	String Village="Amalapuram";
	int cnt=Village.length();
	System.out.println(cnt);
	StringBuffer SS=new StringBuffer(Village);
	System.out.println(SS.reverse());
	
	
}
}
