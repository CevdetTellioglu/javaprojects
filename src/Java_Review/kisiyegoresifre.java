package Java_Review;

import java.util.Scanner;

public class kisiyegoresifre {

	public static void main(String[] args) {
		
		/* 
        scanner kullanarak aşağıdaki sorulara cevaplar isteyiniz
        1.Adım: 3 adet String tanımlayınız. ad, soyad, rapor
        2.Adım: 2 adet integer tanımlayınız  doğum yılı, şimdiki yıl
        3.Adım: Kullanıcıdan; "Lütfen adınızı ve soy adınızı giriniz:" isteyin
                 Harun
                 Ekinci
        4.Adım: Kullanıcıdan;"Lütfen doğum yılınızı ve şimdiki yılı giriniz:" isteyin
                 1983
                 2020        
        5.Adım Raporu aşağıdaki gibi yazdırınız      
                "Adınız: Harun, Soy adınız: Ekinci, Yaşınız: 37"
        6. Adım: Yaşınız,Adınızın ilk harfi, soyadınızın ilk ve son harfi, isim ve soyisim karakter uzunluklarını içeren bir şifre oluşturunuz
           //Şifre= 37HEi56        
        */
		Scanner sc= new Scanner(System.in);
		String ad,soyAd,rapor;
		int d_yil,b_yil;
		
		System.out.println("Lutfen adinizi giriniz.");
		ad=sc.nextLine();
		System.out.println("Lutfen soyadinizi giriniz");
		soyAd=sc.nextLine();
		System.out.println("Lutfen dogum yilinizi giriniz.");
		d_yil=sc.nextInt();
		System.out.println("Lutfen simdiki yili giriniz.");
		b_yil=sc.nextInt();
		int yas=(b_yil-d_yil);
		rapor="Adiniz: "+ad+" Soyadiniz: "+soyAd+" Yasiniz: "+yas;
		
		System.out.println(rapor);
		String sifre= yas+ad.substring(0,1)+soyAd.charAt(0)
		+soyAd.charAt(soyAd.length()-1)+ad.length()+soyAd.length();
		System.out.println("Sifreniz: "+sifre);
		sc.close();
		
	}

}
