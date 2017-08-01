package com.example.vrgupta.gajanan;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by vrgupta on 18/07/17.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.MyViewHolder>{

    private List<CategoryModel> categoryModelList;

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView title;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
        }
    }
    public CategoryAdapter(List<CategoryModel>categoryList)
    {
        this.categoryModelList = categoryList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CategoryModel category = categoryModelList.get(position);
        holder.title.setText(category.getTitle());
    }

    @Override
    public int getItemCount() {
        return categoryModelList.size();
    }


}
