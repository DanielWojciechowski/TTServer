package com.github.danielwojciechowski.TTServer.datamodel;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
public class Travel {

    private String id;

    private Date date;
    private List<GeoPoint> trace;

}
