package com.example.hellorest.users;

public class Geo{
    private double  lng;
    private double  lat;

    public Geo() {
    }

    public Geo(double lat, double lng) {
        this.lng = lng;
        this.lat = lat;
    }

    public void setLng(double  lng){
        this.lng = lng;
    }

    public double  getLng(){
        return lng;
    }

    public void setLat(double  lat){
        this.lat = lat;
    }

    public double  getLat(){
        return lat;
    }



}
