package com.example.hcd_fresher024.appmp3.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.hcd_fresher024.appmp3.R;

/**
 * Created by HCD-Fresher024 on 1/6/2017.
 */

public class FragmentAlbum extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_album,container,false);
        return view;
    }
}
