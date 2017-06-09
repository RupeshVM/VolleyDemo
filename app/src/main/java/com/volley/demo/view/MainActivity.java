package com.volley.demo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.volley.demo.AppController;
import com.volley.demo.R;
import com.volley.demo.adapter.UpcomingMovieAdapter;
import com.volley.demo.api.UpcomingMovieListAPI;
import com.volley.demo.constants.AppConstants;

import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static com.android.volley.Request.Method.GET;

public class MainActivity extends AppCompatActivity implements Response.ErrorListener, Response.Listener<JSONObject> {

    private UpcomingMovieAdapter upcomingMovieAdapter;
    private List<UpcomingMovieListAPI.Result> results = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recycler_view_upcoming_movie = (RecyclerView) findViewById(R.id.recycler_view_upcoming_movie);
        upcomingMovieAdapter = new UpcomingMovieAdapter(results, this);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recycler_view_upcoming_movie.setLayoutManager(layoutManager);
        recycler_view_upcoming_movie.setLayoutManager(layoutManager);
        recycler_view_upcoming_movie.setAdapter(upcomingMovieAdapter);
        sendRequest();
    }

    /**
     * Called when
     */
    private void sendRequest() {
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(GET, AppConstants.UpcomingAPIURL, null, this, this);
        AppController.getInstance().addToRequestQueue(jsonObjectRequest, MainActivity.class.getSimpleName());
    }

    @Override
    public void onErrorResponse(VolleyError error) {

    }

    @Override
    public void onResponse(JSONObject response) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

        try {
            UpcomingMovieListAPI.upcommingMovieAPIResponse upcommingMovieAPIResponse = objectMapper.readValue(response.toString().trim(), UpcomingMovieListAPI.upcommingMovieAPIResponse.class);
            results.addAll(upcommingMovieAPIResponse.getResults());
            upcomingMovieAdapter.notifyDataSetChanged();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
