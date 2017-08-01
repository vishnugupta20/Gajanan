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

public class EventsAdapter extends RecyclerView.Adapter<EventsAdapter.MyViewHolder>{

    private List<EventsModel> eventsModelList;

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView title;
        public TextView subtitle;
        public TextView timing;
        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView)itemView.findViewById(R.id.title);
            subtitle = (TextView)itemView.findViewById(R.id.subtitle);
            timing = (TextView)itemView.findViewById(R.id.timing);

        }
    }
    public EventsAdapter(List<EventsModel>eventsModelList)
    {
        this.eventsModelList = eventsModelList;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        EventsModel model = eventsModelList.get(position);
        holder.title.setText(model.getTitle());
        //holder.subtitle.setText(model.getSubtitle());
       // holder.timing.setText(model.getTiming());

    }

    @Override
    public int getItemCount() {
        return eventsModelList.size();
    }


}
