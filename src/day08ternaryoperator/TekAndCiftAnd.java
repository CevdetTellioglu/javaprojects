package day08ternaryoperator;

public class TekAndCiftAnd {

	public static void main(String[] args) {
		int a = 2;
		int b = 3;
		int c = 4;
		int d = 5;
		int e = 6;
		System.out.println(b<a && d>c);
		
		System.out.println(b<a && d>c && e>c);
		//&& kullanirsaniz Java ilk False u bulduktan sonra diger kontrolleri yapmaz.
		// bu da Java'nin  yukunu azaltir. yukun azaltilmasi suresi kazandirir ve Java hata yapma
		// riskini azaltir
		
		System.out.println(b<a & d>b);
		
		//& kullanirsaniz Java ilk False u bulduktan sonra diger kontrolleri yapar.
		// bu da Java icin iyi degildir, cunku sonucu belli olan bir islem icin hala emek sarfediyor
		
		
		
	}

}
