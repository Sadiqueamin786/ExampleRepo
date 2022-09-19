package hello;

public class Reverse {

	public static void main(String[] args) {
		int r=987654, rev=0;
		while(r!=0) {
			int remainder=r%10;
			rev=rev*10+remainder;
			r=r/10;
		}
		System.out.println(rev);
	}

}
