package com.bridgelabz.workshopthree;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateName{
	public static void main(String [] args){
    List<Integer> list = List.of(6,2,1,3,6,2,1,3,5,4,8);
	List <Integer>listOne = List.of(6,1,4,4,2,5,9,3,7,6,8);
	
	System.out.println("Input Values : " + list);
	System.out.println ("Input Two List: " + listOne);
	
	List<Integer> result = Stream.concat(list.stream(),list.stream())
	.distinct()  //removing duplicates
	.sorted()    //Sort in Ascending order
	.collect(Collectors.toList());  //Collect to a list
	
	System.out.println("OutPut Values : " + result);
	}
}

