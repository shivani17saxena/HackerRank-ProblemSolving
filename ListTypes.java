import java.util.*;

public class ListTypes{
	public static void main(String[] args){
		//ArrayList
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		System.out.println("Arraylist::: "+ l1.toString());
		
		//LinkedList
		List<Integer> l2 = new LinkedList<Integer>();
		l2.add(10);
		l2.add(20);
		System.out.println("LinkedList::: "+l2);
		
		//Stack
		List<Integer> l3 = new Stack<Integer>();
		l3.add(100);
		l3.add(200);
		System.out.println("Stack::: "+l3.toString());
		
		List<Integer> l4 = new Vector<Integer>(){{add(1000); add(2000);}};
		l4.add(3000);
		System.out.println("Vector::: "+l4);
	}
}