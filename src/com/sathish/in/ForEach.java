package com.sathish.in;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Naresh");
		al.add("Sathish");

		// Consumer<String> consumer=(t)->{
		// System.out.println(t);
		// };
		al.forEach((i) -> {
			System.out.println(i);
		});
	}
}
