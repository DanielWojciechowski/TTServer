package com.github.danielwojciechowski.TTServer.datamodel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GeoPoint {

    private double latitude;
    private double longitude;


}
