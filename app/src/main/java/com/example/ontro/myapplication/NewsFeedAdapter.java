package com.example.ontro.myapplication;

import android.content.Context;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Ontro on 17-Sep-17.
 */

class NewsFeedAdapter extends RecyclerView.Adapter<NewsFeedAdapter.NewsFeedViewHolder> {
    private List<Post> mPosts = new ArrayList<>();
    private Context mContext;
    private NewsFeedListener mNewsFeedListener;

    public NewsFeedAdapter(Context context, NewsFeedListener newsFeedListener, List<Post> posts) {
        mContext = context;
        mPosts = posts;
        mNewsFeedListener = newsFeedListener;
    }

    @Override
    public NewsFeedViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.inflater_news_feed_item_list, parent, false);
        return new NewsFeedViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final NewsFeedViewHolder holder, final int position) {
        final Post post = mPosts.get(position);
        holder.mNewsFeedTitleView.setText(post.getTitle());
        Glide.with(mContext)
                .load(post.getFeaturedImage())
                .dontAnimate()
                .into(holder.mNewsFeedImageView);

        holder.mNewsFeedImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mNewsFeedListener != null) {
                    holder.mNewsFeedImageView.setTransitionName(mContext.getString(R.string.activity_image_transition));
                    holder.mNewsFeedTitleView.setTransitionName(mContext.getString(R.string.activity_text_transition));
                    mNewsFeedListener.onItemViewClicked(v, post);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mPosts.size();
    }

    public class NewsFeedViewHolder extends RecyclerView.ViewHolder {
        private TextView mNewsFeedTitleView;
        private ImageView mNewsFeedImageView;

        public NewsFeedViewHolder(View itemView) {
            super(itemView);
            mNewsFeedTitleView = (TextView) itemView.findViewById(R.id.inflater_news_feed_item_list_tv);
            mNewsFeedImageView = (ImageView) itemView.findViewById(R.id.inflate_news_feed_item_list_iv);
        }
    }

    public interface NewsFeedListener {

        void onItemViewClicked(View v, Post post);
    }
}
