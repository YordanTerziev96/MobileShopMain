package com.mobileshop.models;

import java.util.List;

public class Region {

	private String region;
	private List<SubRegion> subRegions;

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public List<SubRegion> getSubRegions() {
		return subRegions;
	}

	public void setSubRegions(List<SubRegion> subRegions) {
		this.subRegions = subRegions;
	}
}
