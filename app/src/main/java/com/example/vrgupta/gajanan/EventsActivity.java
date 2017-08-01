package com.example.vrgupta.gajanan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class EventsActivity extends AppCompatActivity {

    private List<EventsModel> eventsModelList = new ArrayList<>();
    private EventsAdapter mAdapter;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new EventsAdapter(eventsModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        EventsModel eventsModel;

        eventsModel = new EventsModel("Events1","Events subtitle 1","timing 1");
        eventsModelList.add(eventsModel);

        eventsModel = new EventsModel("Events2","Events subtitle 2","timing 2");
        eventsModelList.add(eventsModel);

        eventsModel = new EventsModel("Events3","Events subtitle 3","timing 3");
        eventsModelList.add(eventsModel);

        eventsModel = new EventsModel("Events4","Events subtitle 4","timing 4");
        eventsModelList.add(eventsModel);

        mAdapter.notifyDataSetChanged();
    }
}
