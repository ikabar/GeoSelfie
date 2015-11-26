package com.ikabar.geoselfie;

import android.graphics.Bitmap;

import java.util.Collection;

/**
 * Created by ikabar on 25/11/2015.
 */
public class GeoImage {

    private Bitmap thumbnail;
    private String photoPath;
    Collection<BeaconData> beaconData;

    public GeoImage(Bitmap thumbnail, String photoPath, Collection<BeaconData> beaconData) {
        this.thumbnail = thumbnail;
        this.photoPath = photoPath;
        this.beaconData = beaconData;
    }

    public Bitmap getThumbnail() {
        return thumbnail;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public Collection<BeaconData> getBeaconData() {
        return beaconData;
    }
}
