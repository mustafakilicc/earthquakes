package com.info.earthquakes.dto;

import com.info.earthquakes.core.dto.BaseDTO;

import java.util.ArrayList;
import java.util.List;

public class FeatureCollection extends BaseDTO {

    public List<Feature> features =new ArrayList<>();

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
}
