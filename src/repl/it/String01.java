package repl.it;

import java.util.Scanner;

public class String01 {

	void reverseString(String str1) {
		if ((str1 == null) || (str1.length() <= 1))
			System.out.println(str1);
		else {
			System.out.print(str1.charAt(str1.length() - 1));
			reverseString(str1.substring(0, str1.length() - 1));
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		String01 obj = new String01();
		obj.reverseString(sentence);
		sc.close();
	}
}
