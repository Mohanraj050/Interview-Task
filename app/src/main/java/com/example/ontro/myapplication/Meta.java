package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ontro on 17-Sep-17.
 */

class Meta {
    @SerializedName("links")
    private Links links;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
