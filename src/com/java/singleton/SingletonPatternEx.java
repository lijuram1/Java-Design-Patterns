package com.java.singleton;

public class SingletonPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Selecting the Captain for the first time");
		MakeACaptain c1 = MakeACaptain.getCaptain();
		System.out.println("Selecting the Captain again");
		MakeACaptain c2 = MakeACaptain.getCaptain();
		
		if (c1 ==c2)
			System.out.println("c1 and c2 are of the same instance.");

	}

}
