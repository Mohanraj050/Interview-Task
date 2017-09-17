package com.example.ontro.myapplication;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Ontro on 17-Sep-17.
 */

public interface ApiInterface {

    // getting same data in three different ways.
    @GET("posts?fields=ID,title,URL,date,featured_image,post_thumbnail,content,discussion,like_count,categories&number=3")
    Call<NewsFeedResponse> getNewsDetail();

}