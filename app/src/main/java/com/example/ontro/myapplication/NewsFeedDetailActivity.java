package com.example.ontro.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class NewsFeedDetailActivity extends AppCompatActivity {
    private ImageView mNewsFeedImageView;
    private TextView mNewsFeedTitleView, mNewsFeedContentView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_feed_detail);
//        overridePendingTransition(R.anim.fadein, 0);
        initView();
        setValue();
    }

    private void initView() {
        mNewsFeedImageView = (ImageView) findViewById(R.id.activity_news_feed_detail_iv);
        mNewsFeedTitleView = (TextView) findViewById(R.id.activity_news_feed_detail_tv_title);
        mNewsFeedContentView = (TextView) findViewById(R.id.activity_news_feed_detail_tv_description);

    }

    private void setValue() {
        if(getIntent() != null) {
            Bundle bundle = getIntent().getExtras();
            Post post = (Post) bundle.getSerializable(Constants.BundleKeys.POST);
            if(post != null) {
                mNewsFeedImageView.setTransitionName(getString(R.string.activity_image_transition));
                mNewsFeedTitleView.setTransitionName(getString(R.string.activity_text_transition));

                mNewsFeedTitleView.setText(post.getTitle());
                mNewsFeedContentView.setText(post.getContent());
                Glide.with(NewsFeedDetailActivity.this)
                        .load(post.getFeaturedImage())
                        .dontAnimate()
                        .into(mNewsFeedImageView);
            }
        }
    }
}
