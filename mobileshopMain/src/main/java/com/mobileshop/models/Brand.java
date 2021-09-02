package com.mobileshop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "BRAND")
public class Brand extends BaseEntity implements Serializable {

	@Column(name = "brand", nullable = false)
	private String brand;

	@OneToMany(mappedBy = "brand")
	private List<Model> models;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public List<Model> getModels() {
		return models;
	}

	public void setModels(List<Model> models) {
		this.models = models;
	}



}
