package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Ontro on 17-Sep-17.
 */

class Links {
    @SerializedName("self")
    private String self;
    @SerializedName("help")
    private String help;
    @SerializedName("site")
    private String site;

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getHelp() {
        return help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

}
