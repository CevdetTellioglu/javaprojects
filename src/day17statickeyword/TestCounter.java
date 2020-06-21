package day17statickeyword;

public class TestCounter {
			
	public static void main(String[] args) {
				Counter cs1 =new Counter();
				Counter cs2 =new Counter();
				Counter cs3 =new Counter();
				Counter cs4 =new Counter();
				Counter cs5 =new Counter();
				Counter cs6 =new Counter();
				
				System.out.println("count is: "+cs1.getCount());
				System.out.println("count is: "+cs2.getCount());
				System.out.println("count is: "+cs3.getCount());
				System.out.println("count is: "+cs4.getCount());
				System.out.println("count is: "+cs5.getCount());
				
				
				
				System.out.println("count is: "+ cs6.getCount());
				System.out.println("stCount is: "+ Counter.getStCount());
				

			}
	}

