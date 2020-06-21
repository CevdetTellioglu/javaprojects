package repl.it;

import java.util.Scanner;

public class String8 {

	
		 public static void main(String[] args) {
			    Scanner input = new Scanner(System.in);
			    String str1 = input.nextLine();
			    String str2 = input.nextLine();
			    
			    if(str1.equals(str2) || str2.equals(str1)){
			        System.out.println("True");
			    }else{
			        System.out.println("False");
			    }
			    
		
		
	}

}
