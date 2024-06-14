package SortedListUsingStreams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortedList {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(21);
		list.add(2);
		list.add(45);
		list.add(63);
		list.add(8);
		
		Collections.sort(list);//Assending order
		System.out.println(list);
		
		Collections.reverse(list);//Desending order
		System.out.println(list);
		
		//using streams
	    //Assending Order
		list.stream().sorted().forEach(t->System.out.println(t));
		//desending order
		list.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.println(t));
	}

}
