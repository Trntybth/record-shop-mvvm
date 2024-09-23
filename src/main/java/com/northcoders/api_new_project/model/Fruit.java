package com.northcoders.api_new_project.model;

import com.google.gson.annotations.SerializedName;

public class Fruit {
    @SerializedName("name")
    private String name;
    @SerializedName("id")
    private int id;
    @SerializedName("family")
    private String family;
    @SerializedName("order")
    private String order;
    @SerializedName("genus")
    private String genus;
    @SerializedName("nutritions")

    private Nutritions nutritions;

    public Fruit(String name, int id, String family, String order, String genus, Nutritions nutritions) {
        this.name = name;
        this.id = id;
        this.family = family;
        this.order = order;
        this.genus = genus;
        this.nutritions = nutritions;
    }

    public Fruit() {
    }
}
