package com.volley.demo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.volley.demo.R;
import com.volley.demo.api.UpcomingMovieListAPI;

import java.util.List;

/**
 * Created by rupesh on 9/6/17.
 */

public class UpcomingMovieAdapter extends RecyclerView.Adapter<UpcomingMovieAdapter.ViewHolder> {
    private List<UpcomingMovieListAPI.Result> results;
    private Context context;

    public UpcomingMovieAdapter(List<UpcomingMovieListAPI.Result> results, Context context) {
        this.results = results;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.upcoming_movie_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        UpcomingMovieListAPI.Result result = results.get(position);
        holder.title.setText("" + result.getTitle());
        holder.description.setText("" + result.getOverview());
        holder.rating.setText("" + result.getVoteAverage());
        holder.subtitle.setText("" + result.getReleaseDate());
    }

    @Override
    public int getItemCount() {
        return results.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private LinearLayout moviesLayout;
        private TextView title;
        private TextView subtitle;
        private TextView description;
        private ImageView ratingImage;
        private TextView rating;

        public ViewHolder(View view) {
            super(view);
            moviesLayout = (LinearLayout) view.findViewById(R.id.movies_layout);
            title = (TextView) view.findViewById(R.id.title);
            subtitle = (TextView) view.findViewById(R.id.subtitle);
            description = (TextView) view.findViewById(R.id.description);
            ratingImage = (ImageView) view.findViewById(R.id.rating_image);
            rating = (TextView) view.findViewById(R.id.rating);
        }
    }
}
