package com.java.singleton;

public class MakeACaptain {
	
	private static MakeACaptain _captain;
	
	private MakeACaptain(){
		
	}
	
	public static MakeACaptain getCaptain(){
		
		if (_captain == null){
			_captain = new MakeACaptain();
			System.out.println("New captain has been elected");
			
		}
				
		else{
			System.out.println("You already have a captain");
			System.out.println("Send him for the toss");	
		}
		
		return _captain;
	}
	

	
}
