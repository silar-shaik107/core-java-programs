package map.and.flatmap.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMap {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("silar", "anil", "hemanth", "vamsi");
        
		
		//Using map to split each word into characters
		List<List<Character>> mappedList = words.stream()
				.map(word -> word.chars().mapToObj(c -> (char) c).collect(Collectors.toList()))
				.collect(Collectors.toList());

		System.out.println("Mapped List: " + mappedList);

		//using flatMap to flatten the list of list into a single list 
		List<Character> flatMappedList = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char) c))
			.collect(Collectors.toList());
		
		System.out.println(flatMappedList);

	}

}
