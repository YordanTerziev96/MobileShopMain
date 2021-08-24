package com.mobileshop.factory;

import com.mobileshop.models.Car;
import com.mobileshop.models.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {

	public static Vehicle buildVehicle(String type) {
		Vehicle vehicle;
		switch (type){
			case "car":
				vehicle = new Car();
				break;
			default:
				return null; //TO DO:
		}
		return vehicle;
	}

}
