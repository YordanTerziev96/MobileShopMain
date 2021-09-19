package com.mobileshop.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Caravan extends Vehicle implements Serializable {

	@Column(name = "numberOfBeds", nullable = false)
	private int numberOfBeds;

	@Column(name = "length", nullable = false)
	private int length;

	//TO DO:
}
