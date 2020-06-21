package day15methodcreation;

import java.util.Scanner;

public class MethodCreationRv03 {

	public static void main(String[] args) {
		// Basit Hesap Makinesi yapimi
		// Kullanicidan yapacagi islemi islem sembolu 
		// ile secmesini saglayalim 
		
		Scanner scan = new Scanner(System.in);
		System.out.print("+ , - , x , : , islemlerinden birisini seciniz :");
		char islem=scan.next().charAt(0);
		
		System.out.print("ilk degeri giriniz : ");
		double num1 = scan.nextDouble();
		System.out.print("ikinci sayiyi giriniz : ");
		double num2 = scan.nextDouble();
		
		calculator(islem,num1, num2);
		
		scan.close();
		
	}
	public static void calculator(char islem, double num1, double num2) {
		switch(islem) {
		
		case '+':
			System.out.println(num1+" + "+num2+" = "+ (num1+num2));
			break;
		case '-':
			System.out.println(num1+" - "+num2+" = "+ (num1-num2));
			break;
		case '*':
			System.out.println(num1+" * "+num2+" = "+ (num1*num2));
			break;
		case '/':
			System.out.println(num1+" / "+num2+" = "+ (num1/num2));
			break;
			
			
			default:
				System.out.println("+ , - , x , : islemlerinden birisini disinda bir islem secmeyin ");
		}
	}

}
