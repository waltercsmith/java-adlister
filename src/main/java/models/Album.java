package models;

import java.io.Serializable;
import java.util.Date;


//    JavaBean or model for album entity
public class Album implements Serializable {

    private String artist;
    private String name;
    private Date release_Date;
    private double sales;
    private String genre;

    public Album(){ }

//        getters and setters below


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRelease_Date() {
        return release_Date;
    }

    public void setRelease_Date(Date release_Date) {
        this.release_Date = release_Date;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}
