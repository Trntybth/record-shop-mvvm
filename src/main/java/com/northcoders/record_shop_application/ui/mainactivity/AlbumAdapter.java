package com.northcoders.record_shop_application.ui.mainactivity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import com.northcoders.api_new_project.R;
import com.northcoders.api_new_project.databinding.AlbumItemBinding;
import com.northcoders.record_shop_application.model.Album;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {

    private List<Album> albumList;
    private Context context;
    public static class AlbumViewHolder extends RecyclerView.ViewHolder {
        public AlbumItemBinding albumItemBinding;
        public AlbumViewHolder(AlbumItemBinding albumItemBinding) {
            super(albumItemBinding.getRoot());
            this.albumItemBinding = albumItemBinding;
        }
    }

    public AlbumAdapter(List<Album> albumList, Context context) {
        this.context = context;
        this.albumList = albumList;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        AlbumItemBinding albumItemBinding = DataBindingUtil
                .inflate(LayoutInflater.from(parent.getContext()),
                        R.layout.album_item,
                        parent,
                        false);
        return new AlbumViewHolder(albumItemBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album album = albumList.get(position);
        holder.albumItemBinding.setAlbum(album);
    }


    @Override
    public int getItemCount() {
        return albumList.size();
    }


}
