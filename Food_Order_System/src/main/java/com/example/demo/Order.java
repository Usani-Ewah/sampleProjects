package com.example.demo;

import javax.persistence.Id;

import java.util.HashMap;
import java.util.Scanner;

import javax.persistence.GeneratedValue;

public class Order {
	
	public Order(String burger, String drink) {
		super();
		this.burger = burger;
		this.drink = drink;
	}
	@Override
	public String toString() {
		return "Order [burger=" + burger + ", drink=" + drink + "]";
	}
	public String getBurger() {
		return burger;
	}
	public void setBurger(String burger) {
		this.burger = burger;
	}
	public String getDrink() {
		return drink;
	}
	public void setDrink(String drink) {
		this.drink = drink;
	}
	@Id
	@GeneratedValue
	public Long Id;
	public String burger;
	public String drink;

	
	
}
