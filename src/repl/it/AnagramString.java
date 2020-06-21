package repl.it;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
	static void isAnagram(String str1, String str2) { 
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().replaceAll("\\s", "");  
        String s2 = sc.nextLine().replaceAll("\\s", "");  
        boolean status = true;  
        if (s1.length() != s2.length()) {  
            status = false;  
        } else {  
            char[] ArrayS1 = s1.toLowerCase().toCharArray();  
            char[] ArrayS2 = s2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2);  
            status = Arrays.equals(ArrayS1, ArrayS2);  
        }  
        if (status) {  
            System.out.println(s1 + " and " + s2 + " are anagrams");  
        } else {  
            System.out.println(s1 + " and " + s2 + " are not anagrams");  
        }  
    }  
   
    public static void main(String[] args) {  
        isAnagram("earth", "heart");  
    }  

}
