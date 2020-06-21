package repl.it;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array1 {

	public static void main(String[] args) {
		  String arr1[]={"1232", "1134","2345","1022"};
		  String arr2[]={ "Java", "Python", "PHP", "C#", "C Programming", "C++"};
		  List<String> list1 = Arrays.asList(arr1);
		  List<String> list2 = Arrays.asList(arr2);

		  Collections.sort(list1);
		  Collections.sort(list2);
		  
		  System.out.println(list1);
		  System.out.println(list2);
		    

	}

}
