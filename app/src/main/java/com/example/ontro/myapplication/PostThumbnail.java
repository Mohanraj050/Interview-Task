package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Ontro on 17-Sep-17.
 */

class PostThumbnail implements Serializable {
    @SerializedName("ID")
    private Integer iD;
    @SerializedName("URL")
    private String uRL;
    @SerializedName("guid")
    private String guid;
    @SerializedName("mime_type")
    private String mimeType;
    @SerializedName("width")
    private Integer width;
    @SerializedName("height")
    private Integer height;

    public Integer getID() {
        return iD;
    }

    public void setID(Integer iD) {
        this.iD = iD;
    }

    public String getURL() {
        return uRL;
    }

    public void setURL(String uRL) {
        this.uRL = uRL;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }
}
