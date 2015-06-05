package com.github.danielwojciechowski.TTServer.datamodel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Photo {
    private String path;
    private GeoPoint location;
    private String note;

}
