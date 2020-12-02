package com.example.submission1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvTour;
    private ArrayList<Tour> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTour = findViewById(R.id.batucity);
        rvTour.setHasFixedSize(true);

        list.addAll(TourData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvTour.setLayoutManager(new LinearLayoutManager(this));
        ListTourAdapter listTourAdapter = new ListTourAdapter(list);
        rvTour.setAdapter(listTourAdapter);

        listTourAdapter.setOnItemClickCallback(new ListTourAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Tour data) {
            showSelectedTour(data);
            }
        });
    }

    private void showSelectedTour(Tour tour) {
        Toast.makeText(this, "Kamu memilih " + tour.getName(), Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this,DetailTour.class);
        String[] data = {tour.getName(),tour.getDetail(), String.valueOf(tour.getPhoto())};
        intent.putExtra("data",data);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_about) {
            startActivity(new Intent(MainActivity.this, About.class));
        }
        return true;
    }

}