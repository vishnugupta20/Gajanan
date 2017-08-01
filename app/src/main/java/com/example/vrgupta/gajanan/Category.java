package com.example.vrgupta.gajanan;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class Category extends AppCompatActivity {
    private List<CategoryModel> categoryModelList = new ArrayList<>();
    private CategoryAdapter mAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new CategoryAdapter(categoryModelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(mAdapter);

        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), recyclerView, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                CategoryModel categoryModel = categoryModelList.get(position);
                //Toast.makeText(getApplicationContext(), categoryModel.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
                if (categoryModel.getTitle() == "Photos") {
                    showGalleryActivity();
                }
                else if (categoryModel.getTitle() == "Videos")
                {
                    showVideosAcitivty();
                }
                else if (categoryModel.getTitle() == "Events")
                {
                    showEventsActivity();
                }
                else if (categoryModel.getTitle() == "Buy T-Shirt")
                {
                    showTshirtActivity();
                }
                else if (categoryModel.getTitle() == "About Us")
                {
                    showAboutUsActivity();
                }
            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));

        prepareMovieData();
    }

    private void prepareMovieData() {
        CategoryModel categoryModel;

        categoryModel = new CategoryModel("Photos");
        categoryModelList.add(categoryModel);

        categoryModel = new CategoryModel("Videos");
        categoryModelList.add(categoryModel);

        categoryModel = new CategoryModel("Events");
        categoryModelList.add(categoryModel);

        categoryModel = new CategoryModel("Buy T-Shirt");
        categoryModelList.add(categoryModel);

        categoryModel = new CategoryModel("About Us");
        categoryModelList.add(categoryModel);
        mAdapter.notifyDataSetChanged();
    }

    private void showGalleryActivity()
    {
        Intent t = new Intent(Category.this,GalleryActivity.class);
        startActivity(t);
    }
    private void showVideosAcitivty()
    {
        //https://www.youtube.com/watch?v=I-vEjzA1qSo
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=I-vEjzA1qSo&feature=youtu.be")));
    }
    private void showEventsActivity()
    {
        Intent t = new Intent(Category.this,EventsActivity.class);
        startActivity(t);

    }
    private void showTshirtActivity()
    {

    }
    private void showAboutUsActivity()
    {

    }
}
