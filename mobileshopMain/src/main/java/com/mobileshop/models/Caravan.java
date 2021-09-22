package com.mobileshop.models;

import com.mobileshop.enums.AgroDriveType;
import com.mobileshop.enums.CaravanACType;
import com.mobileshop.enums.CaravanHeatingType;
import com.mobileshop.enums.CaravanToiletType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
public class Caravan extends Vehicle implements Serializable {

	@Column(name = "numberOfBeds", nullable = false)
	private int numberOfBeds;

	@Column(name = "length", nullable = false)
	private int length;

	public int getNumberOfBeds() {
		return numberOfBeds;
	}

	public void setNumberOfBeds(int numberOfBeds) {
		this.numberOfBeds = numberOfBeds;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public CaravanHeatingType getHeatingType() {
		return heatingType;
	}

	public void setHeatingType(CaravanHeatingType heatingType) {
		this.heatingType = heatingType;
	}

	public CaravanACType getACType() {
		return ACType;
	}

	public void setACType(CaravanACType ACType) {
		this.ACType = ACType;
	}

	public CaravanToiletType getToiletType() {
		return toiletType;
	}

	public void setToiletType(CaravanToiletType toiletType) {
		this.toiletType = toiletType;
	}

	@Enumerated(EnumType.STRING)
	private CaravanHeatingType heatingType;

	@Enumerated(EnumType.STRING)
	private CaravanACType ACType;

	@Enumerated(EnumType.STRING)
	private CaravanToiletType toiletType;
}
