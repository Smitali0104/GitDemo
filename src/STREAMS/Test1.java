package STREAMS;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Smitali");
		names.add("Devender");
		names.add("Sushmita");
		names.add("Sonali");
		names.add("Dev");
		
		Long c =names.stream().filter(s->s.startsWith("S")).count();
		System.out.println(c);
		long d = Stream.of("Smitali", "Devender", "Sushmita", "Sonali", "Divya").filter(s->
		{
			s.startsWith("A");
			return false;
		}
		).count();
		System.out.println(d);// it will print 0 as count() only works if the condition returns to true
		
		//to print names of the List based upon a condition
		//Here, the filter condition created a sub-stream of names having length>4 and then printed it
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//If you want to see only a limited no of names from the above result
		names.stream().filter(s->s.length()>4).limit(2).forEach(s->System.out.println(s));
		
		//If you want to print specific names in upper case
		Stream.of("Sushmita", "Divya", "Samarth", "Samantha", "Nick").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//To print specific names in sorted order
		Stream.of("Ajay","Priyanka", "Abhay", "Niharika", "Ashish").filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));

	}

}
