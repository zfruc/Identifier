package com.example.zhou.identifier;

/**
 * Created by Zhou on 2017/5/18.
 */

public class CellLoc {
    private int lac = 0;
    private int cid = 0;
    private double lat = 0.0;
    private double lon = 0.0;
    private int BSSS = 0;

    public  CellLoc(int givenlac,int givencid,int givenbsss){
        this.lac = givenlac;
        this.cid = givencid;
        this.BSSS = givenbsss;
    }

    public void setLat(double givenlat){
        this.lat = givenlat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public double getLat()
    {
        return lat;
    }
    public double getLon(){return lon;}

    public double getBSSS() {
        return BSSS;
    }

    public int getCid() {
        return cid;
    }

    public int getLac() {
        return lac;
    }
}
