package com.mobileshop.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "MODEL")
public class Model extends BaseEntity implements Serializable {

	@Column(name = "model", nullable = false)
	private String model;

	@ManyToOne
	@JoinColumn(name = "brand_id", nullable = false)
	private Brand brand;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
