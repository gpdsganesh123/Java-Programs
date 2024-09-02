package it;

public class Fibnocciseries {
public static void main(String[] args) {
	
	int prev=0, prese=1, n=7, next;
	for(int i=0;i<=n;i++) {
		next=prev+prese;
		System.out.println(""+next);
		prev=prese;
		prese=next;	
}
}
	
	
}
