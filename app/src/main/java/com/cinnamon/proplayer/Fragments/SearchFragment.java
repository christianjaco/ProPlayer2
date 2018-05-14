package com.cinnamon.proplayer.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cinnamon.proplayer.Adapters.ViewPagerAdapter;
import com.cinnamon.proplayer.R;

public class SearchFragment extends Fragment {

    View view;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_search,container,false);


        tabLayout = (TabLayout) view.findViewById(R.id.tablayout_search);
        viewPager = (ViewPager)view.findViewById(R.id.search_view_pager);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());
        adapter.addFragment(new ExploreLeaguesFragment(),"Ligas");
        adapter.addFragment(new ExploreStatisticsFragment(),"Estadisticas");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        MenuInflater menuInflater = getActivity().getMenuInflater();
        menuInflater.inflate(R.menu.menu_search_bar, menu);
        super.onCreateOptionsMenu(menu, inflater);

    }
}
