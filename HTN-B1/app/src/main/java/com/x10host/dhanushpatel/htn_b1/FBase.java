package com.x10host.dhanushpatel.htn_b1;

import com.google.firebase.database.Exclude;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by chapatel on 9/17/16.
 */
public class FBase {
    public double accelX, accelY, accelZ, gpsLat, gpsLong, lightSensor, sonicSensor, soundSensor, tempSensor, whichButtonInt;

    public FBase() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public FBase( double accelX, double accelY, double accelZ, double gpsLat, double gpsLong, double lightSensor, double sonicSensor, double soundSensor, double tempSensor, double whichButtonInt) {
        this.accelX = accelX;
        this.accelY = accelY;
        this.accelZ = accelZ;
        this.gpsLat = gpsLat;
        this.gpsLong = gpsLong;
        this.lightSensor = lightSensor;
        this.sonicSensor = sonicSensor;
        this.soundSensor = soundSensor;
        this.tempSensor = tempSensor;
        this.whichButtonInt = whichButtonInt;
    }

    // [START post_to_map]
    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("accelX",accelX);
        result.put("accelY", accelY);
        result.put("accelZ", accelZ);
        result.put("gpsLat",gpsLat);
        result.put("lightSensor",lightSensor);
        result.put("sonicSensor",sonicSensor);
        result.put("soundSensor",soundSensor);
        result.put("tempSensor",tempSensor);
        result.put("whichButtonInt",whichButtonInt);

        return result;
    }
}
