package day21multidimensionalarray;

public class MultiDimensionalArrayHm01 {

	public static void main(String[] args) {
		// 1) Aşağıdaki multi dimensional array’in
		//tum elemanlarının çarpımını ekrana yazdıran bir program yazınız.
		//{ {1,2,3}, {4,5,6} }
		
		int arr[][]= {{1,2,3},{4,5,6}};
		
		int product=1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				product= product*arr[i][j];	
			}	
		}
		System.out.println(product);
		
	}

}
