import java.util.*;

public class Im_MutableLists{
	public static void main(String[] srgs){
		 //Immutable list-- instantiating List using Arrays.asList
		 List<Integer> l1 = Arrays.asList(1,2,3);
		 System.out.println("Immutable List:::" + l1.toString());
		 //exception as immuatatble and the action is not supported
		 //l1.add(4);
		 //System.out.println("Immutable List:::" + l1.toString());
		 
		 System.out.println("Mutable list");
		 
		 List<Integer> l2 = new ArrayList<>(Arrays.asList(1,2,3));
		 System.out.println("Mutable List:::" + l2.toString());
		 l2.add(4);
		 l2.add(5);
		 System.out.println("Mutable New List:::" + l2.toString());
	}
}