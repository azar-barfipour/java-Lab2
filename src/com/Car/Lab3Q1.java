package com.Car;


import java.util.ArrayList;

public class Lab3Q1 {
	
	static ArrayList<Integer> listNum = new ArrayList<>();

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
		int random = (int) (Math.random() * 49 + 1);
		listNum.add(random);}
		
		Lab3Q1 app = new Lab3Q1();
		app.displayList(listNum);
		
		app.modifyNum(9, -5);
		app.displayList(listNum);
		
		
		//Search
		int position = app.search(1);
		
		if(position != -1) {
			System.out.println(listNum.get(position));
		}else {
			System.out.println("Invalid Entry");
		}
	
	}
	void displayList(ArrayList<Integer> nums) {
		for(Integer num: nums) {
			System.out.println(num);
		}
		System.out.println("*****************");
	}
	

	int search(Integer num) {
		return listNum.indexOf(num);
	}
	void modifyNum(int position, int newNum) {
		listNum.set(position, newNum);
	}

}
