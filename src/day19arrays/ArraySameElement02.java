package day19arrays;

public class ArraySameElement02 {

	public static void main(String[] args) {
		int myArray[]= {1,23,43,54,6567,34,23,45,456};
		int myArray1[]= new int[myArray.length];
		
		int count = 0 ;
		
		for(int i=0 ; i<myArray.length;i++) {
			for(int a=i+1; a<myArray.length; a++) {
				if(myArray[i]== myArray[a]) {
					myArray1[count] = myArray[i];
					count++;
				}
			}
		}
		
		if(count> 0) {
			for(int s=0; s< count; s++) {
				System.out.println(count+ " Same element find "+ " " +myArray1[s] + " ");
			}
		}else {
			System.out.println("not same element");
		}
		
		

	}

}
