package com.ArtemisSoftware.androidui.coollayouts.fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.ArtemisSoftware.androidui.R;
import com.ArtemisSoftware.androidui.coollayouts.adapters.SimpleRecyclerAdapter;
import com.ArtemisSoftware.androidui.coollayouts.models.Version;

import java.util.Arrays;
import java.util.List;


public class ParallaxFragment extends Fragment {
    int color;

    public ParallaxFragment() {
    }

    @SuppressLint("ValidFragment")
    public ParallaxFragment(int color) {
        this.color = color;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_parallax, container, false);

        final FrameLayout frameLayout = view.findViewById(R.id.dummyfrag_bg);
        frameLayout.setBackgroundColor(color);

        RecyclerView recyclerView = view.findViewById(R.id.dummyfrag_scrollableview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity().getBaseContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setHasFixedSize(true);

        List<String> list = Arrays.asList(Version.data);

        SimpleRecyclerAdapter adapter = new SimpleRecyclerAdapter(list);
        recyclerView.setAdapter(adapter);

        return view;
    }
}