package day30exceptions;

public class TryCatch02Rv {
static String m;
	public static void main(String[] args) {
		String s = "";
		System.out.println(s.length());// 0

		try {
			s += "t";

		} catch (Exception e) {
			s += "c";

		} finally {
			s += "f";
		}
		s += "a";
		System.out.println(s);
		/*
		 * String'e null atandigi zaman veya instance variable'a deger atamasi
		 * yapilmadigindan length() methodu calismaz ve NullPointerException exception
		 * aliriz NullPointerException run time exception dur
		 * 
		 */
		
		//String n = null;
		//Asagidaki iki satirdaki kod da exception verir
		//System.out.println(n.length());
		//System.out.println(m.length());
	}

}
