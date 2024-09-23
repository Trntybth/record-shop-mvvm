package com.northcoders.record_shop_application.service;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetroFitInstance {
    private static Retrofit retrofit = null;
    private static final String baseURL = "http://10.0.2.2:8080/api/v1/"; // double check this later ?

    public static AlbumApiService getService() {
        if (retrofit == null) {
            // this allows us to log the JSON body of the HTTP request
            HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor();
            loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            OkHttpClient client = new OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .build();

            retrofit = new Retrofit.Builder()
                    .baseUrl(baseURL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit.create(AlbumApiService.class);
    }
}
