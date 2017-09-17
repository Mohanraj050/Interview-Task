package com.example.ontro.myapplication;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Ontro on 17-Sep-17.
 */

class Categories implements Serializable {

    @SerializedName("Tennis")
    private Tennis tennis;
    @SerializedName("Cricket")
    private Cricket cricket;

    public Tennis getTennis() {
        return tennis;
    }

    public void setTennis(Tennis tennis) {
        this.tennis = tennis;
    }

    public Cricket getCricket() {
        return cricket;
    }

    public void setCricket(Cricket cricket) {
        this.cricket = cricket;
    }
}
