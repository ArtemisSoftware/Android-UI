package com.ArtemisSoftware.androidui.coollayouts.models;

import androidx.fragment.app.Fragment;

public class PagerFragment {

    private Fragment fragment;
    private String title;
    private int icon;


    public PagerFragment(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public PagerFragment(Fragment fragment, String title, int icon) {
        this.fragment = fragment;
        this.title = title;
        this.icon = icon;
    }


    public Fragment getFragment() {
        return fragment;
    }

    public String getTitle() {
        return title;
    }

    public int getIcon() {
        return icon;
    }
}
