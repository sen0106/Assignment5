
public class writeChars {
	public static void main(String[] args) {
		for(int i = 1; i <= 8; i++) {
			writeChars(i);
			System.out.println();
		}
	}
	
	public static void writeChars(int i) {
		if(i < 1) {
			throw new IllegalArgumentException();
		} else if (i == 1) {
			System.out.print("*");
		} else if (i == 2) {
			System.out.print("**");
		} else {
			System.out.print("<");
			writeChars(i - 2);
			System.out.print(">");
		}
	}
}
	