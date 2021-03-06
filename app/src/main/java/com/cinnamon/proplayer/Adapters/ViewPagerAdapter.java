package com.cinnamon.proplayer.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    private final List<Fragment> listFragment;
    private final List<String> listFragmentTitles = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        listFragment = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragmentTitles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listFragmentTitles.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        listFragment.add(fragment);
        listFragmentTitles.add(title);

    }
}
