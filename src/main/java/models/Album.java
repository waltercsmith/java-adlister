package models;

import java.io.Serializable;



//    JavaBean or model for album entity
public class Album implements Serializable {



    private int id;
    private String artist;
    private String name;
    private int release_Date;
    private float sales;
    private String genre;

    public Album(){ } //    <--- Empty constructor is  REQUIRED!!!

    public Album(int id, String artist, String name, int release_Date, float sales, String genre){

        this.id = id;
        this.artist = artist;
        this.name = name;
        this.release_Date = release_Date;
        this.sales = sales;
        this.genre = genre;
    }

//        getters and setters below


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public int getRelease_Date() {
        return release_Date;
    }

    public void setRelease_Date(int release_Date) {
        this.release_Date = release_Date;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(float sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }




}
