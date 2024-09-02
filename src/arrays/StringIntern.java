package arrays;

public class StringIntern {
public static void main(String[] args) {
	String str="g"; //string pool
	
	String str1=new String ("g");//heap memory
	str1.intern();
	
	System.out.println(str==str1);
	
}
}
