package com.northcoders.api_new_project.service;

import com.northcoders.api_new_project.model.Fruit;

import java.util.List;

import retrofit2.Call;

public interface ApiService {
    // where Retrofit http methods will be declared
    public Call<List<Fruit>> getAllFruits();
}
