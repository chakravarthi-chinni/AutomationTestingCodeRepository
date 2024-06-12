package org.chax.testing;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;
public class StreamsPrograms {

	@Test
	public void streams() {
		String names[] = {"Lokesh","sam","chakri","venu","Raju","sai","ravi","sam","Raju"};
		
	List<String> listOfNames=Arrays.asList(names);
		//listOfNames.stream().filter(nameList->listOfNames.size()<listOfNames.size()+1).forEach(nameList->System.out.println(nameList));
	List<String> li=listOfNames.stream().filter(s->s.startsWith("s")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(li);
	//listOfNames.stream().filter(s->s.contains("sam")).forEach(name->System.out.println(name));
	List<String> lii=listOfNames.stream().sorted().collect(Collectors.toList());
		System.out.println(lii);
	}
	
	@Test
	public void stream2() {
		List<String> convertedList=  Stream.of("IronMan","SpiderMan","SuperMan","Thor","CaptainAmerica","Natasa","Hulk")
		.sorted().collect(Collectors.toUnmodifiableList());
		System.out.println("list is : "+convertedList);
	}
}
