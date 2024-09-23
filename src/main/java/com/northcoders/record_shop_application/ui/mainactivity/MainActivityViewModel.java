package com.northcoders.record_shop_application.ui.mainactivity;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.northcoders.record_shop_application.model.Album;
import com.northcoders.record_shop_application.model.AlbumRepository;
import com.northcoders.record_shop_application.service.AlbumApiService;

import java.util.List;

public class MainActivityViewModel extends AndroidViewModel {

    private AlbumRepository albumRepository;
    private MutableLiveData<List<Album>> albumLiveData;
    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        albumRepository = new AlbumRepository(application);
    }
    public LiveData<List<Album>> getAllAlbums() {
       return albumRepository.getMutableLiveData();
    }
}
