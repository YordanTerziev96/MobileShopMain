package com.mobileshop.models;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Vehicle extends BaseEntity implements Serializable {

	@Column(name = "horsepower")
	protected int horsePower;

	@Column(name = "brand", nullable = false)
	protected String brand;

	public int getHorsePower() {
		return horsePower;
	}

	public void setHorsePower(int horsePower) {
		this.horsePower = horsePower;
	}

	@Column(name = "yearOfCreation", nullable = false)
	protected int yearOfCreation;

	@Column(name = "monthOfCreation", nullable = false)
	protected String monthOfCreation;

	@Column(name = "engineType", nullable = false)
	protected String engineType;

	@Column(name = "region", nullable = false)
	protected String region;

	@Column(name = "subRegion", nullable = false)
	protected String subRegion;

	@Column(name = "price", nullable = false)
	protected double price;

	@Column(name = "currency", nullable = false)
	protected String currency;

	@Column(name = "colour", nullable = false)
	protected String colour;

	public String getMonthOfCreation() {
		return monthOfCreation;
	}

	public void setMonthOfCreation(String monthOfCreation) {
		this.monthOfCreation = monthOfCreation;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Advertisement getAdvertisement() {
		return advertisement;
	}

	public void setAdvertisement(Advertisement advertisement) {
		this.advertisement = advertisement;
	}

	@Column(name = "kmDriven", nullable = false)
	protected int kmDriven;

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "advertisement_id", nullable = false)
	private Advertisement advertisement;

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
