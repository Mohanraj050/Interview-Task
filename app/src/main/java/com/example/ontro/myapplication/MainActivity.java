package com.example.ontro.myapplication;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements NewsFeedAdapter.NewsFeedListener {
    private RecyclerView mNewsFeedListView;
    private Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNewsFeedListView  = (RecyclerView) findViewById(R.id.activity_main_rv);
        mToolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        setSupportActionBar(mToolbar);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null) {
            actionBar.setTitle(Constants.DefaultText.NEWS_FEED);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        mToolbar.setTitleTextColor(ContextCompat.getColor(MainActivity.this, android.R.color.white));

        ApiInterface apiInterface = APIHandler.getClient().create(ApiInterface.class);
        Call<NewsFeedResponse> call = apiInterface.getNewsDetail();
        call.enqueue(new Callback<NewsFeedResponse>() {
            @Override
            public void onResponse(Call<NewsFeedResponse> call, Response<NewsFeedResponse> response) {
                if(response.code() == 200) {
                    if(response.body() != null) {
                        NewsFeedResponse newsFeedResponse = response.body();
                       setAdapter(newsFeedResponse);
                    }
                }
            }

            @Override
            public void onFailure(Call<NewsFeedResponse> call, Throwable t) {

            }
        });
    }

    private void setAdapter(NewsFeedResponse newsFeedResponse) {
        NewsFeedAdapter newsFeedAdapter = new NewsFeedAdapter(MainActivity.this, this, newsFeedResponse.getPosts());
        mNewsFeedListView.setAdapter(newsFeedAdapter);
    }

    @Override
    public void onItemViewClicked(Post post) {
        Intent intent = new Intent(MainActivity.this, NewsFeedDetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.BundleKeys.POST, post);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}