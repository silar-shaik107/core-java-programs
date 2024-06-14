package map.and.reduce;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> squares = number.stream().map(n -> n * n)
				                .toList();
		      System.out.println("Squares:"+squares);
		      
		    int sumOfSquares=  number.stream().map(n->n*n)
		    		           .reduce(0,Integer::sum);
		    System.out.println("SumOfSquares:"+sumOfSquares);
	}

}
