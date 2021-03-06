package com.github.danielwojciechowski.TTServer.datamodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Travel {

    private String id;
    private String userUID;

    private String title;
    private String note;

    private List<GeoPoint> trace;
    private List<Photo> photos;


}
