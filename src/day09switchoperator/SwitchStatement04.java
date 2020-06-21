package day09switchoperator;

import java.util.Scanner;

public class SwitchStatement04 {

	public static void main(String[] args) {
		// Kullanıcıdan ay ismi alın eğer ay ismi 31 çeken aylardan biri ise ekrana “Bu ay 31 gündür” yazdırın.
		// Eğer ay ismi 30 çeken aylardan biri ise ekrana “Bu ay 30 gündür” yazdırın.
		// Eğer ay ismi 28 veya 29 çeken aylardan biri ise ekrana “Bu ay Şubat ayıdır” yazdırın.
		// Bu isimlerin dışındaki isimler için “Geçersiz ay ismi” yazdırın.
		Scanner scan = new Scanner(System.in);
		System.out.println("Ay ismi giriniz");
		String ay=scan.next();
		ay = ay.toLowerCase();
		
		switch(ay) {
			 case"ocak":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 case"subat":
				 System.out.println("Bu ay 28 veya 29 gundur yazacak");
				 break;
			 case"mart":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 case"nisan":
				 System.out.println("Bu ay 30 gundur yazacak");
				 break;
			 case"mayis":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 case"haziran":
				 System.out.println("Bu ay 30 gundur yazacak");
				 break;
			 case"temmuz":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 case"agustos":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 case"eylul":
				 System.out.println("Bu ay 30 gundur yazacak");
				 break;
			 case"ekim":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 case"kasim":
				 System.out.println("Bu ay 30 gundur yazacak");
				 break;
			 case"aralik":
				 System.out.println("Bu ay 31 gundur yazacak");
				 break;
			 default:
				 System.out.println("Gecersi ay ismi");
		}
		scan.close();
	}

}
