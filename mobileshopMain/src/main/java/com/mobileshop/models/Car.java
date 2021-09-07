package com.mobileshop.models;


import com.mobileshop.enums.CategoryType;
import com.mobileshop.enums.GearboxType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Car extends Vehicle implements Serializable {

	@Column(name = "horsepower", nullable = false)
	private int horsepower;

	@Enumerated(EnumType.STRING)
	private GearboxType gearboxType;

	@Enumerated(EnumType.STRING)
	private CategoryType categoryType;

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

	public int getHorsepower() {
		return horsepower;
	}

	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
}
