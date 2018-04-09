package demo.showcase.twitterfeed.ui.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import demo.showcase.twitterfeed.R;
import demo.showcase.twitterfeed.core.model.TwitterPost;

/**
 * Created by leslied on 07/04/2018.
 */

public class FeedRecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    List<TwitterPost> postList = new ArrayList<TwitterPost>();
    Picasso picassoModule;


    @Inject
    public FeedRecyclerViewAdapter(Picasso picasso) {
        picassoModule = picasso;
    }

    public void updateDataset(List<TwitterPost> postList){
        this.postList = postList;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        View view = inflater.inflate(R.layout.card_post, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        TwitterPost post = this.postList.get(position);

        ((ViewHolder)holder).setUp(picassoModule, post);

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        @BindView(R.id.postProfileImage)
        ImageView postProfileImage;


        @BindView(R.id.postCreatedAt)
        TextView postCreatedAt;

        @BindView(R.id.postFullText)
        TextView postFullText;

        public void setUp(Picasso picasso, TwitterPost post){
            picasso.load(post.getProfile_image_url()).into(postProfileImage);
            postCreatedAt.setText(post.getCreatedAt());
            postFullText.setText(post.getFull_text());
        }


        public ViewHolder( View itemView) {

            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
