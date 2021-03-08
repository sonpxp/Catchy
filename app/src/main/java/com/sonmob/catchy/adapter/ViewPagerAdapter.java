package com.sonmob.catchy.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.sonmob.catchy.fragments.Add;
import com.sonmob.catchy.fragments.Home;
import com.sonmob.catchy.fragments.Notification;
import com.sonmob.catchy.fragments.Profile;
import com.sonmob.catchy.fragments.Search;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    public ViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Home();

            case 1:
                return new Search();

            case 2:
                return new Add();

            case 3:
                return new Notification();

            case 4:
                return new Profile();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
