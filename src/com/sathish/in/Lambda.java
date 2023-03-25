package com.sathish.in;

@FunctionalInterface
interface A {
	public String getUserName();
}

public class Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A obj = () -> {
			return "SathishDyno";
		};
		System.out.println(obj.getUserName());

	}

}
