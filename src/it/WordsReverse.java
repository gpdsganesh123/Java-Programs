package it;

public class WordsReverse {
public static void main(String[] args) {
	String gan="Purna durga surya ganesh ";
	
	String str="";

	String a[] =gan.split(" ");
    
	for(int i=a.length-1; i>=0; i--) {
	
		str=str+a[i]+" ";
}
	
	
    System.out.println(str);
}
}
