 import java.util.Scanner;
public class Main { 
	 public static void main(String[] args) {
		  Scanner in = new Scanner(System.in);
	        System.out.print("Input number: ");
	        int input = in.nextInt();
	          // Write your code here
	        if(input>0){
	          System.out.println("Sayı Pozitif");
	          } else if (input<0){
	            System.out.println("Sayı Negatif");
	          }else{
	            System.out.println("Sayı Notr");
	          }
	        in.close();
	    }
	}