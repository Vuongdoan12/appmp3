package com.example.hcd_fresher024.appmp3.activity;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.hcd_fresher024.appmp3.R;
import com.example.hcd_fresher024.appmp3.fragments.FragmentAlbum;
import com.example.hcd_fresher024.appmp3.fragments.FragmentPlaylist;
import com.example.hcd_fresher024.appmp3.fragments.FragmentSinger;
import com.example.hcd_fresher024.appmp3.fragments.FragmentSong;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager = (ViewPager)findViewById(R.id.viewPager);
        TabLayout tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        viewPager.setAdapter(new SectionPagerAdapter(getSupportFragmentManager()));
        tabLayout.setupWithViewPager(viewPager);

    }

    private class SectionPagerAdapter extends FragmentPagerAdapter {

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new FragmentSong();
                case 1:
                    return new FragmentPlaylist();
                case 2:
                    return new FragmentAlbum();
                case 3:
                    return new FragmentSinger();
                default:
                    return new FragmentSong();
            }
        }
        @Override
        public int getCount() {
            return 4;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position){
                case 0: return "SONG";
                case 1: return "PLAYLIST";
                case 2: return "ALBUM";
                case 3: return "SINGER";
                default: return "SING";
            }
        }

        public SectionPagerAdapter(FragmentManager fm) {
            super(fm);
        }
    }
}
