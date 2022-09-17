package com.sudhirtheindian4.tiktokclone;

import android.content.Context;
import android.media.MediaPlayer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sudhirtheindian4.tiktokclone.databinding.ReelDegineBinding;

import java.util.ArrayList;

public class Adapter extends  RecyclerView.Adapter<Adapter.VideoHHolder>{

    Context context;
    ArrayList<Model> modelArrayList;
    Boolean isPlaying = false;


    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public VideoHHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.reel_degine,parent,false);


        return new VideoHHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoHHolder holder, int position) {
//        holder.binding.videoView.setVideoURI();/// server ya firebase se data lane ke liye

//        Model model = modelArrayList.get(position); // we can use it

        holder.binding.videoView.setVideoPath(modelArrayList.get(position).getVideoUrl());
        holder.binding.name.setText(modelArrayList.get(position).getName());
        holder.binding.profileImage.setImageResource(modelArrayList.get(position).getProfile());

        holder.binding.videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.start();
                isPlaying = true;

            }
        });

        holder.binding.videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                mediaPlayer.start();   //// gana complete hone par gana start kr do
                isPlaying = true;
            }
        });


        holder.binding.videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isPlaying){
                    holder.binding.videoView.pause();
                    isPlaying = false;
                }
                else {
                    holder.binding.videoView.resume();
                    isPlaying =true;

                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }

    public  class VideoHHolder extends RecyclerView.ViewHolder{
        ReelDegineBinding binding;


        public VideoHHolder(@NonNull View itemView) {
            super(itemView);
            binding = ReelDegineBinding.bind(itemView);

        }
    }
}
