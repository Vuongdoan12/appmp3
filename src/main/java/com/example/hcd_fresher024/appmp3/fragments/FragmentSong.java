package com.example.hcd_fresher024.appmp3.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hcd_fresher024.appmp3.adapter.AdapterSong;
import com.example.hcd_fresher024.appmp3.R;
import com.example.hcd_fresher024.appmp3.bean.Song;

import java.util.ArrayList;

/**
 * Created by HCD-Fresher024 on 1/6/2017.
 */

public class FragmentSong extends Fragment {
    @Nullable

    private static AdapterSong adapter;
    public View onCreateView(final LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_song,container,false);
        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recyclerView);
        ArrayList<Song> arrayList = new ArrayList<Song>();
        for(int i = 0; i<=50; i++){
            arrayList.add(new Song(i,"Buc Tranh Tu Nuoc Mat"+i,"M.Siro"+i));
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        rv.setLayoutManager(linearLayoutManager);
        adapter = new AdapterSong(getActivity(),arrayList);
        rv.setAdapter(adapter);
        adapter.notifyDataSetChanged();

        return view;
    }
}
