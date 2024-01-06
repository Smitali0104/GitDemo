package STREAMS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Sort {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Smitali");
		names.add("Devender");
		names.add("Sushmita");
		names.add("Sonali");
		names.add("Dev");
		
		List<String> names1 = Arrays.asList("Abhay", "Ajit", "Priyanka", "Sameera");
		
		//To concatenate 2 strings
		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.forEach(s->System.out.println(s));
		
		//To find if a particular name is there in a List
		boolean flag = names1.stream().anyMatch(s->s.equalsIgnoreCase("ajit"));
		Assert.assertTrue(flag);
		System.out.println(flag);
		
		//To convert the Stream to List
		//toList() method converts to List
		List<String> list = Stream.of("Abhay", "Ajit", "Priyanka", "Sameera").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		for(String ls:list)
		{
			System.out.println(ls);
		}
		
		//To print unique values
		List<Integer> values= Arrays.asList(1,2,3,2,5,2,6,1);
		values.stream().distinct().forEach(s->System.out.println(s));

		//To print the array in a sorted way and show the 3rd index
		List<Integer> lv = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(2);
	}

}
