package day18statickeyword;

public class ThisKeyword1  {
	int x = 1;
	static int y = 2;
	ThisKeyword1(int x){
        this();
		this.x = x;
	}
   ThisKeyword1(){
		this.y = 3;
	}	
	public static void main(String[] args) {
		ThisKeyword1 obj = new ThisKeyword1(4);
        System.out.println(obj.x + obj.y);
	}
}

