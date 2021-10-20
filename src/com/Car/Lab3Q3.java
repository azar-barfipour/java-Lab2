package com.Car;
import java.util.ArrayList;
import java.util.Comparator;




public class Lab3Q3 {
	

	public static void main(String[] args) {
		
		ArrayList<Car> carList= new ArrayList<>();
		
			carList.add(new Car("Tesla","Hybrid",2000));
			carList.add(new Car("Ford","E50",2019));
			
			carList.sort(Comparator.comparing(e -> e.year));
		    System.out.println(carList);
}



}
