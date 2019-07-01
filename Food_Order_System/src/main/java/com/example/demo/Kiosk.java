package com.example.demo;

import java.util.*;



class Kiosk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, String> burger = new HashMap<>();
		burger.put("Single" , "cheese" );
		burger.put("Double" , "cheese");
		burger.put("Single" , "no Pickles");
		burger.put("Double" , "no Pickles");
		
		for(Map.Entry<String, String> entry : burger.entrySet()) {
			System.out.println("Type of burger:" + entry.getKey() + " " + "with" + " " + entry.getValue());
			
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("Do you want a burger?");
			String line = scanner.nextLine();
			System.out.println("The user typed: " + line);
	}
				}
}}

