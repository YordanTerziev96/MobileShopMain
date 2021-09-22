package com.mobileshop.models;

import com.mobileshop.enums.CategoryType;
import com.mobileshop.enums.GearboxType;
import com.mobileshop.enums.MotorEngineType;
import com.mobileshop.enums.MotorTypeOfCooling;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
public class Motor extends Vehicle implements Serializable {

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

	public int getCubature() {
		return cubature;
	}

	public void setCubature(int cubature) {
		this.cubature = cubature;
	}

	public MotorTypeOfCooling getCoolingType() {
		return CoolingType;
	}

	public void setCoolingType(MotorTypeOfCooling coolingType) {
		CoolingType = coolingType;
	}

	public int getEngine() {
		return engine;
	}

	public void setEngine(int engine) {
		this.engine = engine;
	}

	public MotorEngineType getMotorEngineType() {
		return motorEngineType;
	}

	public void setMotorEngineType(MotorEngineType motorEngineType) {
		this.motorEngineType = motorEngineType;
	}

	@Enumerated(EnumType.STRING)
	private CategoryType categoryType;

	@Column(name = "cubature", nullable = false)
	private int cubature;

	@Enumerated(EnumType.STRING)
	private MotorTypeOfCooling CoolingType;

	@Enumerated(EnumType.STRING)
	private MotorEngineType motorEngineType;

	@Column(name = "engine", nullable = false)
	private int engine;
}
