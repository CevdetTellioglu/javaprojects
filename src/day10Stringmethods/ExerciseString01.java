package day10Stringmethods;

import java.util.Scanner;

public class ExerciseString01 {

	public static void main(String[] args) {
		// kullanıcıdan bir string ve bir char talep ediyoruz, girilen char.dan girilen stringde kaç tane var öğreniyoruz.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz.");
		String st=scan.nextLine();
		System.out.println("Lutfen bulmak istediginiz harfi yaziniz.");
		char ch=scan.next().charAt(0);
		int lth=st.length();
		int c=0;
		
		for(int i = 0; i<lth;i++) {
			if(st.charAt(i)==ch) {
				c++;
			}
		}
		
		System.out.println(c+" "+ch);
		
		scan.close();

	}

}
