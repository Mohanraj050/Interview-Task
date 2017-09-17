package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Ontro on 17-Sep-17.
 */

class Post implements Serializable{
    @SerializedName("ID")
    private Integer iD;
    @SerializedName("date")
    private String date;
    @SerializedName("title")
    private String title;
    @SerializedName("URL")
    private String uRL;
    @SerializedName("content")
    private String content;
    @SerializedName("discussion")
    private Discussion discussion;
    @SerializedName("like_count")
    private Integer likeCount;
    @SerializedName("featured_image")
    private String featuredImage;
    @SerializedName("post_thumbnail")
    private PostThumbnail postThumbnail;
    @SerializedName("categories")
    private Categories categories;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getURL() {
        return uRL;
    }

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Discussion getDiscussion() {
        return discussion;
    }

    public void setDiscussion(Discussion discussion) {
        this.discussion = discussion;
    }

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public String getFeaturedImage() {
        return featuredImage;
    }

    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    public PostThumbnail getPostThumbnail() {
        return postThumbnail;
    }

    public void setPostThumbnail(PostThumbnail postThumbnail) {
        this.postThumbnail = postThumbnail;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

}
