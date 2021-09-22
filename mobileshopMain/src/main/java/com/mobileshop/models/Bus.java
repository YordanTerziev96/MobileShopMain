package com.mobileshop.models;

import com.mobileshop.enums.CategoryType;
import com.mobileshop.enums.GearboxType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
public class Bus extends Vehicle implements Serializable {

	@Enumerated(EnumType.STRING)
	private GearboxType gearboxType;

	public GearboxType getGearboxType() {
		return gearboxType;
	}

	public void setGearboxType(GearboxType gearboxType) {
		this.gearboxType = gearboxType;
	}

	public CategoryType getCategoryType() {
		return categoryType;
	}

	public void setCategoryType(CategoryType categoryType) {
		this.categoryType = categoryType;
	}

	public int getNumberOfAxles() {
		return numberOfAxles;
	}

	public void setNumberOfAxles(int numberOfAxles) {
		this.numberOfAxles = numberOfAxles;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Enumerated(EnumType.STRING)
	private CategoryType categoryType;

	@Column(name = "numberOfAxles", nullable = false)
	private int numberOfAxles;

	@Column(name = "numberOfSeats", nullable = false)
	private int numberOfSeats;

	@Column(name = "loadCapacity", nullable = false)
	private int loadCapacity;

}
