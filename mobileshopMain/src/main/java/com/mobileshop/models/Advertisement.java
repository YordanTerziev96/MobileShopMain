package com.mobileshop.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "ADVERTISEMENT")
public class Advertisement extends BaseEntity implements Serializable {

	@OneToOne(fetch = FetchType.EAGER,
			cascade =  CascadeType.ALL,
			mappedBy = "advertisement")
	private Vehicle vehicle;

	@Column(name = "description", nullable = false)
	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(mappedBy = "advertisement", cascade = CascadeType.ALL)
	private List<Image> images;

	public List<Image> getImages() {
		return images;
	}

	public void setImages(List<Image> images) {
		this.images = images;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
}
