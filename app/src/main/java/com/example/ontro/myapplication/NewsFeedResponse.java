package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Ontro on 17-Sep-17.
 */

class NewsFeedResponse {
    @SerializedName("found")
    private Integer found;
    @SerializedName("posts")
    private List<Post> posts = null;
    @SerializedName("meta")
    private Meta meta;

    public Integer getFound() {
        return found;
    }

    public void setFound(Integer found) {
        this.found = found;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

}
