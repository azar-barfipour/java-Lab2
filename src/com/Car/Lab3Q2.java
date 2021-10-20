package com.Car;


import java.util.ArrayList;
import java.util.Random;

public class Lab3Q2 {
	
	static ArrayList<Integer> listNum = new ArrayList<>();

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
		int random = (int) (Math.random() * 49 + 1);
		listNum.add(random);
		}
		
		Lab3Q2 app = new Lab3Q2();
		app.displayList(listNum);
		
		 ArrayList listNum2
         = (ArrayList)listNum.clone();
		 
		 app.modifyNum(9, -5);
		 app.displayList(listNum);
		
	}
	void displayList(ArrayList<Integer> nums) {
		for(Integer num: nums) {
			System.out.println(num);
		}
		System.out.println("*****************");
	}
	
	void modifyNum(int position, Integer newNum) {
		listNum.set(position, newNum);
	}
	

}
