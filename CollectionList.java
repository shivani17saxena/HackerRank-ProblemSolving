import java.util.*;

public class CollectionList{
	public static void main(String[] args){
		List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
		System.out.println("\nArrayList::: "+ l1);
		
		Collections.addAll(l1, 10,20,30);
		//l1.set(0, l1.get(0));
		System.out.println("\nNew List::: "+l1);
		System.out.println("\nList at pos 1::: "+l1.get(1));
		try{
		List<Integer> l2 = Collections.unmodifiableList(Arrays.asList(12,23,34));
		System.out.println("\n\nList2 = " +l2);
		//Collections.addAll(l2,100,200,300);
		//l2.set(0, l2.get(0));
		//System.out.println("Modified l2 = "+ l2);
		//List<Integer> l3 = Collections.singletonList(1,2);
		List<Integer> list = Collections.singletonList(2); 
		System.out.println("List list = "+ list);
		}
		catch(Exception e){
			System.out.println("Exception: "+e);
		}
	}
}