package day20arrays;

public class ArraysSlayt20eps2 {

	public static void main(String[] args) {

		int[] x = { 2, 1, 4, 5, 7 };
		int limit = 3;
		int i = 0;
		int sum = 0;
		while ((sum < limit) && (i < x.length)) {
			i++;
			sum = sum + x[i];
		}
		System.out.println(sum);

		int[] x1 = { 0, 1, 2, 3 };
		int[] x2 = { 0, 1, 2, 3 };
		int i1 = 0;
		int i2 = 0;
		int count = 0;
		while ((i1 < x1.length) && (i2 < x2.length)) {
			if (x1[i1] == x2[i2]) {
				count++;
				i2++;
			} else if (x1[i1] > x2[i2]) {
				i1++;
			} else {
				System.out.println(x1[i1] > x2[i2]);
				i2++;
			}
		}
		System.out.println(count);
	}

}
