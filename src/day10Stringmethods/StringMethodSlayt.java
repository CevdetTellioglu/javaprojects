package day10Stringmethods;

public class StringMethodSlayt {

	public static void main(String[] args) {
		
		String str = "Cat, caterpillar";
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("cat")); 
		System.out.println(str.indexOf("s")); 
		System.out.println(str.indexOf("CAT"));
		System.out.println(str.indexOf("ter")); 
		System.out.println(str.indexOf("pars"));
		
		System.out.println(str.indexOf("a" , 3 )); 
		System.out.println(str.indexOf("at", 2)); 
		System.out.println(str.indexOf("at", 8));
	}

}
