import java.util.*;

class ArrayListString{
	public static void main(String[] args){
		ArrayList<String> l1 = new ArrayList< String>();
		l1.add("Ravi");
		l1.add("Savi");
		l1.add("Tavi");
		l1.add("Uvii");
		//System.out.println(l1);
		
		// FOREACH
		/*
		for(String s: l1)
		{System.out.println(s);}			
		*/
		
		//ITERATOR
		Iterator itr = l1.iterator();
		if(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}