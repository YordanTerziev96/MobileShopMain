package com.mobileshop.models;

import com.mobileshop.enums.CategoryType;
import com.mobileshop.enums.GearboxType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
public class Truck extends Vehicle implements Serializable {

	@Column(name = "horsepower", nullable = false)
	private int horsepower;

	@Enumerated(EnumType.STRING)
	private GearboxType gearboxType;

	@Enumerated(EnumType.STRING)
	private CategoryType categoryType;

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}

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

	public int getLoadCapacity() {
		return loadCapacity;
	}

	public void setLoadCapacity(int loadCapacity) {
		this.loadCapacity = loadCapacity;
	}

	@Column(name = "numberOfAxles", nullable = false)
	private int numberOfAxles;

	@Column(name = "loadCapacity", nullable = false)
	private int loadCapacity;
}
