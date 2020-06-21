package repl.it;

public class Method13 {

	public static void main(String[] args) {
		// Bir sayı asal olduğunda true, aksi halde false çıktısı return eden bir Java
		// Methodu yazınız.

		System.out.println(isPrime(17));
	}

	public static boolean isPrime(int num) {

		int i, m = 0, flag = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			return false;
		} else {
			for (i = 2; i <= m; i++) {
				return false;
				
			}
		}
		if (flag == 0) {
			return true;
		}
		return false;
	}// end of else
}
