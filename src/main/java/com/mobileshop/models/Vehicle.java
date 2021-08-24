package com.mobileshop.models;

public abstract class Vehicle {

	protected String brand;
	protected int yearOfCreation;
	protected String engineType;
	protected String region;
	protected String subRegion;
	protected double price;
	protected String colour;
	protected int kmDriven;


	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setYearOfCreation(int yearOfCreation) {
		this.yearOfCreation = yearOfCreation;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public void setSubRegion(String subRegion) {
		this.subRegion = subRegion;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setKmDriven(int kmDriven) {
		this.kmDriven = kmDriven;
	}

	public String getBrand() {
		return brand;
	}

	public int getYearOfCreation() {
		return yearOfCreation;
	}

	public String getEngineType() {
		return engineType;
	}

	public String getRegion() {
		return region;
	}

	public String getSubRegion() {
		return subRegion;
	}

	public double getPrice() {
		return price;
	}

	public String getColour() {
		return colour;
	}

	public int getKmDriven() {
		return kmDriven;
	}
}
