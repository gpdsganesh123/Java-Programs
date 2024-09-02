package arrays;

public class CountChar {
public static void main(String[] args) {
	String Names="AAABBBGGGIUWERTYUJF";
	
	int []gani=new int [256];
	
	for(int i=0;i<Names.length(); i++) {
		char c=Names.charAt(i);
		int A=(int)c;
		gani[A]++;
		
	}
	
for(int i=0;i<256;i++) {
     if(gani[i]!=0) {
    	System.out.println((char)i+gani[i]);
    	
     }
	}
	
	
}
}
