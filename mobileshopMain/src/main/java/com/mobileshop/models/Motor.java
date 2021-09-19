package com.mobileshop.models;

import com.mobileshop.enums.CategoryType;
import com.mobileshop.enums.GearboxType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
public class Motor extends Vehicle implements Serializable {

	@Column(name = "horsepower", nullable = false)
	private int horsepower;

	@Enumerated(EnumType.STRING)
	private GearboxType gearboxType;

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

	public int getCubature() {
		return cubature;
	}

	public void setCubature(int cubature) {
		this.cubature = cubature;
	}

	public String getCoolingType() {
		return CoolingType;
	}

	public void setCoolingType(String coolingType) {
		CoolingType = coolingType;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	@Enumerated(EnumType.STRING)
	private CategoryType categoryType;

	@Column(name = "cubature", nullable = false)
	private int cubature;

	@Column(name = "CoolingType", nullable = false)
	private String CoolingType;

	@Column(name = "engine", nullable = false)
	private int engine;
}
