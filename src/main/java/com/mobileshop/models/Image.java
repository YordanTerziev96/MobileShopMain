package com.mobileshop.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "IMAGE")
public class Image extends BaseEntity implements Serializable {

	@Column
	@Lob
	private byte[] picture;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "advertisement_id")
	private Advertisement advertisement;

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}
}
