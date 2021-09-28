package com.mobileshop.factory;

import com.mobileshop.models.*;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {

	public static Vehicle buildVehicle(String type) {
		Vehicle vehicle;
		switch (type){
			case "car":
				vehicle = new Car();
				break;
			case "bus":
				vehicle = new Bus();
				break;
			case "agro":
				vehicle = new Agro();
				break;
			case "caravan":
				vehicle = new Caravan();
				break;
			case "motor":
				vehicle = new Motor();
				break;
			case "truck":
				vehicle = new Truck();
				break;
			default:
				return null; //TO DO:
		}
		return vehicle;
	}

}
