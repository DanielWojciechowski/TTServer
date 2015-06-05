package com.github.danielwojciechowski.TTServer.datamodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GeoPoint {

    private double latitude;
    private double longitude;
    private Date date;


}
