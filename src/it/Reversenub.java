package it;
public class Reversenub {
public static void main(String[] args) {
	int n=1234;
	int rev=0;
	int nun;
	while(n>rev) {
		nun=n%10;
		rev=rev*10+nun ;
		n=n/10;
	}
System.out.println(rev);
}
}