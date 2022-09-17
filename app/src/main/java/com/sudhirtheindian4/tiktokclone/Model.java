package com.sudhirtheindian4.tiktokclone;

public class Model {
    String videoUrl;
    int profile ;        /// yaha image drawable se lena hai isliye ham yaha
    /// int ka use kr rehe hai lekin firebase ka use krne
    /// par string ka use krna padta
    String name;

    public Model(String videoUrl, int profile, String name) {
        this.videoUrl = videoUrl;
        this.profile = profile;
        this.name = name;
    }

    public Model() {
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
