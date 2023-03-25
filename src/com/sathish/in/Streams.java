package com.sathish.in;

import java.util.ArrayList;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<Integer>();
		al.add(10);	
		al.add(15);
		al.add(20);
		al.add(25);
		al.add(11);
		
		al.stream().filter((x->x%2==0)).forEach((t->{
			System.out.println(t);
		}));

	}

}
