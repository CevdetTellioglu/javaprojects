package day37collections;

import java.util.Deque;
import java.util.LinkedList;

public class Dequeue {

	public static void main(String[] args) {
		// Deque : Dobuble Ended Queue (iki uclu Queue)
		// Queue'larda ekleme sona yapilir, silme bastan yapilir
		// Deque kullanirsaniz eklemeyi hem basa hemde sona yapabilirsiniz 
		// ayni sekilde silmeyi de hem bastan hem sondan yapabilirisiniz
		// Deque'da FIFO var bunun yaninda LIFO(Last In First Out) da var
		// Deque resizable'dir yani; kapasitesi degistirelebilir 
		
		// Queue'lara eleman olarak null eklenebilir ama Deque'lara null eleman 
		// olarak eklenemez
		
		Deque<String> dq = new LinkedList<String>();
		dq.add("Son1");
		dq.addFirst("Bas1");
		dq.addLast("Son2");
		dq.push("Bas2"); // push() methodu en basa ekleme yapar
		dq.offer("Son3"); // offer() methodu en sona ekleme yapar
		dq.offerFirst("Bas3");// offerFirst() en basa ekleme yapar
		dq.offerLast("Son4"); // offerLast() en sona ekleme yapar
		
		System.out.println(dq); // [Bas3, Bas2, Bas1, Son1, Son2, Son3, Son4]
		
		//pop() methodu Deque larda bastaki elemani siler ve bastaki elemani return eder
		
		System.out.println(dq.pop()); //Bas3
		System.out.println(dq); //[Bas2, Bas1, Son1, Son2, Son3, Son4]
		System.out.println(dq.removeLast());//Son4
		System.out.println(dq);//[Bas2, Bas1, Son1, Son2, Son3]
		
		System.out.println(dq.removeFirst());// Bas2
		System.out.println(dq);//[Bas1, Son1, Son2, Son3]
		
	}

}
