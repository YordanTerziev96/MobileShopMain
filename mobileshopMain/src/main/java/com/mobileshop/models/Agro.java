package com.mobileshop.models;

import com.mobileshop.enums.AgroDriveType;
import com.mobileshop.enums.MotorEngineType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Entity
public class Agro extends Vehicle implements Serializable {

	public AgroDriveType getAgroDriveType() {
		return agroDriveType;
	}

	public void setAgroDriveType(AgroDriveType agroDriveType) {
		this.agroDriveType = agroDriveType;
	}

	public int getHoursOfWork() {
		return hoursOfWork;
	}

	public void setHoursOfWork(int hoursOfWork) {
		this.hoursOfWork = hoursOfWork;
	}

	@Enumerated(EnumType.STRING)
	private AgroDriveType agroDriveType;

	@Column(name = "hoursOfWork", nullable = false)
	private int hoursOfWork;

}
