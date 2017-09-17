package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Ontro on 17-Sep-17.
 */

class Discussion implements Serializable {
    @SerializedName("comments_open")
    private Boolean commentsOpen;
    @SerializedName("comment_status")
    private String commentStatus;
    @SerializedName("pings_open")
    private Boolean pingsOpen;
    @SerializedName("ping_status")
    private String pingStatus;
    @SerializedName("comment_count")
    private Integer commentCount;

    public Boolean getCommentsOpen() {
        return commentsOpen;
    }

    public void setCommentsOpen(Boolean commentsOpen) {
        this.commentsOpen = commentsOpen;
    }

    public String getCommentStatus() {
        return commentStatus;
    }

    public void setCommentStatus(String commentStatus) {
        this.commentStatus = commentStatus;
    }

    public Boolean getPingsOpen() {
        return pingsOpen;
    }

    public void setPingsOpen(Boolean pingsOpen) {
        this.pingsOpen = pingsOpen;
    }

    public String getPingStatus() {
        return pingStatus;
    }

    public void setPingStatus(String pingStatus) {
        this.pingStatus = pingStatus;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }


}
