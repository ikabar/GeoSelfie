package com.ikabar.geoselfie.data;


import com.ikabar.geoselfie.BeaconData;
import com.orm.SugarRecord;

import java.util.Collection;

/**
 * Created by ikabar on 25/11/2015.
 */
public class GeoImage extends SugarRecord<GeoImage>{

    private String title;
    private String photoPath;
    Collection<BeaconData> beaconData;

    public GeoImage(){};//Used for SugarRecord

    public GeoImage(String title, String photoPath, Collection<BeaconData> beaconData) {
        this.title = title;
        this.photoPath = photoPath;
        this.beaconData = beaconData;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public Collection<BeaconData> getBeaconData() {
        return beaconData;
    }

    public String getTitle() {
        return title;
    }
}
