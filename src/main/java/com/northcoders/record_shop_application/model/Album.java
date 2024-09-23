package com.northcoders.record_shop_application.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.northcoders.api_new_project.BR;

public class Album extends BaseObservable {
    private String id;
    private String title;
    private String artist;
    private String releaseYear;
    private String genre;
    private String stockTracker;

    @Bindable
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }
    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
    @Bindable
    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
        notifyPropertyChanged(BR.artist);
    }
    @Bindable
    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
        notifyPropertyChanged(BR.releaseYear);
    }
    @Bindable
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
        notifyPropertyChanged(BR.genre);
    }
    @Bindable
    public String getStockTracker() {
        return stockTracker;
    }

    public void setStockTracker(String stockTracker) {
        this.stockTracker = stockTracker;
        notifyPropertyChanged(BR.stockTracker);
    }

    public Album(String id, String title, String artist, String releaseYear, String genre, String stockTracker) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.stockTracker = stockTracker;
    }

    public Album() {}

}
