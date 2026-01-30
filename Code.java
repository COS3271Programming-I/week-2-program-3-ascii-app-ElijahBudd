package Project;
import java.text.NumberFormat;

public class ASCII_APP {
	public static void main(String[] args) {

		int x = ((int) (Math.random()*255 + 1));
		System.out.println("The decimal number is: " + x);
		
		String binary = Integer.toBinaryString(x);
		System.out.println("The binary number is: " + binary);
		
		String hex = Integer.toHexString(x);
		System.out.println("The hexadecmial number is: " + hex);
		
		char ascii = (char) x;
		System.out.println("The corresponding ASCII character is: " + ascii);
	}
}
