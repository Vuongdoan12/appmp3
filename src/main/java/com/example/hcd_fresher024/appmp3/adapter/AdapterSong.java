package com.example.hcd_fresher024.appmp3.adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.hcd_fresher024.appmp3.activity.ActivityPlaySong;
import com.example.hcd_fresher024.appmp3.R;
import com.example.hcd_fresher024.appmp3.bean.Song;

import java.util.List;

/**
 * Created by HCD-Fresher024 on 1/6/2017.
 */

public class AdapterSong extends RecyclerView.Adapter<AdapterSong.AdapSong> {
    Context context;
    List<Song> list;
    public AdapterSong(Context context, List<Song> list){
        this.context = context;
        this.list = list;
    }
    public class AdapSong extends RecyclerView.ViewHolder{
        TextView nameSong;
        TextView nameSinger;
        public AdapSong(View itemView) {
            super(itemView);
            nameSong = (TextView)itemView.findViewById(R.id.nameSong);
            nameSinger = (TextView)itemView.findViewById(R.id.nameSinger);
        }
    }
    @Override
    public AdapterSong.AdapSong onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = (View) LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_itemsong,parent,false);
        return new AdapSong(view);
    }

    @Override
    public void onBindViewHolder(final AdapterSong.AdapSong holder, int position) {
        Song item = list.get(position);
        holder.nameSong.setText(item.getNameSong());
        holder.nameSinger.setText(item.getNameSinger());

        holder.nameSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ActivityPlaySong.class);
                intent.putExtra("ID","1");
                ((Activity) context).startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
