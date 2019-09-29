package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Movie> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        rvCategory = findViewById(R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        showMovie();
    }

    private void showMovie() {
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        MovieAdapter movieAdapter = new MovieAdapter(this, new MovieAdapter.OnClick() {
            @Override
            public void onClick(Object movie) {
                Movie parce = (Movie) movie;
                Intent intent = new Intent(MainActivity.this, MovieDetailActivity.class);
                intent.putExtra("m", parce);
                startActivity(intent);
            }
        });
        movieAdapter.setListMovie(list);
        rvCategory.setAdapter(movieAdapter);
    }
}
