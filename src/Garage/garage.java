package Garage;

import java.util.ArrayList;

public class garage {
	
	public double carPrice(int age, boolean isElectric, boolean engineWorking) {
		if (engineWorking == false) {
			return 230.00;	}
		else if(age >= 15) {
			return(230.00 + (1000/age)); }
		else if(age < 15 && isElectric == true) {
			return(1230.00 + (10000/age));}
		else {
			return(1230.00 + (5000/age));	}
	}
	
	public double 
	
	public static void main(String[] args) {

		car car1 = new car("Audi", "A3", 10, false, true);
		tank tank1 = new tank("Vauxhaul", "Churchill BP", 70, true, 0);
		car car2 = new car("Skoda", "Fabia", 15, true, false);
		
		ArrayList<vehicle> myVehicles = new ArrayList<vehicle>();
		myVehicles.add(car1);
		myVehicles.add(tank1);
		myVehicles.add(car2);
		
}
}