package com.mobileshop.models;

import com.mobileshop.enums.FeatureType;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Feature extends BaseEntity implements Serializable {

    @Enumerated(EnumType.STRING)
    private FeatureType featureType;

    private String description;

    public FeatureType getFeatureType() {
        return featureType;
    }

    public void setFeatureType(FeatureType featureType) {
        this.featureType = featureType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
